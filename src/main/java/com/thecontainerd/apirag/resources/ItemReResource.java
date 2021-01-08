package com.thecontainerd.apirag.resources;

import com.thecontainerd.apirag.entities.ItemRe;
import com.thecontainerd.apirag.services.ItemReService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/api/itemre")
public class ItemReResource {

    @Autowired
    private ItemReService service;

    @GetMapping
    public ResponseEntity<List<ItemRe>> findAll(){
        List<ItemRe> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<ItemRe> findById(@PathVariable Long id) {
        ItemRe obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping(value = "/ename/{name}")
    public ResponseEntity<List<ItemRe>> findByNameEnglishContaining(@PathVariable String name) {
        List<ItemRe> list = service.findByNameEnglishContaining(name);
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/bname/{name}")
    public ResponseEntity<Map<String, List>> findByNameBrazilianContaining(@PathVariable String name) {
        List<ItemRe> list = service.findByNameBrazilianContaining(name);
        Map<String, List> map = new HashMap<String, List>();
        map.put("data", list);
        return ResponseEntity.ok().body(map);
    }
}
