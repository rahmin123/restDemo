package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	Service serv = new Service();
    
    @PutMapping("/create")
    public List<String> create() {
    	return serv.createList();
    }
    
    @GetMapping("/viewList")
    public List<String> viewList() 
    {
    	return serv.getList();
    }
    
    @PostMapping("/add") 
    public void add(@RequestBody String snack) 
    {
    	serv.addItem(snack);
    }
    
    @DeleteMapping("/delete/{Item}")
    public void delete(@PathVariable("Item") String snack) {
    	serv.deleteItem(snack);
    }
 
}