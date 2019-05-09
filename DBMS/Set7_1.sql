create or replace procedure emp_rec 
is
begin
for rec in (select * from sailors where age=(select min(age) from sailors))
loop
dbms_output.put_line('SID '|| rec.sid || ' Sname ' ||rec.sname);
end loop;
end emp_rec;
/