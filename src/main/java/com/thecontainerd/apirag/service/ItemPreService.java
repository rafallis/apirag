package com.thecontainerd.apirag.service;

import java.util.List;

import com.thecontainerd.apirag.entity.ItemPre;
import com.thecontainerd.apirag.repository.ItemPreRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemPreService {

    @Autowired
    private ItemPreRepository preRepository;

    public List<ItemPre> findAllPreItems() {
        return preRepository.findAll();
    }

}
