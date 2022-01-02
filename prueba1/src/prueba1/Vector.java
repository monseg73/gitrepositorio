package prueba1;

public class Vector {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		int n=5,result=0;
		int a[]=new int[n];
		for (int i=0;i<n;i++)
			a[i]=(i+1)*10;
		
		//visualizamos el vector
		for (int i=0;i<n;i++)
			System.out.printf("Elemento %d=%d\n",i,a[i]);
		for (int i=0;i<n;i++)
			result=result + a[i];
		System.out.println("La media es ="+ result/n);
	}

}
