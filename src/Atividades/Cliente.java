package Atividades;

public class Cliente {

	public String Nome;
	public String Sobrenome;
	public long Telefone;
	public String Email;
	public long CPF;
	public Cliente(String nome, String sobrenome, long telefone, String email, long cPF) {
		super();
		Nome = nome;
		Sobrenome = sobrenome;
		Telefone = telefone;
		Email = email;
		CPF = cPF;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getSobrenome() {
		return Sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		Sobrenome = sobrenome;
	}
	public long getTelefone() {
		return Telefone;
	}
	public void setTelefone(long telefone) {
		Telefone = telefone;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public long getCPF() {
		return CPF;
	}
	public void setCPF(long cPF) {
		CPF = cPF;
	}
	
	
}
