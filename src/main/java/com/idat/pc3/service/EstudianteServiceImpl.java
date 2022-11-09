package com.idat.pc3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.pc3.model.Estudiante;
import com.idat.pc3.repository.EstudianteRepository;
@Service
public class EstudianteServiceImpl implements EstudianteService {
	
	@Autowired
	private EstudianteRepository repository;
	@Override
	public void guardar(Estudiante estudiante) {
		repository.save(estudiante);
		
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		repository.saveAndFlush(estudiante);
		
	}

	@Override
	public void eliminar(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public List<Estudiante> listar() {
		return repository.findAll();
	}

	@Override
	public Estudiante obtener(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

}
