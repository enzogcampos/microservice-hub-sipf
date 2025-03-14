package com.github.enzogcampos.ms_pagamentos.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;

import java.math.BigDecimal;

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    @Setter
    @EqualsAndHashCode(of = "id")

    public class Pagamento {
        private long id;
        @Column(nullable = false)
        private BigDecimal valor;
        private String nome;
        private String numeroDoCartao;
        private String validade;
        private String codigoDeSeguranca;
        @Column(nullable = false)
        @Enumerated(value = EnumType.STRING)
        private String status;
        @Column(nullable = false)
        private Long pedidoId;
        @Column(nullable = false)
        private Long formaDePagamentoID;

    }

