package br.com.rvkdid.crudItem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.rvkdid.crudItem.business.PessoaBusiness;
import br.com.rvkdid.crudItem.model.Item;
import br.com.rvkdid.crudItem.model.Pessoa;

@Controller
@RequestMapping(path = "/pessoas")
public class PessoasController {
	
	@Autowired
	private PessoaBusiness business;
	
	@PostMapping
	public ResponseEntity<?> cadastrar(@RequestBody List<Pessoa> pessoas) {
		return ResponseEntity.ok(business.processar(pessoas));
	}
}
