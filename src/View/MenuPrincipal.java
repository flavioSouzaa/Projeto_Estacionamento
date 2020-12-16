package View;
import java.util.Scanner;

import CriaClasses.VerificaCampos;
import Processamento.CadastroCarro;

public class MenuPrincipal {

public void MenuPrincipal() {

//*******************************************************\\
	VerificaCampos number  = new VerificaCampos(  );
	CadastroCarro  carro   = new CadastroCarro (  );
	Scanner        in      = new Scanner(System.in);
//********************************************************\\	
	int opcaoSelecionada = 0;
	boolean found 		 = false;
	String temp 		 = null;	
//*********************************************************\\	
		while(true){
	        System.out.println("\n\n=== Menu ==="								 );
	
	        System.out.println("1 - Entrada de novo veículo"					 );
	        System.out.println("2 - Lista todos carros"							 );
	        System.out.println("3 - Lista de vagas livres"						 );
	        System.out.println("4 - Saída de carro"								 );
	        System.out.println("5 - Busca de carro pela placa"					 );
	        System.out.println("6 - Busca pela identificação da vaga"			 );
	        System.out.println("7 - Listagem de todos os carros que "
	        		+ "ingressaram no estacionamento após um determinado horário");
	        System.out.println("0 - Sair");
	
	        System.out.print("Informe a opção:");
	        temp = in.nextLine();
	       
	        found = number.NumberIsString(temp);
	                
	        if(found) {
	        	opcaoSelecionada = Integer.parseInt(temp);
	        	break;
	        }else {
	        	System.out.println("Opção Invalida Tente novamente");
	        }
		}
				
		switch(opcaoSelecionada){
		
        case 1: carro.cadastro();;
            break;
        case 2:;
            break;
        case 3:;
        	break;
        case 4:;
        	break;
        case 5:;
        	break;
        case 6:;
        	break;
        case 7:;
        	break;
        default: System.out.println("Opção inválida");
		}	
	}
}