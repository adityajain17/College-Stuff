declare
t varchar2(20);
function test return varchar2
is
msg varchar2(20);
begin
msg:='Hello';
return msg;
end test;
begin
t:=test();
dbms_output.put_line(t);
end;
/