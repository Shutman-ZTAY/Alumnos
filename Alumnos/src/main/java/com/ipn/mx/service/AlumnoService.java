package com.ipn.mx.service;

import java.util.List;

import com.ipn.mx.domain.entity.Alumno;

public interface AlumnoService {
	
	public List<Alumno> findAll();
	public Alumno findById(Long id);
	public Alumno create(Alumno alumno);
	public Alumno update(Alumno alumno);
	public void delete(Long id);
	
}
