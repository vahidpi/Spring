
package com.frankmoley.landon.web.service;

import com.frankmoley.landon.business.domain.RoomReservation;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Vahid
 */

@RestController
@RequestMapping(value="/api")

public class ReservationServiceController {
    
    @RequestMapping(method= RequestMethod.GET, value="/reservations/{date}")
    public List<RoomReservation> getAllReservationForDate(@PathVariable(value="date")String dateString){
        return this.reservationService.getRoomReservationsForDate(dateString);
        
    }
    
}
