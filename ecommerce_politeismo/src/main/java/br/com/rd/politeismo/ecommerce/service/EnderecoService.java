package br.com.rd.politeismo.ecommerce.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import org.springframework.stereotype.Service;
import br.com.rd.politeismo.ecommerce.entities.Endereco;
import br.com.rd.politeismo.ecommerce.entities.Estado;
import br.com.rd.politeismo.ecommerce.entities.Fisica;
import br.com.rd.politeismo.ecommerce.entities.Fornecedor;
import br.com.rd.politeismo.ecommerce.entities.Juridica;
import br.com.rd.politeismo.ecommerce.repository.EnderecoRepository;
import br.com.rd.politeismo.ecommerce.repository.EstadoRepository;
import br.com.rd.politeismo.ecommerce.repository.FisicaRepository;
import br.com.rd.politeismo.ecommerce.repository.FornecedorRepository;
import br.com.rd.politeismo.ecommerce.repository.JuridicaRepository;

@Service
public class EnderecoService {
    
	private Boolean sistema = true;
	
	private final EnderecoRepository enderecoRepository;
	private final EstadoRepository estadoRepository;
	private final FornecedorRepository fornecedorRepository;
	private final FisicaRepository fisicaRepository;
	private final JuridicaRepository juridicaRepository;


	public EnderecoService (EnderecoRepository enderecoRepository, EstadoRepository estadoRepository, 
			                FornecedorRepository fornecedorRepository, FisicaRepository fisicaRepository,
			                JuridicaRepository juridicaRepository) {
		
		this.enderecoRepository = enderecoRepository;
		this.estadoRepository = estadoRepository;
		this.fornecedorRepository = fornecedorRepository;
		this.fisicaRepository = fisicaRepository;
		this.juridicaRepository = juridicaRepository;
	}
	
	public void iniciar(Scanner sc) {
		int acao;

		while (sistema) {
			System.out.println("Digite a ação que será realizada no Endereço: ");
			System.out.println("0 - Sair");
			System.out.println("1 - Salvar Endereço de Cliente Físico");
			System.out.println("2 - Salvar Endereço de Cliente Jurídico");
			System.out.println("3 - Salvar Endereço de Fornecedor");
			System.out.println("4 - Atualizar Endereço");
			System.out.println("5 - Visualizar Endereço");
			System.out.println("6 - Deletar Endereço");

			acao = Integer.parseInt(sc.nextLine());

			switch (acao) {
			case 1:
				salvarEnderecoClienteFisico(sc);
				break;
			case 2:
				salvarEnderecoClienteJuridico(sc);
				break;
			case 3:
				salvarEnderecoFornecedor(sc);
				break;
			case 4:
				atualizar(sc);
				break;
			case 5:
				visualizar(sc);
				break;
			case 6:
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
		
		enderecoRepository.save(endereco);
		
		System.out.println("Endereço Atualizado!");

	}
	
	
	private void salvarEnderecoClienteFisico(Scanner sc) {
		
		System.out.println("________ Cadastro de Endereço (Cliente Físico) ________");

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
		
		List<Fisica> clientes = clienteFisica(sc);

		
		Endereco endereco = new Endereco();
		
		endereco.setApelido(apelido);
		endereco.setNomeLougradouro(nomeLogradouro);
		endereco.setTipoLougradouro(tipoLogradouro);
		endereco.setNumero(numero);
		endereco.setCep(cep);
		endereco.setCidade(cidade);
		
		Optional<Estado> estado = estadoRepository.findById(estadoId);
		endereco.setEstado(estado.get());
		
		endereco.setClientesFisica(clientes);
		
		enderecoRepository.save(endereco);
		
		System.out.println("Endereço de Cliente Salvo!");

	}
	
	private List<Fisica> clienteFisica(Scanner sc) {
		Boolean isTrue = true;
		List<Fisica> clientes = new ArrayList<>();

		while (isTrue) {
			System.out.println("Digite o ID do Cliente Físico(Para sair digite 0)");
			Long clienteId = Long.parseLong(sc.nextLine());

			if (clienteId != 0) {
				Optional<Fisica> cliente = fisicaRepository.findById(clienteId);
				clientes.add(cliente.get());
			} else {
				isTrue = false;
			}
		}
		return clientes;
	}
	
	
       private void salvarEnderecoClienteJuridico(Scanner sc) {
		
		System.out.println("________ Cadastro de Endereço (Cliente Jurídico) ________");

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
		
		List<Juridica> clientes = clienteJuridico(sc);

		
		Endereco endereco = new Endereco();
		
		endereco.setApelido(apelido);
		endereco.setNomeLougradouro(nomeLogradouro);
		endereco.setTipoLougradouro(tipoLogradouro);
		endereco.setNumero(numero);
		endereco.setCep(cep);
		endereco.setCidade(cidade);
		
		Optional<Estado> estado = estadoRepository.findById(estadoId);
		endereco.setEstado(estado.get());
		
		endereco.setClienteJuridica(clientes);
		
		enderecoRepository.save(endereco);
		
		System.out.println("Endereço de Cliente Jurídico Salvo!");

	}
	
	private List<Juridica> clienteJuridico(Scanner sc) {
		Boolean isTrue = true;
		List<Juridica> clientes = new ArrayList<>();

		while (isTrue) {
			System.out.println("Digite o ID do Cliente Jurídico (Para sair digite 0)");
			Long clienteId = Long.parseLong(sc.nextLine());

			if (clienteId != 0) {
				Optional<Juridica> cliente = juridicaRepository.findById(clienteId);
				clientes.add(cliente.get());
			} else {
				isTrue = false;
			}
		}
		return clientes;
	}
	

	private void salvarEnderecoFornecedor(Scanner sc) {
		
		System.out.println("________ Cadastro de Endereço (Fornecedor) ________");

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
		
		System.out.println("Digite o ID de Forncedor : ");
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
		
		System.out.println("Endereço de Fornecedor Salvo!");

	}

}
