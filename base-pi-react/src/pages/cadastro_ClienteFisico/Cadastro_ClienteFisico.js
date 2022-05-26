
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
    /* 
    const [clientes, setClientes] = useState([]);
    const [successRegister, SetSuccessRegister] = useState(false)

    const register = () => {
        clientes.states =
            axios.post('http://localhost:8080/clientes', clientes)
                .then((response) => {
                    SetSuccessRegister(true)
                })
    } */

    const [clientes, setClientes] = useState({
        nome: '',
        email: '',
        cpf: '',
        nascimento: '',
        genero: '',
        password: '',
        celular: '',
        fixo: ''
    });

    const [status, setStatus] = useState({
        type: '',
        menssagem: ''
    });

    //Receber os dados do formulário
    const valueImput = e => setClientes({ ...clientes, [e.target.name]: e.target.value });

    //Enviar dados para o back-end 
    const addUser = async e => {
        e.preventDefault();

        if (!validate()) return;

        const saveDataForm = true;

        const register = () => {
            clientes.states =
                axios.post('http://localhost:8080/clientes', clientes)
                    .then((response) => {

                    })
        }

        if (saveDataForm) {
            setStatus({
                type: 'success',
                menssagem: 'Usuário cadastrado com Sucesso!'
            });
            setClientes({
                nome: '',
                email: '',
                cpf: '',
                nascimento: '',
                genero: '',
                password: '',
                celular: '',
                fixo: ''
            });

        } else {
            setStatus({
                type: 'error',
                menssagem: 'Erro: Usuário não cadastrado!'
            });
        }
    }

    function validate() {
        if (!clientes.nome) return setStatus({ type: 'error', menssagem: 'Erro: Necessário preencher o campo Nome!' });
        if (!clientes.email) return setStatus({ type: 'error', menssagem: 'Erro: Necessário preencher o campo Email!' });
        if (!clientes.cpf) return setStatus({ type: 'error', menssagem: 'Erro: Necessário preencher o campo CPF!' });
        if (!clientes.celular) return setStatus({ type: 'error', menssagem: 'Erro: Necessário preencher o campo Celular!' });
        if (!clientes.password) return setStatus({ type: 'error', menssagem: 'Erro: Necessário preencher o campo Senha!' });
        if (clientes.password.length < 6) return setStatus({ type: 'error', menssagem: 'Erro: A senha precisa pelo menos de 6 caracteres!' });

        return register();
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

                <form onSubmit={addUser}>
                    <div className='fisico-container'>
                        <div className='cadastroPessoaF fisico'>
                            <p className='campostopo'>Campos marcados com * são de preenchimento obrigatório</p>
                            <div className='mb-3'>
                                <label for='nome_ClienteFisico' className='form-label1 fisico'>*Nome Completo:</label>
                                <input type='text' className='form-control' id='nome_ClienteFisico' name='nome' onChange={valueImput} value={clientes.nome} />
                            </div>
                            <div className='mb-3'>
                                <label for='cpf_ClienteFisico' className='form-label2 fisico'>CPF</label>
                                <input type='text' className='form-control' id='cpf_ClienteFisico' name='cpf' onChange={valueImput} value={clientes.cpf} />
                            </div>
                            <div className='mb-3'>
                                <label for='data_ClienteFisico' className='form-label3 fisico'>Data Nascimento:</label>
                                <input type='text' className='form-control' id='data_ClienteFisico' name='nascimento' onChange={valueImput} value={clientes.nascimento} />
                            </div>

                            <label for='sexo_ClienteFisico' className='form-label4 fisico'>Sexo:</label>
                            <select className='form-select fisico' aria-label='Default select example' id='sexo_ClienteFisico'
                                onChange={valueImput} value={clientes.genero}  name='genero'>
                                <option selected>Selecione..</option>
                                <option value='FEMININO'>Feminino</option>
                                <option value='MASCULINO'>Masculino</option>
                                <option value='OUTROS'>Outros</option>
                            </select>

                            <p className='aviso-tel fisico'>Ao menos um telefone deve ser informado:</p>

                            <div className='mb-3'>
                                <label for='telefone_ClienteFisico' className='form-label5 fisico'>Telefone Fixo ou Comercial:</label>
                                <input type='text' className='form-control' id='telefone_ClienteFisico'
                                    onChange={valueImput} value={clientes.telefone} name='telefone' />
                            </div>

                            <div className='mb-3'>
                                <label for='celular_ClienteFisico' className='form-label6 fisico'>Telefone Celular:</label>
                                <input type='text' className='form-control' id='celular_ClienteFisico' name='celular' onChange={valueImput} value={clientes.celular} />
                            </div>

                            <div className='mb-3'>
                                <label for='email1_ClienteFisico' className='form-label7 fisico'>E-mail</label>
                                <input type='email' className='form-control' id='email1_ClienteFisico' name='email' onChange={valueImput} value={clientes.email} />
                            </div>

                            <div className='mb-3'>
                                <label for='email2_ClienteFisico' className='form-label8 fisico'>*Digite novamente:</label>
                                <input type='email' className='form-control' id='email2_ClienteFisico' />
                            </div>

                            <div className='mb-3'>
                                <label for='senha1_ClienteFisico' className='form-label9 fisico'>*Crie sua Senha de acesso:</label>
                                <input type='password' className='form-control' id='senha1_ClienteFisico' name='password' onChange={valueImput} value={clientes.password} />
                            </div>

                            <div className='mb-3'>
                                <label for='senha_ClienteFisico' className='form-label10 fisico'>*Digite novamente:</label>
                                <input type='password' className='form-control' id='senha2_ClienteFisico' />
                            </div>

                            <div className='mb-3 form-check'>
                                <input type='checkbox' className='form-check-input' id='exampleCheck1_ClienteFisico' />
                                <label className='form-check-label fisico' for='exampleCheck1'>Desejo receber e-mails promocionais</label>
                            </div>

                            <p className='aviso-privacidade fisico'>Ao criar uma conta você está de acordo com nossa <em>Política de Privacidade.</em></p>

                            <button className='btn formcadastroF' type='submit'>CONCLUIR CADASTRO</button>
                        </div>
                    </div>
                </form>

                {status.type === 'success' ?
                    <Alert variant='success'>
                        <h6 className='alert-register' style={{ color: "green" }}>{status.menssagem}</h6>
                    </Alert>
                    : ""}
                {status.type === 'error' ?
                    <Alert variant='danger '>
                        <h6 className='alert-register' style={{ color: "#ff0000" }}>{status.menssagem}</h6>
                    </Alert> : ""}

            </div>

            {/* END FORMULÁRIO CADASTRO DE CLIENTE FÍSICO*/}
            {/*<Container>
             
                    successRegister
                        ?
                        <Alert key='success' variant='success'>
                            <p style={{ color: "#ff0000" }}>{status.menssagem}
                        </Alert>
                        :
                        ''
               
            </Container> */}
            <Footer />
        </>
    );
}

export default ClienteFisico;