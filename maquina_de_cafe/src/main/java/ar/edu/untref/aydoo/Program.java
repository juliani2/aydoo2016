package ar.edu.untref.aydoo;

public class Program {

	 public static final void main(String arg[])
	 {
		 if(arg.length == 2){
			 
			 MaquinaExpendedoraDeBebidas maquina = new MaquinaExpendedoraDeBebidas();
			 
			 if(arg[0].equals("hacerCafeConLecheConNdeAzucar:")){
			
				 maquina.hacerCafeConLecheConNDeAzucar(Integer.parseInt(arg[1]));				 
			 
			 }else if(arg[0].equals("hacerTeConLecheConNdeAzucar:")){
				 
				 maquina.hacerTeConLecheConNDeAzucar(Integer.parseInt(arg[1]));
			 
			 }else{
				 
				 System.out.println("Las opciones validas son:");
				 System.out.println("hacerCafeConLecheConNdeAzucar: n");
				 System.out.println("hacerTeConLecheConNdeAzucar: n");
			 }
			 
		 }else{
			 
			 System.out.println("Las opciones validas son:");
			 System.out.println("hacerCafeConLecheConNdeAzucar: n");
			 System.out.println("hacerTeConLecheConNdeAzucar: n");
		 }
		 
	 }

}
