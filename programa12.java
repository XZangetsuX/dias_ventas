package Dia_ventas;

import java.util.Arrays;
import java.util.Random;

public class programa12 {

	public static void main(String[] args) {
		programa12 p = new programa12();
		int[][] a = new int[12][];//array original
		int[][] b = Arrays.copyOf(a, a.length);//array copia
		a = inicializa();
		muestra(a);
		//System.out.println("-----sort-------");
		b = Sort(a);
		//muestra(a);
		orderIntIndex(a,b);
	}

	public programa12() {

	}

	static void muestra(int a[][]) {

		for (int i = 0; i < a.length; i++) {
			System.out.println("mes " + (i + 1) + ": ");
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.print("\n");
		}
	}

	public static int[][] inicializa() {
		int[][] a;
		a = new int[12][];

		a[0] = new int[31];// enero
		a[1] = new int[28];// febrero
		a[2] = new int[31];// marzo
		a[3] = new int[30];// abril
		a[4] = new int[31];/// mayo
		a[5] = new int[30];// junio
		a[6] = new int[31];// julio
		a[7] = new int[31];// agosto
		a[8] = new int[30];// septiembre
		a[9] = new int[31];// octubre
		a[10] = new int[30];// noviembre
		a[11] = new int[31];// diciembre*/

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = randomxy(5000, 10000);

			}

			System.out.println("\n");
		}

		return a;
	}

	static int randomxy(int x, int y) {
		int ran = (int) (Math.floor(Math.random() * (y - x + 1)) + x);

		return ran;

	}

	public static int[][] Sort(int[][] a) {
		// cargar matriz y mostrar su contenido

		for (int i = 0; i < a.length; i++) {// ordena la matriz de abajo hacia arriba
			for (int j = 0; j < a[i].length; j++) {
				System.out.println(i+","+j+": "+a[i][j]+"\n");
				for (int x = 0; x <a.length; x++) {
					for (int y = 0; y < a[x].length; y++) {
						if (a[i][j] < a[x][y]) {
							int t = a[i][j];
							a[i][j] = a[x][y];
							a[x][y] = t;
						}
					}
				}
			}
		}

		return a;
	}
	
	private static int[][] orderIntIndex(int[][] disorderArray, int[][] orderArray) {
		int lon = disorderArray.length;

		int[][] index = new int[lon][];
		Arrays.fill(index, 0);

		boolean[][] esta = new boolean[lon][];
		Arrays.fill(esta, false);

		for (int i = 0; i < orderArray.length; i++) {
			for (int j = 0; j < esta.length; j++) {
				
			
			int in = 0;
			boolean stay = false;
			while (in < orderArray.length & !stay) {
				if ((disorderArray[in][j] == orderArray[i][j]) & !esta[in][j]) {
					esta[in][j] = true;
					index[i][j] = in;
					stay = true;
				} else {
					in++;
				}
			}
		}
		}
		
	
		return index;
	}

}
