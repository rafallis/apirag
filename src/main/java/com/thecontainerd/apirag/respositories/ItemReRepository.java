package com.thecontainerd.apirag.respositories;

import com.thecontainerd.apirag.entities.ItemRe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemReRepository extends JpaRepository<ItemRe, Long> {

    List<ItemRe> findByNameBrazilianContaining(String name);
    List<ItemRe> findByNameEnglishContaining(String name);
}
