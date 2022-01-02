package cambio1;

public class Matriz {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		int n=5, m=3;
		int[][] matriz=new int[5][3];
		for (int i=0;i<n;i++) {
			for (int j=0;j<m;j++) {
				matriz[i][j]=(i+1)*10 + (j+1);
			}
		}
		System.out.println("Los elementos de la matriz son\n");
		//visualizamos la matriz
		for (int i=0;i<n;i++) {
			for (int j=0;j<m;j++) {
				System.out.printf("Elemento (%d,%d) = %d\n",i,j,matriz[i][j]);
			}
		}
	}

}
