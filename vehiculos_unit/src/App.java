import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class App {
/*
Tienes la clase madre Vehículos, y heredan las clases Coche, Moto y Camión.

¿Qué características son comunes entre todos los vehículos?
¿Cuales son específicas?

Puedes añadir también métodos específicos en cada clase.
Crea tres arraylist de coches, motos y camiones.

- ¿Cómo encontrarías un modelo en específico en cada arraylist?

- Prueba a recorrer cada array por características, del tipo: todos los
nombres, marcas precios, etc
- ¿Cómo guardarías todas las marcas aparte?
- ¿Cómo harías un arraylist mixto con coches, motos y camiones?

+EXTRA: Puedes añadir un descuento global por fin de temporada, que afecte a todas las clases. ¿Cómo lo harías?


 */
    public static void main(String[] args) throws Exception {
        ArrayList <Vehiculos> vehiculosAll = new ArrayList<>();
        ArrayList <Coche> coches = new ArrayList<>();
        ArrayList <Moto> motos = new ArrayList<>();
        ArrayList <Camion> camiones = new ArrayList<>();
        ArrayList <String> marcas = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);

        coches.add(new Coche("Mazda", "CX-5", "coche", 4, false));
        motos.add(new Moto("Yamaha", "MT-125", "moto", 2, "naked"));
        camiones.add(new Camion("Iveco", "35S14", "camion", 4, false, true));
        


        //Recorrer ArraysList por sus características
        System.out.println("\n------\n");
        System.out.println("MODELOS DISPONIBLES");
        System.out.println("\n------\n");
        for(int i=0; i<motos.size(); i++){
            System.out.println(motos.get(i).getTipo() + " | Modelo: " + motos.get(i).getModelo());
        }
        for(int i=0; i<coches.size(); i++){
            System.out.println(coches.get(i).getTipo() + " | Modelo: " + coches.get(i).getModelo());
        }
        for(int i=0; i<camiones.size(); i++){
            System.out.println(camiones.get(i).getTipo() + " | Modelo: " + camiones.get(i).getModelo());
        }

        System.out.println("Qué modelo de moto estás buscando?");
        String modeloMoto = teclado.nextLine();
        for(int i=0; i<motos.size(); i++){
            if(motos.get(i).getModelo().equalsIgnoreCase(modeloMoto)){
                System.out.println(motos.get(i).getTipo() + " " +  motos.get(i).getTipoMoto() + " | Modelo: " + motos.get(i).getMarca() + " " + motos.get(i).getModelo());
            }
        }


        //Añadir marcas en arrayList
        System.out.println("\n------\n");
        System.out.println("NOMBRES MARCAS");
        System.out.println("\n------\n");
        for(int i=0; i<motos.size(); i++){
            marcas.add(motos.get(i).getMarca());
        }
        for(int i=0; i<coches.size(); i++){
            marcas.add(coches.get(i).getMarca());
        }
        for(int i=0; i<camiones.size(); i++){
            marcas.add(camiones.get(i).getMarca());
        }
        System.out.println(marcas);

        //arrayList Marcas
        for(int i=0; i<motos.size(); i++){
            marcas.add(motos.get(i).getMarca());
        }
        for(int i=0; i<coches.size(); i++){
            marcas.add(coches.get(i).getMarca());

        }
        for(int i=0; i<camiones.size(); i++){
            marcas.add(camiones.get(i).getMarca());

        }

        //ArrayList Mixto
        vehiculosAll.add(new Coche("Mazda", "CX-5", "Coche", 4, false));
        vehiculosAll.add(new Moto("Yamaha", "MT-125", "Moto", 2, "naked"));
        vehiculosAll.add(new Camion("Iveco", "35S14", "Camion", 4, false, true));

        System.out.println(vehiculosAll.toString());
        

        


    }
}
