package org.example.rent;

public enum EVehicle {
    Free(0),
    Reserved(1),
    Rented(2),
    Broken(3),
    Fixing(4),
    ;

    private final Integer value;

    EVehicle(Integer value){
        this.value = value;
    }

    public Integer getValue() {
        return this.value;
    }

    public static EVehicle integerOf(Integer value){
        for (EVehicle item : EVehicle.values()){
            if(values().equals(item.getValue())){
                return item;
            }
        }
        throw new IllegalArgumentException("EVehicle value : " + value);
    }

}
