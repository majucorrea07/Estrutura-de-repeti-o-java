package estruturaRepetição;
import java.util.Scanner;
public class exercicio3 {

	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
	    int valor, num=0,media, somapar=0, somaimpar=0;
	    
	    for (int i=1; i<=10; i++) {
	    System.out.println("Informe um valor: ");
	    valor = ler.nextInt();
	    if (valor % 2 == 0) {	
	      somapar++;
	    }
	    else {
	    	somaimpar++;
	    	
	    }
	    	
	    }
	    System.out.println("A quantidade de numeros pares é: " + somapar);
	    System.out.println("A quantidade de numeros impares é: "+ somaimpar);
	    ler.close();
	    
	    
	}

}
