package com.aula42.listaDeProdutos.model;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "usuarios")
public class UsuariosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column(length = 50, nullable = false)
    private String nomeUsuario;

}