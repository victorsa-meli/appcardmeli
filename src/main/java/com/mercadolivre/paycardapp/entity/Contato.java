package com.mercadolivre.paycardapp.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Contato {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int celular;
    private int numeroResidencia;
    private int numeroTelefone;
    private String email;

    //RELACION  CONSUMIDOR
    @OneToOne
    private Consumidor consumidor;
}
