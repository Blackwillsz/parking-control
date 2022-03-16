package com.api.parkingcontrol.repositories;

import java.util.Optional;

import com.api.parkingcontrol.models.User;

public interface UserRepositoryPort {

	Optional<User> findById(Integer id);

	Optional<User> findByEmail(String email);

	User save(User user);
}
