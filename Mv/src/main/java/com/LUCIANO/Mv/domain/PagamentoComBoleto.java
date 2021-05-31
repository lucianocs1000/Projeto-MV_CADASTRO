package com.LUCIANO.Mv.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.LUCIANO.Mv.enums.EstadoPagamento;

@Entity
@Table(name = "PAGAMENTOCOMBOLETO")
public class PagamentoComBoleto extends Pagamento{


	private static final long serialVersionUID = 1L;
	
	
	private Date dataVencimento;
	private Date dataPagamento;
	
	public PagamentoComBoleto() {
		
	}

	public PagamentoComBoleto(Integer id, EstadoPagamento estado, Date dataVencimento, Date dataPagamento) {
		super(id, estado);
		
		this.dataPagamento = dataPagamento;
		this.dataVencimento = dataVencimento;
		
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
