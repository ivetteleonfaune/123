package Person;

import Strategys.Luchador;
import Strategys.Strategy;
import Strategys.IFuerte;

public class PanchoDelSur extends Luchador {

	private Strategy strategy;
	private String nombre;
	
	public PanchoDelSur(){
		strategy = new IFuerte();
        nombre = "PANCHO DEL SUR!!!!";
        setTipo("fuerte");
	}
     
    @Override
	public String golpear(){
		return "PUÑO DEL HOCICON!!!";
	}
        
	@Override
	public String patear(){
		return "PATADA SATELITEEE!!!";
	}
    
    @Override
	public String saltar(){
		return "JOJOI!!!";
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