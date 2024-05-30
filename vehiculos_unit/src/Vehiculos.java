public class Vehiculos {
    protected String marca;
    protected String modelo;
    protected String tipo;
    protected int numRuedas;
    

    public Vehiculos() {
    }

    public Vehiculos(String marca, String modelo, String tipo, int numRuedas) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.numRuedas = numRuedas;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumRuedas() {
        return this.numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    @Override
    public String toString() {
        return "{" +
            " marca='" + getMarca() + "'" +
            ", modelo='" + getModelo() + "'" +
            ", tipo='" + getTipo() + "'" +
            ", numRuedas='" + getNumRuedas() + "'" +
            "}";
    }
    
}
