
package libs;


public class Funciones {
	
	/**
	 * Esta funcion devuelve el numero con el valor medio entre los tres que se pide al usuario, los compara entre ellos para 
	 * comprobar cual es el que tenga el valor medio aun sin tener los parametros desordenados.
	 * @param num1 int Valor 1 a comprobar si es el medio.
	 * @param num2 int Valor 2 a comprobar si es el medio.
	 * @param num3 int Valor 3 a comprobar si es el medio.
	 * @return Se devuelve el numero central entre los tres. 
	 */
	
	public int devuelveCentral(int num1, int num2, int num3) {
		
		int enMedio;
		
		if ((num1>=num2) && (num1<=num3)) {
			enMedio=num1;
		}  else if  ((num2>=num1) && (num2<=num3)) {
			enMedio= num2;
		} else {
			enMedio = num3;
		}
		return enMedio;
	}
	
	/**
	 * Esta funcion comprueba si el año que se le pasa es un año bisiesto, de primeras dice que el año no es bisiesto y a partir
	 * de eso comprueba si el año es bisiesto con una serie de operaciones matematicas (divide el año entre 4 y si el resto es 0
	 * comprueba si al dividirlo entre 100 y 400 el resto es 0). En caso afirmativo el año no es bisiesto, pero si no se cumple las
	 * condidiones el año si sera bisiesto.
	 * @param bisiesto Año se le pasa a la funcion el año que querremos comprobar si es bisiesto.
	 * @return Devuelve un booleano en el que dice si el año es bisiesto devolvera "true" y si no lo es devolvera "false".
	 */
	
	public boolean esBisiesto(int año) {
		boolean bisiesto =false;
		if (año %4 == 0 ) {
			if (año%100==0 && año%400!=0) {
				bisiesto=false;
			} else {
				bisiesto=true;
			}
		} else {
			bisiesto=false;
			}
		return bisiesto;
	}
	
	/**
	 * La funcion comprueba si un array o vector es capicuo, es decir, que se sea igual de derecha a izquierda como de izquierda a derecha
	 * la funcion recorre el array en ambas direcciones y compara si son iguales, en caso de ser afirmativo sera capicuo, en caso contrario
	 * no sera capicuo.
	 * @param v Array que se comprobara si es capicuo o no.
	 * @return Devuelve un booleano que muestra si es capicua el array o no, si lo es devuelve un "true" y sino devolvera un "false".
	 */
	
	public static boolean esCapicua(int v[]) {
		boolean capicua = true;
		
		for (int i=0, j=v.length-1; i<v.length/2; i++,j--) {
			if (v[i]!=v[j]) {
				capicua=false;
			}
		}
		return capicua;
	}
	
	/**
	 * Funcion que se dedica a realiar una suma de arrays o vectores, de primeras comprueba si los arrays son del mismo tamaño
	 * y en caso de ser afirmativo procedera a recorrerlos y a sumar el valor de sus indices.
	 * @param v Primer array para sumar.
	 * @param v2 Segundo array para sumar.
	 * @throws aritmeticException Se devuelve esta exception en el caso de los arrays pasados a la funcion no sean de la misma dimension
	 * @return int[] Devuelve un tercer array o vector que es el resultante de la suma de los anteriores arrays pasados a la funcion.
	 */

	public int [] suma_vectores(int v[], int v2[]) {
		int vector_suma [] = new int[v.length];
		
		if (v.length!=v2.length) 
		   throw new ArithmeticException("Los vectores deben tener el mismo tamaño");
		
		for (int i = 0; i < vector_suma.length; i++) {
			vector_suma[i]=v[i]+v2[i];
		}
		return vector_suma;
	}
	
	
}
