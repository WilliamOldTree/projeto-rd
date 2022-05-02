package br.com.rd.politeismo.ecommerce.service;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.Scanner;
import org.springframework.stereotype.Service;

import br.com.rd.politeismo.ecommerce.entities.Categoria;
import br.com.rd.politeismo.ecommerce.entities.Departamento;
import br.com.rd.politeismo.ecommerce.entities.Produto;
import br.com.rd.politeismo.ecommerce.entities.ProdutosDestaque;
import br.com.rd.politeismo.ecommerce.repository.CategoriaRepository;
import br.com.rd.politeismo.ecommerce.repository.DepartamentoRepository;
import br.com.rd.politeismo.ecommerce.repository.ProdutoRepository;
import br.com.rd.politeismo.ecommerce.repository.ProdutosDestaqueRepository;

@Service
public class ProdutoService {
	  
		private Boolean sistema = true;
		
	    private final ProdutoRepository produtoRepository;
	    private final DepartamentoRepository departamentoRepository;
	    private final CategoriaRepository categoriaRepository;
	    private final ProdutosDestaqueRepository produtosDestaqueRepository;

		public ProdutoService (ProdutoRepository produtoRepository, DepartamentoRepository departamentoRepository, 
				               CategoriaRepository categoriaRepository, ProdutosDestaqueRepository produtosDestaqueRepository) {
			
			this.produtoRepository = produtoRepository;
			this.departamentoRepository = departamentoRepository;
			this.categoriaRepository = categoriaRepository;
			this.produtosDestaqueRepository = produtosDestaqueRepository;
		}
		
		public void iniciar(Scanner sc) {
			int acao;

			while (sistema) {
				System.out.println("Digite a ação que será realizada no Produto: ");
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
			System.out.println("Digite o ID do Produto para Exclusão: ");
			Long id = Long.parseLong(sc.nextLine());
			produtoRepository.deleteById(id);
			System.out.println("Produto Deletado!");				
		}

		private void visualizar(Scanner sc) {
			Iterable<Produto> produtos = produtoRepository.findAll();
			produtos.forEach(produto -> System.out.println(produto));				
		}

		private void atualizar(Scanner sc) {
			
			System.out.println("Digite o ID do Produto que deseja alterar: ");
			Long id = Long.parseLong(sc.nextLine());
			
			System.out.println("Digite o Nome: ");
			String descricao = sc.nextLine();

			System.out.println("Digite o Volume: ");
			Double volume = Double.parseDouble(sc.nextLine());

			System.out.println("Digite o Peso: ");
			Double peso = Double.parseDouble(sc.nextLine());

			System.out.println("Digite o Preço: ");
			BigDecimal preco = new BigDecimal(sc.nextLine());
			
			System.out.println("Digite a Quantidade: ");
			Integer quantidade =  Integer.parseInt(sc.nextLine());

			System.out.println("Digite ID do Departamento: ");
			Long departamentoId = Long.parseLong(sc.nextLine());
			
			System.out.println("Digite ID da Categoria: ");
			Long categoriaId = Long.parseLong(sc.nextLine());

			System.out.println("Digite ID do Desconto: ");
			Long descontoId = Long.parseLong(sc.nextLine());
			
			Produto produto = new Produto();
			
			produto.setId(id);
			produto.setDescricao(descricao);
			produto.setVolume(volume);
			produto.setPeso(peso);
			produto.setPreco(preco);
	        produto.setQuantidade(quantidade);
	        
			Optional<Departamento> departamento = departamentoRepository.findById(departamentoId);
	        produto.setDepartamento(departamento.get());
	        
			Optional<Categoria> categoria = categoriaRepository.findById(categoriaId);
	        produto.setCategoria(categoria.get());
	        
			Optional<ProdutosDestaque> produtosDestaque = produtosDestaqueRepository.findById(descontoId);
	        produto.setDestaque(produtosDestaque.get());
						
			produtoRepository.save(produto);
			
			System.out.println("Produto Atualizado!");		
			
		}

		private void salvar(Scanner sc) {
			System.out.println("________Cadastro de Produto________");

			System.out.println("Digite o Nome: ");
			String descricao = sc.nextLine();

			System.out.println("Digite o Volume: ");
			Double volume = Double.parseDouble(sc.nextLine());

			System.out.println("Digite o Peso: ");
			Double peso = Double.parseDouble(sc.nextLine());

			System.out.println("Digite o Preço: ");
			BigDecimal preco = new BigDecimal(sc.nextLine());
			
			System.out.println("Digite a Quantidade: ");
			
			Integer quantidade =  Integer.parseInt(sc.nextLine());
			System.out.println("Digite o Status: ( 0 - INATIVO | 1 - ATIVO )");
			Boolean status =  Boolean.parseBoolean(sc.nextLine());
			
			System.out.println("Digite o Departamento: ");
			Long departamentoId = Long.parseLong(sc.nextLine());
			
			System.out.println("Digite a Categoria: ");
			Long categoriaId = Long.parseLong(sc.nextLine());

			System.out.println("Digite o Desconto: ");
			Long descontoId = Long.parseLong(sc.nextLine());
			
			Produto produto = new Produto();
			
			produto.setDescricao(descricao);
			produto.setVolume(volume);
			produto.setPeso(peso);
			produto.setPreco(preco);
	        produto.setQuantidade(quantidade);
	        produto.setFlInativo(status);
	        
			Optional<Departamento> departamento = departamentoRepository.findById(departamentoId);
	        produto.setDepartamento(departamento.get());
	        
			Optional<Categoria> categoria = categoriaRepository.findById(categoriaId);
	        produto.setCategoria(categoria.get());
	        
			Optional<ProdutosDestaque> produtosDestaque = produtosDestaqueRepository.findById(descontoId);
	        produto.setDestaque(produtosDestaque.get());
						
			produtoRepository.save(produto);
			
			System.out.println("Produto Salvo!");			
		}
}
