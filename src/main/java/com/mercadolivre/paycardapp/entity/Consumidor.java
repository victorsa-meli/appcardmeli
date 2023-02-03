package com.mercadolivre.paycardapp.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;
import java.util.Set;


@Entity
@Data
@EqualsAndHashCode
public class Consumidor {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private int numeroDocumento;
    private Date dataNascimento;


    //RELACIONAMENTO COM A TABELA CONTATO
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name ="contato_id", referencedColumnName = "id")
    private Contato contato;


    //RELACION ENDERECO

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "endereco_id", referencedColumnName ="id")
    private Endereco endereco;



    //RELACION COM CARTOES DESSE CONSUMIDOR

    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "consumidor_id")
    private Set<Cartao> listaDeCartoes;


}
