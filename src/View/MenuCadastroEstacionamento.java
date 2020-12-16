package View;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import CriaClasses.Estacionamento;
import CriaClasses.Hora;
import CriaClasses.Vaga;
import CriaClasses.VerificaCampos;

public class MenuCadastroEstacionamento {
	public void castro() {
//********************************************************\\	
		VerificaCampos verifica = new VerificaCampos(  );
		Scanner        in       = new Scanner(System.in);
//********************************************************\\		
		boolean controle = false;
		boolean found    = false;
		String endereco  = null ;
		String temp    	 = null ;
		String nome 	 = null ;
		int qtdCarros 	 = 0    ;
//*********************************************************\\	 				
		ArrayList<Estacionamento> estacionamento = new ArrayList<Estacionamento>();
		ArrayList<Vaga> vaga = new ArrayList<>();
		ArrayList<Hora> horas = new ArrayList<>();

		while (true) {
			if (controle == false) {
				System.out.printf("\n****************************\n");
				System.out.print("Nome do Estabelecimento:");
				nome = in.nextLine();
				System.out.println("Endereço:");
				endereco = in.nextLine();
				controle = true;
			}
			System.out.println("Quantidade de Vagas:");
			temp = in.nextLine();

			found = verifica.NumberIsString(temp);

			if (found) {
				qtdCarros = Integer.parseInt(temp);
				if (!((qtdCarros <= 0) || (qtdCarros > 100))) {
					Estacionamento sti = new Estacionamento(nome, endereco, qtdCarros, vaga,horas);
					estacionamento.add(sti);
					System.out.println("Cadastro Realizado com Sucesso.");
					break;
				} else {
					System.out.println("Opção Invalida Tente novamente");
				}
			}
		}
	}
}
