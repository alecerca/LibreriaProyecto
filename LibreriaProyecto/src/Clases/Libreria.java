package Clases;

import Frames.LibreriaF;
import java.io.*;
import javax.swing.JOptionPane;

public class Libreria {

   public Lista<Material> materiales;
    public Libreria(){
        materiales = new Lista();
    }
    public void AgregarMaterial(Material m1) throws Exception{
        materiales.Adicionar(m1);         
        }
    public String[] MostrarC(){
        String [] nom = new String[materiales.Longitud()];
        for(int i = 0; i<materiales.Longitud();i++){
            if((((Libro)materiales.Obtener(i)).getCategoria()).equalsIgnoreCase("Adultos")){
                nom[i] = (((Libro)materiales.Obtener(i)).getNombre()); 
            }
        }
        return nom;
    }
    
    public String[] MostrarI(){
        String [] nom = new String[materiales.Longitud()];
        for(int i = 0; i<materiales.Longitud();i++){
            if((((Libro)materiales.Obtener(i)).getCategoria()).equalsIgnoreCase("Infantiles")){
                nom[i] = (((Libro)materiales.Obtener(i)).getNombre()); 
            }
        }
        return nom;
    }   
    
    public String[] RevistasV(){
        String [] titu = new String[materiales.Longitud()];
        for(int i = 0; i<materiales.Longitud();i++){
            titu[i] = (((Revista)materiales.Obtener(i)).getNombre());
        }
        return titu;
    }
    public int TituloGen(){
        int cont = 0;
        String ge = " ";
        for(int i=0; i<materiales.Longitud();i++){
            if(materiales.Obtener(i) instanceof Libro){
              ge = (((Libro)materiales.Obtener(i)).getGenero());
              cont++;
            }
             
        }
        return cont;
    }
    
    public String[] EGenero(){
        String [] ge1 = new String[materiales.Longitud()];
        for(int i = 0;i<materiales.Longitud();i++){
            if(materiales.Obtener(i) instanceof Libro){
                ge1[i] = (((Libro)materiales.Obtener(i)).getGenero());
            }
        }
        return ge1;
    }
    
    public String [] RankingDias(){
        String [] ran = new String[materiales.Longitud()];
        int [] arreglo = new int[materiales.Longitud()];
        int d = 0;
        for(int i = 0;i<materiales.Longitud();i++){
            arreglo[i] = materiales.Obtener(i).getDiasV();
            }
        for(int i = 2;i<materiales.Longitud();i++){
            for(int j = 0;j<materiales.Longitud();j++){
                if(arreglo[j]>arreglo[j+1]){
                    d = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = d;
                }
            }
        }
        for(int i = 0;i<materiales.Longitud();i++){
            if(arreglo[i] == materiales.Obtener(i).getDiasV()){
                ran [i] = materiales.Obtener(i).getNombre();
            }else if(arreglo[i+1] == materiales.Obtener(i+1).ValorAsociado()){
                ran [i] = materiales.Obtener(i).getNombre();
            }
        }
        return ran;
    }
    
    public Material ListaF(){
        return materiales.Obtener(0);
    }
    
    public String[] MCategoria(){
        String [] mcat = new String[materiales.Longitud()];
        for(int i = 0;i<materiales.Longitud();i++){ 
            if((((Libro)materiales.Obtener(i)).getAutor()).equalsIgnoreCase((((Libro)materiales.Obtener(i)).getAutor()))){
                mcat[i] = (((Libro)materiales.Obtener(i)).getNombre());
            }
        }
        return mcat;
    }
    
    public String[] Mautor(String ele){
        String r = " ";
        String a = " ";
        int CA = 0;
        String autores[] = new String[materiales.Longitud()];
        LibreriaF lf = new LibreriaF();
       for(int i = 0; i < materiales.Longitud(); i++){
           r = ((Libro)materiales.Obtener(i)).getAutor();
           if(ele.equalsIgnoreCase(r)){
               autores[i] = materiales.Obtener(i).getNombre();
               
            }
       }
       return autores;
     }
    
    public int ListaL(){
        return materiales.Longitud();
    }
    public void EliminarMat(int pos)throws Exception {
        materiales.Eliminar(pos);
        
    }
    
    public int Devolver (String GD){
        String r = " ";
        int CA = 0;
       //String generos[] = new String [CA];
       for(int i = 0; i < materiales.Longitud(); i++){
           r = ((Libro)materiales.Obtener(i)).getGenero();
           if(GD.equalsIgnoreCase(r)){
            CA++;
            //generos[i] = materiales.Obtener(i).getNombre();
       }
     
       }
       return CA;
    }
    
