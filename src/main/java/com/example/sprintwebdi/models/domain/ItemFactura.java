package com.example.sprintwebdi.models.domain;


public class ItemFactura {

    private Producto producto;
    private Integer cantidad;

    // METHOD

    public Integer valorTotal(){
        return producto.getPrecio() * cantidad;
    }

    // GETTERS AND SETTERS

    public ItemFactura(Producto producto, Integer cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
