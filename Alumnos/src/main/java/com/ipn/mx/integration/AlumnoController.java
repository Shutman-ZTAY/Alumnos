package com.ipn.mx.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ipn.mx.domain.entity.Alumno;
import com.ipn.mx.service.AlumnoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.PutMapping;


@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api")
public class AlumnoController {

	@Autowired
	AlumnoService service;
	
	@GetMapping("/alumno")
	@ResponseStatus(HttpStatus.OK)
	public List<Alumno> getAll() {
		return service.findAll();
	}
	
	@GetMapping("/alumno/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Alumno getAlumnoById(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping("/alumno")
	@ResponseStatus(HttpStatus.CREATED)
	public Alumno newAlumno(@RequestBody Alumno alumno) {
		return service.create(alumno);
	}
	
	@PutMapping("/alumno/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Alumno updateAlumno(@PathVariable Long id, @RequestBody Alumno alumno) {
		return service.update(alumno);
	}
	
	@DeleteMapping("/alumno/{id}")
	public void deleteAlumno(@PathVariable Long id) {
		service.delete(id);
	}
}
