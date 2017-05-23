package Person;

import Strategys.Luchador;
import Strategys.Strategy;
import Strategys.IAgil;

public class GorrionDeConchali extends Luchador{

	private Strategy strategy;
	private String nombre;
	
	public GorrionDeConchali(){
		strategy = new IAgil();
        nombre = "GORRION DE CONCHALI!!!!";		
        setTipo("agil");		
    }
    	
	@Override
    public String golpear(){
		return "PUNHO CEBOLLERO!!!";
	}
	
    @Override
	public String patear(){
		return "PATADA LACRIMOGENA!!!";
	}

    @Override
	public String saltar(){
		return "PIQUERO ROMANTICO!!!";
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