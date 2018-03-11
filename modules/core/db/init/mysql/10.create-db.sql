-- begin WAREHOUSE_UNIT
create table WAREHOUSE_UNIT (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    NAME varchar(20) not null,
    --
    primary key (ID)
)^
-- end WAREHOUSE_UNIT
-- begin WAREHOUSE_TYPE
create table WAREHOUSE_TYPE (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    NAME varchar(20) not null,
    --
    primary key (ID)
)^
-- end WAREHOUSE_TYPE
-- begin WAREHOUSE_MATERIAL
create table WAREHOUSE_MATERIAL (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    MATERIAL_NUMBER varchar(50) not null,
    MATERIAL_NAME varchar(30) not null,
    SUPPLY varchar(30),
    MODEL varchar(30),
    QUANTITY decimal(19, 2),
    UNIT_ID varchar(32),
    PRICE decimal(19, 2),
    TOTAL_PRICE decimal(19, 2),
    TYPE_ID varchar(32),
    RESPONSER_ID varchar(32),
    COOPERATOR_ID varchar(32),
    PLAN_DATE date,
    ACT_DATE date,
    COMMENT_ varchar(50),
    --
    primary key (ID)
)^
-- end WAREHOUSE_MATERIAL
-- begin WAREHOUSE_WAREHOUSE
create table WAREHOUSE_WAREHOUSE (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    WAREHOUSE_NUMBER varchar(20) not null,
    WAREHOUSE_NAME varchar(20) not null,
    DESCRIPTION longtext,
    --
    primary key (ID)
)^
-- end WAREHOUSE_WAREHOUSE
-- begin WAREHOUSE_STORE_POSTION
create table WAREHOUSE_STORE_POSTION (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    WAREHOUSE_ID varchar(32) not null,
    POSITION_NUMBER varchar(6) not null,
    POSITION_NAME varchar(50),
    MATERIAL_ID varchar(32),
    MAX_WEIGHT decimal(19, 2),
    MAX_CUBAGE decimal(19, 2),
    DESCRIPTION longtext,
    --
    primary key (ID)
)^
-- end WAREHOUSE_STORE_POSTION
-- begin WAREHOUSE_SUPPLY
create table WAREHOUSE_SUPPLY (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    SUPPLY_NAME varchar(50) not null,
    ADDRESS varchar(70),
    CONTACTER varchar(10),
    TELEPHONE varchar(10),
    CELL_PHONE varchar(13),
    EMAIL varchar(30),
    --
    primary key (ID)
)^
-- end WAREHOUSE_SUPPLY
-- begin WAREHOUSE_CUSTOMER
create table WAREHOUSE_CUSTOMER (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    CUSTOMER_NAME varchar(20),
    COMPANY varchar(50),
    ADDRESS varchar(70),
    CELL_PHONE varchar(13),
    TELEPHONE varchar(20),
    --
    primary key (ID)
)^
-- end WAREHOUSE_CUSTOMER
-- begin WAREHOUSE_STAFF
create table WAREHOUSE_STAFF (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    STAFF_NUMBER varchar(255) not null,
    NAME varchar(10) not null,
    CELL_PHONE varchar(11),
    IN_COMPANY_DATE date,
    ADDRESS varchar(255),
    EMAIL varchar(30),
    --
    primary key (ID)
)^
-- end WAREHOUSE_STAFF
-- begin WAREHOUSE_IN_STORE_ORDER
create table WAREHOUSE_IN_STORE_ORDER (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    IN_STORE_NUMBER varchar(50),
    SUPPLY_ID varchar(32),
    BATCH_NUMBER varchar(255),
    STAFF_ID varchar(32) not null,
    COMMENT_ longtext,
    --
    primary key (ID)
)^
-- end WAREHOUSE_IN_STORE_ORDER
-- begin WAREHOUSE_IN_ORDER_DETAIL
create table WAREHOUSE_IN_ORDER_DETAIL (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    MATERIAL_ID varchar(32) not null,
    QUANTITY decimal(19, 2) not null,
    STORE_POSITION_ID varchar(32),
    --
    primary key (ID)
)^
-- end WAREHOUSE_IN_ORDER_DETAIL
-- begin WAREHOUSE_OUT_STORE_ORDER
create table WAREHOUSE_OUT_STORE_ORDER (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    OUT_STORE_NUMBER varchar(50),
    CUSTOMER_ID varchar(32),
    STAFF_ID varchar(32) not null,
    COMMENT_ longtext,
    --
    primary key (ID)
)^
-- end WAREHOUSE_OUT_STORE_ORDER
-- begin WAREHOUSE_OUT_ORDER_DETAIL
create table WAREHOUSE_OUT_ORDER_DETAIL (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    MATERIAL_ID varchar(32) not null,
    QUANTITY decimal(19, 2) not null,
    --
    primary key (ID)
)^
-- end WAREHOUSE_OUT_ORDER_DETAIL
-- begin WAREHOUSE_IN_STORE_ORDER_IN_ORDER_DETAIL_LINK
create table WAREHOUSE_IN_STORE_ORDER_IN_ORDER_DETAIL_LINK (
    IN_STORE_ORDER_ID varchar(32),
    IN_ORDER_DETAIL_ID varchar(32),
    primary key (IN_STORE_ORDER_ID, IN_ORDER_DETAIL_ID)
)^
-- end WAREHOUSE_IN_STORE_ORDER_IN_ORDER_DETAIL_LINK
-- begin WAREHOUSE_OUT_STORE_ORDER_OUT_ORDER_DETAIL_LINK
create table WAREHOUSE_OUT_STORE_ORDER_OUT_ORDER_DETAIL_LINK (
    OUT_STORE_ORDER_ID varchar(32),
    OUT_ORDER_DETAIL_ID varchar(32),
    primary key (OUT_STORE_ORDER_ID, OUT_ORDER_DETAIL_ID)
)^
-- end WAREHOUSE_OUT_STORE_ORDER_OUT_ORDER_DETAIL_LINK
