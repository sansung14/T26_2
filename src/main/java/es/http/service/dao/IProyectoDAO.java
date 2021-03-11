package es.http.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import es.http.service.dto.Proyecto;

/**
 * @author David
 *
 */
public interface IProyectoDAO extends JpaRepository<Proyecto, String>{
	
}
