declare
s number:=0;
n number;
begin
n:=&n;
while n>0
loop
s:=s+n;
n:=n-1;
end loop;
dbms_output.put_line('Sum is ' ||s);
end;
/