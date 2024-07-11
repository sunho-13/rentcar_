package org.example.rent;

public interface VehicleJPARepository {
    List<BehicleEntity> findAllByCompanyContains(String company);
    List<BehicleEntity> findAllByModelContains(String model);
    List<BehicleEntity> findAllByMakeYeakContains(int makeYear);
    List<BehicleEntity> findAllByTypeContains(VehicleType type);
    List<BehicleEntity> findAllByColorContains(String color);
    List<BehicleEntity> findAllByTotalKmContains(int totalKm);
    List<BehicleEntity> findAllByFactoryNumberContains(String factoryNumber);
    List<BehicleEntity> findAllByRegistNumberContains(String registNumber);
    List<BehicleEntity> findAllByStatusContains(VehicleStatus status);
}
