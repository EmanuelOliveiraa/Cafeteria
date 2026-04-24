package controller;
import entidade.Produto;
import java.util.ArrayList;
import java.util.Scanner;
public class controllerProduto{
    private ArrayList<Produto> produtos = new ArrayList<>();
    private Scanner input = new Scanner(System.in);

    public void cadastrarProduto(){
        Produto produto = new Produto();

        System.out.println("-----NOVO PRODUTO-----");
        System.out.print("Escreva o nome do produto: ");
        produto.setNome(input.nextLine());
        System.out.print("Escreva o id do produto: ");
        produto.setIdProduto(input.nextInt());
        System.out.print("Escreva o preco: ");
        produto.setPreco(input.nextDouble());
        System.out.print("Escreva a descricao do produto: ");
        produto.setDescricao(input.nextLine());
        produtos.add(produto);

    }

    public void mostrarProduto(Produto produto){
        System.out.print("Nome do Produto: ");
        System.out.println(produto.getNome());
        System.out.print("ID do produto: ");
        System.out.println(produto.getIdProduto());
        System.out.print("Preco: ");
        System.out.println(produto.getPreco());
        System.out.print("Descricao: ");
        System.out.println(produto.getDescricao());
    }

    public void listarProdutos(){
        int i = 0;
        for(Produto produto : produtos){
            System.out.print(i + ". ");
            mostrarProduto(produto);
            i++;
        }
    }
}
