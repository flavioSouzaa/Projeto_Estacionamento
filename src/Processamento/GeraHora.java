package Processamento;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import CriaClasses.Hora;

public class GeraHora {

	Hora horas = new Hora(0, 0, 0, 0, 0, 0);
	
	
	public static Date DataSistema() {
		Calendar calendar = Calendar.getInstance();
		return calendar.getTime();				
	}	
	
	public static Date ObterDataComDiferencaDias(int dias) {		
		
		Calendar calendar = Calendar.getInstance();
		calendar.add(calendar.DAY_OF_MONTH, dias);
		return calendar.getTime();
	}
	
	public static Date ObterDataComDiferencaHoras(int hora) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(calendar.HOUR, hora);
		return calendar.getTime();
	}
	
	public static Date ObterDataComDiferencaMinutos(int minutos) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(calendar.MINUTE, minutos);
		return calendar.getTime();
	}
	
	public static String ObterDataFormatada(Date data) {
		DateFormat formata = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		return formata.format(data);
	}
	
		
	
	public void CalcularHora() {
//***************************************************\\		
		long curr;
		String dataFormatadaEntrada,dataFormatadaSaida;
		Date horaSistama;
		Date horaSaida;
//***************************************************\\
		horaSistama = GeraHora.DataSistema();		
		horaSaida   = GeraHora.ObterDataComDiferencaMinutos(192);
				
		curr = Math.abs(horaSaida.getTime() - horaSistama.getTime());
		
		dataFormatadaEntrada = ObterDataFormatada(horaSistama);
		dataFormatadaSaida   = ObterDataFormatada(horaSaida);
		
		horas.setHora(TimeUnit.HOURS.convert(curr, TimeUnit.MILLISECONDS));
		horas.setMinuto(TimeUnit.MINUTES.convert(curr, TimeUnit.MILLISECONDS));
		
		if(horas.getMinuto() >60)
			horas.setMinuto(TimeUnit.MINUTES.convert(curr, TimeUnit.MILLISECONDS)%60);
		System.out.println("*************************************************");
		System.out.println("Data do Sistema: "+ dataFormatadaEntrada);
		System.out.println("Data Modificada: "+ dataFormatadaSaida);
		
		System.out.println(horas.toString());
	}
}

