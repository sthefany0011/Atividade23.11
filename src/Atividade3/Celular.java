package Atividade3;

public class Celular {

	    public String Cor;
		public String Acessorio1;
		public String Acessorio2;
		public String Modelo;
		public int Lanšamento;
		public Celular(String cor, String acessorio1, String acessorio2, String modelo, int lanšamento) {
			super();
			Cor = cor;
			Acessorio1 = acessorio1;
			Acessorio2 = acessorio2;
			Modelo = modelo;
			Lanšamento = lanšamento;
		}
		public String getCor() {
			return Cor;
		}
		public void setCor(String cor) {
			Cor = cor;
		}
		public String getAcessorio1() {
			return Acessorio1;
		}
		public void setAcessorio1(String acessorio1) {
			Acessorio1 = acessorio1;
		}
		public String getAcessorio2() {
			return Acessorio2;
		}
		public void setAcessorio2(String acessorio2) {
			Acessorio2 = acessorio2;
		}
		public String getModelo() {
			return Modelo;
		}
		public void setModelo(String modelo) {
			Modelo = modelo;
		}
		public int getLanšamento() {
			return Lanšamento;
		}
		public void setLanšamento(int lanšamento) {
			Lanšamento = lanšamento;
		}
		
		
	}


