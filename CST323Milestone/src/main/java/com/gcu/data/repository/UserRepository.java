package com.gcu.data.repository;
import com.gcu.data.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Integer> {


}
