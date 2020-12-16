package CriaClasses;

public class Hora {
//*************************************************//
	long Dia    		 ;
	long Mes    		 ;
	long Ano    		 ;	
	long Hora   		 ;
	long Minuto 		 ;
	long Segundo		 ;
//*************************************************//

	public Hora() {
	}
	
	public Hora(long dia, long mes, long ano, long hora, long minuto, long segundo) {
//*************************************************//
		Dia = dia		  ;
		Mes = mes		  ;
		Ano = ano		  ;
		Hora = hora       ;
		Minuto = minuto   ;
		Segundo = segundo ;
//*************************************************//
	}

	public long getDia() {
		return Dia;
	}


	public void setDia(long dia) {
		Dia = dia;
	}


	public long getMes() {
		return Mes;
	}


	public void setMes(long mes) {
		Mes = mes;
	}


	public long getAno() {
		return Ano;
	}


	public void setAno(long ano) {
		Ano = ano;
	}


	public long getHora() {
		return Hora;
	}


	public void setHora(long hora) {
		Hora = hora;
	}


	public long getMinuto() {
		return Minuto;
	}


	public void setMinuto(long minuto) {
		Minuto = minuto;
	}


	public long getSegundo() {
		return Segundo;
	}


	public void setSegundo(long segundo) {
		Segundo = segundo;
	}
	
	public String toString() {
				
		return "Tempo de Permanencia: " + "\n" +  "Horas: " + getHora() +" "+ "Minutos:"+getMinuto();
		
	}
}
