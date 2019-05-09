declare
cursor stu_cursor is select * from student;
srec stu_cursor%ROWTYPE;
begin
for srec in (select * from student)
loop
dbms_output.put_line('SID ' || srec.sid || ' SNAME '|| srec.sname || ' CLASS ' || srec.class);
end loop;
end;
/