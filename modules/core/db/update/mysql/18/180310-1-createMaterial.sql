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
    TYPE_ID varchar(32),
    UNIT_ID varchar(32),
    QUANTITY decimal(19, 2),
    --
    primary key (ID)
);
