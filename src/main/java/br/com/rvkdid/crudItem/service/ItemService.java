package br.com.rvkdid.crudItem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rvkdid.crudItem.model.Item;
import br.com.rvkdid.crudItem.repository.ItemRepository;

@Service
public class ItemService {

	@Autowired
	private ItemRepository repo;

	public List<Item> findAll(){
		return repo.findAll();
	}

	public Optional<Item> findById(Integer id) {
		return repo.findById(id);
	}

	public Item save(Item item) {
		return repo.save(item);
	}

	public Item alterar(Item item) {

		return repo.save(item);
	}

}
