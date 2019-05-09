declare
v_sal number;
begin
v_sal:=&v_sal;
delete from job_grade where lowest_sal=v_sal;
dbms_output.put_line('record deleted');
end;
/