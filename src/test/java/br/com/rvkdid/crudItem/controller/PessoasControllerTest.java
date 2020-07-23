package br.com.rvkdid.crudItem.controller;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import br.com.rvkdid.crudItem.business.PessoasBusiness;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = PessoasController.class)
public class PessoasControllerTest {
	
	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private PessoasBusiness business;
	
	@Test
	public void testPostPessoasList() {
		fail("Not yet implemented");
	}

}
