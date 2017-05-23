package Person;

import Strategys.Luchador;
import Strategys.Strategy;
import Strategys.IAgil;

public class HalconDeChicureo extends Luchador{

	private Strategy strategy;
	private String nombre;
	
	public HalconDeChicureo(){
		strategy = new IAgil();
       nombre = "HALCON DE CHICUREO!!!!";
        setTipo("agil");    
    }
	
	@Override
	public String golpear(){
		return "BRAZO BOOMERANG!!!";
	}
	
	@Override
    public String patear(){
		return "PATADA DE BIEN LEJOS!!!";
	}

	@Override
    public String saltar(){
		return "SALTO DEL AVION!!!";
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