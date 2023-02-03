package com.mercadolivre.paycardapp.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Extrato {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    int idNomeEstabelecimento;
    String nomeEstebelecimento;
    String descricaoProduto;
    Date dataDaCompra;
    Long cardNumber;
    Double valorDacompra;
    Double cashback;
    Double taxa;


}
