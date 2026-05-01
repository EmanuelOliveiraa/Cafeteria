package entidade;

import java.util.ArrayList;

public class Pedido {
	private int idPedido;
	private int quantidade;
	private String item;
	private Cliente cliente;
	private ArrayList<Produto> produtos = new ArrayList<>(); //ele pode escolher varios produtos

	public void setProduto(Produto produto){
		produtos.add(produto);
	}

	public ArrayList<Produto> getProdutos(){
		return produtos;
	}
	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


}
