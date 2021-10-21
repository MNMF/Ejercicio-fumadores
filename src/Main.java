

public class Main {

	
public static void main(String[]args){
    Mesa mesa=new Mesa();
	agente agente=new agente(mesa);
	
	fumador fumador0= new fumador(0, mesa);
	fumador fumador1= new fumador(1, mesa);
    fumador fumador2= new fumador(2, mesa);
	
	agente.start();
	
    fumador0.start();
	fumador1.start();
	fumador2.start();
	

	}
}

