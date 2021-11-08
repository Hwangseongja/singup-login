package com.victolee.signuplogin.domain.entity;

import lombok.*;

import javax.persistence.*;
@Data
@Entity
@Table(name = "sensor_info")
@NoArgsConstructor
public class SensorEntity {

    @Id
    @Column
    private char Freq;
    @Column
    private char Pulses;
    @Column
    private char Liters;
    @Column
    private char Mq2;
    @Column
    private char Mq5;
    @Column
    private char Mq7;
    @Column
    private char body;
    @Column
    private char humidity;
    @Column
    private char temperature;
    @Column
    private char electric;
    @Column
    private char CDS;

    @GeneratedValue
    private String date;

    @Builder //해당 클래스의 빌더패턴 클래스를 생성
    public SensorEntity(char Freq, char Pulses, char Liters, char Mq2,char Mq5,char Mq7,char body,char humidity, char temperature, char electric,char CDS, String date) {

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
