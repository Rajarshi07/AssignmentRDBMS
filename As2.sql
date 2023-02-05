drop TABLE employee;
DROP table DEPARTMENT;
DROP table LOCATION;
DROP SEQUENCE SEQ_LOC_PK;

create table Employee( EmpId number, FirstName varchar2(20), LastName varchar2(20), EmailId varchar2(40), Gender char(1), MobileNo char(10), DateOfJoining date default sysdate, DeptId int );

alter table employee add(Salary number(10,2));



alter table Employee modify FirstName varchar2(30);

alter table employee modify firstname varchar2(30) constraint Employee_FirstName_NN not null;

alter table employee modify lastname varchar2(30) constraint Employee_LastName_NN not null;


alter table employee add constraint Employee_Emailid_UN unique(Emailid);


alter table employee add constraint Employee_Mobile_UN unique(mobileno);

alter table employee add constraint employee_pk primary key(empid);


alter table employee add constraint employee_gender_chk check(gender in ('M', 'F'));

-- Department Table Creation
create table department( deptid number constraint dept_pk primary key, deptname varchar2(30) constraint dept_name_nn not null);

alter table employee add constraint employee_dept_ref foreign key(deptid) references department(deptid) on delete set null;

-- Insertions into Employee Table & Department Tables
insert into department values(1, 'IT');


insert into department values(2, 'SysAdmin');


insert into department values(3, 'Finance');


insert into employee values(101, 'FN1', 'LN1', 'user1@gmail.com', 'M', '9876543210', sysdate, 1, 29500);


insert into employee values(102, 'FN2', 'LN2', 'user2@gmail.com', 'F', '9876543211', sysdate, 1, 32000);


insert into employee values(103, 'FN3', 'LN3', 'user3@gmail.com', 'M', '9876543212', sysdate, 2, 31200);


insert into employee values(104, 'FN4', 'LN4', 'user4@gmail.com', 'F', '9876543213', sysdate, 2, 36000);


insert into employee values(105, 'FN5', 'LN5', 'user5@gmail.com', 'M', '9876543214', sysdate, 3, 45500);


insert into employee values(106, 'FN6', 'LN6', 'user6@gmail.com', 'F', '9876543215', sysdate, 3, 50000);

-- Location Table Creation
create table location( lid number(5) constraint location_pk primary key, city varchar2(20) );


-- Sequence Creation
create sequence SEQ_LOC_PK start with 1000 increment by 10 nomaxvalue nocycle cache 10;


-- Insertion into Location Table
insert into location values(SEQ_LOC_PK.nextval, 'LOC1');


insert into location values(SEQ_LOC_PK.nextval, 'LOC2');


insert into location values(SEQ_LOC_PK.nextval, 'LOC3');

-- Alterations to Department Table - Adding location column
alter table department add lid number(5);


alter table department add constraint department_loc_ref foreign key(lid) references location(lid) on delete set null;

select * from department;

update department set lid = 1000 where deptid = 1;


update department set lid = 1010 where deptid = 2;


update department set lid = 1020 where deptid = 3;

-- Creating new user & logging into it
alter session set "_ORACLE_SCRIPT"= true;


create user rajarshi identified by Oracle_1;


GRANT ALL PRIVILEGES to rajarshi;


disc

conn rajarshi/Oracle_1;

--  table join - employee, deptname & city
select e.firstname, d.deptname, l.city from SYSTEM.employee e natural join SYSTEM.department d natural join SYSTEM.location l;

-- empid, empname & salary of employees with highest & second highest salary
select empid, firstname, salary from SYSTEM.employee order by salary desc FETCH FIRST 2 ROWS ONLY;
