alter table WAREHOUSE_MATERIAL add constraint FK_WAREHOUSE_MATERIAL_COOPERATOR foreign key (COOPERATOR_ID) references WAREHOUSE_STAFF(ID);