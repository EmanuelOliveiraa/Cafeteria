package entidade;

public class RegistroDeVenda extends Pagamento {
	private int idRegistro;
	private String data;


	public int getCodigoVenda() {
		return idRegistro;
	}

	public void setCodigoVenda(int idRegistro) {
		this.idRegistro = idRegistro;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}