package vehiculos;

import java.util.ArrayList;

public class Pais {
    private String nombre;

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public static Pais paisMasVendedor() {
        ArrayList<Pais> paisesFabrica = new ArrayList<Pais>();

        for (Fabricante fabricante : Fabricante.listaFabricantes) {
            // si el pais no esta en paisesFabrica
            paisesFabrica.add(fabricante.getPais());
        }

        //cual pais es el que mas se repite
        int mayor = 0;
        Pais paisMayor = null;
        for (Pais pais : paisesFabrica) {
            int cantidadPais = 0;
            for (int i = 0; i < paisesFabrica.size(); i++) {
                if (pais == paisesFabrica.get(i)){
                    cantidadPais++;
                }
            }
            if (cantidadPais > mayor){
                mayor = cantidadPais;
                paisMayor = pais;
            }
        }

        return paisMayor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
