package Fundamentos;

import java.util.Scanner;

public class Exercicio12 {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	System.out.println("Digite umm número: ");
	int resp = entrada.nextInt();
	
	System.out.println(resp == 0 ? "Número igual a zero" : resp > 0 ? "Número positivo" : "Número negativo");
}}
