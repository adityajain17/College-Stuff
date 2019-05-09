declare
cursor emp_cursor is select * from employee;
begin
for emp_rec in emp_cursor
loop
dbms_output.put_line('SSN:' || emp_rec.ssn || ' First Name: ' ||emp_rec.firstname || ' Last Name: ' ||emp_rec.lastname|| ' Salary: ' || emp_rec.salary);
end loop;
end;
/