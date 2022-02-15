package com.abbonnementmicroservice.abbonnementmicroservice.repositories;

import com.abbonnementmicroservice.abbonnementmicroservice.beans.Abbonnement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbbonnementRepository extends JpaRepository<Abbonnement, Integer> {
}
