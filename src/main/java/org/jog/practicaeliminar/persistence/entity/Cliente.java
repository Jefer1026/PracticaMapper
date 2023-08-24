package org.jog.practicaeliminar.persistence.entity;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "clientes")
public class Cliente implements Serializable {
    @Serial
    private static final long serialVersionUID = 2996260643760069746L;
    @Id
    @Column(name = "id_cliente")
    private String idCliente;
    @Column(name = "apellido_cliente")
    private String apellidoCliente;
    @Column(name = "celular_cliente")
    private Double celularCliente;
    @Column(name = "direccion_cliente")
    private String direccionCliente;
    @Column(name = "email_cliente")
    private String emailCliente;
}
