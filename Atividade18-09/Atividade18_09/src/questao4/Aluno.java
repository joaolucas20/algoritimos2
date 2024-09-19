package questao4;

import java.util.Scanner;

public class Aluno {
String nome;
Double A1,A2;



public String getNome() {
	return nome;
}



public void setNome(String nome) {
	this.nome = nome;
}



public Double getA1() {
	return A1;
}



public void setA1(Double a1) {
	A1 = a1;
}



public Double getA2() {
	return A2;
}



public void setA2(Double a2) {
	A2 = a2;
}



public double Media() {
	return ((A1+A2)/2);
	
}
public void Situacao() {
	if(Media()>7) {
		System.out.println("aluno passou");
	}else if(Media()<7&&Media()>4) {
		System.out.println("aluno de exame");
	}else {
		System.out.println("aluno reprovou");
	}
	
}
public static void main(String[] args) {
	Aluno aluno =new Aluno();
	
Scanner sc =new Scanner(System.in);
System.out.println("informe o nome do aluno");
aluno.nome=sc.nextLine();
System.out.println("informe a A1");
aluno.A1=sc.nextDouble();
System.out.println("informe a A2");
aluno.A2=sc.nextDouble();


System.out.println("o aluno "+aluno.nome+" tirou a media de "+aluno.Media()+" e esta "
		);
aluno.Situacao();




}
}