    public String[] RankingV(){
        String rank [] = new String[materiales.Longitud()];
        double arreglo [] = new double[materiales.Longitud()];
        double c = 0;
        int r = 0;
        for(int i = 0;i<materiales.Longitud();i++){
            arreglo[i] = materiales.Obtener(i).ValorAsociado();
            }
        for(int i = 2;i<materiales.Longitud();i++){
            for(int j = 0;j<materiales.Longitud();j++){
                if(arreglo[j]>arreglo[j+1]){
                    c = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = c;
                }
            }
        }
        for(int i = 0;i<materiales.Longitud();i++){
            if(arreglo[i] == materiales.Obtener(i).ValorAsociado()){
                rank [i] = materiales.Obtener(i).getNombre();
            }else if(arreglo[i+1] == materiales.Obtener(i+1).ValorAsociado()){
                rank [i] = materiales.Obtener(i).getNombre();
            }
        }
        
        return rank;
}
    
    public double TotalI(){
        String c = " ";
        double t = 0;
        for(int i = 0;i<materiales.Longitud();i++){
            c = ((Libro)materiales.Obtener(i)).getCategoria();
            if(c.equalsIgnoreCase("Adultos")){
                t += (((Libro)materiales.Obtener(i)).ValorAsociado());
            }
        }
        return t;
    }
    
    public double TotalR(){
        String r = " ";
        double to = 0;
        for(int i = 0;i<materiales.Longitud();i++){
            r = (((Libro)materiales.Obtener(i)).getCategoria());
            if(r.equalsIgnoreCase("Infantiles")){
                to += (((Libro)materiales.Obtener(i)).ValorAsociado());
            }
        }
        return to;
    }
    
    public void ComprarL(String n, int c){
        String [] titulos = new String[materiales.Longitud()];
        LibreriaF f = new LibreriaF();
        int p = 0;
        for(int i = 0;i<materiales.Longitud();i++){
            titulos[i] = (((Libro)materiales.Obtener(i)).getNombre());
            if(n.equalsIgnoreCase(titulos[i])){
                p = f.getCantexi() - c;
                if(p <= 0){
                    p = 0;
                    materiales.Eliminar(i);
                }
            }
        }
        f.cantven = c;
        if(p == 0){
            JOptionPane.showMessageDialog(f, "Se ha eliminado el material de la libreria");
        }
        JOptionPane.showMessageDialog(f, "Material: " + n + " vendido");
    }
       public void ComprarR(String n, int cr){
        String [] titulos = new String[materiales.Longitud()];
        LibreriaF f = new LibreriaF();
        int p = 0;
        for(int i = 0;i<materiales.Longitud();i++){
            titulos[i] = (((Revista)materiales.Obtener(i)).getNombre());
            if(n.equalsIgnoreCase(titulos[i])){
                p = f.getCantexir() - cr;
                if(p <= 0){
                    p = 0;
                    materiales.Eliminar(i);
                }
            }
        }
        f.cantvenr = cr;
        if(p == 0){
            JOptionPane.showMessageDialog(f, "Se ha eliminado el material de la libreria");
        }
        JOptionPane.showMessageDialog(f, "Material: " + n + " vendido");
    }
       
    public String [] Rankingvend(){
        String [] nom = new String[materiales.Longitud()];
        int arreglo [] = new int[materiales.Longitud()];
        int c = 0;
        for(int i = 0;i<materiales.Longitud();i++){
            arreglo[i] = materiales.Obtener(i).getCantVendidos();
            }
        for(int i = 2;i<materiales.Longitud();i++){
            for(int j = 0;j<materiales.Longitud();j++){
                if(arreglo[j]>arreglo[j+1]){
                    c = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = c;
                }
            }
        }
        for(int i = 0;i<materiales.Longitud();i++){
            if(arreglo[i] == materiales.Obtener(i).getCantVendidos()){
                nom [i] = materiales.Obtener(i).getNombre();
            }else if(arreglo[i+1] == materiales.Obtener(i+1).ValorAsociado()){
                nom [i] = materiales.Obtener(i).getNombre();
            }
        }
        return nom;
    }   
    
    public void GuardarFichero() throws IOException{
        File file = new File("archivo.txt");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        for(int i = 0;i<materiales.Longitud();i++){
            bw.write(((Libro)materiales.Obtener(i)).getNombre() + "\n" + ((Libro)materiales.Obtener(i)).getPrecio() + "\n" + ((Libro)materiales.Obtener(i)).getCantVendidos()
             + "\n" + ((Libro)materiales.Obtener(i)).ValorAsociado());
            
            bw.close();
        }
    }
    public void GuardarFicheroR() throws IOException{
        File file = new File("archivoR.txt");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        for(int i = 0;i<materiales.Longitud();i++){
            bw.write(((Revista)materiales.Obtener(i)).getNombre() + "\n" + ((Revista)materiales.Obtener(i)).getPrecio() + "\n" + ((Revista)materiales.Obtener(i)).getCantVendidos()
             + "\n" + ((Revista)materiales.Obtener(i)).ValorAsociado());
            
            bw.close();
        }
    }
       
}