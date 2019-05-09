declare
empno employee.ssn%type;
ename employee.firstname%type;
cursor emp_cursor is select ssn,firstname from employee;
begin
open emp_cursor;
loop
fetch emp_cursor into empno,ename;
exit when emp_cursor%ROWCOUNT>10 or emp_cursor%NOTFOUND;
dbms_output.put_line(to_char(empno) || ' ' || ename);
end loop;
close emp_cursor;
end;
/