package questao1;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    // Classe interna simples para representar o item no carrinho
    private class ItemCarrinho {
        Produto produto;
        int quantidade;

        public ItemCarrinho(Produto produto, int quantidade) {
            this.produto = produto;
            this.quantidade = quantidade;
        }

        public double getPrecoTotal() {
            return produto.preco * quantidade;
        }

        @Override
        public String toString() {
            return produto.toString() + " (Qtd: " + quantidade + ")";
        }
    }

    private List<ItemCarrinho> itens = new ArrayList<>();

    public void adicionarProduto(Produto produto, int quantidade) {
        for (ItemCarrinho item : itens) {
            if (item.produto.equals(produto)) {
                item.quantidade += quantidade;
                return;
            }
        }
        itens.add(new ItemCarrinho(produto, quantidade));
    }

    public void removerProduto(Produto produto) {
        itens.removeIf(item -> item.produto.equals(produto));
    }

    public double calcularTotal() {
        return itens.stream().mapToDouble(ItemCarrinho::getPrecoTotal).sum();
    }

    @Override
    public String toString() {
        return "Carrinho: " + itens + "\nTotal: R$" + calcularTotal();
    }
}