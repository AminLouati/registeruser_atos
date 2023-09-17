package atos.user.register.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import atos.user.register.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
