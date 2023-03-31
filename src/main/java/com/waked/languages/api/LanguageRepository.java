package com.waked.languages.api;

import org.springframework.data.mongodb.repository.MongoRepository;;

public interface LanguageRepository extends MongoRepository<Language, String> {
    
}
