package entities;

public enum Valor {
    DOIS(0),
    TRES(0),
    QUATRO(0),
    CINCO(0),
    SEIS(0),
    SETE(10),
    VALETE(3),
    DAMA(2),
    REI(4),
    AS(11);
    
    private int ponto;
    
    private Valor(int ponto) {
        this.ponto = ponto;
    }
    
    public int getPonto() {
        return ponto;
    }
}
