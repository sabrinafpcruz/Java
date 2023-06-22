package Fundamentos;

import java.util.Scanner;

public class Exercicio16 {
public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Digite a N1: ");
	int n1 = entrada.nextInt();
	
	System.out.println("Digite a N2: ");
	int n2 = entrada.nextInt();
	
	float media = (n1 + n2)/2;
	
	System.out.println("A média foi: "+media);
	
	
}
}
