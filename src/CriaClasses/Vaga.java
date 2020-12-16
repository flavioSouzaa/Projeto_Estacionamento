package CriaClasses;

public class Vaga {

	private int idt;
    private String placaCarro;
    private String horaEntrada;
    private String horaSaida;
    private String horarioOcupacao;


	public Vaga(int idt, String placaCarro,String horaEntrada,String horaSaida, String horarioOcupacao) {
        this.idt = idt;
        this.placaCarro = placaCarro;
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
        this.horarioOcupacao = horarioOcupacao;        

    }
    
    public String getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(String horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public String getHoraSaida() {
		return horaSaida;
	}

    public int getIdt() {
        return idt;
    }

    public void setIdt(int idt) {
        this.idt = idt;
    }

    public String getPlacaCarro() {
        return placaCarro;
    }

    public void setPlacaCarro(String placaCarro) {
        this.placaCarro = placaCarro;
    }

    public String getHorarioOcupacao() {
        return horarioOcupacao;
    }       
    
    public String getHorasaida() {
    	return horaSaida;
    }
    
    public void setHorarioOcupacao(String horarioOcupacao) {
        this.horarioOcupacao = horarioOcupacao;
    }

    public void setHoraSaida(String horasaida) {
    	this.horaSaida = horasaida;
    }
    public String toString(){
       
    	if((horaSaida == null) && (horarioOcupacao == null))    	
    	return "ID: " + idt + "\n"+ "Placa do Veiculo:" + placaCarro + "\n" +"Hora de Entrada:" +   horaEntrada  + "\n" +"***********************************";     		 
    	
        return "ID: " + idt + "\n"+ "Placa do Veiculo: " + placaCarro + "\n" +"Hora de Entrada:  " +   horaEntrada  + "\n" +"Hora de Saída:    " + horaSaida + "\n" + "Hora de Ocupação: "+ horarioOcupacao + "\n" +"***********************************";     		 
    	
        		 
    }
}
