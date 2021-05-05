create sequence hibernate_sequence start 1 increment 1;

create table student_groups (
    id int8 not null,
    name varchar(255),
    primary key (id)
);

create table students (
    id int8 not null,
    date_of_birth date,
    first_name varchar(255),
    last_name varchar(255),
    patronymic varchar(255),
    group_id int8 not null,
    primary key (id)
);

alter table if exists students
    add constraint students_student_groups_fk
    foreign key (group_id) references student_groups;