package bonitao;

import java.util.Scanner;

public class DateMatch {
	
	Scanner sc= new Scanner(System.in);
		
	public void match(){
		System.out.println("Introduza o seu nome:");
		String input= sc.nextLine().toLowerCase();
		
		
		switch(input){
			case "diogo":
				System.out.println("O seu par ideal � Bianca");
				break;
			case "bianca":
				System.out.println("O seu par ideal � Diogo. N�o te stresses, o amor �s vezes est� onde menos esperamos. ");
				break;
			case "rui":
				System.out.println("O seu par ideal � Pamela");
				break;
			case "rita":
				System.out.println("O seu par ideal � Brad Pitt");
				break;
			case "jo�o":
				System.out.println("O seu par ideal � Benfica");
				break;
			case "eug�nio":
				System.out.println("O seu par ideal � Tiazinha");
				break;
			default:
				System.out.println("vai morrer sozinho");
			
		}
	}

}
