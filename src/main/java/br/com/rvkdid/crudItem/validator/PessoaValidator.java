package br.com.rvkdid.crudItem.validator;

import java.util.Collection;
import java.util.Collections;

import br.com.fluentvalidator.AbstractValidator;
import br.com.fluentvalidator.handler.HandlerInvalidField;
import br.com.fluentvalidator.predicate.LogicalPredicate;
import br.com.fluentvalidator.predicate.StringPredicate;
import br.com.fluentvalidator.context.Error;
import br.com.rvkdid.crudItem.model.Pessoa;

public class PessoaValidator extends AbstractValidator<Pessoa> {

	@Override
	public void rules() {
		// TODO Auto-generated method stub
		ruleFor(Pessoa::getNome)
		.must(p -> p.equals("aaa"))
		.when(LogicalPredicate.not(StringPredicate.stringEmptyOrNull()))
		.handlerInvalidField(new HandlerInvalidField<String>() {
			
            public Collection<Error> handle(final Object instance, final Collection<String> value) {
                final Pessoa entity = Pessoa.class.cast(instance);
                return Collections.singletonList(Error.create("entity", "entity property collection must be size 1", "404", entity));
            }
        })
		
		.critical();
		
	}

}
