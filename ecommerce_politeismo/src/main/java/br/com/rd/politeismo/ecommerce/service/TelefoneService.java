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

		
		
		System.out.println("Digite o DDD");
		Integer ddd = Integer.parseInt(sc.nextLine());

		System.out.println("Digite o seu numero de Celular");
		String celular = sc.nextLine();

		System.out.println("tem um numero fixo? (Caso não pressione ENTER)");
		String fixo = sc.nextLine();

		System.out.println("Digite o ID do Cliente Físico (Caso não pressione ENTER)");
		Long clienteFId = (long) Integer.parseInt(sc.nextLine());
		
		System.out.println("Digite o ID do Cliente Juridico (Caso não pressione ENTER)");
		Long clienteJId = (long) Integer.parseInt(sc.nextLine());
		
		System.out.println("Esse cliente algum id de fornecedor? (Caso não pressione ENTER) ");
		Long fornecedorId = (long) Integer.parseInt(sc.nextLine());



		Telefone telefone = new Telefone();
		telefone.setDdd(ddd);
		telefone.setCelular(celular);
		telefone.setFixo(fixo);

		
		
          
		Optional<Fornecedor> fornecedor = fornecedorRepository.findById(fornecedorId);
		telefone.setFornecedor(fornecedor.get());

		
		Optional<Fisica> fisica = fisicaRepository.findById(clienteFId);
		telefone.setFisica(fisica.get());
		
		
		Optional<Juridica> juridica = juridicaRepository.findById(clienteJId);
		telefone.setJuridica(juridica.get());

		telefoneRepository.save(telefone);

		System.out.println("Contato Salvo com Sucesso");

	}

	private void atualizar(Scanner sc) {
		
		System.out.println("Digite o ID do Contato");
		Long id = (long) Integer.parseInt(sc.nextLine());
		
		
		System.out.println("Digite o DDD");
		Integer ddd = Integer.parseInt(sc.nextLine());

		System.out.println("Digite o seu numero de Celular");
		String celular = sc.nextLine();

		System.out.println("tem um numero fixo?");
		String fixo = sc.nextLine();

		System.out.println("Digite o ID do Cliente Físico (Caso não pressione ENTER)");
		Long clienteFId = (long) Integer.parseInt(sc.nextLine());
		
		System.out.println("Digite o ID do Cliente Juridico (Caso não pressione ENTER)");
		Long clienteJId = (long) Integer.parseInt(sc.nextLine());

		System.out.println("Esse cliente tem  algum id de fornecedor? (Caso não pressione ENTER) ");
		Long fornecedorId = (long) Integer.parseInt(sc.nextLine());

		

		Telefone telefone = new Telefone();
		telefone.setId(id);
		telefone.setDdd(ddd);
		telefone.setCelular(celular);
		telefone.setFixo(fixo);
         

	
		Optional<Fornecedor> fornecedor = fornecedorRepository.findById(fornecedorId);
		telefone.setFornecedor(fornecedor.get());

		
		Optional<Fisica> fisica = fisicaRepository.findById(clienteFId);
		telefone.setFisica(fisica.get());
		
		
		Optional<Juridica> juridica = juridicaRepository.findById(clienteJId);
		telefone.setJuridica(juridica.get());

		telefoneRepository.save(telefone);

		System.out.println("Contato Atualizado com Sucesso");
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
