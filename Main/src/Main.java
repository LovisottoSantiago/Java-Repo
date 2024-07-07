import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<Producto> listaProductos = cargarProductos("listaProductos.txt");

        ArrayList<Producto> productos = new ArrayList<Producto>();
        Producto lavandina = new Producto(59,"Lavandina", "Suelto", "5 litros", 1800);
        Producto jabonAriel = new Producto(60,"Jabon Ariel", "Suelto", "5 litros", 3500);
        productos.add(lavandina);
        productos.add(jabonAriel);

        guardarProductos(productos, "listaProductos.txt");

        for (Producto p: listaProductos){
            System.out.println(p.getNombre());
        }








    }

    //! < -------------- Metodos del Main -------------- />

    //? < -------------- Logica para crear objetos Producto -------------- />
    public static Producto crearProducto(){
        
    }


    // Método para guardar productos en archivo
    public static void guardarProductos(ArrayList<Producto> productos, String nombreArchivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            for (Producto p : productos) {
                writer.write(p.getCodigo() + "," + p.getNombre() + "," + p.getCategoria() + "," + p.getDescripcion() + "," + p.getPrecio());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al guardar los productos: " + e.getMessage());
        }
    }

    // Método para cargar productos desde archivo
    public static ArrayList<Producto> cargarProductos(String nombreArchivo) {
        ArrayList<Producto> productos = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length == 5) {
                    int codigo = Integer.parseInt(datos[0]);
                    String nombre = datos[1];
                    String categoria = datos[2];
                    String descripcion = datos[3];
                    float precio = Float.parseFloat(datos[4]);
                    Producto p = new Producto(codigo, nombre, categoria, descripcion, precio);
                    productos.add(p);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al cargar los productos: " + e.getMessage());
        }
        return productos;
    }





}














