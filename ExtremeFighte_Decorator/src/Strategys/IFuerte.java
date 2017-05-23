package Strategys;

public class IFuerte extends Strategy { 
	
	@Override
    public int getValor(){
            return 100;
    }
	
    @Override
    public String Sort(){
        return "Ataque fuerte";
    }
    
}