package questao3;

import java.util.Scanner;

public class Calculadora {

	Double numero1,numero2;

	
	
	
	public Double getNumero1() {
		return numero1;
	}




	public void setNumero1(Double numero1) {
		this.numero1 = numero1;
	}




	public Double getNumero2() {
		return numero2;
	}




	public void setNumero2(Double numero2) {
		this.numero2 = numero2;
	}




	public double Soma() {
		return numero1+numero2;
	}
	public double Sub() {
		return numero1-numero2;
	}
	public double Divisao() {
		return numero1/numero2;
	}
	public double Multiplicacao() {
		return numero1*numero2;
	}
	
public static void main(String[] args) {
	
	Scanner leitor =new Scanner(System.in);
	
	Calculadora calculadora =new Calculadora();
	
	System.out.println("informe o primeiro numero");
	calculadora.numero1=leitor.nextDouble();
	System.out.println("informe o Segundo numero");
	calculadora.numero2=leitor.nextDouble();
	
	
	int condition;

    do {
        System.out.println("Escolha o que deseja fazer:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Divisão");
        System.out.println("4 - Multiplicação");
        System.out.println("0 - Sair");

        condition = leitor.nextInt();

        switch (condition) {
            case 1:
                System.out.println("Resultado da soma: " + calculadora.Soma());
                break;
            case 2:
                System.out.println("Resultado da subtração: " + calculadora.Sub());
                break;
            case 3:
                System.out.println("Resultado da divisão: " + calculadora.Divisao());
                break;
            case 4:
                System.out.println("Resultado da multiplicação: " + calculadora.Multiplicacao());
                break;
            case 0:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida! Tente novamente.");
        }
    } while (condition != 0);

    leitor.close();
}
}
