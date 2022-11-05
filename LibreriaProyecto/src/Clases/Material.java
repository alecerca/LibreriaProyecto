package Clases;

public abstract class Material {
    protected int numeroLote;
    protected String nombre;
    protected double precio;
    protected String fechaAlta;
    protected int cantInicial;
    protected int cantExist;
    protected int cantVendidos;
    protected int DiasV;

    public Material(int cantV,int numL, String nb, double precio, String fa, int cantI, int cantE, int DiasV) {
        this.numeroLote = numL;
        this.cantVendidos = cantV;
        this.nombre = nb;
        this.precio = precio;
        this.fechaAlta = fa;
        this.cantInicial = cantI;
        this.cantExist = cantE;
        this.DiasV = DiasV;
    }
    
    public abstract double ValorAsociado();
    
    public int getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(int numeroLote) {
        this.numeroLote = numeroLote;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public int getCantInicial() {
        return cantInicial;
    }

    public void setCantInicial(int cantInicial) {
        this.cantInicial = cantInicial;
    }

    public int getCantVendidos() {
        return cantVendidos;
    }

    public int getDiasV() {
        return DiasV;
    }

    public int getCantExist() {
        return cantExist;
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
    
    

}