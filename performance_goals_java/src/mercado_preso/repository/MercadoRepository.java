package mercado_preso.repository;

import java.util.List;
import java.util.Optional;

import mercado_preso.model.Produto;

public class MercadoRepository {

	// CRUD do E-commerce

	// 1.Listar topdo mundo
	// 2.listar por ID
	// 3.Cadastrar
	// 4.atualizar
	// 5.deletar

	// Métodos

	private List<Produto> produtosBandoDeDados;

	public MercadoRepository(List<Produto> listaProdutos) {
		this.produtosBandoDeDados = listaProdutos;
	}

	public List<Produto> getAll() {
		return this.produtosBandoDeDados;
	}

	public Optional<Produto> getProduto(long id) {

		for (int i = 0; i < this.produtosBandoDeDados.size(); i++) {
			if (this.produtosBandoDeDados.get(i).getId() == id) {
				return Optional.of(this.produtosBandoDeDados.get(i));
			}
		}
		return Optional.ofNullable(null);
	}

	public void salvaProduto(Produto produto) {
		this.produtosBandoDeDados.add(produto);
	}

	public boolean atualizaProduto(Produto produto) {
		long id = produto.getId();
		Optional<Produto> produtoAtualizar = this.getProduto(id);

		if (produtoAtualizar.isPresent()) {
			for (int i = 0; i < this.produtosBandoDeDados.size(); i++) {
				if (this.produtosBandoDeDados.get(i).getId() == id) {
					this.produtosBandoDeDados.add(i, produto);
					return true;
				}
			}
		}
		return false;
	}

}
