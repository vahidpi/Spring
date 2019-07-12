package com.frankmoley.landon.data.repository;

import org.springframework.stereotype.Repository;
import com.frankmoley.landon.data.entity.Room;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Vahid
 */

@Repository
public interface RoomRepository extends CrudRepository<Room, Long>{
    Room findByNumber(String number);
    
    
}
