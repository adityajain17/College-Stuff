create or replace function employer return varchar2
is
ename varchar2(20);
begin
select firstname into ename from employee where ssn ='543216789';
return ename;
end;
/