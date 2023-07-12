package Metodos;

public class usarMetodo {
public static void main(String[] args) {
	JavaMetodos pessoa01 = new JavaMetodos();
	int a = pessoa01.idade();
	String b = pessoa01.nome();
	boolean c = pessoa01.estado();
	double d = pessoa01.valor();
	System.out.println(a+b+c+d);
}
}
