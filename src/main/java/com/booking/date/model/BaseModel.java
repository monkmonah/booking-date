package com.booking.date.model;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class BaseModel {
    @Id
    private String id;
}
