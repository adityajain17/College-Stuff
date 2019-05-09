begin
for emp_record in (select ssn,firstname from employee where departmentnumber=3)
loop
dbms_output.put_line(emp_record.ssn || ' ' || emp_record.firstname);
end loop;
end;
/