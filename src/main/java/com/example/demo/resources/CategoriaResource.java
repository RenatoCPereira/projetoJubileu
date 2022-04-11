package com.example.demo.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Categoria;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

	@RequestMapping(method = RequestMethod.GET)
	public List<Categoria> listar() {
		
		Categoria c1 = new Categoria(1, "Informatica");
		Categoria c2 = new Categoria(2, "EScritorio");
		
		List<Categoria> lista = new ArrayList<>();
		
		lista.add(c1);
		lista.add(c2);

		return lista;
	}

}
