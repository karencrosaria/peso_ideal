package pesoideal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double altura, pesoideal;
		//feminino f  masculino m
		char sexo;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Qual a sua altura? ");
		altura = scanner.nextDouble();
		System.out.println("Qual o seu sexo?\n F feminino \n M masculino");
		sexo = scanner.next().charAt(0);

		if(sexo=='f' || sexo=='F'){
			pesoideal = (62.1*altura)- 44.7;
			System.out.println("Seu peso ideal é: "+ (int)pesoideal+"kg.");
			
		}else if 
			(sexo=='m' || sexo=='M') {
			pesoideal = (72.7*altura)- 58;	
			System.out.println("Seu peso ideal é: "+ (int)pesoideal+"kg."); 
	}else {
		System.out.println("Sexo inválido.");
		
	}
}
}		
		
		
		
		

			
			
	

		


	





		
	





