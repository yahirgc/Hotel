package Trivago;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main{

	public static Scanner x = new Scanner(System.in);

	public static void main(String[] args){

		LocalDate llegada, salida, fechaActual=LocalDate.now();
		int habitacion_tipo,personas, días;
		int opc = 0;

		Titular pancho = new Titular();
		Hotel trivago = new Hotel();

		pancho.setNombres("Pancho Pantera");


		while(opc != -1){

			System.out.println("Ingresa una opcion");
			System.out.println("1.- Check-in");
			System.out.println("2.- Liberar cuarto");
			System.out.println("3.- Disponibilidad de habitaciones");
			System.out.println("4.- Ver informacion de un usuario");
			opc = x.nextInt();

			switch(opc){

				case 1 -> {
					System.out.println("Ingresar cantidad de personas");
					personas = x.nextInt();
					System.out.println("La fecha actual es:" + fechaActual);
					System.out.println("¿Hasta que día?");
					días = x.nextInt();
					llegada = fechaActual;
					salida = llegada.withDayOfMonth(días);
					System.out.println("La salida será:" + salida);
                                        System.out.println("Escoge una habitación");
                                        pancho.numHabitacion = x.nextInt();
                                        Hotel.Ocupar(pancho.numHabitacion);
				;;}

				case 3 -> { trivago.mostrar();

				}//case


				}//Switch

			}//While
			System.out.println("\n\n\tFin del programa\n");
			System.out.println("\n\n \t\n" + pancho.nombres	);

			}
}
