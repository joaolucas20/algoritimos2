package questao8a10;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private int numero;
    private Date data;
    private Cliente cliente; // Associação com Cliente
    private List<Produto> produtos;

    // Construtor
    public Pedido(int numero, Date data, Cliente cliente) {
        this.numero = numero;
        this.data = data;
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
    }

    // Método para adicionar produtos ao pedido
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    // Método para calcular o valor total do pedido
    public double calcularValorTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        return total;
    }

    // Getters
    public int getNumero() {
        return numero;
    }

    public Date getData() {
        return data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
    
    public static void main(String[] args) {
        // Criando um cliente
        Cliente cliente = new Cliente("João Silva", "12345678901");

        // Criando produtos
        Produto p1 = new Produto("Camiseta", 49.90);
        Produto p2 = new Produto("Calça", 89.90);

        // Criando um pedido e associando o cliente
        Pedido pedido = new Pedido(1, new Date(), cliente);

        // Adicionando produtos ao pedido
        pedido.adicionarProduto(p1);
        pedido.adicionarProduto(p2);

        // Exibindo os detalhes do pedido e o valor total
        System.out.println("Cliente: " + pedido.getCliente().getNome());
        System.out.println("CPF: " + pedido.getCliente().getCpf());
        System.out.println("Valor total do pedido: R$" + pedido.calcularValorTotal());
    }
}


