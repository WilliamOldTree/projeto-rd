import './atendimento_ao_cliente.css'
import Header from '../../components/header/Header'
import Footer from '../../components/footer/Footer'
import SAC from '../../components/asserts/icons/sac.png'
import Title from '../../components/title/Title'
import Email from '../../components/asserts/icons/email.png'
import Whatsapp from '../../components/asserts/icons/whatsAtendimento.png'
import Telefone from '../../components/asserts/icons/placa-de-telefone .png'


function AtendimentoCliente() {
    return (
        <>

            <Header />

            <div className='container'>

                <Title titleIcon={SAC} titleText="Atendimento ao Cliente" />

                <h2 className='EnvieMensagem'><nobr>Envie uma Mensagem</nobr></h2>


                <div className='form-atendimento '>
                    <p className='FaleConosco'>
                        - Tem alguma dúvida,sugestão ou reclamação? Entre em contato com os nossos canais de
                        atendimento, para solucionar o seu problema o mais rápido possível.
                    </p>
                </div>

                <div >
                    <h1 className='cont1'>Whatsapp</h1>
                    <a href="https://api.whatsapp.com/send/?phone=5511952901633&text=Boas-vindas+a+Polite%C3%ADsmo+Shop%21+Como+posso+te+ajudar%3F+Me+conta+o+que+aconteceu+e+o+que+voc%C3%AA+precisa+%3F&app_absent=0">  <img src={Whatsapp} width='10%' className='whatsA mb-3'></img></a>
                </div>

                <div >
                    <h1 className='cont2'>Email</h1>
                    <a href="mailto:politeismoshop@hotmail.com?Body=Ol%E1%2C%20deixe%20sua%20mensagem%20para%20n%F3s%21">  <img src={Email} className='emailA mb-3' width={'10%'}></img></a>
                </div>

                <div >
                    <a href="tel:+5511952901633"><img className='telefoneA mb-3' src={Telefone} width={'10%'}></img></a>
                    <h1 className='cont3'>Telefone</h1>
                </div>




            </div>
            <Footer />
        </>
    )
}

export default AtendimentoCliente