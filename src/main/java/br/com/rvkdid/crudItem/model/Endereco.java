package br.com.rvkdid.crudItem.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Endereco {

    @Id
    private Integer id;

    @Column
    private String rua;

    @Column
    private String numero;
}
