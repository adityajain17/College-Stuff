declare
v_num1 integer;
v_num2 integer;
v_result integer;
begin
v_num1:=&v_num1;
v_num2:=&v_num2;
v_result:=v_num1/v_num2;
dbms_output.put_line('V_Result ' || v_result);
exception
when zero_divide
then
dbms_output.put_line('A number cannot be divided by zero');
end;
/