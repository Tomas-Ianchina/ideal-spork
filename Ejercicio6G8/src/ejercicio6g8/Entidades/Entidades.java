/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6g8.Entidades;

import java.util.Objects;

/**
 *
 * @author TOMI
 */
public class Entidades {
    private Double Precio;
    private String Producto;
    private Integer Cantidad;

    public Entidades() {
    }

    public Entidades(Double Precio, String Producto, Integer Cantidad) {
        this.Precio = Precio;
        this.Producto = Producto;
        this.Cantidad = Cantidad;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double Precio) {
        this.Precio = Precio;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    public Integer getCantidad() {
        return Cantidad;
    }

    public void setCantidad(Integer Cantidad) {
        this.Cantidad = Cantidad;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Entidades other = (Entidades) obj;
        if (!Objects.equals(this.Producto, other.Producto)) {
            return false;
        }
        if (!Objects.equals(this.Precio, other.Precio)) {
            return false;
        }
        if (!Objects.equals(this.Cantidad, other.Cantidad)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades{" + "Precio=" + Precio + ", Producto=" + Producto + ", Cantidad=" + Cantidad + '}';
    }
    
    
}
