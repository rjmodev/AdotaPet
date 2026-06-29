package com.example.adotapet.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Animais")
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "especie")
    private String especie;

    @Column(name = "nome")
    private String nome;

    @Column(name = "idade")
    private int idade;

    @Column(name = "descricao")
    private String descricao;

    public Integer getId() {
        return id;
    }

    public String getEspecie() {

        return especie;
    }

    public String getNome() {

        return nome;
    }

    public int getIdade() {

        return idade;
    }

    public String getDescricao() {

        return descricao;
    }

    public void setId(Integer id) {

        this.id = id;
    }

    public void setEspecie(String especie) {

        this.especie = especie;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public void setIdade(int idade) {

        this.idade = idade;
    }

    public void setDescricao(String descricao) {

        this.descricao = descricao;
    }
}
