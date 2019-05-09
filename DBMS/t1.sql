begin
for rec in (select departmentname from employee natural join department where firstname='Joyce')
loop
dbms_output.put_line(rec.departmentname);
end loop;
end;
/