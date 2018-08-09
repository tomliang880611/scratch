SET DATABASE SQL SYNTAX ORA TRUE;

--drop TABLE MY_USER;

create table MY_USER (
  id number (15, 0),
  name VARCHAR2(255 CHAR),
  age NUMBER(15,0)
);

commit;