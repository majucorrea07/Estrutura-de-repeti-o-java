package estruturaRepetição;
import java.util.Scanner;
public class exercicio5 {

	public static void main(String[] args) {
	int	funcio, salfuncio=0,sal,media=1;
    Scanner ler = new Scanner(System.in);
	
	System.out.println("Informe o número de funcionários que a empresa possui: ");
	funcio = ler.nextInt();
	
	for (int i=1; i<=funcio; i++) {
	System.out.println("Informe o sálario de cada funcionário");
	sal = ler.nextInt();
	salfuncio += sal;
	
	}
	
	media = salfuncio/funcio;
	System.out.println("A média salarial da empresa é de: " + media);
	ler.close();
	
	}

}
