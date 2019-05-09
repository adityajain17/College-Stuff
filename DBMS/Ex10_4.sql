create or replace function fact(n in number)
return number
is
fact number;
num number;
begin
num:=n;
fact:=1;
if(num<0)
then
dbms_output.put_line('Invalid Input');
return -1;
else
while(num>0)
loop
fact:=fact*num;
num:=num-1;
end loop;
return fact;
end if;
end;
/