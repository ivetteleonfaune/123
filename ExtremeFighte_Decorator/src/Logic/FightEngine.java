package Logic;

import Strategys.Luchador;
import Person.GorrionDeConchali;
import Person.ChoroPortenho;
import Person.MineroWarrior;
import Person.PanchoDelSur;
import Person.HalconDeChicureo;
import Apoyo.Tarro;
import Apoyo.Iluminati;
import Apoyo.NoPeleen;
import java.util.Scanner;

public class FightEngine {
	
	static final Scanner seleccion = new Scanner(System.in);
	Luchador luchador; 

	public FightEngine(){
		iniciar();
	}
	
	private void iniciar(){
		int selec;
		System.out.println("Empieza el juego!!!");
		System.out.println("Selecciona tu luchador:\n1-Choro Portenho\n2-Minero Warrior\n3-Gorrion de Conchali\n4-Halcon de Chicureo\n5-Pancho del Sur");
		switch(Integer.parseInt(seleccion.nextLine())) {
			case 1: luchador = new ChoroPortenho(); //Magico
					break;
			case 2: luchador = new MineroWarrior(); //Fuerte
					break;
			case 3: luchador = new GorrionDeConchali(); //Agil
					break;
			case 4: luchador = new HalconDeChicureo(); //Agil
					break;
			case 5: luchador = new PanchoDelSur(); //Fuerte
					break;
        }
		System.out.println("Seleccione un apoyo:\n0-Sin ningun apoyo\n1-Nino Iluminati\n2-No peleen\n3-Tarro");
		while((selec = Integer.parseInt(seleccion.nextLine())) != 0){
			System.out.println("0-No mas apoyo\n1-Ninho Iluminati\n2-No peleen\n3-Tarro");
			switch(selec){
				case 1:	 luchador = new Iluminati(luchador);
					break;
				case 2:	luchador = new NoPeleen(luchador);
					break;
				case 3: luchador = new Tarro(luchador);
					break;
				default: System.out.println("Default");
					break;
			}
		}
        System.out.println(luchador.getNombre() + " inicia la batalla!");
        System.out.println("Ingresa tu accion:\n1-Golpe\n2-Patada\n3-Salto\n4-Ataque especial");
		switch(Integer.parseInt(seleccion.nextLine())) {
			case 1: System.out.println(luchador.golpear());
					break;
			case 2: System.out.println(luchador.patear());
					break;
			case 3: System.out.println(luchador.saltar());
					break;
			case 4: System.out.println("DAÑO TOTAL:" + luchador.getStrategy().Sort() + " .-" + luchador.getValor() + "-.");
					break;
		}
		System.out.println("-.FIN DEL JUEGO.-");
	}

}
