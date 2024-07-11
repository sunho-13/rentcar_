package org.example.rent.IVehiclePackage;

public class IVehicleType {
    Long getId();
    void setId(Long id);

    String getName();
    void setName(String name);

    default void copyFields(IVehicleType from) {
        if (from == null) {
            return;
        }
        if (from.getId() != null) {
            this.setId(from.getId());
        }
        if (from.getName() != null && !from.getName().isEmpty()) {
            this.setName(from.getName());
        }
    }
}
