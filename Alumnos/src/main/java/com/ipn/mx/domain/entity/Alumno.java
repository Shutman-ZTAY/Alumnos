package com.ipn.mx.domain.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity
@Table(name = "Alumno")
public class Alumno implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAlumno;
	@Column(name = "nombre", length = 100, nullable = false)
	private String nombre;
	@Column(name = "paterno", length = 100, nullable = false)
	private String paterno;
	@Column(name = "materno", length = 100, nullable = false)
	private String materno;
	@Column(name = "email", length = 200, nullable = false)
	private String email;
}
