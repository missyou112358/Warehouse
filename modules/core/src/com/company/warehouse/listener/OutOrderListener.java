package com.company.warehouse.listener;

import org.springframework.stereotype.Component;
import com.haulmont.cuba.core.listener.BeforeInsertEntityListener;
import com.haulmont.cuba.core.EntityManager;
import com.company.warehouse.entity.OutStoreOrder;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component("warehouse_OutOrderListener")
public class OutOrderListener implements BeforeInsertEntityListener<OutStoreOrder> {


    @Override
    public void onBeforeInsert(OutStoreOrder entity, EntityManager entityManager) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        entity.setOutStoreNumber("OUT" + sdf.format(new Date()));
    }


}