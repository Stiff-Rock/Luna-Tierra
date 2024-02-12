package Pruebas;

import java.io.IOException;
import java.util.Scanner;

public class Tierra_Luna {
	public static void main(String[] args) throws IOException {
		final double gravedadTierra = 9.81;
		final double gravedadLuna = 1.62;
		Scanner escaner = new Scanner(System.in);
		System.out.println("¡Hola! ¿Cómo te llamas?");
		String nombre = escaner.nextLine();
		System.out.println("¡Encantado " + nombre + "! ¿Que edad tienes?");
		String edadTxt = escaner.nextLine();
		int edadNum = Integer.parseInt(edadTxt);
		System.out.println("Me lo apunto. Te llamas " + nombre + " y tienes " + edadNum + " años");

		System.out.println("Dime, " + nombre + ". ¿Querrias ir a la Luna o prefieres qudarte en la Tierra?");
		System.out.println("1: Luna.");
		System.out.println("2: Tierra.");
		int resp = escaner.nextInt();

		System.out.println("Has escogido la opción número " + resp + ".");
		System.out.println("Primero, necesito saber tu peso.");
		double peso = escaner.nextDouble();
		System.out.println("¡Perfecto!");
		System.out.println("¿Sabías que tu peso en la Tierra no es el mimso que en la Luna?");

		switch (resp) {
		case 1:
			System.out.print("Si estuvieses en la Luna tu peso sería ");
			System.out.printf("%2.2f", ((peso / gravedadTierra) * gravedadLuna));
			System.out.println(" Kg.");
			break;

		case 2:
			System.out.println("El peso no es igual a la masa, por ello, si hacemos los cálclos necesarios,");
			System.out.print("averiguamos que tu masa (independientemente de donde estés) es de ");
			System.out.printf("%2.2f", (peso / gravedadTierra));
			System.out.print(" Kg.");
			break;
		default:
			System.err.println("Error, no se reconoció tu respuesta. Reinicia el programa.");
			escaner.close();
		}

	}
}
