package br.com.rd.politeismo.ecommerce.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;
import java.util.Scanner;
import org.springframework.stereotype.Service;

import br.com.rd.politeismo.ecommerce.entities.Fisica;
import br.com.rd.politeismo.ecommerce.entities.Sexo;
import br.com.rd.politeismo.ecommerce.repository.FisicaRepository;
import br.com.rd.politeismo.ecommerce.repository.SexoRepository;

@Service
public class ClienteFisicoService {
	private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	private Boolean sistema = true;
	
	private final FisicaRepository fisicaRepository;
	private final SexoRepository sexoRepository;

	public ClienteFisicoService(FisicaRepository fisicaRepository, SexoRepository sexoRepository) {
		this.fisicaRepository = fisicaRepository;
		this.sexoRepository = sexoRepository;
	}
	
	
	public void iniciar(Scanner sc) {
		int acao;

		while (sistema) {
			System.out.println("Digite a ação que será realizada no Cliente Físico: ");
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
		
		fisicaRepository.deleteById(id);
		System.out.println("Cliente Deletado!");				
	}


	private void visualizar(Scanner sc) {
		Iterable<Fisica> clienteFisica = fisicaRepository.findAll();
		clienteFisica.forEach(fisica -> System.out.println(fisica));					
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

		System.out.println("Digite o CPF: ");
		String cpf = sc.nextLine();

		System.out.println("Digite a Data de Nascimento: ");
		String dataNascimento = sc.nextLine();

		System.out.println("Digite o Sexo: (1 - FEMININO | 2 - MASCULINO | 3 - OUTROS)");
		Long sexoId = Long.parseLong(sc.nextLine());
		
		Fisica clienteFisico = new Fisica();
		
		clienteFisico.setId(id);
		clienteFisico.setNome(nome);
		clienteFisico.setEmail(email);
		clienteFisico.setSenha(senha);
		clienteFisico.setCpf(cpf);
		clienteFisico.setNascimento(LocalDate.parse(dataNascimento, formatter));
		
		Optional<Sexo> sexo = sexoRepository.findById(sexoId);
		clienteFisico.setIdSexo(sexo.get());
					
		fisicaRepository.save(clienteFisico);
		
		System.out.println("Cliente Atualizado!");			
	}


	private void salvar(Scanner sc) {
		System.out.println("________Cadastro de Cliente Físico________");

		System.out.println("Digite o Nome: ");
		String nome = sc.nextLine();

		System.out.println("Digite a Email: ");
		String email = sc.nextLine();

		System.out.println("Digite o Senha: ");
		String senha = sc.nextLine();

		System.out.println("Digite o CPF: ");
		String cpf = sc.nextLine();

		System.out.println("Digite a Data de Nascimento: ");
		String dataNascimento = sc.nextLine();

		System.out.println("Digite o Sexo: (1 - FEMININO | 2 - MASCULINO | 3 - OUTROS)");
		Long sexoId = Long.parseLong(sc.nextLine());
		
		Fisica clienteFisico = new Fisica();
		
		clienteFisico.setNome(nome);
		clienteFisico.setEmail(email);
		clienteFisico.setSenha(senha);
		clienteFisico.setCpf(cpf);
		clienteFisico.setNascimento(LocalDate.parse(dataNascimento, formatter));
		
		Optional<Sexo> sexo = sexoRepository.findById(sexoId);
		clienteFisico.setIdSexo(sexo.get());
					
		fisicaRepository.save(clienteFisico);
		
		System.out.println("Cliente Salvo!");			
	}
}
