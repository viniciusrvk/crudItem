package br.com.rvkdid.crudItem.service;

import br.com.rvkdid.crudItem.model.Item;
import br.com.rvkdid.crudItem.repository.ItemRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@RunWith(SpringRunner.class)
public class ItemServiceTest {

    @InjectMocks
    private ItemService itemService;

    @Mock
    private ItemRepository itemRepository;

    @Test
    public void findAll(){
        List<Item> item = new ArrayList<>();

        itemService.findAll();

        Mockito.when(itemRepository.findAll()).thenReturn(item);
    }

    @Test
    public void findByIdTest(){
        itemService.findById(1);

        Mockito.when(itemRepository.findById(Mockito.anyInt())).thenReturn(Optional.of(new Item()));
    }

    @Test
    public void saveTest(){
        itemService.save(new Item());

        Mockito.when(itemRepository.save(new Item())).thenReturn(new Item());
    }

    @Test
    public void alterarTest(){
        itemService.alterar(new Item());

        Mockito.when(itemRepository.save(new Item())).thenReturn(new Item());
    }

}
