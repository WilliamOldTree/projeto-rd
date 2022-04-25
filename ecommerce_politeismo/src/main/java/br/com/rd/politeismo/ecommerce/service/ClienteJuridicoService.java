package br.com.rd.politeismo.ecommerce.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import org.springframework.stereotype.Service;

import br.com.rd.politeismo.ecommerce.entities.Juridica;
import br.com.rd.politeismo.ecommerce.repository.JuridicaRepository;

@Service
public class ClienteJuridicoService {
	
	private Boolean sistema = true;
	
	private final JuridicaRepository juridicaRepository;

	private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public ClienteJuridicoService(JuridicaRepository juridicaRepository) {
		this.juridicaRepository = juridicaRepository;
	}
	
	public void iniciar(Scanner sc) {
		int acao;

		while (sistema) {
			System.out.println("Digite a ação que será realizada no Cliente Juridico: ");
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
				visualizar(sc);
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

	private void deletar(Scanner sc) {
		System.out.println("Digite o ID do Cliente para Exclusão: ");
		Long id = Long.parseLong(sc.nextLine());
		
		juridicaRepository.deleteById(id);
		System.out.println("Cliente Deletado!");			
	}

	private void visualizar(Scanner sc) {
		Iterable<Juridica> clienteJuridico = juridicaRepository.findAll();
		clienteJuridico.forEach(juridica -> System.out.println(juridica));			
	}

	private void atualizar(Scanner sc) {
		System.out.println("Digite o ID do Cliente que deseja alterar: ");
		Long id = Long.parseLong(sc.nextLine());
		
		System.out.println("Digite o Nome: ");
		String nome = sc.nextLine();

		System.out.println("Digite a Email: ");
		String email = sc.nextLine();

		System.out.println("Digite o Senha: ");
		String senha = sc.nextLine();

		System.out.println("Digite o CNPJ: ");
		String cnpj = sc.nextLine();

		System.out.println("Digite a Data de Abertura: ");
		String dataAbetura = sc.nextLine();

		System.out.println("Digite a Inscrição Municipal: ");
		String inscricaoEstadual = sc.nextLine();
		
		System.out.println("Digite a Razão Social: ");
		String razaoSocial = sc.nextLine();

		
		Juridica clienteJuridico = new Juridica();
		
		clienteJuridico.setId(id);
		clienteJuridico.setNome(nome);
		clienteJuridico.setEmail(email);
		clienteJuridico.setSenha(senha);
		clienteJuridico.setCnpj(cnpj);
		clienteJuridico.setAbertura(LocalDate.parse(dataAbetura, formatter));
		clienteJuridico.setInscricaoEstadual(inscricaoEstadual);
		clienteJuridico.setRazaoSocial(razaoSocial);
					
		juridicaRepository.save(clienteJuridico);
		
		System.out.println("Cliente Atualizado!");			
		
		
	}

	private void salvar(Scanner sc) {
		System.out.println("________Cadastro de Cliente Juridico________");

		System.out.println("Digite o Nome: ");
		String nome = sc.nextLine();

		System.out.println("Digite a Email: ");
		String email = sc.nextLine();

		System.out.println("Digite o Senha: ");
		String senha = sc.nextLine();

		System.out.println("Digite o CNPJ: ");
		String cnpj = sc.nextLine();

		System.out.println("Digite a Data de Abertura: ");
		String dataAbetura = sc.nextLine();

		System.out.println("Digite a Inscrição Municipal: ");
		String inscricaoEstadual = sc.nextLine();
		
		System.out.println("Digite a Razão Social: ");
		String razaoSocial = sc.nextLine();

		
		Juridica clienteJuridico = new Juridica();
		
		clienteJuridico.setNome(nome);
		clienteJuridico.setEmail(email);
		clienteJuridico.setSenha(senha);
		clienteJuridico.setCnpj(cnpj);
		clienteJuridico.setAbertura(LocalDate.parse(dataAbetura, formatter));
		clienteJuridico.setInscricaoEstadual(inscricaoEstadual);
		clienteJuridico.setRazaoSocial(razaoSocial);
					
		juridicaRepository.save(clienteJuridico);
		
		System.out.println("Cliente Salvo!");			
		
	}
	
	
	
}
