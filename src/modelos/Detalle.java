
package modelos;

public class Detalle {
    private int id;
    private String codigo;
    private int cantidad;
    private double precio;
    private int id_venta;
    
    public Detalle(){
        
    }

    public Detalle(int id, String codigo, int cantidad, double precio, int id_venta) {
        this.id = id;
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.precio = precio;
        this.id_venta = id_venta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodProducto() {
        return codigo;
    }

    public void setCodProducto(String id_pro) {
        this.codigo = id_pro;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }
}
