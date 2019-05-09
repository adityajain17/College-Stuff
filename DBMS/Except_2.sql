declare
v_dep number;
wdep exception;
begin
v_dep:=&v_dep;
if(v_dep<0)
then
raise wdep;
else
for rec in (select ssn,firstname from employee where departmentnumber=v_dep)
LOOP
dbms_output.put_line(rec.ssn || ' '|| rec.firstname);
END LOOP;
end if;
exception
WHEN wdep
THEN
dbms_output.put_line('Invalid department number');
end;
/ 