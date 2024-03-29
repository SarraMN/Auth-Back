package com.thecodeveal.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thecodeveal.app.entities.Authority;


@Repository
public interface AuthorityRepo extends JpaRepository<Authority, Long> {

}
