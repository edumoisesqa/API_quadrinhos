package com.seriesops.quadrinhos.model;

import javax.persistence.*;

@Entity
@Table(name="quadrinhos")
public class Quadrinho {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    @Column(name ="titulo")
    private String  titulo;

    @Column(name="descricao")
    private  String descricao;

    @Column(name="editora")
    private String editora;

    public  Quadrinho(){

    }
    public  Quadrinho(String titulo, String descricao, String editora){
        this.titulo = titulo;
        this.descricao = descricao;
        this.editora = editora;
    }
}
