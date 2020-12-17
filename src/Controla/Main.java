package Controla;

import Processamento.CalculaValor;
import Processamento.GeraHora;

public class Main {

	public static void main(String[] args) {
		
		while(true){
			RecebeOpcao ro = new RecebeOpcao();
			ro.verificaOpcao();
		}		
	}
}
