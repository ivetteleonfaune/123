package Strategys;

public abstract class Luchador {
    
	private String tipo = new String();
                
    public abstract String golpear();
	
	public abstract String patear();

	public abstract String saltar();
	
    public abstract String getNombre();
    
    public String getTipo(){
        return tipo;
    }

    public void setTipo(String nuevoTipo){
        tipo=nuevoTipo;
    }

    public abstract Strategy getStrategy();
    
    public abstract int getValor();

}
