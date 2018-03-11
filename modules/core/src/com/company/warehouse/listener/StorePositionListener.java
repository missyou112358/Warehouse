package com.company.warehouse.listener;

import org.springframework.stereotype.Component;
import com.haulmont.cuba.core.listener.BeforeInsertEntityListener;
import com.haulmont.cuba.core.EntityManager;
import com.haulmont.cuba.core.entity.Entity;
import com.haulmont.cuba.core.listener.BeforeUpdateEntityListener;
import com.company.warehouse.entity.StorePostion;

@Component("warehouse_StorePositionListener")
public class StorePositionListener implements BeforeInsertEntityListener<StorePostion>, BeforeUpdateEntityListener<StorePostion> {


    @Override
    public void onBeforeInsert(StorePostion entity, EntityManager entityManager) {
        String positionNumber = entity.getPositionNumber();
        String positionName = entity.getWarehouse().getWarehouseNumber();
        positionName = positionName + "库" + positionNumber.charAt(0) + "架"
                + positionNumber.substring(1,4) + "列" + positionNumber.substring(4) + "层";
        entity.setPositionName(positionName);
    }


    @Override
    public void onBeforeUpdate(StorePostion entity, EntityManager entityManager) {
        String positionNumber = entity.getPositionNumber();
        String positionName = entity.getWarehouse().getWarehouseNumber();
        positionName = positionName + "库" + positionNumber.charAt(0) + "架"
                + positionNumber.substring(1,4) + "列" + positionNumber.substring(4) + "层";
        entity.setPositionName(positionName);
    }


}