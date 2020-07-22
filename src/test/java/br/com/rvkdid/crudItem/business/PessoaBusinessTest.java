package br.com.rvkdid.crudItem.business;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.rvkdid.crudItem.model.Pessoa;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = PessoaBusiness.class)
public class PessoaBusinessTest {

	@Autowired
	private PessoaBusiness pessoaBusiness;
	
	@Test
	public void deveValidarUmaListaDePessoas() {
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("");
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome(null);
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		
		List<Pessoa> processar = pessoaBusiness.processar(pessoas);
		
		System.out.println(processar);
		
	}

}
