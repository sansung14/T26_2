package es.http.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import es.http.service.dto.Asignado;

/**
 * @author David
 *
 */
public interface IAsignadoDAO extends JpaRepository<Asignado, Integer>{
	
}
