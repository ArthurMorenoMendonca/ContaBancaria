package entities;

import exceptions.DomainException;

public class Conta {
	
	private Integer numero;
	private String titular;
	private Double saldo;
	private Double limite;
	
	public Conta() {
	}

	public Conta(Integer numero, String titular, Double saldo, Double limite) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.limite = limite;
	}

	public Integer getNumero() {
		return numero;
	}


	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}
	
	public void depositar(Double amount) {
		 saldo += amount;
	}
	
	public void saque(Double amount) {
		if(amount > limite) {
			throw new DomainException("O valor excede o limite de retirada");
		}
		if(amount > saldo) {
			throw new DomainException("Não a saldo suficiente");
		}
		 saldo -= amount;
	}
	
	
	
	

}
