package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	//BASE DE P.O.O
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		//Recebendo os dados para iniciar o programa
		System.out.println("Enter product data");
		System.out.println("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price");
		product.price = sc.nextDouble();
		System.out.println("Quantity in Stock :  ");
		product.quantity = sc.nextInt();
		
		//Imprimindo na tela os dados passados 
		System.out.println();
		System.out.println("Product data " + product);
		
		//Adicionando valores no estoque
		System.out.println();
		System.out.println("Enter the number of products to be added in stock");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		//Imprimindo na tela os dados passados Atualizados 
		System.out.println();
		System.out.println("Updated data " + product);
		
		//Removendo valores no estoque
		System.out.println();
		System.out.println("Enter the number of products to be removed in stock");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		//Imprimindo na tela os dados passados Atualizados 
		System.out.println();
		System.out.println("Updated data " + product);
		
		sc.close();
	}

}
