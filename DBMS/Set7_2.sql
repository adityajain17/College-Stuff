declare
n number;
s number:=0;
d number:=0;
num number;
begin
n:=&n;
num:=n;
while n>0
loop
d:=mod(n,10);
s:=s+power(d,3);
n:=trunc(n/10);
end loop;
dbms_output.put_line('Sum is ' || s);
if s=num
then
dbms_output.put_line('Armstrong Number');
else
dbms_output.put_line('Not a Armstrong Number');
end if;
end;
/