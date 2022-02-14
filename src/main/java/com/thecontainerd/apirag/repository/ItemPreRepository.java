package com.thecontainerd.apirag.repository;

import com.thecontainerd.apirag.entity.ItemPre;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemPreRepository extends JpaRepository<ItemPre, Long> {

}
