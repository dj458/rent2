CREATE SEQUENCE equipments_id_seq;


create table equipments (
    id bigint not null DEFAULT NEXTVAL('equipments_id_seq'),
    price_value varchar(255),

    primary key (id)
);



ALTER SEQUENCE equipments_id_seq OWNED BY equipments.id;