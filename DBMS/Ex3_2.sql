declare
num number;
result number:=0;
i number:=1;
begin
num:=&num;
while(i<=num)
loop
result:=result + i;
i:=i+2;
end loop;
dbms_output.put_line('The sum is '|| result);
end;
/