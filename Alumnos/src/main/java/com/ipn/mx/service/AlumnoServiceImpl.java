package com.ipn.mx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipn.mx.domain.entity.Alumno;
import com.ipn.mx.domain.repository.AlumnoRepository;

import jakarta.transaction.Transactional;

@Service
public class AlumnoServiceImpl implements AlumnoService {

	@Autowired
	AlumnoRepository repo;
	
	@Override
	public List<Alumno> findAll() {
		return repo.findAll();
	}

	@Override
	public Alumno findById(Long id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public Alumno create(Alumno alumno) {
		return repo.save(alumno);
	}

	@Transactional
	@Override
	public Alumno update(Alumno alumno) {
		Alumno a = repo.findById(alumno.getIdAlumno()).orElse(null);
		if (a == null) {
			return null;
		}
		return repo.save(alumno);
	}

	@Override
	public void delete(Long id) {
		repo.deleteById(id);
	}

}
