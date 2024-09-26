package questao1;

public class Cliente {
    String nome;
    Carrinho carrinho = new Carrinho();

    public Cliente(String nome) {
        this.nome = nome;
    }

    public void adicionarAoCarrinho(Produto produto, int quantidade) {
        carrinho.adicionarProduto(produto, quantidade);
    }

    public void removerDoCarrinho(Produto produto) {
        carrinho.removerProduto(produto);
    }

    public void mostrarCarrinho() {
        System.out.println(carrinho);
    }
}