package br.com.rvkdid.crudItem.controller;

import br.com.rvkdid.crudItem.model.Item;
import br.com.rvkdid.crudItem.service.ItemService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;


@RunWith(MockitoJUnitRunner.class)
public class ItemControllerTest {

    @InjectMocks
    private ItemController itemController;

    @Mock
    private ItemService itemService;

    @Test
    public void getByIdOkTest(){
        when(itemService.findById(anyInt())).thenReturn(java.util.Optional.of(new Item()));

        ResponseEntity responseEntity = itemController.getById(1);

        Assert.assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
    }

    @Test
    public void todosOkTest(){
        List<Item> item = new ArrayList<>();

        when(itemService.findAll()).thenReturn(item);

        ResponseEntity responseEntity = itemController.todos();

        Assert.assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
    }

    @Test
    public void cadastrarOkTest(){
        //dando erro de stubbings ao descomentar a linha
//        when(itemService.save(new Item())).thenReturn(new Item());

        ResponseEntity responseEntity = itemController.cadastrar(new Item());

        Assert.assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
    }

    @Test
    public void alterarOkTest(){
        //dando erro de stubbings ao descomentar a linha
//        when(itemService.save(new Item())).thenReturn(new Item());

        ResponseEntity responseEntity = itemController.alterar(new Item(), 1);

        Assert.assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
    }

}
