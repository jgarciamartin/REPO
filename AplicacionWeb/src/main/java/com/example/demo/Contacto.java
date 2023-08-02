package com.example.demo;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;



@Data
@Entity
public class Contacto {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String nombre;
	
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate fechaNacimiento;
	
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDateTime fechaRegistro;
	
	public void asignarFechaRegistro() {
		this.fechaRegistro = LocalDateTime.now();
	}
}
