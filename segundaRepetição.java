package estruturaRepetição;
import java.util.Scanner;
public class segundaRepetição {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int numero,resultado;
        Scanner ler = new Scanner(System.in);
	
	System.out.println("Informe o numero para ver a tabuada: ");
	numero = ler.nextInt();
	
	for(int i =1; i<=10; i++) {
	resultado = numero * i;
	System.out.println(numero + " X " + i + " = " + resultado + "\n");
	
	}
	ler.close();
	
	}

}
