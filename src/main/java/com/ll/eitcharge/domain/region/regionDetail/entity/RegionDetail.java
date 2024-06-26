package com.ll.eitcharge.domain.region.regionDetail.entity;

import com.ll.eitcharge.domain.chargingStation.chargingStation.entity.ChargingStation;
import com.ll.eitcharge.domain.region.region.entity.Region;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.FetchType.LAZY;
import static lombok.AccessLevel.PROTECTED;

@Entity
@NoArgsConstructor(access = PROTECTED)
@AllArgsConstructor(access = PROTECTED)
@Builder
@Getter
public class RegionDetail {
    @Id
    private String zscode;
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "zcode")
    private Region zcode;

    private String regionDetailName;

    @OneToMany(mappedBy = "regionDetail")
    private List<ChargingStation> chargingStations = new ArrayList<>();
}
