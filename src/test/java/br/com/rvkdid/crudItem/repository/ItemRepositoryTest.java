package br.com.rvkdid.crudItem.repository;

import br.com.rvkdid.crudItem.model.Item;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ItemRepositoryTest {

    @Autowired
    private ItemRepository itemRepository;

    @Before
    public void setup(){
        itemRepository.deleteAll();
    }

    @Test
    public void findAllTest(){
        List<Item> listItems = itemList();

        List<Item> allItemsRecovered = itemRepository.findAll();

        Assert.assertTrue(listItems.equals(allItemsRecovered));
    }

    @Test
    public void findByIdTest(){
        Item itemPersisted = itemRepository.save(returnItem());

        Optional<Item> foundById = itemRepository.findById(itemPersisted.getId());

        Assert.assertTrue(itemPersisted.equals(foundById.get()));
    }

    @Test
    public void saveTest(){
        Item itemPersisted = itemRepository.save(returnItem());

        Assert.assertNotNull(itemPersisted.getId());
        Assert.assertEquals(returnItem().getLink(), itemPersisted.getLink());
        Assert.assertEquals(returnItem().getLinkCurto(), itemPersisted.getLinkCurto());
        Assert.assertEquals(returnItem().getNome(), itemPersisted.getNome());
        Assert.assertEquals(returnItem().getComprado(), itemPersisted.getComprado());
    }

    @Test
    public void updateTest(){
        Item itemPersisted = itemRepository.save(returnItem());
        itemPersisted.setComprado(Boolean.FALSE);
        itemRepository.save(itemPersisted);

        Assert.assertNotEquals(itemPersisted.getComprado(), returnItem().getComprado());
        Assert.assertFalse(itemPersisted.getComprado());
    }

    public List<Item> itemList(){
        List<Item> listItems = new ArrayList<>();

        for(int i=0; i<3; i++){
            Item item = new Item();
            item.setComprado(Boolean.TRUE);
            item.setLink("https://google.com");
            item.setLinkCurto("https://...");
            item.setNome("Google");

            itemRepository.save(item);
            listItems.add(item);
        }

        return listItems;
    }

    public Item returnItem(){
        Item item = new Item();
        item.setComprado(Boolean.TRUE);
        item.setLink("https://google.com");
        item.setLinkCurto("https://...");
        item.setNome("Google");

        return item;
    }

}
