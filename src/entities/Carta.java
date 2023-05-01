
public class Carta { 
    private String naipe;
    private String valor;
    
    public Carta(String valor, String naipe) { 
        this.valor = valor;
        this.naipe = naipe;
    }
    
    public String getValor() { 
        return valor;
    }
    
    public String getNaipe() {
        return naipe;
    } 
    
    public String toString() {
        return "{" + valor + " de " + naipe +"}";
    }
}
