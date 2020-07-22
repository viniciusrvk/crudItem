package br.com.rvkdid.crudItem.business;

import java.util.List;

import org.springframework.stereotype.Component;

import br.com.rvkdid.crudItem.model.Pessoa;
import br.com.rvkdid.crudItem.validator.PessoaListValidator;

@Component
public class PessoaBusiness {
	
	private PessoaListValidator validator = new PessoaListValidator();

	public List<Pessoa> processar(List<Pessoa> pessoas) {
		validator.apply(pessoas);
		
		return pessoas;
	}

	
}
