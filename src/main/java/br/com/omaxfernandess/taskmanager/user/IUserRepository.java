package br.com.omaxfernandess.taskmanager.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IUserRepository  extends JpaRepository<UserModel, UUID> {
}