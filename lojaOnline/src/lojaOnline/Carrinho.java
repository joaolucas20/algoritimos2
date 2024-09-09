package lojaOnline;

import java.util.ArrayList;

import java.util.Scanner;

public class Carrinho {




 ArrayList<Produto>produtos=new ArrayList<Produto>();

 void adicionarProdutos(Produto produto){
   produtos.add(produto);
   
 }
 void RemoverProdutos(Produto produto){
	   produtos.remove(produto);
	   
	 }
 
 public void mostrarProdutos() {
     for (Produto p : produtos) {
         System.out.println(p);
     }
 }

 
 public double calcularTotal() {
     double total = 0;
     for (Produto p : produtos) {
         total += p.preco;
     }
     return total;
 }

 
 public static void main(String[] args) {
	  Cliente cliente = new Cliente("João");
	  
	  
	 Produto p1 = new Produto("Notebook", 2500.0);
     Produto p2 = new Produto("Mouse", 50.0);
     Produto p3 = new Produto("camisa", 40.0);
     
     
    

     System.out.println("cliente "+cliente.nome);
     Carrinho carrinho = new Carrinho();
     carrinho.adicionarProdutos(p1);
     carrinho.adicionarProdutos(p2);
     carrinho.adicionarProdutos(p3);
     
     carrinho.mostrarProdutos();
     System.out.println("Total: R$ " + carrinho.calcularTotal());
     
     
     carrinho.RemoverProdutos(p3);
     System.out.println("Produtos no carrinho:");
     carrinho.mostrarProdutos();
     System.out.println("Total: R$ " + carrinho.calcularTotal());
     
     
     
    
     
     
     
     

     
 }
}



