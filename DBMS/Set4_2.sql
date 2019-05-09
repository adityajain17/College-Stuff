declare
n number;
fact number:=1;
begin
n:=&n;
while n>0
loop
fact:=fact*n;
n:=n-1;
end loop;
dbms_output.put_line('Factorial is ' || fact);
end;
/