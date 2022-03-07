package com.example.demo.repository;

import com.example.demo.entities.UserMembership;
import com.example.demo.entities.Users;
import com.example.demo.repository.generic.GenericRepository;

import java.util.Optional;

public interface UserMembershipRepository extends GenericRepository<UserMembership> {

    UserMembership findByUser(Optional<Users> user);

}