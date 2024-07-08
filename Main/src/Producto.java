public class Producto {
    private int codigo;
    private String nombre;
    private String categoria;
    private String descripcion;
    private float precio;

    public Producto(int codigo, String nombre, String categoria, String descripcion, float precio){
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    //! < -------------- Modificadores de acceso -------------- />
    //* CODIGO
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    //* NOMBRE
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //* CATEGORIA
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    //* DESCRIPCION
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    //* PRECIO
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    //! < -------------- Metodos de la clase producto -------------- />

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Producto producto = (Producto) obj;
        return codigo == producto.codigo;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(codigo);
    }

    public void saludar(){
        System.out.println("Nombre: " + nombre + ", precio: $" + precio + ".\nCodigo: " + codigo + ", categoria: " + categoria + ".\n");
    }


}
