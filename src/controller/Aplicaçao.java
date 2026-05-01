package controller;
import entidade.*;

import java.util.*;


public class  Aplicaçao {
	static Scanner input = new Scanner(System.in);
	private static controllerProduto ara = new controllerProduto();
	private static controllerPedido p1 = new controllerPedido(ara);




	public static void main(String[] args) {

		ara.cadastrarProduto();
		//ara.mostrarProduto();
		ara.listarProdutos();
		p1.fazerPedido();
		p1.mostrarPedido();

	}

}
