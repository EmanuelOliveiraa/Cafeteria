package entidade;

public class Cliente {
	private String nome;
	private int idCliente;
	private Pedido pediodos;

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public Pedido getPediodos() {
		return pediodos;
	}

	public void setPediodos(Pedido pediodos) {
		this.pediodos = pediodos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
