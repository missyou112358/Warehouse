alter table WAREHOUSE_OUT_ORDER_DETAIL add constraint FK_WAREHOUSE_OUT_ORDER_DETAIL_MATERIAL foreign key (MATERIAL_ID) references WAREHOUSE_MATERIAL(ID);