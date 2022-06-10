import React, { useState, createContext, useEffect } from "react"
import { baseUrl } from "../environments"
import axios from "axios"
import { useHistory } from "react-router-dom"

const ClientContext = createContext({})

function ClientProvider(props) {

    const [client, setClient] = useState(null)
    const [nome, setNome] = useState("")
    const [token, setToken] = useState("")
    const [clienteDados, setClienteDados] = useState({})
  
    //const [login, setLogin] = useState({})
    const history = useHistory()
    


    const getCliente = (idcliente) => {
        axios.get(`http://localhost:8080/clientes/${idcliente}`)
            .then((response) => {
                setClienteDados(response.data)
                console.log(response.data)
                localStorage.cliente = JSON.stringify(response.data)
            })
            .catch((error) => {
                
                console.error(error.messege)
            })
    }

    async function LogarCliente(login) {
        let success = false
        await axios.post("http://localhost:8080/auth", login)
            .then((response) => {
                console.log("logar")
                setNome(response.data.nomeCliente)
                //localStorage.setItem("nome", JSON.stringify(response.data.nomeCliente))
                const nomeCliente = response.data.nomeCliente;
                localStorage.setItem("nome", nomeCliente)

                setClient(response.data.idCliente)
                localStorage.setItem("id", JSON.stringify(response.data.idCliente))
                setToken(response.data.token)
                localStorage.setItem("token", JSON.stringify(response.data.token))
                axios.defaults.headers.common["Authorization"] = `Bearer ${response.data.token}`
                success = true
                getCliente(response.data.idCliente)
            })
            .catch((error) => {
               
                console.error(error.messege)
            })


            


        return success
    }

    function AtualizarNome() {
        setClienteDados(JSON.parse(localStorage.getItem("cliente")))
        setNome(JSON.parse(localStorage.getItem("nome")))
        setClient(JSON.parse(localStorage.getItem("id")))
    }

    function getIdCliente() {
        setClient(JSON.parse(localStorage.getItem("id")))
        getCliente(JSON.parse(localStorage.getItem("id")))
        axios.defaults.headers.common["Authorization"] = `Bearer ${token}`
    }

    function getDadosDoCliente() {
        setClienteDados(JSON.parse(localStorage.getItem("cliente")))
        axios.defaults.headers.common["Authorization"] = `Bearer ${token}`
    }

    const getUserStorage = () => {
        return localStorage.getItem("nome")
    }

    const getUserName = () => {
        let userL = getUserStorage()
        setNome(userL)
    }

    const logout = () => {
        console.log("logout")
        localStorage.removeItem("cliente")
        localStorage.removeItem("token")
        localStorage.removeItem("nome")
        localStorage.removeItem("id")

        axios.defaults.headers.common["Authorization"] = null
        setClient(null)
        history.push("/login");
    }

    return (
        <ClientContext.Provider
            value={{
                client, getCliente, LogarCliente, AtualizarNome,
                Autorizado: !!client, nome, clienteDados, getIdCliente,
                getDadosDoCliente, getUserName, logout
            }}>
            {props.children}
        </ClientContext.Provider>
    )
}

export { ClientProvider }
export default ClientContext
