package com.goodneighbour.goodneighbourbackend.repository;

import com.goodneighbour.goodneighbourbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // You can add custom query methods here if needed
    
}
