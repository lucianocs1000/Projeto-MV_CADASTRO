package com.LUCIANO.Mv.repositories;

import javax.persistence.Entity;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LUCIANO.Mv.domain.Cliente;

@Entity
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
