package Fundamentos;

import java.util.Scanner;

public class Exercicio13 {
public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Digite o primeiro número: ");
	int n1 = leia.nextInt();
	System.out.println("Digite o segundo número: ");
	int n2 = leia.nextInt();
	System.out.println("Digite o terceiro número: ");
	int n3 = leia.nextInt();
	
	if (n1 > n2 && n1 > n3) {
		if(n2 > n3) {System.out.println("O número: "+n1+" é o maior e o: "+n3+" o menor");} 
		else {System.out.println("O número"+n1+"é o maior e o"+n2+"o menor");}}
	else if(n2 > n3) {
		if(n3 > n1) {System.out.println("O número: "+n2+" é o maior e o: "+n3+" o menor");}
		else {System.out.println("O número"+n2+"é o maior e o"+n1+"o menor");}}
	else {
		if (n2> n1) {System.out.println("O número: "+n3+" é o maior e o: "+n1+" o menor");}
		else {System.out.println("O número "+n3+" é o maior e o "+n1+" o menor");}}
	}

}
