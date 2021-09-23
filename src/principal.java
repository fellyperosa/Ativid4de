import java.util.Scanner;

public class principal {
	
	

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("FORMAS DO TRINGULO");
		
		System.out.println("DIGITE AS LATERAIS DO TRIANGULO");
		
		
		
		System.out.println("Lado 1 :");
		float num1 = teclado.nextFloat();
		
		System.out.println("Lado 2 :");
		float num2 = teclado.nextFloat();
		
		System.out.println("Lado 3 :");
		float num3 = teclado.nextFloat();
		
		if (num1 < num2 + num3 ||  num2 < num1 + num3 || num3 < num1 + num3){
            System.out.println("Trata-se de um triangulo");
        }
		
		
		if (num1 == num2 && num1 == num3 && num2 == num3) {
		System.out.println("Então ele é um triangulo EQUILÁTERO !");
		}else if (num1==num2 || num1 == num3 || num2==num3) {
			System.out.println("Então ele é um triangulo ISÓCELES !");
		}else
		
			System.out.println("Então ele é um triangulo ESCALENO !");
		
		
		
	

	}

}
