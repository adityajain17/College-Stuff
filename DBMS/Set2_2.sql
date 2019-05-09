declare
n number;
a number:=0;
b number:=1;
c number:=1;
i number:=0;
begin
n:=&n;
dbms_output.put_line('Fibonacci Series: ');
dbms_output.put_line(a);
dbms_output.put_line(b);
dbms_output.put_line(c);
i:=1;
while i<=n-3
loop
a:=b;
b:=c;
c:=a+b;
dbms_output.put_line(c);
i:=i+1;
end loop;
end;
/