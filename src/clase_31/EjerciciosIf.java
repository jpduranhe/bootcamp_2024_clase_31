package clase_31;

public class EjerciciosIf {
  
	public static void main(String[] args) {
		/*
			1) Si es mayor a 18, imprimir la edad por pantalla.
			
			2) Si es mayor a 18, imprimir la edad por pantalla, si es menor a 18, 
				imprimir un mensaje que indique que es menor.
				
			3) Si es mayor a 18, imprimir la edad por pantalla. 
				Si es igual a 18, que imprima “tiene 18 actualmente”. 
				Si es menor, que lo indique por pantalla.

		 */
		
		int juanito=18, pepito=16, maria=21;
		
		int variableAEvaluarIfUno=juanito;
		if( variableAEvaluarIfUno > 18){
			
			//System.out.println("Eres un mayor de 18 y tu edad es:"+variableAEvaluarIfUno);
		}
		
		int variableAEvaluarIfDos=juanito;
		if(variableAEvaluarIfDos > 18) {
	//		System.out.println("Eres un mayor de 18 y tu edad es:"+variableAEvaluarIfDos);
		} else {
	//		System.out.println("Eres un menor de 18 y tu edad es:"+variableAEvaluarIfDos);
		}
		
		int variableAEvaluarIftres=pepito;
		
		if(variableAEvaluarIftres > 18) {
		//	System.out.println("Eres un mayor de 18 y tu edad es:"+variableAEvaluarIftres);
		} else if(variableAEvaluarIftres == 18) {
		//	System.out.println("Tienes :"+variableAEvaluarIftres);
		}		
		else {
		//	System.out.println("Eres un menor de 18 y tu edad es:"+variableAEvaluarIftres);
		}

		
		
		if(variableAEvaluarIftres > 18) {
		//	System.out.println("Eres un mayor de 18 y tu edad es:"+variableAEvaluarIftres);
		}
		if(variableAEvaluarIftres == 18) {
		//	System.out.println("Tienes :"+variableAEvaluarIftres);
		}		
		if(variableAEvaluarIftres < 18) {
		//.out.println("Eres un menor de 18 y tu edad es:"+variableAEvaluarIftres);
		}
		
		
		
		if(variableAEvaluarIftres < 18) 
			System.out.println("Eres un mayor de 18 y tu edad es:"+variableAEvaluarIftres);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
