-- delete from tdes_sku;
create table if not exists tdes_sku (
    id bigint not null primary key auto_increment,
    tenant_code varchar(200),
    warehouse_code varchar(200),
    sku_code varchar(200),
    sku_name varchar(500)
);

-- delete from tdes_wave;
create table if not exists tdes_wave (
                                        id bigint not null primary key auto_increment,
                                        tenant_code varchar(200),
                                        warehouse_code varchar(200),
                                        wave_code varchar(200),
                                        wave_name varchar(500),
                                        wave_status int(4)
);

-- delete from tdes_stage;
create table if not exists tdes_stage (
                                         id bigint not null primary key auto_increment,
                                         tenant_code varchar(200),
                                         warehouse_code varchar(200),
                                         wave_code varchar(200),
                                         stage_code varchar(200),
                                         stageStatus int(11),
                                         hu_type bigint(11),
                                         next_stage_code varchar(200),
                                         next_hu_type bigint(11),
                                         next_depend_stage_status int(11)
);