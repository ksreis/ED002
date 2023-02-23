package Controller;

public class Elementos {
	
	public Elementos() {
		super();
	}

	public static int totNegativo(int[] v, int n) {
	    // condição de parada
	    if (n == 0) {
	        return 0;
	    }
	    // chamada recursiva
	    else {
	        int count = totNegativo(v, n - 1);
	        if (v[n - 1] < 0) {
	            count++;
	        }
	        return count;
	    }
	}

}


