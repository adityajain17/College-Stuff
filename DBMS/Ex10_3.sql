create or replace function get_count(dname in varchar2)
return number
is
x number;
begin
select count(*) into x from employee natural join department where departmentname=dname group by departmentname;
return x;
end;
/
