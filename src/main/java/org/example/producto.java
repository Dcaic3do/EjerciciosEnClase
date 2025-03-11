package org.example;

public class producto {
    private String codigoProducto;
    private String nombreProducto;
    private double precioProducto;
    private int stock;

    public producto() {
    }

    public producto(String codigoProducto, String nombreProducto, double precioProducto, int stock) {
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.stock = stock;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "producto{" +
                "codigoProducto='" + codigoProducto + '\'' +
                ", nombreProducto='" + nombreProducto + '\'' +
                ", precioProducto=" + precioProducto +
                ", stock=" + stock +
                '}';
    }

    public void vender(int cantidad){
        this.stock -= cantidad;
    }

    public void reponerStock(int cantidad){
        this.stock += cantidad;
    }

    public void descuento(double descuento){
        descuento = descuento/100;
        this.precioProducto = precioProducto * (1-(descuento));
    }

    public void aumentarPrecio(double aumento){
        aumento = aumento/100;
        this.precioProducto = precioProducto * (1 + (aumento));
    }

    public double valorTotal(){
        return this.precioProducto * this.stock;
    }
}
