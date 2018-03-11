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
);
