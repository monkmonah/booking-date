package com.booking.date.model;

import java.time.LocalTime;

import com.booking.date.model.type.TimeStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper=false)
@AllArgsConstructor
@NoArgsConstructor
public class BookedTime extends BaseModel {
    private LocalTime time;
    private TimeStatus status;
    
    public boolean is(TimeStatus status) {
        return status.equals(this.status);
    }
}
