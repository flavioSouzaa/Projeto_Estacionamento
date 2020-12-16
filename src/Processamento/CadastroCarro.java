package Processamento;

import java.util.Date;
import java.util.Scanner;

import CriaClasses.Vaga;
import CriaClasses.VerificaCampos;

public class CadastroCarro {

	public void cadastro() {
		
//***************************************************\\
		VerificaCampos verifica = new VerificaCampos();
		Scanner in = new Scanner(System.in);		
		GeraPlaca  pl = new GeraPlaca();
		GeraHora   hora  = new GeraHora();
//***************************************************\\		
		boolean found 			=  false;
		String temp   			=  null;
		String placa  			=  null;
		String horaEntrada  	=  null;
		String horaSaida   	    =  null;
		String horarioOcupacao  =  null;
		int opcao     			= 0;
		int id        			= 0;
		Date D_horaSistema;
//***************************************************\\
		
		System.out.println("\n");

		id ++;
		placa = pl.PadraoNovo();
		D_horaSistema = hora.DataSistema();
		horaEntrada   = hora.ObterDataFormatada(D_horaSistema);

		horaSaida       = hora.ObterDataFormatada(D_horaSistema);
		horarioOcupacao = hora.ObterDataFormatada(D_horaSistema);
		
		System.out.println("Cadastro realizado com Sucesso.");
		System.out.println("\n");
		System.out.println("***********************************");
		System.out.println("Dados do Veiculo:");
		Vaga vagas = new Vaga(id, placa, horaEntrada, horaSaida, horarioOcupacao);
		System.out.println("***********************************");
		
		System.out.println(vagas.toString());		
		
	}
}
