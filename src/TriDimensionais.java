import java.util.Scanner;

public class TriDimensionais {

	public TriDimensionais(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Ola eu sou o Adriano");
		System.out.println("Eu posso te ensinar os Arrays do Java, primeiro: ");
		System.out.println("Entre com o Array que voce sente dificuldade");
		System.out.println("1-Arrays simples, 2-arrays duplos ou 3- Arrays tridimensionais");
		int opcao = scan.nextInt();
		
		if (opcao == 1 || opcao == 2) {
			System.out.println("A isso é muito facil, espera só chegar nos arrays tridimensionais");
			System.out.println(" Vou embora para Belgica");
		}else if(opcao == 3){
			System.out.println("Ta ferrado, chegou nos arrays tridimensionais isso é muito dificil");
		}else{
			System.out.println("Escolheu a opção errada");
		}
		
		
		
	}

}
