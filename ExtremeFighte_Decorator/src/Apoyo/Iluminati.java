package Apoyo;

import Strategys.Luchador;
import Strategys.Strategy;

public class Iluminati extends Decorador{
    
	Luchador luchador;
    
    public Iluminati(Luchador luchador){
    	this.luchador = luchador;
    }
    
    @Override
    public Strategy getStrategy(){
    	return luchador.getStrategy();
    }
            
    @Override
    public String golpear(){
    	return luchador.golpear();
	}
	
	@Override
    public String patear(){
		return luchador.patear();
	}

	@Override
    public String saltar(){
		return luchador.saltar();
	}

    @Override
    public String getNombre(){
		return luchador.getNombre();
	}
      
    public int getValor(){
        return 40 + luchador.getValor();
    }

}