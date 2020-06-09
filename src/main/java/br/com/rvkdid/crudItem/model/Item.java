package br.com.rvkdid.crudItem.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Item implements Serializable{

	private static final long serialVersionUID = 6903515656772159096L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column
	private String nome;

	@Column
	private String link;

	@Column
	private String linkCurto;

	@Column
	private Boolean comprado;
}
