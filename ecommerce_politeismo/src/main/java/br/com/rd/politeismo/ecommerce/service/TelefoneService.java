package br.com.rd.politeismo.ecommerce.service;


import java.util.Optional;
import java.util.Scanner;

import org.springframework.stereotype.Service;

import br.com.rd.politeismo.ecommerce.entities.Fisica;
import br.com.rd.politeismo.ecommerce.entities.Fornecedor;
import br.com.rd.politeismo.ecommerce.entities.Juridica;
import br.com.rd.politeismo.ecommerce.entities.Telefone;
import br.com.rd.politeismo.ecommerce.repository.FisicaRepository;
import br.com.rd.politeismo.ecommerce.repository.FornecedorRepository;
import br.com.rd.politeismo.ecommerce.repository.JuridicaRepository;
import br.com.rd.politeismo.ecommerce.repository.TelefoneRepository;


@Service
public class TelefoneService {
	private Boolean sistema = true;
	
	private final TelefoneRepository telefoneRepository;
	private final FornecedorRepository fornecedorRepository;
	private final FisicaRepository fisicaRepository;
	private final JuridicaRepository juridicaRepository;



	public TelefoneService( TelefoneRepository telefoneRepository,
			FornecedorRepository fornecedorRepository, FisicaRepository fisicaRepository,
			JuridicaRepository juridicaRepository) {
		super();
		this.telefoneRepository = telefoneRepository;
		this.fornecedorRepository = fornecedorRepository;
		this.fisicaRepository = fisicaRepository;
		this.juridicaRepository = juridicaRepository;
	}

	public void iniciar(Scanner sc) {
		int acao;

		while (sistema) {
			System.out.println("Qual a ação que será realizada no Cadastro de contato");
			System.out.println("0 - Sair");
			System.out.println("1 - Salvar");
			System.out.println("2 - Atualizar");
			System.out.println("3 - Visualizar");
			System.out.println("4 - Deletar");

			acao = Integer.parseInt(sc.nextLine());

			switch (acao) {
			case 1:
				salvar(sc);
				break;
			case 2:
				atualizar(sc);
				break;
			case 3:
				visualizar();
				break;
			case 4:
				deletar(sc);
				break;
			default:
				sistema = false;
				break;
			}
		}
	}

	private void salvar(Scanner sc) {
	    Boolean opcao = true;

        int escolha;
        
		while(opcao){
			System.out.println("A qual cliente esse contato pertence?");
			System.out.println("0- Voltar");
			System.out.println("5- Cliente Físico");
			System.out.println("7- Fornecedor");
			
			escolha = Integer.parseInt(sc.nextLine());
			
			switch (escolha) {
			case 5:
				System.out.println("Digite o DDD");
				Integer ddd = Integer.parseInt(sc.nextLine());

				System.out.println("Digite o seu numero de Celular");
				String celular = sc.nextLine();

				System.out.println("tem um numero fixo? (Caso não pressione ENTER)");
				String fixo = sc.nextLine();

				System.out.println("ID do Cliente Físico");
				Long clienteFId = (long) Integer.parseInt(sc.nextLine());
				
				Telefone telefone = new Telefone();
				telefone.setDdd(ddd);
				telefone.setCelular(celular);
				telefone.setFixo(fixo);

				Optional<Fisica> fisica = fisicaRepository.findById(clienteFId);
				telefone.setFisica(fisica.get());
				
				telefoneRepository.save(telefone);

				System.out.println("Contato Salvo com Sucesso");
				
				break;
		
			case 7:
				System.out.println("Digite o DDD");
				Integer dddF = Integer.parseInt(sc.nextLine());

				System.out.println("Digite o seu numero de Celular");
				String celularF = sc.nextLine();

				System.out.println("tem um numero fixo? (Caso não pressione ENTER)");
				String fixoF = sc.nextLine();

				
				
				System.out.println(" id de fornecedor");
				Long fornecedorId = (long) Integer.parseInt(sc.nextLine());
				
				
				Telefone telefoneF = new Telefone();
				telefoneF.setDdd(dddF);
				telefoneF.setCelular(celularF);
				telefoneF.setFixo(fixoF);


				Optional<Fornecedor> fornecedor = fornecedorRepository.findById(fornecedorId);
				telefoneF.setFornecedor(fornecedor.get());
				
				telefoneRepository.save(telefoneF);
				System.out.println("Contato Salvo com Sucesso");	
				break;
				
			default:
				opcao = false;
				break;
			
		}
	}
			

	}

	private void atualizar(Scanner sc) {
	    Boolean opcao = true;

		
		
		  int escolha;
	        
			while(opcao){
				System.out.println("A qual cliente esse contato pertence?");
				System.out.println("0- Voltar");
				System.out.println("5- Cliente Físico");
				System.out.println("7- Fornecedor");
				
				escolha = Integer.parseInt(sc.nextLine());
				
				switch (escolha) {
				case 5:
					
					System.out.println("ID do Contato");
					Long idF = (long) Integer.parseInt(sc.nextLine());
					
					System.out.println("Digite o DDD");
					Integer ddd = Integer.parseInt(sc.nextLine());

					System.out.println("Digite o seu numero de Celular");
					String celular = sc.nextLine();

					System.out.println("tem um numero fixo? (Caso não pressione ENTER)");
					String fixo = sc.nextLine();

					System.out.println("ID do Cliente Físico");
					Long clienteFId = (long) Integer.parseInt(sc.nextLine());
					
					Telefone telefone = new Telefone();
					telefone.setId(idF);
					telefone.setDdd(ddd);
					telefone.setCelular(celular);
					telefone.setFixo(fixo);

					Optional<Fisica> fisica = fisicaRepository.findById(clienteFId);
					telefone.setFisica(fisica.get());
					
					telefoneRepository.save(telefone);

					System.out.println("Contato Atualizado com Sucesso");
					
					break;
				case 7:
					System.out.println("ID do Contato");
					Long idFor = (long) Integer.parseInt(sc.nextLine());
					
					
					System.out.println("Digite o DDD");
					Integer dddF = Integer.parseInt(sc.nextLine());

					System.out.println("Digite o seu numero de Celular");
					String celularF = sc.nextLine();

					System.out.println("tem um numero fixo? (Caso não pressione ENTER)");
					String fixoF = sc.nextLine();

					
					
					System.out.println(" id de fornecedor");
					Long fornecedorId = (long) Integer.parseInt(sc.nextLine());
					
					
					Telefone telefoneF = new Telefone();
					telefoneF.setId(idFor);
					telefoneF.setDdd(dddF);
					telefoneF.setCelular(celularF);
					telefoneF.setFixo(fixoF);


					Optional<Fornecedor> fornecedor = fornecedorRepository.findById(fornecedorId);
					telefoneF.setFornecedor(fornecedor.get());
					
					telefoneRepository.save(telefoneF);
					System.out.println("Contato Atualizado com Sucesso");	
					break;
					
				default:
					opcao = false;
					break;
				
			}
		}
	}

	private void visualizar() {
		Iterable<Telefone> telefones = telefoneRepository.findAll();
		telefones.forEach(telefone -> System.out.println(telefone));
	}

	private void deletar(Scanner sc) {
		System.out.println("Digite o ID do Contato");
		Long id = (long) Integer.parseInt(sc.nextLine());
		telefoneRepository.deleteById(id);
		System.out.println("Contato Deletado com Sucesso");
	}
}
