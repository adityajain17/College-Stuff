declare
fname varchar2(50);
lname varchar2(50);
begin
for rec in (select ssn,firstname,lastname from employee where salary>1000)
LOOP
dbms_output.put_line(rec.ssn || '  ' || rec.firstname || '  ' || rec.lastname);
END LOOP;
end;
/