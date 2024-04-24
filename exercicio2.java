package estruturaRepetição;
import java.util.Scanner;
public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
        double valor,media, soma=0;
	   
       for (double i=0; i<=4; i++) {
	   System.out.println("Informe o valor");
	   valor = ler.nextDouble();
	   soma+= valor;
	   
       }
	media = soma/5;
	System.out.println("Sua média foi: " + media);
	ler.close();
	
	
	
	
	}

}
