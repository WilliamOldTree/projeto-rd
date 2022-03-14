import './Cadastro_ClienteFisico.css'

/* LINK PAGES */
import { Link } from 'react-router-dom'
import Header from '../../components/header/Header';
import Footer from '../../components/footer/Footer';

/* ICONS CADASTRO */
import User from '../../components/asserts/icons/user.png';

function ClienteFisico() {
    return (
        <>
            <Header />

            {/* BEGGIN FORMULÁRIO CADASTRO DE CLIENTE FÍSICO*/}
            <div className='container'>
                <h2 className='title'><img width='55' className='imgUser' src={User} /> Nova Conta</h2>

                <hr/>
                <Link to='/cadastro_ClienteFisico' className='btn pessoaF fisico' role='button'>PESSOA FÍSICA</Link>
                <Link to='/cadastro_ClienteJuridico' className='btn pessoaJ fisico' role='button'>PESSOA JURÍDICA</Link>

                <div className='cadastroPessoaF fisico'>
                    <p className='campostopo'>Campos marcados com * são de preenchimento obrigatório</p>
                    <div className='mb-3'>
                        <label for='nome_ClienteFisico' className='form-label1 pedidos'>*Nome Completo:</label>
                        <input type='text' className='form-control' id='nome_ClienteFisico' />
                    </div>
                    <div className='mb-3'>
                        <label for='cpf_ClienteFisico' className='form-label2 pedidos'>CPF</label>
                        <input type='text' className='form-control' id='cpf_ClienteFisico' />
                    </div>
                    <div className='mb-3'>
                        <label for='data_ClienteFisico' className='form-label3 pedidos'>Data Nascimento:</label>
                        <input type='date' className='form-control' id='data_ClienteFisico' />
                    </div>

                    <label for='sexo_ClienteFisico' className='form-label4 pedidos'>Sexo:</label>
                    <select className='form-select' aria-label='Default select example' id='sexo_ClienteFisico'>
                        <option selected>Selecione..</option>
                        <option value='1'>Feminino</option>
                        <option value='2'>Masculino</option>
                        <option value='3'>Outros</option>
                    </select>

                    <p className='aviso-tel pedidos'>Ao menos um telefone deve ser informado:</p>

                    <div className='mb-3'>
                        <label for='telefone_ClienteFisico' className='form-label5 pedidos'>Telefone Fixo ou Comercial:</label>
                        <input type='text' className='form-control' id='telefone_ClienteFisico' />
                    </div>

                    <div className='mb-3'>
                        <label for='celular_ClienteFisico' className='form-label6 pedidos'>Telefone Celular:</label>
                        <input type='text' className='form-control' id='celular_ClienteFisico' />
                    </div>

                    <div className='mb-3'>
                        <label for='email1_ClienteFisico' className='form-label7 pedidos'>E-mail</label>
                        <input type='email' className='form-control' id='email1_ClienteFisico' />
                    </div>

                    <div className='mb-3'>
                        <label for='email2_ClienteFisico' className='form-label8 pedidos'>*Digite novamente:</label>
                        <input type='email' className='form-control' id='email2_ClienteFisico' />
                    </div>

                    <div className='mb-3'>
                        <label for='senha1_ClienteFisico' className='form-label9 pedidos'>*Crie sua Senha de acesso:</label>
                        <input type='password' className='form-control' id='senha1_ClienteFisico' />
                    </div>

                    <div className='mb-3'>
                        <label for='senha_ClienteFisico' className='form-label10 pedidos'>*Digite novamente:</label>
                        <input type='password' className='form-control' id='senha2_ClienteFisico' />
                    </div>

                    <div className='mb-3 form-check'>
                        <input type='checkbox' className='form-check-input' id='exampleCheck1_ClienteFisico' />
                        <label className='form-check-label pedidos' for='exampleCheck1'>Desejo receber e-mails promocionais</label>
                    </div>

                    <p className='aviso-privacidade pedidos'>Ao criar uma conta você está de acordo com nossa <em>Política de Privacidade.</em></p>

                    <button className='btn formcadastroF' type='submit'>CONCLUIR CADASTRO</button>
                </div>
            </div>
            {/* END FORMULÁRIO CADASTRO DE CLIENTE FÍSICO*/}

            <Footer />
        </>
    );
}

export default ClienteFisico;