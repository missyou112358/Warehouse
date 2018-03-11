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
);
