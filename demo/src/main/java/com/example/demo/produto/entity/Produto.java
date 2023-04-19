package com.example.demo.produto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(name = "produto")
@Data
@AllArgsConstructor
@NoArgsConstructor
//@RedisHash("Produto")
public class Produto extends ParentEntity {
    private String descricao;
    private BigDecimal vrBruto;
    private BigDecimal vrDec;
    private BigDecimal vrLiq;
    private String createdAt =
            new SimpleDateFormat("dd-MM-yyyy HH:mm:ss z")
                    .format(new Date());
}