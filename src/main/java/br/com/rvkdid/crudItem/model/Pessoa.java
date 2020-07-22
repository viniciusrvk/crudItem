package br.com.rvkdid.crudItem.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Optional;

@Data
@Entity
public class Pessoa {

    @Id
    private Integer id;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "ENDERECO")
    private Optional<Endereco> endereco;

}
