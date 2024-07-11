package org.example.rent;

import lombok.*;
import org.example.rent.IVehiclePackage.VehicleTypeEntity;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VehicleDto implements IVehicle{

    private Long id;
    private String company;
    private String model;
    private int makeYear;
    private VehicleTypeEntity type;
    private String color;
    private int totalKm;
    private String factoryNumber;
    private String registNumber;
    private EVehicle status;

    @Override
    public String toString() {
        return String.format("ID: %6d, 회사:%s, 모델:%s, 연식:%d, 색상:%s, km:%d, 공장번호:%d, 등록번호:%d, 상태:%d)"
                , this.id, this.company,
                this.model, this.makeYear, this.type, this.color,
                this.totalKm, this.factoryNumber, this.registNumber, this.status);
    }



}
