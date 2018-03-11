-- update WAREHOUSE_TYPE set NAME = <default_value> where NAME is null ;
alter table WAREHOUSE_TYPE alter column NAME set not null ;
