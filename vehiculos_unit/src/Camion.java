public class Camion extends Vehiculos {
    private boolean articulado;
    private boolean frigorifico;

    public Camion() {
    }

    public Camion(String marca, String modelo, String tipo, int numRuedas,boolean articulado, boolean frigorifico) {
        super(marca, modelo, tipo, numRuedas);
        this.articulado = articulado;
        this.frigorifico = frigorifico;
    }

    public boolean isArticulado() {
        return this.articulado;
    }

    public boolean getArticulado() {
        return this.articulado;
    }

    public void setArticulado(boolean articulado) {
        this.articulado = articulado;
    }

    public boolean isFrigorifico() {
        return this.frigorifico;
    }

    public boolean getFrigorifico() {
        return this.frigorifico;
    }

    public void setFrigorifico(boolean frigorifico) {
        this.frigorifico = frigorifico;
    }


    @Override
    public String toString() {
        String esArticulado="";
        String esFrigorífico="";
        if(isArticulado()){
            esArticulado=" Articulado";
        }
        if(isFrigorifico()){
            esFrigorífico=" Frigorífico";
        }
        return getTipo() + esArticulado +esFrigorífico + " " +  getMarca() + " | Modelo: " + getModelo() + ". Tiene " + getNumRuedas() + " ruedas.\n";
    }
    public String toStringNombre() {
        return getMarca() + " " + getModelo();
    }
}

    

