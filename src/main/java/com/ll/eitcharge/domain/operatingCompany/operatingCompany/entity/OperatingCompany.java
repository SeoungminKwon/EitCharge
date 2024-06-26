package com.ll.eitcharge.domain.operatingCompany.operatingCompany.entity;

import com.ll.eitcharge.domain.chargingStation.chargingStation.entity.ChargingStation;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

import static lombok.AccessLevel.PROTECTED;

@Entity
@NoArgsConstructor(access = PROTECTED)
@AllArgsConstructor(access = PROTECTED)
@Builder
@Getter
public class OperatingCompany {
    @Id
    //기관 아이디
    private String busiId;
    //기관명
    private String bnm;
    //점유율 상위 15개 기관 여부
    private String isPrimary;

    @OneToMany(mappedBy = "operatingCompany")
    private List<ChargingStation> chargingStations = new ArrayList<>();
}
