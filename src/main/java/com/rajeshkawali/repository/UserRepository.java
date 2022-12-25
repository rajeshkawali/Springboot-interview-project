package com.rajeshkawali.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rajeshkawali.entity.User;

/**
 * @author Rajesh_Kawali
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}