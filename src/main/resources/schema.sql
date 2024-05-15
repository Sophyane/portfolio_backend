-- Contact
create table IF NOT EXISTS contact(
    id serial primary key,
    firstName varchar(255) not null,
    lastName varchar(255) not null,
    email varchar(255) not null,
    telephone varchar(255) not null,
    subject varchar(255) not null,
    message varchar(255) not null
);

