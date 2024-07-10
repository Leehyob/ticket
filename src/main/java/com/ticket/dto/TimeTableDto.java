package com.ticket.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@Setter
@Getter
@ToString
public class TimeTableDto {

    private String date;

    private String time;

    private String actorName;
}
