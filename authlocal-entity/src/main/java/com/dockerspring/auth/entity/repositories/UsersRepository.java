package com.dockerspring.auth.entity.repositories;

import com.dockerspring.auth.entity.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<User, Integer> {

}