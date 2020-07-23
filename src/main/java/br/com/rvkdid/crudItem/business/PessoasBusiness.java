package br.com.rvkdid.crudItem.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import br.com.fluentvalidator.context.ValidationResult;
import br.com.rvkdid.crudItem.model.Pessoa;
import br.com.rvkdid.crudItem.validator.PessoaValidator;

@Component
public class PessoasBusiness {
	
	private PessoaValidator validator = new PessoaValidator();

	public List<?> processar(List<Pessoa> pessoas) throws Exception {
		List<ValidationResult> validate = validator.validate(pessoas);
		System.out.println(validate.size() == pessoas.size());
		List list = new ArrayList<Object>();
		for (int i = 0; i < validate.size(); i++) {
			ValidationResult valid = validate.get(i);
			if(!valid.isValid()) {
				list.add(valid.getErrors());
			}else {
				list.add(pessoas.get(i));
			}
		}
		return list;
	}

	
}
