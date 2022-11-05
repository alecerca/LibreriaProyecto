
package Clases;

public class Lista<T> {
    private T[] elementos;
    private int cantReal;
    private int cmax;

    public Lista() {
        cmax = 1000;
        elementos = (T[]) new Object[cmax];
        cantReal = 0;
    }

    public void Adicionar(T valor) throws Exception{
        if(cantReal < cmax)
            elementos[cantReal++] = valor;
        else throw new Exception ("La lista esta llena");
    }

    public void Insertar(int pos, T elemento) {
        cantReal++;
        for (int i = cantReal - 1; i > pos; i--) {
            elementos[i] = elementos[i - 1];
        }
        elementos[pos] = elemento;
    }

    public void Eliminar(int pos) {
        for (int i = pos + 1; i < cantReal; i++) {
            elementos[i - 1] = elementos[i];
        }
        cantReal--;
    }

    public T Obtener(int pos) {
        return elementos[pos];
    }

    public int Longitud() {
        return cantReal;
    }

    public boolean isVacia() {
        return cantReal == 0;
    }
    
    public T[] ToArray(){
        T[] result = (T[]) new Object[cantReal];
        for (int i = 0; i < cantReal; i++) {
           result[i] = elementos[i];            
        }
        return result;
    }
    
}

