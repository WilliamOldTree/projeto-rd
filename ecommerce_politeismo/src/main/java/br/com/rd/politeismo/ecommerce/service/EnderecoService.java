package br.com.rd.politeismo.ecommerce.service;

import java.util.Optional;
import java.util.Scanner;

import org.springframework.stereotype.Service;

import br.com.rd.politeismo.ecommerce.entities.Endereco;
import br.com.rd.politeismo.ecommerce.entities.Estado;
import br.com.rd.politeismo.ecommerce.entities.Fornecedor;
import br.com.rd.politeismo.ecommerce.repository.EnderecoRepository;
import br.com.rd.politeismo.ecommerce.repository.EstadoRepository;
import br.com.rd.politeismo.ecommerce.repository.FornecedorRepository;

@Service
public class EnderecoService {
    
	private Boolean sistema = true;
	
	private final EnderecoRepository enderecoRepository;
	private final EstadoRepository estadoRepository;
	private final FornecedorRepository fornecedorRepository;

	public EnderecoService (EnderecoRepository enderecoRepository, EstadoRepository estadoRepository, 
			                FornecedorRepository fornecedorRepository) {
		
		this.enderecoRepository = enderecoRepository;
		this.estadoRepository = estadoRepository;
		this.fornecedorRepository = fornecedorRepository;
	}
	
	public void iniciar(Scanner sc) {
		int acao;

		while (sistema) {
			System.out.println("Digite a ação que será realizada no Endereço: ");
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
		System.out.println("Digite o ID do Endereço para Exclusão");
		Long id = Long.parseLong(sc.nextLine());
		enderecoRepository.deleteById(id);
		System.out.println("Endereço Deletado!");		
	}

	private void visualizar(Scanner sc) {
		Iterable<Endereco> enderecos = enderecoRepository.findAll();
		enderecos.forEach(endereco -> System.out.println(endereco));		
	}

	private void atualizar(Scanner sc) {
	
		System.out.println("Digite o ID do Endereço que deseja alterar: ");
		Long id = Long.parseLong(sc.nextLine());
		
		System.out.println("Favoritar como (Casa, Trabalho..): ");
		String apelido = sc.nextLine();

		System.out.println("Digite o Logradouro: ");
		String nomeLogradouro = sc.nextLine();

		System.out.println("Digite o Tipo Logradouro (Rua, Avenida..): ");
		String tipoLogradouro = sc.nextLine();

		System.out.println("Digite o nº: ");
		String numero = sc.nextLine();
		
		System.out.println("Digite o CEP: ");
		String cep = sc.nextLine();
		
		System.out.println("Digite a Cidade: ");
		String cidade = sc.nextLine();

		System.out.println("Digite o Estado: ");
		Long estadoId = Long.parseLong(sc.nextLine());
		
		System.out.println("Caso seja Endereço de Forncedor digite seu ID / Caso não seja aperte (ENTER): ");
		Long fornecedorId = (long) Integer.parseInt(sc.nextLine());
		
		Endereco endereco = new Endereco();
		
		endereco.setId_endereco(id);
		endereco.setApelido(apelido);
		endereco.setNomeLougradouro(nomeLogradouro);
		endereco.setTipoLougradouro(tipoLogradouro);
		endereco.setNumero(numero);
		endereco.setCep(cep);
		endereco.setCidade(cidade);
		
		Optional<Estado> estado = estadoRepository.findById(estadoId);
		endereco.setEstado(estado.get());
		
		Optional<Fornecedor> fornecedor = fornecedorRepository.findById(fornecedorId);
		endereco.setFornecedor(fornecedor.get());
		
		enderecoRepository.save(endereco);
		
		System.out.println("Endereço Atualizado!");

	}

	private void salvar(Scanner sc) {
		
		System.out.println("________Cadastro de Endereço________");

		System.out.println("Favoritar como (Casa, Trabalho..): ");
		String apelido = sc.nextLine();

		System.out.println("Digite o Logradouro: ");
		String nomeLogradouro = sc.nextLine();

		System.out.println("Digite o Tipo Logradouro (Rua, Avenida..): ");
		String tipoLogradouro = sc.nextLine();

		System.out.println("Digite o nº: ");
		String numero = sc.nextLine();
		
		System.out.println("Digite o CEP: ");
		String cep = sc.nextLine();
		
		System.out.println("Digite a Cidade: ");
		String cidade = sc.nextLine();

		System.out.println("Digite o Estado: ");
		Long estadoId = Long.parseLong(sc.nextLine());
		
		System.out.println("Caso seja Endereço de Forncedor digite seu ID / Caso não seja aperte (ENTER): ");
		Long fornecedorId = Long.parseLong(sc.nextLine());
		
		Endereco endereco = new Endereco();
		
		endereco.setApelido(apelido);
		endereco.setNomeLougradouro(nomeLogradouro);
		endereco.setTipoLougradouro(tipoLogradouro);
		endereco.setNumero(numero);
		endereco.setCep(cep);
		endereco.setCidade(cidade);
		
		Optional<Estado> estado = estadoRepository.findById(estadoId);
		endereco.setEstado(estado.get());
		
		Optional<Fornecedor> fornecedor = fornecedorRepository.findById(fornecedorId);
		endereco.setFornecedor(fornecedor.get());
		
		enderecoRepository.save(endereco);
		
		System.out.println("Endereço Salvo!");

	}

}