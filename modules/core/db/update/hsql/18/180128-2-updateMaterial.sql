alter table WAREHOUSE_MATERIAL drop column UNIT_ID cascade ;
alter table WAREHOUSE_MATERIAL add column UNIT_ID varchar(36) ;
