package com.passagermicroservice.passagermicroservice.Repositories;

import com.passagermicroservice.passagermicroservice.beans.Passager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassagerRepository extends JpaRepository<Passager, Integer> {
}
