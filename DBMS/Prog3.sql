declare
v_no number;
begin
select ssn into v_no from employee where firstname='Franklin';
dbms_output.put_line(v_no);
end;
/