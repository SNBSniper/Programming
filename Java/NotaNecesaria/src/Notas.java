/**
 * 
 */

/**
 * @author Daniel.Tapia
 *
 */
public class Notas {

	
	public static void main(String[] args) {
		
		int c1,c2,lab;
		StdOut.println("Ingrese Nota del C1");
		c1=StdIn.readInt();
		StdOut.println("Ingrese Nota del C2");
		c2=StdIn.readInt();
		StdOut.println("Ingrese Nota del Lab");
		lab=StdIn.readInt();
		
		StdOut.println("La nota necesaria para aprobar el ramo es " + (1800-9*lab-7*c1-7*c2)/7); //esto se consigue despejando la variable C3 del algoritmo usando algebra.
		
		
	}

}
