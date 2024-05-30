public class Coche extends Vehiculos {

    private boolean descapotable;


    public Coche() {
    }

    public Coche(String marca, String modelo, String tipo, int numRuedas, boolean descapotable) {
        super(marca, modelo, tipo, numRuedas);
        this.descapotable = descapotable;
    }

    public boolean isDescapotable() {
        return this.descapotable;
    }

    public boolean getDescapotable() {
        return this.descapotable;
    }

    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }

    

    @Override
    public String toString() {
        String esDescapotable="";
        if(isDescapotable()){
            esDescapotable=" (Descapotable)";
        }
        return getTipo() + " " + getMarca() + " | Modelo: " + getModelo() + esDescapotable + ". Tiene " + getNumRuedas() + " ruedas.\n";
    }

    public String toStringNombre() {
        return getMarca() + " " + getModelo();
    }


    
}
