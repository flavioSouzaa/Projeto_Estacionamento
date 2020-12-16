package View;

import java.util.Scanner;

import Controla.RecebeOpcao;
import CriaClasses.VerificaCampos;

public class MenuInicial {

//******************************************\\
	VerificaCampos number = new VerificaCampos();
	RecebeOpcao rp = new RecebeOpcao();
	Scanner in = new Scanner(System.in);
//******************************************\\
	public int Menuinicial() {
//******************************************\\		
		boolean found 	 = false;
		final int ULTIMO = 3;
		int opcao 		 = 0;
		String temp 	 = null;
//******************************************\\

		while (true) {
			System.out.println("\n\n=== Menu ===");
			System.out.println("1 - Cadastrar Estacionamento:");
			System.out.println("2 - Outras Opeções:");
			System.out.println("3 - Sair:");
			temp = in.nextLine();

			found = number.NumberIsString(temp);

			if (found) {
				opcao = Integer.parseInt(temp);
				if (!(opcao > ULTIMO))
					break;
			} else {
				System.out.println("Opção Invalida Tente novamente.");
			}
		}
		return opcao;
	}
}
