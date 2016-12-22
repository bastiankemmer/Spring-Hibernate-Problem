package com.example.model.repository;

import com.example.model.UserModel;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by bastiankemmer on 22.12.16.
 */
public interface UserRepository extends CrudRepository<UserModel, String> {
}
