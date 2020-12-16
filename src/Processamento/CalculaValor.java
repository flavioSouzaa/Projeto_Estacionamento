package Processamento;

import CriaClasses.Hora;

public class CalculaValor {

		float valorHoraPermanencia;
		public void CalculaValorPermanencia() {
//***************************************************\\
		GeraHora grh = new GeraHora();		
		Hora horas = new Hora();
		Utils_valores util = new Utils_valores();
//***************************************************\\
		grh.CalcularHora();
		
		
		horas.setHora(3);
		horas.setMinuto(35);
		
		System.out.println(horas.getHora());
		System.out.println(horas.getMinuto());
		
		if((horas.getMinuto() > util.TRINTA_MINUTOS) && (horas.getHora() < util.UMA_HORA)) {
			valorHoraPermanencia = util.VALOR_TRINTA_MINUTOS;
		}else if ((horas.getHora() == util.UMA_HORA) && (horas.getMinuto() < util.TRINTA_MINUTOS)) {
				valorHoraPermanencia = util.VALOR_UMA_HORA;
			}else {
				valorHoraPermanencia = util.VALOR_UMA_HORA;
				valorHoraPermanencia = valorHoraPermanencia + (horas.getHora() * util.VALOR_HORA_ADICIONAL);
				if(horas.getMinuto() > util.TRINTA_MINUTOS)
					valorHoraPermanencia = valorHoraPermanencia + util.VALOR_TRINTA_MINUTOS;
			}
		}

	public String toString() {
		return "Valor à Pagar: "+" R$: "+ valorHoraPermanencia;
	}
}