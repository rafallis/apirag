package com.thecontainerd.apirag.services;

import com.thecontainerd.apirag.entities.ItemRe;
import com.thecontainerd.apirag.respositories.ItemReRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemReService {

    @Autowired
    private ItemReRepository repository;

    public List<ItemRe> findAll() {
        return repository.findAll();
    }

    public ItemRe findById(Long id) {
        Optional<ItemRe> obj = repository.findById(id);
        return obj.get();
    }

    public List<ItemRe> findByNameEnglishContaining(String name) {
        List<ItemRe> list = repository.findByNameEnglishContaining(name);
        return list;
    }
}
