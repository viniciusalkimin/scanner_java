import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double z;
		char a;
		
		System.out.println("Digite uma String :");
		x=sc.next();
		
		System.out.println("Digite um número Inteiro :");
		y=sc.nextInt();
		
		System.out.println("Digite um número Real :");
		z=sc.nextDouble();
		
		System.out.println("Digite um caractere :");
		a=sc.next().charAt(0);
		
		System.out.println("Você digitou os seguintes dados: ");
		System.out.println("String:" +x);
		System.out.println("Int:" +y);
		System.out.println("Real:" +z);
		System.out.println("Char:" +a);
	}

}
