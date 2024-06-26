package net.originmobi.pdv.model;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class Categoria implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;

	@NotBlank(message = "Descrição não pode ser vazia")
	@Size(max = 50)
	private String descricao;
	private Date data_cadastro;

	public Categoria() {
	}

	public Categoria(Long codigo, String descricao, Date data_cadastro) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.data_cadastro = data_cadastro;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getData_cadastro() {
		return data_cadastro;
	}

	public void setData_cadastro(Date data_cadastro) {
		this.data_cadastro = data_cadastro;
	}

}
