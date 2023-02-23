package View;

import Controller.Elementos;

public class Principal {

		public static void main(String [] args) {
			
			 int[] v = {-17,-9,-8,12,15,28};
		        int totNegativo = Elementos.totNegativo(v, v.length);
		        System.out.println("O total de números negativos e: " + totNegativo);
		}
}
		
