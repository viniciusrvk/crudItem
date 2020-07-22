package br.com.rvkdid.crudItem.validator;

import java.util.List;

import br.com.fluentvalidator.AbstractValidator;
import br.com.fluentvalidator.predicate.CollectionPredicate;
import br.com.fluentvalidator.predicate.LogicalPredicate;
import br.com.rvkdid.crudItem.model.Pessoa;

public class PessoaListValidator extends AbstractValidator<List<Pessoa>>{

	@Override
	public void rules() {
		// TODO Auto-generated method stub
		ruleForEach(list -> list)
		.whenever(LogicalPredicate.not(CollectionPredicate.empty()))
		.withValidator(new PessoaValidator());
	}

}
