package Wevton;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String cod, nome, tipo;
		int qtd;
		double val_prod;
		
		Produto prod;
		
		sc.nextLine();
		
		System.out.print("Insira o código do produto: ");
		cod = sc.nextLine();
		System.out.print("Insira o nome do produto: ");
		nome = sc.nextLine();
		System.out.print("Insira a quantidade desse produto no estoque: ");
		qtd = sc.nextInt();
		sc.nextLine();
		System.out.print("Insira a categoria do produto: ");
		tipo = sc.nextLine();
		System.out.print("Insira o preço do produto: ");
		val_prod = sc.nextDouble();
		sc.nextLine();
		
		prod = new Produto(cod, nome, qtd, tipo, val_prod);
		
		System.out.println("Produto criado com sucesso!");
		
		System.out.println("Demonstrando as operações com a classe Produto: \n");
		
		System.out.print("Insira uma quantidade pra vender, e ele verificará se é possível vender ou não: ");
		int x = sc.nextInt();
		sc.nextLine();
		double v = prod.vender(x);
		sc.nextLine();
		
		if(v != -1) {
			System.out.println("Não é possível vender essa quantidade de produtos.");
		}
		else {
			System.out.println("Foi possível, e o valor é " + v);
		}
		
		System.out.println(prod);
		
		System.out.print("Insira dois valores: um para determinar a quantidade do produto a ser comprado e depois o valor. Coloque 0 caso não queria modificar o valor: ");
		x = sc.nextInt();
		sc.nextLine();
		v = sc.nextDouble();
		sc.nextLine();
	
		if(v == 0.0) {
			prod.comprar(x);
		}
		else {
			prod.comprar(x, v);
		}
		
		System.out.println(prod);
	}
}
