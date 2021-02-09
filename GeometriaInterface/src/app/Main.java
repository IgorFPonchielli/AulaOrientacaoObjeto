package app;

import classes.Circulo;
import classes.Figura;
import classes.Quadrado;
import classes.Retangulo;
import classes.Triangulo;

public class Main {

	public static void main(String[] args) {

		Quadrado qd = new Quadrado("qua", 8);
		Retangulo rt = new Retangulo("retan", 5, 8);
		Circulo cr = new Circulo("circulo", 5);
		Triangulo tr = new Triangulo("triangulo", 5.75, 8);
		
		
		System.out.println("\n");		
		System.out.println("Area do quadrado: " + qd.getArea());
		System.out.println("Area do retangulo: " + rt.getArea());
		System.out.println("Area do circulo: " + cr.getArea());
		System.out.println("Area do Triangulo: " + tr.getArea());
	}

}
