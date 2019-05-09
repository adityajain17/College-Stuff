declare
i number:=1;
j number:=0;
c number:=0;
d number:=0;
begin
while i<=100
loop
c:=0;
d:=0;
j:=1;
while j<=i
loop
d:=mod(i,j);
if d=0
then
c:=c+1;
end if;
j:=j+1;
end loop;
if c=2
then
dbms_output.put_line(i);
end if;
i:=i+1;
end loop;
end;
/