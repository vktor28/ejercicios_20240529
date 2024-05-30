public class Moto extends Vehiculos {
    private String tipoMoto;

    public Moto() {
    }

    public Moto(String marca, String modelo, String tipo, int numRuedas, String tipoMoto) {
        super(marca, modelo, tipo, numRuedas);
        this.tipoMoto = tipoMoto;
    }


    public String getTipoMoto() {
        return this.tipoMoto;
    }

    public void setTipoMoto(String tipoMoto) {
        this.tipoMoto = tipoMoto;
    }


    @Override
    public String toString() {
        return getTipo() + " " + getTipoMoto() + " " + getMarca() + " | Modelo: " + getModelo() + ". Tiene " + getNumRuedas() + " ruedas.\n";

    }
    public String toStringNombre() {
        return getMarca() + " " + getModelo();
    }
}
