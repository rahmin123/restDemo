package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

@RestController
public class Controller {

	Service serv = new Service();
	
    @GetMapping("/")
    public String HelloSpring(){
        System.out.println("My First Spring Application");
        return "My First Spring Application";
    }
    
    @PutMapping("/create")
    public List<String> create() {
    	return serv.createList();
    }
    
    @GetMapping("/viewList")
    public List<String> viewList() 
    {
    	return serv.getList();
    }
    
    @PostMapping("/update") 
    public void update(@RequestBody String snack) 
    {
    	serv.addItem(snack);
    }
    
    @DeleteMapping("/delete/{Item}")
    public void delete(@PathVariable("Item") String snack) {
    	serv.deleteItem(snack);
    }
 
}