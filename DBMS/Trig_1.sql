create or replace trigger mytrig2
after delete or insert or update on employee
for each row
begin
if deleting then
insert into xemployee (ssn,lastname,firstname,deldate) values(:old.ssn,:old.lastname,:old.firstname,sysdate);
elsif inserting then
insert into nemployee (ssn,lastname,firstname,adddate) values(:new.ssn,:new.lastname,:new.firstname,sysdate);
elsif updating('salary') then
insert into cemployee (ssn,oldsalary,newsalary,update) values(:old.ssn,:old.salary,:new.salary,sysdate);
else
insert into uemployee (ssn,address,up_date) values (:old.ssn,:new.address,sysdate);
end if;
end;
/
