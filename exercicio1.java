package estruturaRepetição;
import java.util.Scanner;
public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int num;
    Scanner ler = new Scanner(System.in);
	 
    System.out.println("Informe o número");
	num = ler.nextInt();
	
	for(int i=num; i<=num; i++) {        
	if (i % 2 == 0) {
	System.out.println("O número é par");
	}
	else {
	System.out.println("O número é impar");
	}
	}
	ler.close();
	
	
	}

}
