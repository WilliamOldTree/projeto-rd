import './atendimento_ao_cliente.css'
import Header from '../../components/header/Header'
import Footer from '../../components/footer/Footer'
import SAC from '../../components/asserts/icons/sac.png'
import Title from '../../components/title/Title'


function AtendimentoCliente() {
    return (
        <>

            <Header />

            <div className='container'>

            <Title titleIcon={SAC} titleText="Atendimento ao Cliente" />

                <h2 className='EnvieMensagem'><nobr>Envie uma Mensagem</nobr></h2>
 

                <form className='form-atendimento'>

                    <h3 className='CampoObrigatorio'><nobr>Campos com * são de preenchimento obrigatório</nobr></h3>
                    
                    <div className='mb-3'>
                        <label className='form-label'></label>
                        <input type='text' className='form-control' id='NomeAtendimento' required placeholder='*Nome:'  ></input>
                    </div>

                    <div className='mb-3'>
                        <label className='form-label'></label>
                        <input type='email' className='form-control' id='EmailAtendimento' required placeholder='*Email:'></input>
                    </div>

                    <div className='mb-3'>
                        <label className='form-label'></label>
                        <input type='text' className='form-control' id='ContatoAtendimento' placeholder='Telefone:'></input>
                    </div>

                    <div className='mb-3'>
                        <label className='form-label'></label>
                        <select className='form-select' id='AssuntoAtendimento' required>
                            <option selected >*Assunto</option>
                            <option>Devoluções</option>
                            <option>Pagamentos</option>
                            <option>Entregas</option>
                            <option>Trocas</option>
                        </select>
                    </div>

                    <div className='mb-3'>
                        <label className='form-label'></label>
                        <input type='text' className='form-control' id='MensagemAtendimento' required placeholder='*Mensagem:'></input>
                    </div>

                    <button type='submit' className='ButtonAtendimento'>ENVIAR</button>
                </form>


            </div>
            <Footer />
        </>
    )
}

export default AtendimentoCliente