package com.example.One.to.many.Uni;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface customerrepository extends JpaRepository<customer, Long> {

}
