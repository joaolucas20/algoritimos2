package questao15;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Produto> produtos;
    private String status; // Status do pedido (e.g., "pendente", "entregue")

    // Construtor
    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
        this.status = "pendente";
    }

    // Método para adicionar produto ao pedido
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    // Método para definir o status do pedido
    public void definirStatus(String status) {
        this.status = status;
    }

    // Getters
    public Cliente getCliente() {
        return cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public String getStatus() {
        return status;
    }

    // Método para calcular o peso total dos produtos
    public double calcularPesoTotal() {
        double pesoTotal = 0;
        for (Produto produto : produtos) {
            pesoTotal += produto.getPeso();
        }
        return pesoTotal;
    }
    
    
}