package Atividade3;

public class objetoCelular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Celular celular1 = new Celular("Amarelo Neon", "Carregador", "Fone de ouvido", "Iphone12W78", 2020);
   System.out.println("Cor do aparelho: "+ celular1.getCor()+"\t"+ "Acessórios: "+ celular1.getAcessorio1()+ "\t" +"e"+"\t"+ celular1.getAcessorio2()+ "\t" + "Modelo: "+
	celular1.getModelo()+ "\t"+ "Ano de Lançamento: "+ celular1.getLançamento());

	}
}