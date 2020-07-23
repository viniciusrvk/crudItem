package br.com.rvkdid.crudItem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity(name = "PESSOA")
public class Pessoa {

    @Id
    private Integer id;

    @Column(name = "NOME")
    private String nome;
    
    @Column
    private Integer idade;

    @OneToOne
    @JoinColumn(name = "ENDERECO" )
    private Endereco endereco;
    
    private String mensagemErro;
    private Integer codigoErro;

}
