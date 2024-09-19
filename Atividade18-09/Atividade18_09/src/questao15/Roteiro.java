package questao15;

import java.util.ArrayList;
import java.util.List;

public class Roteiro {
    private List<Pedido> pedidos;

    // Construtor
    public Roteiro() {
        pedidos = new ArrayList<>();
    }

    // Método para adicionar um pedido ao roteiro
    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    // Método para exibir detalhes dos pedidos
    public void exibirPedidos() {
        for (Pedido pedido : pedidos) {
            System.out.println("Cliente: " + pedido.getCliente().getNome());
            System.out.println("Endereço: " + pedido.getCliente().getEndereco());
            System.out.println("Telefone: " + pedido.getCliente().getTelefone());
            System.out.println("Status do Pedido: " + pedido.getStatus());
            System.out.println("Produtos:");
            for (Produto produto : pedido.getProdutos()) {
                System.out.println("  - " + produto.getNome() + " (Peso: " + produto.getPeso() + " kg)");
            }
            System.out.println("Peso Total: " + pedido.calcularPesoTotal() + " kg");
            System.out.println();
        }
    }

    // Método para calcular o total de pedidos
    public int contarPedidos() {
        return pedidos.size();
    }
    
    public static void main(String[] args) {
        // Criando clientes
        Cliente cliente1 = new Cliente("João Silva", "Rua A, 123", "123456789");
        Cliente cliente2 = new Cliente("Maria Oliveira", "Avenida B, 456", "987654321");

        // Criando produtos
        Produto produto1 = new Produto("Televisão", 10.5);
        Produto produto2 = new Produto("Geladeira", 70.0);
        Produto produto3 = new Produto("Micro-ondas", 15.0);

        // Criando pedidos
        Pedido pedido1 = new Pedido(cliente1);
        pedido1.adicionarProduto(produto1);
        pedido1.adicionarProduto(produto2);

        Pedido pedido2 = new Pedido(cliente2);
        pedido2.adicionarProduto(produto3);

        // Criando o roteiro
        Roteiro roteiro = new Roteiro();
        roteiro.adicionarPedido(pedido1);
        roteiro.adicionarPedido(pedido2);

        // Exibindo detalhes dos pedidos
        roteiro.exibirPedidos();

        // Exibindo total de pedidos
        System.out.println("Total de pedidos: " + roteiro.contarPedidos());
    }
}