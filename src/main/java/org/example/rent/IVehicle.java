package org.example.rent;

import java.io.Serializable;

public interface IVehicle extends Serializable {
    Long getId();
    void setId(Long id);

    String getCompany();
    void setCompany(String company);

    String getModel();
    void setModel(String model);

    int getMakeYear();
    void setMakeYear(int makeYear);

    VehicleTypeEntity getType();
    void setType(VehicleTypeEntity type);

    String getColor();
    void setColor(String color);

    int getTotalKm();
    void setTotalkm(int totalKm);

    String getFactoryNumber();
    void setGetFactoryNumber(String factoryNumber);

    String getRegistNumber();
    void setRegistNumber(String registNumber);

    EVehicle getStatus();
    void setStatus(EVehicle status);

    default void copyFields(IVehicle from){
        if(from==null){
            return;
        }
        if(from.getId()!=null){
            this.setId(from.getId());
        }
        if(from.getCompany()!=null){
            this.setCompany(from.getCompany());
        }
        if(from.getModel()!=null){
            this.setModel(from.getModel());
        }
        if(from.getMakeYear()!=null){
            this.setMakeYear(from.getMakeYear());
        }
        if(from.getType()!=null){
            this.setType(from.getType());
        }
        if(from.getColor()!=null){
            this.setColor(from.getColor());
        }
        if(from.getTotalKm()!=null){
            this.setTotalKm(from.getTotalKm());
        }
        if(from.getFactoryNumber()!=null){
            this.setFactoryNumber(from.getFactoryNumber());
        }
        if(from.getRegistNumber()!=null){
            this.setRegistNumber(from.getRegistNumber());
        }
        if(from.getStatus()!=null){
            this.setStatus(from.getStatus());
        }
    }

}
