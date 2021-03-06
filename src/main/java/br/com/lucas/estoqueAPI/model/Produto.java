package br.com.lucas.estoqueAPI.model;

import javax.persistence.*;

@Entity
@Table(name="produto")
public class Produto {

    // Primary Key
    @Id
    // Auto-Increment
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeproduto;

    private Integer categoriaid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeproduto() {
        return nomeproduto;
    }

    public void setNomeproduto(String nomeproduto) {
        this.nomeproduto = nomeproduto;
    }

    public Integer getCategoriaid() {
        return categoriaid;
    }

    public void setCategoriaid(Integer categoriaid) {
        this.categoriaid = categoriaid;
    }
}
