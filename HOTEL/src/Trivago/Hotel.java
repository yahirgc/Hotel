package Trivago;

public class Hotel{ 
	private static Habitacion [] habitaciones = new Habitacion [32];
	public Hotel(){}

	public static void Ocupar(int x) {
	
    	if (x >= 0 && x < 32 && Hotel.habitaciones[x].Ocupado() == false){ 
        	Hotel.habitaciones[x-1].setOcupado(true);
        }else System.out.println("Habitación no disponible");

	}//Ocupar

	public void mostrar(){
	    
	    for(int i=1; i<33; i++){
		if (this.habitaciones[i-1].Ocupado() == false)
                System.out.println("Habitación #" + i +" Disponible");
            }
        }//mostrar	
        
}//Clase