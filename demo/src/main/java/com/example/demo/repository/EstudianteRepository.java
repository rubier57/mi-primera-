package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Estudiante;
 
// Solo una interfaz: Spring escribe el código para guardar, buscar y borrar
public interface  EstudianteRepository extends JpaRepository<Estudiante, Integer> {
}

