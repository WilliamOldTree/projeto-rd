package br.com.rd.politeismo.ecommerce;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import br.com.rd.politeismo.ecommerce.service.ClienteFisicoService;
import br.com.rd.politeismo.ecommerce.service.ClienteJuridicoService;
import br.com.rd.politeismo.ecommerce.service.EnderecoService;
import br.com.rd.politeismo.ecommerce.service.ProdutoService;
import br.com.rd.politeismo.ecommerce.service.TelefoneService;

@EnableJpaRepositories
@SpringBootApplication
public class EcommercePoliteismoApplication implements CommandLineRunner{
	
	private Boolean sistema = true;

	private final EnderecoService enderecoService;
	private final ProdutoService produtoService;
	private final ClienteJuridicoService clienteJuridicoService;
	private final ClienteFisicoService clienteFisicoService;
	private final TelefoneService telefoneService;

	public EcommercePoliteismoApplication(EnderecoService enderecoService, ProdutoService produtoService,
			ClienteJuridicoService clienteJuridicoService, ClienteFisicoService clienteFisicoService,
			TelefoneService telefoneService) {
		super();
		this.enderecoService = enderecoService;
		this.produtoService = produtoService;
		this.clienteJuridicoService = clienteJuridicoService;
		this.clienteFisicoService = clienteFisicoService;
		this.telefoneService = telefoneService;
	}

	public static void main(String[] args) {
		SpringApplication.run(EcommercePoliteismoApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int acao;
		
		while(sistema) {
			System.out.println("Qual a ação que será executada?");
			System.out.println("0 - Sair ");
			System.out.println("1 - Endereco ");
			System.out.println("2 - Produto ");
			System.out.println("3 - Cliente Jurídico ");
			System.out.println("4 - Cliente Físico ");
			System.out.println("5 - Cadastro de Contato");

			acao = Integer.parseInt(sc.nextLine());

			if(acao == 1) {
				enderecoService.iniciar(sc);
			}else if(acao == 2) {
		    	produtoService.iniciar(sc);
			}else if(acao == 3) {
				clienteJuridicoService.iniciar(sc);
			}else if(acao == 4) {
				clienteFisicoService.iniciar(sc);
			}
		    else if(acao == 5) {
			telefoneService.iniciar(sc);
		}else {
				sistema = false;
			}
		}
		
		sc.close();
	}

}