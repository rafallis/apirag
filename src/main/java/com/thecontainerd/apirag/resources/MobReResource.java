package com.thecontainerd.apirag.resources;

import com.thecontainerd.apirag.entities.MobRe;
import com.thecontainerd.apirag.services.MobReService;
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
@RequestMapping(value = "/api/mobre")
public class MobReResource {

    @Autowired
    private MobReService service;

    @GetMapping
    public ResponseEntity<Map<String, List>> findAll() {
        List<MobRe> list = service.findAll();
        Map<String, List> map = new HashMap<>();
        map.put("data", list);
        return ResponseEntity.ok().body(map);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<MobRe> findById(@PathVariable Long id) {
        MobRe obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping(value = "/name/{name}")
    public ResponseEntity<Map<String, List>> findByIName(@PathVariable String name) {
        List<MobRe> list = service.findByIName(name);
        Map<String, List> map = new HashMap<>();
        map.put("data", list);
        return ResponseEntity.ok().body(map);
    }
}
