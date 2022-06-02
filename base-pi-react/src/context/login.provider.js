import React, { useState, createContext, useEffect } from 'react'
import { useHistory } from 'react-router-dom'
//import { useNavigate } from 'react-router-dom';
import { api, createSession } from '../envinromentsLogin'

export const AuthContext = createContext()

export function AuthProvider(props) {
    const [user, setUser] = useState(null)
    const history = useHistory()
    const [loading, setLoading] = useState(true)
    const [userName, setUserName] = useState('')
    const [id, setId] = useState('')


    useEffect(() => {
        const logged = localStorage.getItem('user')

        logged ? setUser(JSON.parse(logged)) : setUser(null)

        setLoading(false)

    }, [])

    const login = async (email, password) => {

        try {

            const response = await createSession(email, password)

            // api criar uma session

            const loggedUser = response.data.idCliente
            const token = response.data.token
            const nome = response.data.nomeCliente


            localStorage.setItem("user", JSON.stringify(loggedUser));
            localStorage.setItem("token", token);
            localStorage.setItem("nome", nome)

            setUserName(nome)
            setId(localStorage.getItem('user'))

            api.defaults.headers.Authorization = `Bearer ${token}`

            setUser(loggedUser);
            history.push("/");

            console.log("token:", response.data.token)
            console.log("login auth: ", response)
            console.log("id global: ", id)
            console.log("nome: ", nome)
            console.log("id: ", loggedUser)

        } catch (erro) {

            console.log("erro: ", erro)

            //    alert("erro ao logoar")

        }
    }

    const logout = () => {
        console.log("logout")
        localStorage.removeItem("user")
        localStorage.removeItem("token")
        localStorage.removeItem("nome")

        api.defaults.headers.Authorization = null

        setUser(null)
        history.push("/login")
    }

    const getUserStorage = () => {
        return localStorage.getItem('nome')
    }

    const getUserName = () => {
        let userL = getUserStorage()
        setUserName(userL)
    }

    return (
        <AuthContext.Provider value={{ authenticaded: !!user, user, login, logout, loading, userName, id, getUserName }}>
            {props.children}
        </AuthContext.Provider>
    )

}
