package com.LUCIANO.Mv.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.LUCIANO.Mv.enums.EstadoPagamento;

@Entity
@Table(name = "PAGAMENTOCOMCARTAO")
public class PagamentoComCartao extends Pagamento{

	private static final long serialVersionUID = 1L;
	private Integer numeroDEparcelas;
	private String credito;
	private String debito;
	
	
	public PagamentoComCartao() {
		
	}


	public PagamentoComCartao(Integer id, EstadoPagamento estado,String credito, String debito,Integer numeroDEparcelas) {
		super(id, estado);
		this.numeroDEparcelas  =  numeroDEparcelas;
		this.debito = debito;
		this.credito = credito;
	}


	public Integer getNumeroDEparcelas() {
		return numeroDEparcelas;
	}


	public void setNumeroDEparcelas(Integer numeroDEparcelas) {
		this.numeroDEparcelas = numeroDEparcelas;
	}


	public String getCredito() {
		return credito;
	}


	public void setCredito(String credito) {
		this.credito = credito;
	}


	public String getDebito() {
		return debito;
	}


	public void setDebito(String debito) {
		this.debito = debito;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
