package app.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import app.entidade.Usuario;
import app.repository.NameRepository;

@RestController
public class NameRestcontroller {

	@Autowired
	NameRepository repository;
	
	

	@RequestMapping(value = "/names", method = RequestMethod.GET)
	public List<Usuario> AllNames(){
			return repository.findAllName();
	}
	
	@RequestMapping(value = "/names" , method = RequestMethod.POST)
	public void addName(@RequestBody String user){
		
		repository.insertName(user);
	}

	
	
}
