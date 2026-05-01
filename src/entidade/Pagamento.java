package entidade;

public class Pagamento extends Pedido{
	private String tipoPagamento;
	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}



	Double valor;
	Cliente cliente;

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(String tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}
}
