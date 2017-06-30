import java.util.Scanner;

public class TriDimensionais {

	public TriDimensionais() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ola eu sou o Adriano");
		System.out.println("Eu posso te ensinar os Arrays do Java, primeiro passo: ");

		boolean opcaoValida = false; 

		do {
			System.out.println("Entre com o Array que voce sente dificuldade");
			System.out.println("1-Arrays simples, 2-arrays duplos ou 3- Arrays tridimensionais");

			int opcao = scan.nextInt();

			if (opcao == 1 || opcao == 2) {
				System.out.println("A isso é muito facil, espera só chegar nos arrays tridimensionais");
				System.out.println("Vou lhe ensinar não!, escolhe outra opção");
				System.out.println("");
			} else if (opcao == 3) {
				System.out.println("Ta lixado, chegou nos arrays tridimensionais isso é muito dificil");
				System.out.println("Vou para Belgica, não posso lhe ajudar");
				opcaoValida = true;
			}else{
				System.out.println("Escolheu uma opção errada");
				System.out.println("");
			}

		} while (!opcaoValida);

	}

}
