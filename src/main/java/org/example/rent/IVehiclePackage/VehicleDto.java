package org.example.rent.IVehiclePackage;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VehicleDto implements IVehicleType {
    private Long id;
    private String name;
}
