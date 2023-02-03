package com.mercadolivre.paycardapp.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Cartao {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long numero;
    private Double saldo;


    @Enumerated(EnumType.STRING)
    private  TipoDeCartao tipoDeCartao;

}
