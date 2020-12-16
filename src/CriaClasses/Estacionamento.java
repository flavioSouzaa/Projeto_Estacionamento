package CriaClasses;

import java.util.ArrayList;
public class Estacionamento {
	private String endereco;
	private int qtdCarros;
	private String nome;    
    private ArrayList<Vaga> vagas;
    private ArrayList<Hora> horas;
    
	public Estacionamento(String nome, String endereco, int qtdCarros, ArrayList<Vaga> vagas, ArrayList<Hora> horas) {		
		this.nome = nome;
		this.endereco = endereco;
		this.qtdCarros = qtdCarros;
		this.vagas = vagas;
		this.horas = horas; 
	}
	
	public ArrayList<Hora> getHoras() {
		return horas;
	}

	public void setHoras(ArrayList<Hora> horas) {
		this.horas = horas;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public ArrayList<Vaga> getVagas() {
		return vagas;
	}

	public void setVagas(ArrayList<Vaga> vagas) {
		this.vagas = vagas;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getQtdCarros() {
		return qtdCarros;
	}
	public void setQtdCarros(int qtdCarros) {
		this.qtdCarros = qtdCarros;
	}    
}
