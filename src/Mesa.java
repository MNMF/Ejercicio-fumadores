

public class Mesa{
	
	private boolean fumando=false;
	private boolean compMesa=false;
	private int comp;
		
	public synchronized void componentes(int comp) throws InterruptedException{
	while(compMesa||fumando)
	
	wait();
	
	this.comp=comp;
	compMesa=true;
	System.out.println("el fumador actual le falta el ingrediente "+comp);
	
	notifyAll();
	}
	
	public synchronized void inicioFumar (int fumador) throws InterruptedException{
	while(!compMesa||fumando||comp!=fumador)
		
	wait();
	
	System.out.println("fumador "+fumador+" lía su cigarrillo y comienza a fumar");
	compMesa=false;
	fumando=true;
	
	notifyAll();
	}
	
	public synchronized void terminoFumar(int fumador) throws InterruptedException{
	fumando=false;
	
	System.out.println("fumador "+fumador+" a consumido su cigarrillo"+"\n"+"\n");
	}
}
