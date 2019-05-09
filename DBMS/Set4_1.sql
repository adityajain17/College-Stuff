create or replace procedure get_info_1 (re date)
is
begin
for rec in (select sname,bname,color from sailor natural join reserves natural join boats where day=re)
loop
dbms_output.put_line(rec.sname);
dbms_output.put_line(rec.bname);
dbms_output.put_line(rec.color);
end loop;
end;
/