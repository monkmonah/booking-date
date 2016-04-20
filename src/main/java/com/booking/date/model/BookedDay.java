package com.booking.date.model;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@Data
@EqualsAndHashCode(callSuper=false)
@RequiredArgsConstructor
public class BookedDay extends BaseModel {
    private final List<BookedTime> times;
}