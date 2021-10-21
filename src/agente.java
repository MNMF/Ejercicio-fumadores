import java.util.*;

public class agente extends Thread {
	
	private Mesa mesa;
	private Random a=new Random();
	
	public agente(Mesa mesa){
		this.mesa=mesa;
	}
	
	public void run(){
		while(true){
			int comp=a.nextInt(3);
			try{
				Thread.sleep(a.nextInt(900));
				mesa.componentes(comp);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
