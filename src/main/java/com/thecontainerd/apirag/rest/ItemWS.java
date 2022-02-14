package com.thecontainerd.apirag.rest;

import java.util.List;

import com.thecontainerd.apirag.entity.ItemPre;
import com.thecontainerd.apirag.repository.ItemPreRepository;
import com.thecontainerd.apirag.service.ItemPreService;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemWS {

    @Autowired
    private ItemPreService itemPreService;

    @GetMapping(value = "/items/pre")
    public ResponseEntity<List<ItemPre>> findAllPreItems() {
        return ResponseEntity.ok().body(itemPreService.findAllPreItems());
    }
}
