package com.company.warehouse.listener;

import com.company.warehouse.entity.*;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.core.global.Resources;
import org.springframework.stereotype.Component;
import com.haulmont.cuba.core.listener.BeforeInsertEntityListener;
import com.haulmont.cuba.core.EntityManager;

import javax.inject.Inject;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Component("warehouse_InStoreOrderListener")
public class InStoreOrderListener implements BeforeInsertEntityListener<InStoreOrder> {

    @Override
    public void onBeforeInsert(InStoreOrder entity, EntityManager entityManager) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        entity.setInStoreNumber("IN" + sdf.format(new Date()));
        /*List<InOrderDetail> detailList = entity.getDetails();
        for (InOrderDetail inOrderDetail : detailList){
            Material material = inOrderDetail.getMaterial();

            MaterialStock materialStock = entityManager.find(MaterialStock.class,material.getId());

            if (materialStock == null){
                materialStock = new MaterialStock();
                materialStock.setMaterial(material);
                materialStock.setQuantity(inOrderDetail.getQuantity());
            }else{
                materialStock.setQuantity(materialStock.getQuantity().add(inOrderDetail.getQuantity()));
            }
        }*/
    }
}