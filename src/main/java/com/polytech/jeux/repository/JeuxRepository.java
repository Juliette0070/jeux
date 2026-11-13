package com.polytech.jeux.repository;

import com.polytech.jeux.entity.Jeux;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JeuxRepository extends JpaRepository<Jeux, Integer> {
}
