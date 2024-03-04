    create table persons
    (
        name           varchar(30) not null,
        surname        varchar(50) not null,
        age            int check ( age > 0 and age < 100),
        phone_number   varchar(11)  not null,
        city_of_living varchar(20),
        primary key (name, surname, age)
    );

insert into persons(name, surname, age, phone_number, city_of_living)
values('John','Brown',15,'555768','London') ,
      ('Peter','Petrov',20,'9166756437','Moscow') ,
      ('Mary','Green',99,'7658732','Paris') ,
      ('Denis','Golubev',58,'9362637482','Moscow') ,
      ('Kate','Katina',86,'9187362736','Moscow') ,
      ('Bill','Wood',13,'37637473','Madrid') ;