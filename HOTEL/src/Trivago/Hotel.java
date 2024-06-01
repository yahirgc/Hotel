package Trivago;

public class Hotel{

	private static boolean [] habitaciones = new boolean [32];//por defecto todos false
	
	public Hotel(){}

	public static void Ocupar(int x) {
	
    	if (x >= 0 && x < 32 && Hotel.habitaciones[x] == false) 
        	Hotel.habitaciones[x-1] = true ;
     	else System.out.println("Habitación no disponible");

	}//Ocupar

	public void mostrar(){
	    
	    for(int i=1; i<33; i++){
		if (this.habitaciones[i-1] == false)
                System.out.println("Habitación #" + i +" Disponible");
            }
        }//mostrar	
        
}//Clase