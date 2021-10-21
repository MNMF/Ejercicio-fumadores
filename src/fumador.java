

public class fumador extends Thread{
	
 private int fumador;
 private Mesa mesa;

 
 public fumador(int fumador, Mesa mesa){
 this.fumador=fumador;
 this.mesa=mesa;       
 }

 public void run(){
	  while(true){
	   try {
	    mesa.inicioFumar(fumador);
	    mesa.terminoFumar(fumador);
	   } 
	   catch (InterruptedException e) {
		   e.printStackTrace(); }
      }
  }
 }