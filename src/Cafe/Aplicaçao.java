package Cafe;
import java.util.*;


public class Aplicaçao {
	static Scanner input = new Scanner(System.in);
	
	//arraylist dos abjetos
	static ArrayList<Cafeteria> cafeterias = new ArrayList<Cafeteria>();
	static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	static ArrayList<Funcionario> funcionario = new ArrayList<Funcionario>();
	static ArrayList<Pagamento> pagamentos = new ArrayList<Pagamento>();
	static ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
	static ArrayList<RegistroDeVenda> registroDeVendas = new ArrayList<RegistroDeVenda>();
	
	//objetos tipo cafeteria
	static Cafeteria cafeteria1 = new Cafeteria();
	static Cafeteria cafeteria2 = new Cafeteria();
	
	//objetos tipo cliente
	static Cliente carol = new Cliente();
	static Cliente carlos = new Cliente();
	
	//objetos tipo funcionario
	static Funcionario func1 = new Funcionario();
	static Funcionario func2 = new Funcionario();
	
	//objetos tipo pagamento
	static Pagamento pagar1 = new Pagamento();
	static Pagamento pagar2 = new Pagamento();
	
	//objetos tipo pedido
	static Pedido pedido1 = new Pedido();
	static Pedido pediodo2 = new Pedido();
	
	//objetos tipo registro de vendas
	static RegistroDeVenda registrodevenda1 = new RegistroDeVenda();
	static RegistroDeVenda registrodevenda2 = new RegistroDeVenda();
	
	
	public static void novaCafeteria(Cafeteria cafeteria) {
		System.out.println("-----NOVA CAFETERIA-----");
		System.out.println("Escreva o nome da nova cafeteria: ");
		cafeteria.nome = input.nextLine();
		System.out.println("Escreva o local da caferia");
		cafeteria.local = input.nextLine();
		//cafeteria.funcionario.nome = input.nextLine();
		//cafeteria.registrodevendas 		
	}
	
	
	
	

	public static void main(String[] args) {
		
		
		
	}

}
