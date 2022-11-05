package Clases;

public class Libro extends Material{
    private String autor;
    private String genero;
    private int cantPagina;
    private int numeroEdicion;
    private String categoria;

    public Libro(String autor, String gen, int cantP, int numE, String cat,int cantV, int numL, String nb, double precio, String fa, int cantI, int cantE,int DiasV) {
        super(cantV,numL, nb, precio, fa, cantI, cantE,DiasV);
        this.autor = autor;
        this.genero = gen;
        this.cantPagina = cantP;
        this.numeroEdicion = numE;
        this.categoria = cat;
    }

    @Override
    public double ValorAsociado(){
        return super.cantVendidos/super.DiasV;
    }
    
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getCantPagina() {
        return cantPagina;
    }

    public void setCantPagina(int cantPagina) {
        this.cantPagina = cantPagina;
    }

    public int getNumeroEdicion() {
        return numeroEdicion;
    }

    public void setNumeroEdicion(int numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

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
    
    

}
