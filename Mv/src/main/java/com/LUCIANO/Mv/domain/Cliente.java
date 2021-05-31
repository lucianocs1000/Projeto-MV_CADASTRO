package com.LUCIANO.Mv.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.br.CNPJ;
import org.hibernate.validator.constraints.br.CPF;

import com.LUCIANO.Mv.enums.TipoCliente;

@Entity
@Table(name = "CLIENTE")
public class Cliente implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotEmpty
	private String nome;
	
	@Email
	private String email;
	
	@CPF
	@CNPJ
	private String cpfOUcnpj;
	
	private Integer  tipo;
	
	@ElementCollection
	@CollectionTable(name = "TELEFONE")
	
	private Set<String> telefones = new  HashSet<>();
	
	@MapsId
	@OneToOne
	@JoinColumn(name = "endereco_id")
	private Endereco endereco;
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "cliente")
	private Pagamento pagamento;
	
	public Cliente() {
		
	}


	public Cliente(Integer id, @NotEmpty String nome, @Email String email, @CPF @CNPJ String cpfOUcnpj,
			TipoCliente tipo) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.cpfOUcnpj = cpfOUcnpj;
		this.tipo = tipo.getCod();
	}

	
	
	

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getCpfOUcnpj() {
		return cpfOUcnpj;
	}


	public void setCpfOUcnpj(String cpfOUcnpj) {
		this.cpfOUcnpj = cpfOUcnpj;
	}


	public TipoCliente getTipo() {
		return TipoCliente.toEnum(tipo);
	}


	public void setTipo(TipoCliente tipo) {
		this.tipo = tipo.getCod();
	}


	public Set<String> getTelefones() {
		return telefones;
	}


	public void setTelefones(Set<String> telefones) {
		this.telefones = telefones;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


	public Pagamento getPagamento() {
		return pagamento;
	}


	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}


	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}


	
	
	
	
	
	
	

}
