DECLARE
CURSOR emp_cursor IS SELECT ssn,firstname FROM employee WHERE departmentnumber=2;
empno employee.ssn%type;
fname employee.firstname%type;
begin
open emp_cursor;
loop
fetch emp_cursor into empno,fname;
dbms_output.put_line(empno || ' '|| fname);
exit when emp_cursor%NOTFOUND;
end loop;
close emp_cursor;
end;
/