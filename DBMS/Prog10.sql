<<outer>>
declare
v_a number:=3;
begin
declare
v_a number:=4;
begin
dbms_output.put_line(v_a);
dbms_output.put_line(outer.v_a);
end;
dbms_output.put_line(v_a);
end;
/