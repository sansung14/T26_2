package es.http.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.http.service.dto.Cientifico;
import es.http.service.service.CientificoServiceImpl;

@RestController
@RequestMapping("/api")
public class CientificoController {
	
	@Autowired
	CientificoServiceImpl cientificoServiceImpl;
	
	@GetMapping("/cientificos")
	public List<Cientifico> listaCientificos(){
		return cientificoServiceImpl.listarCientificos();
	}
	
	
	@PostMapping("/cientificos")
	public Cientifico salvarCientifico(@RequestBody Cientifico cientifico) {
		
		return cientificoServiceImpl.guardarCientifico(cientifico);
	}
	
	
	@GetMapping("/cientificos/{id}")
	public Cientifico cientificoXID(@PathVariable(name="id") String id) {
		
		Cientifico Cientifico_xid= new Cientifico();
		
		Cientifico_xid=cientificoServiceImpl.cientificoXID(id);
		
		//System.out.println("Cientifico XID: "+Cientifico_xid);
		
		return Cientifico_xid;
	}
	
	@PutMapping("/cientificos/{id}")
	public Cientifico actualizarCientifico(@PathVariable(name="id")String id,@RequestBody Cientifico cientifico) {
		
		Cientifico Cientifico_seleccionado= new Cientifico();
		Cientifico Cientifico_actualizado= new Cientifico();
		
		Cientifico_seleccionado= cientificoServiceImpl.cientificoXID(id);
		
		Cientifico_seleccionado.setNomapels(cientifico.getNomapels());
		
		Cientifico_actualizado = cientificoServiceImpl.actualizarCientifico(Cientifico_seleccionado);
		
		//System.out.println("El Cientifico actualizado es: "+ Cientifico_actualizado);
		
		return Cientifico_actualizado;
	}
	
	@DeleteMapping("/cientificos/{id}")
	public void eleiminarCientifico(@PathVariable(name="id")String id) {
		cientificoServiceImpl.eliminarCientifico(id);
	}
	
	
}
