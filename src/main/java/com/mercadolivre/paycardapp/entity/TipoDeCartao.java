package com.mercadolivre.paycardapp.entity;


import lombok.Getter;

@Getter
public enum TipoDeCartao {



    ALIMENTACAO(1),
    DROGARIA(2),
    COMBUSTIVEL(3);

    int codigo;

    TipoDeCartao(int codigo){
        this.codigo = codigo;
    }



}
