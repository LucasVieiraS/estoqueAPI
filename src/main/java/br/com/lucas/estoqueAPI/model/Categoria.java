package br.com.lucas.estoqueAPI.model;

import javax.persistence.*;

@Entity
@Table(name="categoria")
public class Categoria {

    // Primary Key
    @Id
    // Auto-Increment
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomecategoria() {
        return nomecategoria;
    }

    public void setNomecategoria(String nomecategoria) {
        this.nomecategoria = nomecategoria;
    }

    private String nomecategoria;
}
