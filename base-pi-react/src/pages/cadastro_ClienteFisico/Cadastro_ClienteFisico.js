import './Cadastro_ClienteFisico.css'
import React, { useState, useEffect } from 'react'
import { baseUrl } from '../../environments'
import axios from 'axios'
import { Alert, Container } from 'react-bootstrap'

/* LINK PAGES */
import { Link } from 'react-router-dom'
import Header from '../../components/header/Header';
import Footer from '../../components/footer/Footer';
import Title from '../../components/title/Title'

/* ICONS CADASTRO */
import User from '../../components/asserts/icons/user.png';

function ClienteFisico(props) {

    const [clientes, setClientes] = useState([]);
    const [successRegister, SetSuccessRegister] = useState(false)

    const register = () => {
        clientes.states =
            axios.post('http://localhost:8080/clientes', clientes)
                .then((response) => {
                    SetSuccessRegister(true)
                })
    }

    return (
        <>
            <Header />
            {/* BEGGIN FORMULÁRIO CADASTRO DE CLIENTE FÍSICO*/}
            <div className='container'>
                <Title titleIcon={User} titleText="Nova Conta" />

                {/*<div className='buttons-fisico'>
                    <Link to='/cadastro_ClienteFisico' className='btn pessoaF fisico' role='button'>PESSOA FÍSICA</Link>
                    <Link to='/cadastro_ClienteJuridico' className='btn pessoaJ fisico' role='button'>PESSOA JURÍDICA</Link>
                </div> {successRegister ? <h3>Usuário cadastrado com sucesso</h3> : ''}*/ }

                <div className='fisico-container'>
                    <div className='cadastroPessoaF fisico'>
                        <p className='campostopo'>Campos marcados com * são de preenchimento obrigatório</p>
                        <div className='mb-3'>
                            <label for='nome_ClienteFisico' className='form-label1 fisico'>*Nome Completo:</label>
                            <input type='text' className='form-control' id='nome_ClienteFisico'
                                value={clientes.nome}
                                onChange={(event) => { setClientes({ ...clientes, nome: event.target.value }) }} />
                        </div>
                        <div className='mb-3'>
                            <label for='cpf_ClienteFisico' className='form-label2 fisico'>CPF</label>
                            <input type='text' className='form-control' id='cpf_ClienteFisico' 
                                value={clientes.cpf}
                                onChange={(event) => { setClientes({ ...clientes, cpf: event.target.value }) }} />
                        </div>
                        <div className='mb-3'>
                            <label for='data_ClienteFisico' className='form-label3 fisico'>Data Nascimento:</label>
                            <input type='text' className='form-control' id='data_ClienteFisico' 
                                value={clientes.nascimento}
                                onChange={(event) => { setClientes({ ...clientes, nascimento: event.target.value }) }} />
                        </div>

                        <label for='sexo_ClienteFisico' className='form-label4 fisico'>Sexo:</label>
                        <select className='form-select fisico' aria-label='Default select example' id='sexo_ClienteFisico'
                            value={clientes.genero}
                            onChange={(event) => { setClientes({ ...clientes, genero: event.target.value }) }}>
                            <option selected>Selecione..</option>
                            <option value='FEMININO'>Feminino</option>
                            <option value='MASCULINO'>Masculino</option>
                            <option value='OUTROS'>Outros</option>
                        </select>

                        <p className='aviso-tel fisico'>Ao menos um telefone deve ser informado:</p>

                        <div className='mb-3'>
                            <label for='telefone_ClienteFisico' className='form-label5 fisico'>Telefone Fixo ou Comercial:</label>
                            <input type='text' className='form-control' id='telefone_ClienteFisico'
                                value={clientes.fixo}
                                onChange={(event) => { setClientes({ ...clientes, fixo: event.target.value }) }} />
                        </div>

                        <div className='mb-3'>
                            <label for='celular_ClienteFisico' className='form-label6 fisico'>Telefone Celular:</label>
                            <input type='text' className='form-control' id='celular_ClienteFisico'
                                value={clientes.celular}
                                onChange={(event) => { setClientes({ ...clientes, celular: event.target.value }) }} />
                        </div>

                        <div className='mb-3'>
                            <label for='email1_ClienteFisico' className='form-label7 fisico'>E-mail</label>
                            <input type='email' className='form-control' id='email1_ClienteFisico'
                                value={clientes.email}
                                onChange={(event) => { setClientes({ ...clientes, email: event.target.value }) }} />
                        </div>

                        <div className='mb-3'>
                            <label for='senha1_ClienteFisico' className='form-label9 fisico'>*Crie sua Senha de acesso:</label>
                            <input type='password' className='form-control' id='senha1_ClienteFisico'
                                value={clientes.password}
                                onChange={(event) => { setClientes({ ...clientes, password: event.target.value }) }} />
                        </div>

                        <p className='aviso-privacidade fisico'>Ao criar uma conta você está de acordo com nossa <em>Política de Privacidade.</em></p>

                        <button className='btn formcadastroF' onClick={register} type='submit'>CONCLUIR CADASTRO</button>
                    </div>
                </div>
            </div>

            {/* END FORMULÁRIO CADASTRO DE CLIENTE FÍSICO*/}
            <Container>
                {successRegister
                    ?
                    <Alert className="alert-register" key='success' variant='success'>
                        <h3>Usuário cadastrado com Sucesso!</h3> <Link to="/login">Faça seu Login</Link>
                    </Alert>
                    : ''
                }
            </Container>
            <Footer />
        </>
    );
}

export default ClienteFisico;