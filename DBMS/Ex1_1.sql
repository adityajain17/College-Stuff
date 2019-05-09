declare
empno employee.ssn%type;
sal employee.salary%type;
begin
empno:='&empno';
select salary into sal from employee where ssn=empno;
dbms_output.put_line('Salary is : ' || sal);
end;
/