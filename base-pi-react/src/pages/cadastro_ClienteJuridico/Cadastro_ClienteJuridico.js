import './Cadastro_ClienteJuridico.css'

/* LINK PAGES */
import { Link } from 'react-router-dom'
import Header from '../../components/header/Header';
import Footer from '../../components/footer/Footer';
import Title from '../../components/title/Title'

/* ICONS CADASTRO */
import User from '../../components/asserts/icons/user.png';

function ClienteJuridico() {
    return (
        <>
            <Header />

            {/* BEGGIN FORMULÁRIO CADASTRO DE CLIENTE JURÍDICO*/}
            <div class="container">
            <Title titleIcon={User} titleText="Nova Conta"/>


                <div className='buttons-juridico'>
                    <Link to="/cadastro_ClienteFisico" class="btn pessoaF juridico" role="button">PESSOA FÍSICA</Link>
                    <Link to="/cadastro_ClienteJuridico" class="btn pessoaJ juridico" role="button">PESSOA JURÍDICA</Link>
                </div>

                <div className='juridico-container'>
                <div class="cadastroPessoaJ juridico">
                    <p class="campostopo">Campos marcados com * são de preenchimento obrigatório</p>
                    <div class="mb-3">
                        <label for="razaoSocial_ClienteJuridico" class="form-label1 juridico">*Razão Social:</label>
                        <input type="text" class="form-control" id="razaoSocial_ClienteJuridico" />
                    </div>
                    <div class="mb-3">
                        <label for="insEstadual_ClienteJuridico" class="form-label2 juridico">*Inscrição Estadual:</label>
                        <input type="text" class="form-control" id="insEstadual_ClienteJuridico" />
                    </div>
                    <div class="mb-3">
                        <label for="cnpj" class="form-label3 juridico">*CNPJ:</label>
                        <input type="text" class="form-control" id="cnpj_ClienteJuridico" />
                    </div>
                    <div class="mb-3">
                        <label for="nome_ClienteJuridico" class="form-label4 juridico">*Nome Completo:</label>
                        <input type="text" class="form-control" id="nome_ClienteJuridico" />
                    </div>

                    <div class="mb-3">
                        <label for="data_ClienteJuridico" class="form-label5 juridico">Data Nascimento:</label>
                        <input type="date" class="form-control" id="data_ClienteJuridico" />
                    </div>

                    <p class="aviso-tel juridico">Ao menos um telefone deve ser informado:</p>

                    <div class="mb-3">
                        <label for="telefone_ClienteJuridico" class="form-label6 juridico">Telefone Fixo ou Comercial:</label>
                        <input type="tel" class="form-control" id="telefone_ClienteJuridico" />
                    </div>

                    <div class="mb-3">
                        <label for="celular_ClienteJuridico" class="form-label7 juridico">Telefone Celular:</label>
                        <input type="tel" class="form-control" id="celular_ClienteJuridico" />
                    </div>

                    <div class="mb-3">
                        <label for="email1_ClienteJuridico" class="form-label8 juridico">E-mail</label>
                        <input type="email" class="form-control" id="email1_ClienteJuridico" />
                    </div>

                    <div class="mb-3">
                        <label for="email2_ClienteJuridico" class="form-label9 juridico">*Digite novamente:</label>
                        <input type="email" class="form-control" id="email2_ClienteJuridico" />
                    </div>

                    <div class="mb-3">
                        <label for="senha_ClienteJuridico1" class="form-label10 juridico">*Crie sua Senha de acesso:</label>
                        <input type="password" class="form-control" id="senha1_ClienteJuridico" />
                    </div>

                    <div class="mb-3">
                        <label for="senha2_ClienteJuridico" class="form-label11 juridico">*Digite novamente:</label>
                        <input type="password" class="form-control" id="senha2_ClienteJuridico" />
                    </div>

                    <div class="mb-3 form-check">
                        <input type="checkbox" class="form-check-input" id="exampleCheck1_ClienteJuridico" />
                        <label class="form-check-label juridico" for="exampleCheck1">Desejo receber e-mails promocionais</label>
                    </div>

                    <p class="aviso-privacidade juridico">Ao criar uma conta você está de acordo com nossa <em>Política de Privacidade.</em></p>

                    <button class="btn formcadastroJ juridico" type="submit">CONCLUIR CADASTRO</button>
                </div>
                </div>
            </div>
            {/* END FORMULÁRIO CADASTRO DE CLIENTE JURÍDICO*/}

            <Footer />
        </>
    );
}

export default ClienteJuridico;