package questao14;

import java.util.ArrayList;
import java.util.List;

public class Venda {
    private List<Produto> produtosVendidos;
    private double valorTotal;

    // Construtor
    public Venda() {
        produtosVendidos = new ArrayList<>();
        valorTotal = 0;
    }

    // Método para adicionar produto à venda
    public void adicionarProduto(Produto produto) {
        produtosVendidos.add(produto);
        valorTotal += produto.getPreco();
    }

    // Método para calcular o valor total da venda
    public double getValorTotal() {
        return valorTotal;
    }

    // Getters
    public List<Produto> getProdutosVendidos() {
        return produtosVendidos;
    }
}