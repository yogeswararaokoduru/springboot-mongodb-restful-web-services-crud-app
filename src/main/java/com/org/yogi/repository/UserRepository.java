package com.org.yogi.repository;

import com.org.yogi.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;


/**
 * @author yogi.
 */

public interface UserRepository extends MongoRepository<User, Long> {

    public User findById(String id);

    public Long deleteById(String id);
}
