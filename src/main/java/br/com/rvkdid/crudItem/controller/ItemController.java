package br.com.rvkdid.crudItem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.rvkdid.crudItem.model.Item;
import br.com.rvkdid.crudItem.service.ItemService;

@Controller
@RequestMapping(path = "/item")
public class ItemController {

	@Autowired
	private ItemService service;

	@GetMapping
	public ResponseEntity<?> todos(){
		return ResponseEntity.ok(service.findAll());
	}

	@GetMapping(path = "/{id}")
	public ResponseEntity<?> getById(@PathVariable Integer id){
		return ResponseEntity.of(service.findById(id));
	}

	@PostMapping
	public ResponseEntity<?> cadastrar(@RequestBody Item item) {
		return ResponseEntity.ok(service.save(item));
	}

	@PutMapping(path = "/{id}")
	public ResponseEntity<?> alterar(@RequestBody Item item, @PathVariable Integer id) {
		return ResponseEntity.ok(service.alterar(item));
	}
}
