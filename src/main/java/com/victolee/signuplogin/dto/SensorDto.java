package com.victolee.signuplogin.dto;

import com.victolee.signuplogin.domain.entity.SensorEntity;
import lombok.*;


import javax.persistence.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class SensorDto {

    private char Freq;
    private char Pulses;
    private char Liters;
    private char Mq2;
    private char Mq5;
    private char Mq7;
    private char body;
    private char humidity;
    private char temperature;
    private char electric;
    private char CDS;

    @GeneratedValue
    private String date;
    public SensorEntity toEntity(){
        return SensorEntity.builder()
                .Freq(Freq)
                .Pulses(Pulses)
                .Liters(Liters)
                .Mq2(Mq2)
                .Mq5(Mq5)
                .Mq7(Mq7)
                .body(body)
                .humidity(humidity)
                .temperature(temperature)
                .electric(electric)
                .CDS(CDS)
                .date(date)
                .build();
    }

    @Builder //해당 클래스의 빌더패턴 클래스를 생성
    public SensorDto(char Freq, char Pulses, char Liters, char Mq2,char Mq5,char Mq7,char body,char humidity, char temperature, char electric,char CDS, String date) {

        this.Freq = Freq;
        this.Pulses = Pulses;
        this.Liters= Liters;
        this.Mq2= Mq2;
        this.Mq5= Mq5;
        this.Mq7= Mq7;
        this.body= body;
        this.humidity= humidity;
        this.temperature= temperature;
        this.electric= electric;
        this.CDS= CDS;
        this.date= date;
    }

}
