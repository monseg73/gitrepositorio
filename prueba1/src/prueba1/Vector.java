package prueba1;

public class Vector {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		int n=5; 
		int[] vector=new int[n];
		for (int i=0;i<n;i++) {
			vector[i]=(i+1)*10;
		}
		//visualizamos el vector
		for (int i=0;i<n;i++)
			System.out.printf("Elemento %d = %d\n",i,vector[i]);
	}

}
