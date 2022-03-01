package com.example.demo.service;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

import com.example.demo.dto.RoleDTO;
import com.example.demo.entities.Role;
import lombok.extern.slf4j.Slf4j;
import com.example.demo.entities.UserMembership;
import com.example.demo.entities.Users;
import com.example.demo.repository.UserMembershipRepository;
import com.example.demo.repository.UsersRepository;
import com.example.demo.service.impl.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class JwtUserDetailsService implements UserDetailsService {

    @Autowired
    UsersRepository userRepository;

    @Autowired
    UserMembershipRepository userMembershipRepository;

    @Autowired
    RoleService roleService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Optional<Users> user = userRepository.findByUsername(username);
        log.info(username);
        log.info("OK : "+user);
        if (user.isEmpty()) {
            log.error("User not found");
            throw new UsernameNotFoundException("user not found");
        }else {
            log.info("user found");
        }

        Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();

        log.info(String.valueOf(user));
        UserMembership membership = userMembershipRepository.findByUser(user);
        String role = null;
        try {
            role = roleService.findById(membership.getRole().getId()).getName();
            log.info(String.valueOf(role));
        } catch (Exception e) {
            e.printStackTrace();
        };

        authorities.add(new SimpleGrantedAuthority(role));
        return new User(user.get().getUsername(),user.get().getPassword(),authorities);
    }


}
