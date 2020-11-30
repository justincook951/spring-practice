package com.justincook.learningspring.data.repository;

import com.justincook.learningspring.data.entity.Guest;
import com.justincook.learningspring.data.entity.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends CrudRepository<Guest, Long> {
}
