declare
v_no employee.ssn%type;
v_name varchar2(10):='venkat';
name v_name%type;
begin
v_no:=10;
name:='ven';
dbms_output.put_line(v_no);
dbms_output.put_line(name);
end;
/ 