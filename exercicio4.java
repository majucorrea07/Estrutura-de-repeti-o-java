package estruturaRepetição;
import java.util.Scanner;
public class exercicio4 {

	public static void main(String[] args) {
	int fatorial=1,num;
    Scanner ler = new Scanner(System.in);
	
    System.out.println("Informe um número: ");
    num = ler.nextInt();
	System.out.println(" ");
	
	for (int i=1; i<=num; i++) {
	fatorial *=i;
	System.out.println(i + "!=" + fatorial);
	
	}
	ler.close();
	
	
	
	
	}

}
