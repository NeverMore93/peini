package com.yuan.peini.dao;

import com.yuan.peini.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Component
@Transactional
public interface UserDao extends JpaRepository<User, Long> {
    User findUserByEmail(String email);
    User findUserByUsername(String username);
    User saveAndFlush(User user);
    List<User> findAll();
}
