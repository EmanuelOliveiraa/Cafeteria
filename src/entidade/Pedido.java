package entidade;

public class Pedido {
	private int idPedidos;
	private int quantidade;
	private String item;
	private Cliente cliente;
	private Produto produto; //ele pode escolher varios produtos

	public int getNumeroPedidos() {
		return idPedidos;
	}

	public void setNumeroPedidos(int idPedidos) {
		this.idPedidos = idPedidos;
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
