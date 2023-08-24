package org.jog.practicaeliminar.persistence.entity;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "compras_productos")
public class ComprasProducto implements Serializable {

    @Serial
    private static final long serialVersionUID = -7756714362738309065L;
    @EmbeddedId
    private ComprasProductoFK comprasProductoFK;
    private Integer cantidad;
    private Double total;
    private Boolean estado;

    @ManyToOne
    @JoinColumn(name = "id_compra", insertable = false,updatable = false)
    private Compra compra;
    @ManyToOne
    @JoinColumn(name = "id_producto", insertable = false,updatable = false)
    private Producto producto;

    public ComprasProductoFK getComprasProductoFK() {
        return comprasProductoFK;
    }

    public void setComprasProductoFK(ComprasProductoFK comprasProductoFK) {
        this.comprasProductoFK = comprasProductoFK;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
