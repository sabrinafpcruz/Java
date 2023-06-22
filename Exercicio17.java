package Fundamentos;

import java.util.Scanner;

public class Exercicio17 {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Insira F para Feminino e M para Masculino");
	char resp = entrada.next().charAt(0);
	System.out.println(resp);
	
}
}
