package br.com.rvkdid.crudItem.validator;

import br.com.fluentvalidator.AbstractValidator;
import br.com.fluentvalidator.predicate.LogicalPredicate;
import br.com.fluentvalidator.predicate.StringPredicate;
import br.com.rvkdid.crudItem.model.Pessoa;

public class PessoaValidator extends AbstractValidator<Pessoa> {

	@Override
	public void rules() {
		// TODO Auto-generated method stub
		ruleFor(Pessoa::getNome)
		.must(LogicalPredicate.not(StringPredicate.stringEmptyOrNull()))
		.withFieldName("nome")
		.withMessage("O nome nao pode ser nulo ou vazio")
		.withAttempedValue(Pessoa::getNome);
	}

}
