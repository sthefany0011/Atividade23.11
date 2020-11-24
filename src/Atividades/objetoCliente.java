package Atividades;

public class objetoCliente {

	public static void main(String[] args) {
		
  Cliente cliente1 = new Cliente("Pedro", "Oliveira", 38711934, "pedro.oliveira@gmail.com", 567876345);
  
System.out.println("Nome Completo do Cliente: "+ "\t"+ cliente1.getNome() + "\t" + cliente1.getSobrenome() + "\t"+ "Telefone: "+ "\t"+ cliente1.getTelefone()
+ "\t"+ "Email:" + "\t" + cliente1.getEmail() + "\t" + "CPF: "+ "\t"+ cliente1.getCPF());
  
	}

}
