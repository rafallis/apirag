package com.thecontainerd.apirag.services;

import com.thecontainerd.apirag.entities.MobRe;
import com.thecontainerd.apirag.respositories.MobReRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MobReService {

    @Autowired
    private MobReRepository repository;

    public List<MobRe> findAll(){
        return repository.findAll();
    }

    public MobRe findById(Long id) {
        Optional<MobRe> obj = repository.findById(id);
        return obj.get();
    }

    public List<MobRe> findByIName(String name) {
        List<MobRe> list = repository.findByINameContaining(name);
        return list;
    }
}
