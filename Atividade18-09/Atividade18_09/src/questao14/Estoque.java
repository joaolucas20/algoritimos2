package questao14;

import java.util.HashMap;
import java.util.Map;

public class Estoque {
    private Map<Produto, Integer> produtos;

    // Construtor
    public Estoque() {
        produtos = new HashMap<>();
    }

    // Método para adicionar produto ao estoque
    public void adicionarProduto(Produto produto, int quantidade) {
        produtos.put(produto, produtos.getOrDefault(produto, 0) + quantidade);
    }

    // Método para remover produto do estoque
    public boolean removerProduto(Produto produto, int quantidade) {
        int estoqueAtual = produtos.getOrDefault(produto, 0);
        if (estoqueAtual >= quantidade) {
            produtos.put(produto, estoqueAtual - quantidade);
            return true;
        }
        return false;
    }

    // Método para verificar quantidade de produto no estoque
    public int verificarQuantidade(Produto produto) {
        return produtos.getOrDefault(produto, 0);
    }
}