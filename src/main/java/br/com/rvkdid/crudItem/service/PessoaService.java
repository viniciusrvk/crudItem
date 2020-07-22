package br.com.rvkdid.crudItem.service;

import br.com.rvkdid.crudItem.model.Pessoa;
import br.com.rvkdid.crudItem.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository repository;

    public Pessoa save(Pessoa pessoa){

        return repository.save(pessoa);
    }

}
