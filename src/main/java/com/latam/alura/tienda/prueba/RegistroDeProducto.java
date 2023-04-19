package com.latam.alura.tienda.prueba;

import java.math.BigDecimal;

import javax.persistence.EntityManager;

import com.latam.alura.tienda.dao.CategoriaDao;
import com.latam.alura.tienda.dao.ProductoDao;
import com.latam.alura.tienda.modelo.Categoria;
import com.latam.alura.tienda.modelo.Producto;
import com.latam.alura.tienda.utils.JPAUtils;

public class RegistroDeProducto {

	public static void main(String[] args) {
		Categoria celulares = new Categoria("CELULARES");
		
		EntityManager em = JPAUtils.getEntityManager();
		
		em.getTransaction().begin(); 

		em.persist(celulares);
		
		celulares.setNombre("LIBROS"); //Modificar el nombre de la categoria celulares a libros
		
		em.flush();
		em.clear();
		
		celulares = em.merge(celulares);
		celulares.setNombre("SOFTWARES");
		
		em.flush();
		em.remove(celulares);
		em.flush();
	}
}
