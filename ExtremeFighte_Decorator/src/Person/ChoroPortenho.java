package Person;

import Strategys.Luchador;
import Strategys.Strategy;
import Strategys.IMago;

public class ChoroPortenho extends Luchador {
    
	private Strategy strategy;
	private String nombre;
	
	public ChoroPortenho(){
		strategy = new IMago();
        nombre = "Choro Portenho";
        setTipo("mago");  
    }
            
    @Override
    public String golpear(){
		return "ALETAZO MARINO!!!";
	}
	
	@Override
    public String patear(){
		return "PATADA DE LA JAIBAAAAA!!!";
	}

	@Override
    public String saltar(){
		return "PIQUERO INFERNAAAAAL!!!";
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