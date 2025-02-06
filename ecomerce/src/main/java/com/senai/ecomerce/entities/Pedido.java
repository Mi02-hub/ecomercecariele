package com.senai.ecomerce.entities;

import java.time.Instant;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_pedidos")
public class Pedido {
	 @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Instant momento;
	private String status;
	
	
	
	public Pedido() {
	
	}




	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public Instant getMomento() {
		return momento;
	}




	public void setMomento(Instant momento) {
		this.momento = momento;
	}




	public String getStatus() {
		return status;
	}




	public void setStatus(String status) {
		this.status = status;
	}




	public Pedido(Long id, Instant momento, String status) {
	
		this.id = id;
		this.momento = momento;
		this.status = status;
	}
	
	
	
}
