package ritaLanca;

import java.util.Scanner;

public class CheiraAQue {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Cheira cheira= new Cheira();
		System.out.println("Cheira a quê? (Caracterize o cheiro)");
		String input=sc.nextLine();
		cheira.setCheiro(input);
	
	}

}
