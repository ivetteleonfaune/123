package Person;

import Strategys.Luchador;
import Strategys.Strategy;
import Strategys.IFuerte;

public class MineroWarrior extends Luchador{

	private Strategy strategy;
	private String nombre;
	
    public MineroWarrior(){
    	strategy = new IFuerte();
    	nombre = "Minero Warrior";
    	setTipo("fuerte");
    }

    @Override
    public String golpear(){
		return "PUNHO DEL PIRQUINEROOOO!!!";
	}
	
    @Override
	public String patear(){
		return "PATADA DEL CATEADOOOOOOR!!!";
	}
        
    @Override
	public String saltar(){
		return "SALTO EXPLOSIVOOOOO!!!";
	}

    @Override
    public String getNombre(){
		return nombre;
	}
    
    @Override
    public Strategy getStrategy(){
        return strategy;
    }
    
    @Override
    public int getValor(){
        return strategy.getValor();
    }
	
}