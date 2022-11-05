package Clases;

public class Revista extends Material {

    public void setNumeroLote(int numeroLote) {
        this.numeroLote = numeroLote;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public void setCantInicial(int cantInicial) {
        this.cantInicial = cantInicial;
    }

    public void setCantExist(int cantExist) {
        this.cantExist = cantExist;
    }

    public void setCantVendidos(int cantVendidos) {
        this.cantVendidos = cantVendidos;
    }

    public void setDiasV(int DiasV) {
        this.DiasV = DiasV;
    }

    private int numAnyo;
    private int frecuencia;
    private String tematica;

    public Revista(int numA, int fre, String tematica,int cantV, int numL, String nb, double precio, String fa, int cantI, int cantE,int DiasV) {
        super(cantV,numL, nb, precio, fa, cantI, cantE,DiasV);
        this.numAnyo = numA;
        this.frecuencia = fre;
        this.tematica = tematica;
    }

    @Override
    public double ValorAsociado(){
        return (super.cantVendidos/super.DiasV) * 0.8 * frecuencia;
    }
    
    public int getNumAnyo() {
        return numAnyo;
    }

    public void setNumAnyo(int numAnyo) {
        this.numAnyo = numAnyo;
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }
    
    
}
