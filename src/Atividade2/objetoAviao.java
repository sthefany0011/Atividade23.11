package Atividade2;

public class objetoAviao {

	public static void main(String[] args) {
		
		Aviao aviao1 = new Aviao(8000, "WRTSD4564", "LATAM", 100, true, "Boeing 2003W", "Antonio Marcus");
          System.out.println("Altura de Voo:"+ aviao1.getAlturaVoo() + "\t"+"Código do Avião :" + "\t" + aviao1.getCogdoaviao() + "\t" +  
		"Nome da Companhia: " + "\t"+ aviao1.getNomedacia()+"\n"+ "Capacidade Máxima: "+ "\t" + aviao1.getCapDePessoas() + "\t"+ "Escala de voo:" + "\t"+ 
    		  aviao1.isEscala()+ "\t" + "Modelo do Avião:"+ "\t"+ aviao1.getModelo() + "t"+ "Nome do Piloto:"+"\t"+ aviao1.getNomePiloto());
          
          
          
	}

}
