package com.idat.pc3.service;

import java.util.List;

import com.idat.pc3.model.Estudiante;



public interface EstudianteService {
	void guardar(Estudiante estudiante);
	void actualizar(Estudiante estudiante);
	void eliminar(Integer id);
	List<Estudiante> listar();
	Estudiante obtener(Integer id);
	

}
