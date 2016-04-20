package com.booking.date.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.booking.date.model.BookedTime;

@RepositoryRestResource(collectionResourceRel = "bookedTime", path = "bookedTime")
public interface BookedTimeRepository extends MongoRepository<BookedTime, String> {
}
