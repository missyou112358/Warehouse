-- update WAREHOUSE_UNIT set NAME = <default_value> where NAME is null ;
alter table WAREHOUSE_UNIT alter column NAME set not null ;
