
    create table mining_platform.equipment (
       id uuid not null,
        created_by uuid,
        created_date int8 not null,
        last_modified_by uuid,
        last_modified_date int8 not null,
        entity_status varchar(255) not null,
        name varchar(255) not null,
        short_name varchar(255) not null,
        primary key (id)
    )

    create table mining_platform.location (
       id uuid not null,
        created_by uuid,
        created_date int8 not null,
        last_modified_by uuid,
        last_modified_date int8 not null,
        entity_status varchar(255) not null,
        primary key (id)
    )

    create table mining_platform.material (
       id uuid not null,
        created_by uuid,
        created_date int8 not null,
        last_modified_by uuid,
        last_modified_date int8 not null,
        entity_status varchar(255) not null,
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

    create table mining_platform.site (
       id uuid not null,
        created_by uuid,
        created_date int8 not null,
        last_modified_by uuid,
        last_modified_date int8 not null,
        entity_status varchar(255) not null,
        description varchar(255) not null,
        name varchar(255) not null,
        organization_id uuid,
        primary key (id)
    )

    create table mining_platform.team (
       id uuid not null,
        created_by uuid,
        created_date int8 not null,
        last_modified_by uuid,
        last_modified_date int8 not null,
        entity_status varchar(255) not null,
        primary key (id)
    )

    create table mining_platform.unit (
       id uuid not null,
        created_by uuid,
        created_date int8 not null,
        last_modified_by uuid,
        last_modified_date int8 not null,
        entity_status varchar(255) not null,
        primary key (id)
    )

    create table mining_platform.user (
       id uuid not null,
        created_by uuid,
        created_date int8 not null,
        last_modified_by uuid,
        last_modified_date int8 not null,
        entity_status varchar(255) not null,
        primary key (id)
    )

    alter table if exists mining_platform.site 
       add constraint organization_fk 
       foreign key (organization_id) 
       references mining_platform.organization
