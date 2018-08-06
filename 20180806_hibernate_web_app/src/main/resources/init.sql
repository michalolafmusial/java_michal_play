CREATE SCHEMA IF NOT EXISTS homework6zad1;
USE homework6zad1;

CREATE TABLE IF NOT EXISTS homework6zad1.users (
  id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
  login VARCHAR (100) NOT NULL,
  password VARCHAR (100) NOT NULL,
  name VARCHAR (100) NOT NULL,
  surname VARCHAR (100) NOT NULL,
  age INT NOT NULL,
  gender VARCHAR (100) NOT NULL,
  status VARCHAR (100) DEFAULT 'W'
);

ALTER TABLE homework6zad1.users ADD CONSTRAINT CK_users_status
    CHECK (status IN ('A', 'W', 'D', 'B'));

insert into homework6zad1.users (login, password, name, surname, age, gender, status)
values ('michalm1','xddd','michal','musial',13,'MAN','W');
insert into homework6zad1.users (login, password, name, surname, age, gender, status)
values ('marcinm1','dssd','marcin','doka',13,'MAN','W');
insert into homework6zad1.users (login, password, name, surname, age, gender, status)
values ('johnm1','xddcxxcd','john','joka',13,'MAN','W');
insert into homework6zad1.users (login, password, name, surname, age, gender, status)
values ('marekm1','cxxc','marek','baba',13,'MAN','W');
insert into homework6zad1.users (login, password, name, surname, age, gender, status)
values ('zenonm1','wee','zenon','ona',13,'MAN','W');
insert into homework6zad1.users (login, password, name, surname, age, gender, status)
values ('justyna1m','rfd','justyna','why',13,'WOMAN','W');
insert into homework6zad1.users (login, password, name, surname, age, gender, status)
values ('agam1','vgd','aga','so',13,'WOMAN','W');
insert into homework6zad1.users (login, password, name, surname, age, gender, status)
values ('olam1','edx','ola','empty',13,'WOMAN','W');
insert into homework6zad1.users (login, password, name, surname, age, gender, status)
values ('majam1','dfgr','maja','queen',13,'WOMAN','W');
insert into homework6zad1.users (login, password, name, surname, age, gender, status)
values ('polaa1','erfd','pola','get',13,'WOMAN','W');

commit;


-- select * from homework6zad1.users;
