package org.example.rent.IVehiclePackage;

import java.util.List;

public class IVehicleTypeService {
    IVehicleType findById(Long id);
    IVehicleType findByName(String name);
    List<IVehicleType> getAllList();
    IVehicleType insert(IVehicleType vehicleType) throws Exception;
    boolean remove(Long id) throws Exception;
    IVehicleType update(Long id, IVehicleType vehicleType);
    List<IVehicleType> findAllByNameContains(String name);
}
