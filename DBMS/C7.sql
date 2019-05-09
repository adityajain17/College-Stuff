declare
cursor emp_cursor is select * from employee;
emp_record emp_cursor%ROWTYPE;
begin
if not emp_cursor%ISOPEN then
open emp_cursor;
end if;
for emp_record in emp_cursor
loop
dbms_output.put_line(emp_record.ssn || ' ' ||emp_record.firstname);
end loop;
close emp_cursor;
end;
/
