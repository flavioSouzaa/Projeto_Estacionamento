package Processamento;

import java.util.Random;

import Processamento.Utils_Placa;

public class GeraPlaca {

//******************************************************\\
	StringBuilder  stgb       = new StringBuilder();
	Utils_Placa    util       = new Utils_Placa	 ();
	Random         ran        = new Random	     ();
	String         placaVelho = null			   ;
	String         placaNova  = null			   ;
//*******************************************************\\

	public String PadraoNovo() {

		for (int i = 0; i < util.NUMBER_CARACTER; i++) {
			stgb.append((char) (ran.nextInt(0 + util.CARACTERES_ALFABETO) + util.CARACTERE_ASCII));
		}

		for (int i = 0; i < util.NUMBER_DIGITAL; i++) {

			if (stgb.length() == util.NUMBER_MERCOSUL) {
				stgb.append((char) (ran.nextInt(0 + util.CARACTERES_ALFABETO) + util.CARACTERE_ASCII));
			} else {
				stgb.append(ran.nextInt(util.NUMERO));
			}
		}
		placaNova = stgb.toString();
		return placaNova;
	}

	public String PadraoVelho() {

		Random ran = new Random();
		StringBuilder stgb = new StringBuilder();

		for (int i = 0; i < util.NUMBER_CARACTER; i++) {
			stgb.append((char) (ran.nextInt(0 + util.CARACTERES_ALFABETO) + util.CARACTERE_ASCII));
		}

		for (int i = 0; i < util.NUMBER_DIGITAL; i++) {
			stgb.append(ran.nextInt(util.NUMERO));
		}
		placaVelho = stgb.toString();
		return placaVelho;
	}
}
