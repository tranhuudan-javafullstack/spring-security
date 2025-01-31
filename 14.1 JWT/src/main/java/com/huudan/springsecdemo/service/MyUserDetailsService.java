package com.huudan.springsecdemo.service;

import com.huudan.springsecdemo.model.User;
import com.huudan.springsecdemo.model.UserPrincipal;
import com.huudan.springsecdemo.repository.UserRepo;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {

    private final UserRepo repo;

    public MyUserDetailsService(UserRepo repo) {
        this.repo = repo;
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = repo.findByUsername(username);
        Optional.ofNullable(user).orElseThrow(() -> new UsernameNotFoundException("User 404"));
        return new UserPrincipal(user);
    }

}
