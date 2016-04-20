package com.booking.date.web.api;

import java.time.LocalTime;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.booking.date.model.BookedTime;
import com.booking.date.model.type.TimeStatus;

@RestController
public class CalendarController {
    @RequestMapping(value="/api/calendae", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BookedTime> getGreeting() {
        int hour = 9;
        int minute = 30;

        BookedTime time = new BookedTime(LocalTime.of(hour, minute), TimeStatus.FREE);
        return ResponseEntity.accepted().body(time);
    }
}
