package Controla;

import View.MenuCadastroEstacionamento;
import View.MenuPrincipal;
import View.MenuInicial;

public class RecebeOpcao {

	public void verificaOpcao() {

//************************************************************************\\
		MenuCadastroEstacionamento mcs = new MenuCadastroEstacionamento();
		MenuPrincipal m = new MenuPrincipal();
		MenuInicial mi = new MenuInicial();
//************************************************************************\\
		int opcaoSelecionada = 0;		
		int initialize = 0;
//************************************************************************\\

		opcaoSelecionada = mi.Menuinicial();

		while (initialize == 0) 
		{
			switch (opcaoSelecionada) {

			case 1:
				mcs.castro();
				initialize = 1;
				break;
			case 2:
				m.MenuPrincipal();
				initialize = 1;
				break;
			case 3: 
				System.exit(0);
				break;
			default:
				System.out.println("Opção inválida");
			}
		}
	}
}
