begin
for emp_rec in (select * from employee natural join department)
loop
dbms_output.put_line('SSN:' || emp_rec.ssn || ' FirstName ' || emp_rec.firstname || ' DepartmentName ' || emp_rec.departmentname || ' Department Number: '|| emp_rec.departmentnumber);
end loop;
end;
/