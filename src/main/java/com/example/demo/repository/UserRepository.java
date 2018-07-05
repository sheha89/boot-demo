package com.example.demo.repository;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ShehanAb on 5/7/18.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
}
