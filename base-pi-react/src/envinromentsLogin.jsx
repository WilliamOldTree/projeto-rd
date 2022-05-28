import axios from 'axios'

export const api = axios.create({
    baseApi: 'http://localhost:8080'
})

export const createSession = async (email, password) => {
    return await api.post("http://localhost:8080/auth", {email, password})
    .catch((error) => 
        console.log( error)
    );

}
