package com.wetts.domain;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by wetts on 2017/2/21.
 */
public interface UserRepository extends MongoRepository<User, Long> {

    User findByUsername(String username);

}