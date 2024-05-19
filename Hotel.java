package Trivago;

public class Hotel{

	private boolean [] habitaciones = new boolean [32];//por defecto todos false
	
	public Hotel(){}


	public void Ocupar(int x) {
	
    	if (x >= 0 && x < 32 && this.habitaciones[x] == false) 
        	this.habitaciones[x] = true ;
     	else System.out.println("Habitación no disponible");

	}//Ocupar

	
}//Clase
