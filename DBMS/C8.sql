declare
cursor emp_cursor(dep number) is select ssn,firstname from employee where departmentnumber=dep;
begin
for emp_rec in emp_cursor(4)
loop
dbms_output.put_line(emp_rec.ssn || '     ' ||emp_rec.firstname);
end loop;
dbms_output.put_line('New Department');
for emp_rec in emp_cursor(5)
loop
dbms_output.put_line(emp_rec.ssn || '     ' ||emp_rec.firstname);
end loop;
end;
/