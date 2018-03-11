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
);
