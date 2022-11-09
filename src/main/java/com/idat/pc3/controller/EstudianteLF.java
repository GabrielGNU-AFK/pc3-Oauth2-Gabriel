package com.idat.pc3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.idat.pc3.model.Estudiante;
import com.idat.pc3.service.EstudianteService;

@RestController
@RequestMapping("/estudianteLF/v1")
public class EstudianteLF {
	
	@Autowired
	private EstudianteService service;
	
	@RequestMapping(path="/listar", method=RequestMethod.GET)
	public ResponseEntity<List<Estudiante>> listar(){
		return new ResponseEntity<List<Estudiante>>(service.listar(), HttpStatus.OK);
	}
	
	@RequestMapping(path="/listar/{id}", method=RequestMethod.GET)
	public ResponseEntity<Estudiante> obtenerPorId(@PathVariable Integer id){
		Estudiante estudiante=service.obtener(id);
		if(estudiante!=null) {
			return new ResponseEntity<Estudiante>(estudiante,HttpStatus.OK);
		}else {
			return new ResponseEntity<Estudiante>(estudiante,HttpStatus.NOT_FOUND);
		}
		
	}
	
	
	

}
