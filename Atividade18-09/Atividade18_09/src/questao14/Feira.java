package questao14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Feira {
    private Estoque estoque;
    private List<Venda> vendas;

    // Construtor
    public Feira() {
        estoque = new Estoque();
        vendas = new ArrayList<>();
    }

    // Método para adicionar produtos ao estoque
    public void adicionarProdutoAoEstoque(Produto produto, int quantidade) {
        estoque.adicionarProduto(produto, quantidade);
    }

    // Método para registrar uma venda
    public boolean registrarVenda(List<Produto> produtos) {
        Venda venda = new Venda();
        for (Produto produto : produtos) {
            if (estoque.removerProduto(produto, 1)) {
                venda.adicionarProduto(produto);
            } else {
                System.out.println("Produto " + produto.getNome() + " não disponível em estoque.");
                return false;
            }
        }
        vendas.add(venda);
        return true;
    }

    // Método para calcular o faturamento diário
    public double calcularFaturamentoDiario() {
        double faturamento = 0;
        for (Venda venda : vendas) {
            faturamento += venda.getValorTotal();
        }
        return faturamento;
    }

    // Getters
    public Estoque getEstoque() {
        return estoque;
    }

    public List<Venda> getVendas() {
        return vendas;
    }
    
    public static void main(String[] args) {
        // Criando produtos
        Produto p1 = new Produto("Maçã", 1.50);
        Produto p2 = new Produto("Banana", 1.20);
        Produto p3 = new Produto("Laranja", 2.00);

        // Criando a feira
        Feira feira = new Feira();

        // Adicionando produtos ao estoque
        feira.adicionarProdutoAoEstoque(p1, 100);
        feira.adicionarProdutoAoEstoque(p2, 150);
        feira.adicionarProdutoAoEstoque(p3, 200);

        // Registrando vendas
        if (feira.registrarVenda(Arrays.asList(p1, p2, p3))) {
            System.out.println("Venda registrada com sucesso.");
        }

        if (feira.registrarVenda(Arrays.asList(p1, p1, p2))) {
            System.out.println("Venda registrada com sucesso.");
        }

        // Calculando e exibindo o faturamento diário
        System.out.println("Faturamento diário: R$" + feira.calcularFaturamentoDiario());
    }
    
}