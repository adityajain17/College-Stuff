declare
v_name varchar2(20);
v_regno number;
begin
v_name:='Aditya Jain';
v_regno:='66';
dbms_output.put_line('the name is ' || v_name);
dbms_output.put_line('the no is ' || v_regno);
end;
/