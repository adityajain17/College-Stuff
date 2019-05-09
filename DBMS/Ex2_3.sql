declare
num number;
rev number:=0;
rem number;
begin
num:=&num;
while (num>0)
LOOP
rem:=mod(num,10);
rev:=(rev*10)+rem;
num:=trunc(num/10);
end LOOP;
dbms_output.put_line('Reversed Number is '||rev);
end;
/