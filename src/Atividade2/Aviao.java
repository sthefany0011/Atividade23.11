package Atividade2;

public class Aviao {

	

	
	public int alturaVoo;
	
	public String Cogdoaviao;
	
	public String Nomedacia;
	
	public int capDePessoas;
	
	public boolean escala;
	
	public String Modelo;
	
	public String NomePiloto;

	public Aviao(int alturaVoo, String cogdoaviao, String nomedacia, int capDePessoas, boolean escala, String modelo,
			String nomePiloto) {
		super();
		this.alturaVoo = alturaVoo;
		this.Cogdoaviao = cogdoaviao;
		this.Nomedacia = nomedacia;
		this.capDePessoas = capDePessoas;
		this.escala = escala;
		this.Modelo = modelo;
		this.NomePiloto = nomePiloto;
	}

	public int getAlturaVoo() {
		return alturaVoo;
	}

	public void setAlturaVoo(int alturaVoo) {
		this.alturaVoo = alturaVoo;
	}

	public String getCogdoaviao() {
		return Cogdoaviao;
	}

	public void setCogdoaviao(String cogdoaviao) {
		Cogdoaviao = cogdoaviao;
	}

	public String getNomedacia() {
		return Nomedacia;
	}

	public void setNomedacia(String nomedacia) {
		Nomedacia = nomedacia;
	}

	public int getCapDePessoas() {
		return capDePessoas;
	}

	public void setCapDePessoas(int capDePessoas) {
		this.capDePessoas = capDePessoas;
	}

	public String isEscala() {
	String status;
	if(escala == true) {
	status = "Voo tem escala";
	}
	else {
		status= "Sem escala";
	}
		
		
		return status;
	}

	public void setEscala(boolean escala) {
		this.escala = escala;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public String getNomePiloto() {
		return NomePiloto;
	}

	public void setNomePiloto(String nomePiloto) {
		NomePiloto = nomePiloto;
	}
	
	
	
	
	
}
