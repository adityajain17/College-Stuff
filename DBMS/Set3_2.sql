declare
r number;
d number;
n number;
begin
n:=&n;
r:=0;
d:=0;
while n>0
loop
d:=mod(n,10);
r:=r*10+d;
n:=trunc(n/10);
end loop;
dbms_output.put_line('Reverse of the above number is ' || r);
end;
/