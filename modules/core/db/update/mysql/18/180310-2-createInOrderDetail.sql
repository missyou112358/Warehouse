alter table WAREHOUSE_IN_ORDER_DETAIL add constraint FK_WAREHOUSE_IN_ORDER_DETAIL_MATERIAL foreign key (MATERIAL_ID) references WAREHOUSE_MATERIAL(ID);
alter table WAREHOUSE_IN_ORDER_DETAIL add constraint FK_WAREHOUSE_IN_ORDER_DETAIL_STORE_POSITION foreign key (STORE_POSITION_ID) references WAREHOUSE_STORE_POSTION(ID);
