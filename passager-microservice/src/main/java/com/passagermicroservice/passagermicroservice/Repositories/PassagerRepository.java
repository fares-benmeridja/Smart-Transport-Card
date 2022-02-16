package com.passagermicroservice.passagermicroservice.Repositories;

import com.passagermicroservice.passagermicroservice.beans.Passager;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface PassagerRepository extends JpaRepository<Passager, Integer> {
}
