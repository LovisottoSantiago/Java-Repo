import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Producto> listaProductos = cargarProductos("listaProductos.txt");

        try {
            boolean menu = true;
            while (menu) {
                System.out.println("1. Ver lista");
                System.out.println("2. Agregar productos");
                System.out.println("0. Salir");
                System.out.print("Elija una opcion: ");
                int opcion = Integer.parseInt(scanner.nextLine());

                switch (opcion) {
                    case 1:
                        String B = seleccionarCategoria(listaProductos);
                        for (Producto p : listaProductos) {
                            if ((p.getCategoria()).equalsIgnoreCase(B)) {
                                System.out.println(" ");
                                p.saludar();
                            } else {
                                throw new MisExcepciones("Categoria incorrecta");
                            }
                        }
                        break;

                    case 2:
                        boolean condicion = true;
                        while (condicion) {
                            Producto A = crearProducto();
                            listaProductos.add(A);
                            System.out.print("¿Desea ingresar otro producto? (S/N): ");
                            String pregunta = scanner.nextLine();
                            if (pregunta.equalsIgnoreCase("N")) {
                                condicion = false;
                            }
                        }
                        guardarProductos("listaProductos.txt", listaProductos); // guardar la lista completa
                        break;

                    case 0:
                        menu = false;
                        break;

                    default:
                        throw new MisExcepciones("No elegiste un valor del menu");
                }
            }
            System.out.println("Saliendo...");
        } catch (Exception e) {
            System.out.println("Valor incorrecto.");
        }
    }

    //! < ---------------------------- METODOS DEL MAIN ---------------------------- />
    //* < -------------- Crear producto (inputs al usuario) -------------- />
    public static Producto crearProducto() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresar nombre del producto: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingresar codigo del producto: ");
        int codigo = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingresar categoría del producto: ");
        String categoria = scanner.nextLine();
        System.out.print("Ingresar descripción del producto: ");
        String descripcion = scanner.nextLine();
        System.out.print("Ingresar precio del producto: ");
        float precio = Float.parseFloat(scanner.nextLine());
        return new Producto(codigo, nombre, categoria, descripcion, precio);
    }

    //* < -------------- Cargar arrayList -------------- />
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

    //* < -------------- Guardar arrayList -------------- />
    public static void guardarProductos(String nombreArchivo, ArrayList<Producto> listaProductos) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) { // sin modo de adición
            for (Producto p : listaProductos) {
                writer.write(p.getCodigo() + "," + p.getNombre() + "," + p.getCategoria() + "," + p.getDescripcion() + "," + p.getPrecio());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al guardar los productos: " + e.getMessage());
        }
    }

    //* < -------------- Seleccionar categoria (se mostraría una lista con las categorias disponibles) -------------- />
    public static String seleccionarCategoria(ArrayList<Producto> L) {
        Scanner scanner = new Scanner(System.in);
        for (Producto P : L) { //! si la categoria se repite, me la muestra varias veces, por lo tanto, hay que cambiar esto
            System.out.println(P.getCategoria());
        }
        System.out.print("Ingresar categoria: ");
        return scanner.nextLine();
    }
}
