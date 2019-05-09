declare
ename employee.firstname%type;
procedure get_dept(emp_name in varchar2)
is
begin
for rec in (select departmentname from employee natural join department where firstname=emp_name)
loop
dbms_output.put_line(rec.departmentname);
end loop;
end get_dept;
begin
ename:='&ename';
dbms_output.put_line('Department Names are ');
get_dept(ename);
end;
/
