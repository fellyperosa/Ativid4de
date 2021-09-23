import java.util.Scanner;

public class Principal {
	
 
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o ano");
		float ano = teclado.nextFloat();
		
		if(ano % 400 == 0){
            System.out.println(ano + " é bissexto.");
        // se o ano for menor que 400
        } else if((ano % 4 == 0) && (ano % 100 != 0)){
            System.out.println(ano + " é bissexto.");
        } else{
            System.out.println(ano + " não é bissexto");
        }

		
	}

}
