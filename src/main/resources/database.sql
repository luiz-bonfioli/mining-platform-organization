
    create table mining_platform.category (
       id uuid not null,
        created_by uuid,
        created_date int8 not null,
        last_modified_by uuid,
        last_modified_date int8 not null,
        entity_status varchar(255) not null,
        name varchar(255) not null,
        primary key (id)
    )

    create table mining_platform.change_log (
       id uuid not null,
        created_by uuid,
        created_date int8 not null,
        last_modified_by uuid,
        last_modified_date int8 not null,
        entity_status varchar(255) not null,
        company_token varchar(255) not null,
        execution_date timestamp not null,
        execution_status varchar(255) not null,
        version varchar(255) not null,
        primary key (id)
    )

    create table mining_platform.checklist (
       id uuid not null,
        created_by uuid,
        created_date int8 not null,
        last_modified_by uuid,
        last_modified_date int8 not null,
        entity_status varchar(255) not null,
        name varchar(255) not null,
        primary key (id)
    )

    create table mining_platform.checklist_entry (
       id uuid not null,
        created_by uuid,
        created_date int8 not null,
        last_modified_by uuid,
        last_modified_date int8 not null,
        entity_status varchar(255) not null,
        primary key (id)
    )

    create table mining_platform.checklist_item (
       id uuid not null,
        created_by uuid,
        created_date int8 not null,
        last_modified_by uuid,
        last_modified_date int8 not null,
        entity_status varchar(255) not null,
        name varchar(255) not null,
        checklist_id uuid not null,
        primary key (id)
    )

    create table mining_platform.company (
       id uuid not null,
        created_by uuid,
        created_date int8 not null,
        last_modified_by uuid,
        last_modified_date int8 not null,
        entity_status varchar(255) not null,
        name varchar(255) not null,
        primary key (id)
    )

    create table mining_platform.device (
       id uuid not null,
        created_by uuid,
        created_date int8 not null,
        last_modified_by uuid,
        last_modified_date int8 not null,
        entity_status varchar(255) not null,
        serial_number varchar(255) not null,
        primary key (id)
    )

    create table mining_platform.equipment (
       id uuid not null,
        created_by uuid,
        created_date int8 not null,
        last_modified_by uuid,
        last_modified_date int8 not null,
        entity_status varchar(255) not null,
        name varchar(255) not null,
        short_name varchar(255) not null,
        category_id uuid not null,
        model_id uuid not null,
        primary key (id)
    )

    create table mining_platform.inbound (
       id uuid not null,
        created_by uuid,
        created_date int8 not null,
        last_modified_by uuid,
        last_modified_date int8 not null,
        entity_status varchar(255) not null,
        content bytea not null,
        inbound_status varchar(255),
        package_number int4 not null,
        transaction_id uuid,
        primary key (id)
    )

    create table mining_platform.location (
       id uuid not null,
        created_by uuid,
        created_date int8 not null,
        last_modified_by uuid,
        last_modified_date int8 not null,
        entity_status varchar(255) not null,
        name varchar(255) not null,
        primary key (id)
    )

    create table mining_platform.material (
       id uuid not null,
        created_by uuid,
        created_date int8 not null,
        last_modified_by uuid,
        last_modified_date int8 not null,
        entity_status varchar(255) not null,
        name varchar(255) not null,
        primary key (id)
    )

    create table mining_platform.model (
       id uuid not null,
        created_by uuid,
        created_date int8 not null,
        last_modified_by uuid,
        last_modified_date int8 not null,
        entity_status varchar(255) not null,
        name varchar(255) not null,
        primary key (id)
    )

    create table mining_platform.operator (
       id uuid not null,
        created_by uuid,
        created_date int8 not null,
        last_modified_by uuid,
        last_modified_date int8 not null,
        entity_status varchar(255) not null,
        name varchar(255) not null,
        primary key (id)
    )

    create table mining_platform.organization (
       id uuid not null,
        created_by uuid,
        created_date int8 not null,
        last_modified_by uuid,
        last_modified_date int8 not null,
        entity_status varchar(255) not null,
        description varchar(255) not null,
        name varchar(255) not null,
        primary key (id)
    )

    create table mining_platform.outbound (
       id uuid not null,
        created_by uuid,
        created_date int8 not null,
        last_modified_by uuid,
        last_modified_date int8 not null,
        entity_status varchar(255) not null,
        content bytea not null,
        package_number int4 not null,
        transaction_id uuid,
        primary key (id)
    )

    create table mining_platform.site (
       id uuid not null,
        created_by uuid,
        created_date int8 not null,
        last_modified_by uuid,
        last_modified_date int8 not null,
        entity_status varchar(255) not null,
        name varchar(255) not null,
        primary key (id)
    )

    create table mining_platform.team (
       id uuid not null,
        created_by uuid,
        created_date int8 not null,
        last_modified_by uuid,
        last_modified_date int8 not null,
        entity_status varchar(255) not null,
        name varchar(255) not null,
        primary key (id)
    )

    create table mining_platform.topic (
       id uuid not null,
        created_by uuid,
        created_date int8 not null,
        last_modified_by uuid,
        last_modified_date int8 not null,
        entity_status varchar(255) not null,
        application varchar(255) not null,
        exchange varchar(255) not null,
        exchange_type varchar(255) not null,
        instance uuid,
        auto_delete boolean not null,
        durable boolean not null,
        single_active_consumer boolean not null,
        topic varchar(255) not null,
        topic_type varchar(255) not null,
        primary key (id)
    )

    create table mining_platform.transaction (
       id uuid not null,
        created_by uuid,
        created_date int8 not null,
        last_modified_by uuid,
        last_modified_date int8 not null,
        entity_status varchar(255) not null,
        event_id int2 not null,
        number_of_packages int4 not null,
        service_id int2 not null,
        transaction_status varchar(255) not null,
        transaction_type varchar(255) not null,
        primary key (id)
    )

    create table mining_platform.unit (
       id uuid not null,
        created_by uuid,
        created_date int8 not null,
        last_modified_by uuid,
        last_modified_date int8 not null,
        entity_status varchar(255) not null,
        name varchar(255) not null,
        primary key (id)
    )

    create table mining_platform.user (
       id uuid not null,
        created_by uuid,
        created_date int8 not null,
        last_modified_by uuid,
        last_modified_date int8 not null,
        entity_status varchar(255) not null,
        name varchar(255) not null,
        primary key (id)
    )

    alter table if exists mining_platform.topic 
       add constraint topic_topic_type_uk unique (topic, topic_type)

    alter table if exists mining_platform.checklist_item 
       add constraint checklist_fk 
       foreign key (checklist_id) 
       references mining_platform.checklist

    alter table if exists mining_platform.equipment 
       add constraint category_fk 
       foreign key (category_id) 
       references mining_platform.category

    alter table if exists mining_platform.equipment 
       add constraint model_fk 
       foreign key (model_id) 
       references mining_platform.model

    alter table if exists mining_platform.inbound 
       add constraint transaction_fk 
       foreign key (transaction_id) 
       references mining_platform.transaction

    alter table if exists mining_platform.outbound 
       add constraint transaction_fk 
       foreign key (transaction_id) 
       references mining_platform.transaction
