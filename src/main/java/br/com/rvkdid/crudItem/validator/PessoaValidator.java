package br.com.rvkdid.crudItem.validator;

import br.com.fluentvalidator.AbstractValidator;
import br.com.fluentvalidator.predicate.LogicalPredicate;
import br.com.fluentvalidator.predicate.ObjectPredicate;
import br.com.fluentvalidator.predicate.StringPredicate;
import br.com.rvkdid.crudItem.model.Pessoa;

public class PessoaValidator extends AbstractValidator<Pessoa> {

	@Override
	public void rules() {
		// TODO Auto-generated method stub
//		ruleFor(Pessoa::getNome)
//		.must(LogicalPredicate.not(StringPredicate.stringEmptyOrNull()))
//		.handlerInvalidField(new HandlerInvalidField<String>() {
//			
//            public List<Error> handle(final Object instance, final Collection<String> value) {
//                final Pessoa entity = Pessoa.class.cast(instance);
//                return Collections.singletonList(Error.create("entity", "entity property collection must be size 1", "404", entity));
//            }
//        }).critical();
//		
		ruleFor(Pessoa::getNome)
		.must(LogicalPredicate.not(StringPredicate.stringEmptyOrNull()))
		.withCode("400")
		.withFieldName("pessoa.nome")
		.withMessage("O nome nao pode ser nulo ou vazio.")
		.withAttempedValue(Pessoa::getNome);
		
		ruleFor(Pessoa::getIdade)
		.must(LogicalPredicate.not(ObjectPredicate.nullValue()))
		.withCode("400")
		.withFieldName("pessoa.idade")
		.withMessage("A idade nao pode ser nula.")
		.withAttempedValue(Pessoa::getIdade);
		
	}

}
