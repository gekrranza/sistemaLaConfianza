
package modelos;

public class Venta {
    private int id_venta;
    private int cliente;
    private String nombre_cli;
    private String vendedor;
    private double total;
    //private String fecha;
    
    public Venta(){
        
    }

    public Venta(int id_venta, int cliente, String nombre_cli, String vendedor, double total) {
        this.id_venta = id_venta;
        this.cliente = cliente;
        this.nombre_cli = nombre_cli;
        this.vendedor = vendedor;
        this.total = total;
        //this.fecha = fecha;
    }

    public int getIdVenta() {
        return id_venta;
    }

    public void setIdVenta(int id_venta) {
        this.id_venta = id_venta;
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public String getNombre_cli() {
        return nombre_cli;
    }

    public void setNombre_cli(String nombre_cli) {
        this.nombre_cli = nombre_cli;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    //public String getFecha() {
     //   return fecha;
    //}

    //public void setFecha(String fecha) {
      //  this.fecha = fecha;
    //}

    

    
}
