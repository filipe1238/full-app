package com.example.demo.produto.entity;

import jakarta.persistence.*;

import java.util.UUID;

@MappedSuperclass
public abstract class ParentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,
            generator = "UUID")
    @Column(name = "id", nullable = false, updatable = false)
    private UUID id;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Boolean isTransient() {
        if (this.id == null || this.id.equals(0)) {
            return true;
        }
        return false;
    }
}
