package com.ll.eitcharge.domain.charger.charger.entity;


import com.ll.eitcharge.domain.chargingStation.chargingStation.entity.ChargingStation;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

import static lombok.AccessLevel.PROTECTED;

@Entity
@NoArgsConstructor(access = PROTECTED)
@AllArgsConstructor(access = PROTECTED)
@Builder
@Getter
public class Charger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "stat_id")
    private ChargingStation chargingStation;
    //충전기 id
    private String chgerId;
    //충전기 타입(완속 급속 콤보 등)
    private String chgerType;
    //충전기 상태
    private String stat;
    //충전기 상태 갱신 일시
    @DateTimeFormat(pattern = "yyyyMMddHHmmss")
    private LocalDateTime statUpdDt;
    //마지막 충전 시작일
    @DateTimeFormat(pattern = "yyyyMMddHHmmss")
    private LocalDateTime lastTsdt;
    //마지막 충전종료일시
    @DateTimeFormat(pattern = "yyyyMMddHHmmss")
    private LocalDateTime lastTedt;
    //충전중 시작일시
    @DateTimeFormat(pattern = "yyyyMMddHHmmss")
    private LocalDateTime nowTsdt;
    //충전 용량
    private String output;
    //충전 방식
    private String method;
}