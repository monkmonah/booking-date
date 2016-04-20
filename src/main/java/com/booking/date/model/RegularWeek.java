package com.booking.date.model;

import java.time.DayOfWeek;
import java.util.Map;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class RegularWeek extends BaseModel {
    private final Map<DayOfWeek, BookedDay> days;
    public BookedDay getDay(DayOfWeek dayOfWeek) {
        return days.get(dayOfWeek);
    }
}
