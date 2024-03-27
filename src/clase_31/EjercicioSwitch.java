package clase_31;

import java.util.Scanner;

public class EjercicioSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Desarrollemos un condicional switch que evalúe un número ingresado del 1 al 12 
		 *  y nos devuelva por pantalla a cuál mes del año hace referencia.
		 */
	
		Scanner leer = new Scanner(System.in);
		
		System.out.print("Ingresa un numero de Mes:   ");
		int nroMes=leer.nextInt();
		
		
		switch(nroMes) {
		case 1 :
			System.out.println("Enero");
			break;
		case 2 :
			System.out.println("Febrero");
			break;
		case 3 :
			System.out.println("Marzo");
			break;
		case 4 :
			System.out.println("Abril");
			break;
		case 5 :
			System.out.println("Mayo");
			break;
		case 6 :
			System.out.println("Junio");
			break;
		case 7 :
			System.out.println("Julio");
			break;
		case 8 :
			System.out.println("Agosto");
			break;
		case 9 :
			System.out.println("Septiembre");
			break;
		case 10 :
			System.out.println("Octubre");
			break;	
		case 11 :
			System.out.println("Noviembre");
			break;
		case 12 :
			System.out.println("Diciembre");
			break;
		default:
			System.out.println("No es un mes válido");
			
		}
		
		
		
		
		switch(nroMes) {
			case 1 :
			case 3 :
			case 5 :
			case 7 :
			case 8 :
			case 10 :
			case 12 :
				System.out.println("31 Dias");
				break;		
			case 4 :
			case 6 :
			case 9 :
			case 11 :		
				System.out.println("30 Dias");
				break;
			case 2 :
				System.out.println("28");
				break;
			default:
				System.out.println("No es un mes válido");			
		}
		
		switch(nroMes) {
			case  1,3,5,7,8,10,12 -> System.out.println("31 Dias");
			case  4,6,9,11 -> System.out.println("30 Dias");
			case 2 -> System.out.println("28");
			default-> System.out.println("No es un mes válido");		
		}
		
	}

}
