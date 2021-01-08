package com.thecontainerd.apirag.respositories;

import com.thecontainerd.apirag.entities.MobRe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MobReRepository extends JpaRepository<MobRe, Long> {

    List<MobRe> findByiNameContaining(String name);
}
