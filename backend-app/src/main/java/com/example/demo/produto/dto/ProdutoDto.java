package com.example.demo.produto.dto;

import com.example.demo.carrinho.entity.Carrinho;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProdutoDto {
    private UUID id;
    private String descricao;
    private BigDecimal vrBruto;
    private BigDecimal vrDesc;
    private BigDecimal vrLiq;
    private Carrinho carrinhoAtual;
}
