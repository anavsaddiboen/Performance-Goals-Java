package mercado_preso.model;

public class Produto {

	private int id;
	private String produto;
	private int quantidade;
	private float valor;
	
	
	public Produto(int id, String produto, int quantidade, float valor) {
		this.id = id;
		this.produto = produto;
		this.quantidade = quantidade;
		this.valor = valor;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getProduto() {
		return produto;
	}


	public void setProduto(String produto) {
		this.produto = produto;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	public float getValor() {
		return valor;
	}


	public void setValor(float valor) {
		this.valor = valor;
	}
	
	// cadastrar novo produto
	
	// buscar pela id
	
	// deletar um produto
	
	// listar produtos
	
	// atualizar repositorio
	
}
