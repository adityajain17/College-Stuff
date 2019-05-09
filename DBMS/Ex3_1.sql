declare
num number:=100;
begin
while num>0
loop
dbms_output.put_line(num);
num:=num-1;
end loop;
end;
/