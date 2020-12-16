package Controla;

import Processamento.CalculaValor;
import Processamento.GeraHora;

public class Main {

	public static void main(String[] args) {
		
		
		CalculaValor valor = new CalculaValor();
		valor.CalculaValorPermanencia();
		System.out.println(valor.toString());
		
		while(true){
			RecebeOpcao ro = new RecebeOpcao();
			ro.verificaOpcao();
		}		
	}
}
