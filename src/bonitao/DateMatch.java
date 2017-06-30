package bonitao;

import java.util.Scanner;

public class DateMatch {
	
	Scanner sc= new Scanner(System.in);
		
	public void match(){
		System.out.println("Introduza o seu nome:");
		String input= sc.nextLine().toLowerCase();
		
		
		switch(input){
			case "diogo":
				System.out.println("O seu par ideal é Bianca");
				break;
			case "bianca":
				System.out.println("O seu par ideal é Diogo. Não te stresses, o amor às vezes está onde menos esperamos. ");
				break;
			case "rui":
				System.out.println("O seu par ideal é Pamela");
				break;
			case "rita":
				System.out.println("O seu par ideal é Brad Pitt");
				break;
			case "joão":
				System.out.println("O seu par ideal é Benfica");
				break;
			case "eugénio":
				System.out.println("O seu par ideal é Tiazinha");
				break;
			default:
				System.out.println("vai morrer sozinho");
			
		}
	}

}
