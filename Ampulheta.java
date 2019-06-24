
public class Ampulheta {

	public static void main(String[] args) {
		
		/*
		 1 2 3 4 5 6
		 2 3 4 5 6 7
		 3 4 5 6 7 8
		 4 5 6 7 8 9
		 5 6 7 8 9 1
		 6 7 8 9 1 2
		*/
		
		int matriz[][] = {{1,2,3,4,5,6},
						  {2,3,4,5,6,7},
						  {3,4,5,6,7,8},
						  {4,5,6,7,8,9},
						  {5,6,7,8,9,1},
						  {6,7,8,9,1,2}};
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(" "+matriz[i][j]);
			}
			System.out.println();
		}

		System.out.println("");
		readAmpulheta(matriz);
		
	}
	
	public static void readAmpulheta(int m[][]){
		int somatorio[] = new int [16];
		int max = 0;
		int k = 0;
		int total = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				somatorio[k] = m[i][j] + m[i][j+1] + m[i][j+2] + m[i+1][j+1] + m[i+2][j] + m[i+2][j+1] + m[i+2][j+2];
				total += m[i][j] + m[i][j+1] + m[i][j+2] + m[i+1][j+1] + m[i+2][j] + m[i+2][j+1] + m[i+2][j+2];
				if (somatorio[k] > max) {
					max = somatorio[k];
				}
				k++;
			}
		}
		for (int z = 0; z < 16; z++) {
			System.out.println("Somatório "+(z+1)+": "+somatorio[z]);
		}
		System.out.println("Maior somatório: "+max);
		System.out.println("Somatório total: "+total);
	}

}
