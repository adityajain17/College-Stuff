declare
v_sal number;
begin
v_sal:=&v_sal;
update job_grade set lowest_sal=v_sal where gra='a';
dbms_output.put_line('record updated');
end;
/