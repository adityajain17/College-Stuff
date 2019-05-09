declare
cursor emp_cursor is select ssn,firstname from employee where departmentnumber=4;
begin
for emp_record in emp_cursor
loop
dbms_output.put_line(emp_record.ssn || '  '|| emp_record.firstname);
end loop;
end;
/