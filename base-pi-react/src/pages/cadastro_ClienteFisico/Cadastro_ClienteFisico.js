import './Cadastro_ClienteFisico.css'
import React, { useState, useEffect } from 'react'
import { baseUrl } from '../../environments'
import axios from 'axios'
import { Alert, Container } from 'react-bootstrap'
import './Validacoes.css'
/* LINK PAGES */
import { Link, useHistory } from 'react-router-dom'
import Header from '../../components/header/Header';
import Footer from '../../components/footer/Footer';
import Title from '../../components/title/Title'

/* ICONS CADASTRO */
import User from '../../components/asserts/icons/user.png';

function ClienteFisico(props) {

    const [clientes, setClientes] = useState([]);
    const history = useHistory();

    const register = () => {
        clientes.states =
            axios.post('http://localhost:8080/clientes', clientes)
                .then((response) => {
                    history.push("/login")
                   
                })
    }

    function mascaraCpf() {
        var cpf = document.getElementById('cpf_ClienteFisico')
        if (cpf.value.length == 3 || cpf.value.length == 7) {
            cpf.value += '.'
        }
        else if (cpf.value.length == 11) {
            cpf.value += ' -'
        }

        if (cpf.value.length < 15) {
            return false;
        } else if (cpf == " ") {
            return false
        }
    }

    function mascaraFixo() {
        var fixo = document.getElementById('telefone_ClienteFisico')
        if (fixo.value.length == 2) {
            fixo.value += ' +( '
        }
        if (fixo.value.length == 8) {
            fixo.value += ') '
        }
        if (fixo.value.length == 14) {
            fixo.value += '-'
        }
    }

    function mascaraCelular() {
        var celular = document.getElementById('celular_ClienteFisico')
        if (celular.value.length == 2) {
            celular.value += ' +( '
        }
        if (celular.value.length == 8) {
            celular.value += ') '
        }
        if (celular.value.length == 15) {
            celular.value += '-'
        }
    }

    function mascaraData() {
        var data = document.getElementById('data_ClienteFisico')
        if (data.value.length == 2 || data.value.length == 5) {
            data.value += '/'
        }
    }

    function validarTudo() {
        var nome = document.getElementById('nome_ClienteFisico').value;
        var senha = document.getElementById('senha1_ClienteFisico').value;
        var cpf = document.getElementById('cpf_ClienteFisico').value;
        var celular = document.getElementById('celular_ClienteFisico').value;
        var tel = document.getElementById('telefone_ClienteFisico').value;
        var email = document.getElementById('email1_ClienteFisico').value;

        if (email == "") {
            document.getElementById('ErroEmail').innerHTML = "Informe seu email!";
            return false;
        } else {
            document.getElementById('ErroEmail').innerHTML = " ";
        }
        if (nome == "") {
            document.getElementById('ErroNome').innerHTML = "Informe seu nome!";
            return false;
        }
        if (nome != false) {
            document.getElementById('ErroNome').innerHTML = " ";

        }
        if (cpf == "") {
            document.getElementById('ErroCpf').innerHTML = "Informe seu Cpf!";
            return false;
        }
        else if (cpf.length < 15) {
            document.getElementById('ErroCpf').innerHTML = " Cpf Inválido!";
            return false;
        } else {
            document.getElementById('ErroCpf').innerHTML = " ";

        }
        if (tel == "") {
            document.getElementById('ErroCel').innerHTML = "Informe seu Número!";
            return false;
        }
        else if (tel.length < 19) {
            document.getElementById('ErroCel').innerHTML = " Número inválido!";
            return false;
        } else {
            document.getElementById('ErroCel').innerHTML = " ";

        }
        if (celular == "") {
            document.getElementById('ErroTel').innerHTML = "Informe seu Número!";
            return false;
        }

        else if (celular.length < 20) {
            document.getElementById('ErroTel').innerHTML = " Número inválido!";
            return false;
        }
        else {
            document.getElementById('ErroTel').innerHTML = " ";

        }
        if (senha == "") {
            document.getElementById('ErroSenha').innerHTML = "Informe sua senha!";
            return false;
        }
        else if (senha.length < 7) {
            document.getElementById('ErroSenha').innerHTML = "Insira 8 caracteres no minimo!";
            return false;
        }
        else {
            document.getElementById('ErroSenha').innerHTML = " ";

        }
        if (nome == "" && email == "" && celular == "" && tel == "" && senha == "" && cpf == "") {
            document.getElementById('Campos').innerHTML = "Preencha todos os campos obrigatórios ";
            return register(false)
        } else {
            document.getElementById('Campos').innerHTML = " ";
            return register(true)
        }
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
                            <span id='ErroNome' ></span>
                        </div>
                        <div className='mb-3'>
                            <label for='cpf_ClienteFisico' className='form-label2 fisico'>CPF</label>
                            <input type='text' className='form-control' id='cpf_ClienteFisico'
                                value={clientes.cpf}
                                onChange={(event) => { setClientes({ ...clientes, cpf: event.target.value }) }} maxLength="15" autoComplete='off'
                                onKeyUp={mascaraCpf} />
                            <span id='ErroCpf' ></span>
                        </div>
                        <div className='mb-3'>
                            <label for='data_ClienteFisico' className='form-label3 fisico'>Data Nascimento:</label>
                            <input type='text' className='form-control' id='data_ClienteFisico'
                                value={clientes.nascimento}
                                onChange={(event) => { setClientes({ ...clientes, nascimento: event.target.value }) }}
                                maxLength="10" autoComplete='off'
                                onKeyUp={mascaraData}
                                placeholder={"dia/mês/ano (ex: 15/06/1997)"}
                            />
                        </div>

                        <label for='sexo_ClienteFisico' className='form-label4 fisico'>Sexo:</label>
                        <select className='form-select fisico' aria-label='Default select example' id='sexo_ClienteFisico'
                            required=""
                            value={clientes.genero}
                            onChange={(event) => { setClientes({ ...clientes, genero: event.target.value }) }}>
                            <option selected>Selecione..</option>
                            <option value='FEMININO'>Feminino</option>
                            <option value='MASCULINO'>Masculino</option>
                            <option value='OUTROS'>Outros</option>
                        </select>

                        <div className='mb-3'>
                            <label for='telefone_ClienteFisico' className='form-label5 fisico'>Telefone Fixo ou Comercial:</label>
                            <input type='text' className='form-control' id='telefone_ClienteFisico'
                                value={clientes.fixo}
                                onChange={(event) => { setClientes({ ...clientes, fixo: event.target.value }) }}
                                maxLength="19" autoComplete='off'
                                onKeyUp={mascaraFixo}
                                placeholder={"55 + (XX) XXXX-XXXX"} />
                            <span id='ErroCel' ></span>
                        </div>

                        <div className='mb-3'>
                            <span id='ErroTel' ></span>

                            <label for='celular_ClienteFisico' className='form-label6 fisico'>Telefone Celular:</label>
                            <input type='text' className='form-control' id='celular_ClienteFisico'
                                value={clientes.celular}
                                onChange={(event) => { setClientes({ ...clientes, celular: event.target.value }) }}
                                maxLength="20" autoComplete='off'
                                onKeyUp={mascaraCelular}
                                placeholder={"55 + (XX) XXXXX-XXXX"} />
                        </div>

                        <div className='mb-3'>
                            <label for='email1_ClienteFisico' className='form-label7 fisico'>E-mail</label>
                            <input type='email' className='form-control' id='email1_ClienteFisico'
                                value={clientes.email}
                                onChange={(event) => { setClientes({ ...clientes, email: event.target.value }) }} />
                            <span id='ErroEmail' ></span>

                        </div>

                        <div className='mb-3'>
                            <label for='senha1_ClienteFisico' className='form-label9 fisico'>*Crie sua Senha de acesso:</label>
                            <input type='password' className='form-control' id='senha1_ClienteFisico'
                                value={clientes.password}
                                onChange={(event) => { setClientes({ ...clientes, password: event.target.value }) }} />
                            <span id='ErroSenha' ></span>
                        </div>
                        <span id='Campos' ></span>
                        <p className='aviso-privacidade fisico'>Ao criar uma conta você está de acordo com nossa <em>Política de Privacidade.</em></p>

                        <button className='btn formcadastroF' onClick={validarTudo} type='submit'>CONCLUIR CADASTRO</button>
                    </div>
                </div>
            </div>

            {/* END FORMULÁRIO CADASTRO DE CLIENTE FÍSICO*/}

            <Footer />

        </>
    );
}

export default ClienteFisico;