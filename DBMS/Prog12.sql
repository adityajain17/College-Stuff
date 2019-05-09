declare
v_lsal job_grade.lowest_sal%type;
v_hsal job_grade.highest_sal%type;
begin
select sum(lowest_sal),sum(highest_sal) into v_lsal,v_hsal from job_grade;
dbms_output.put_line(v_lsal);
dbms_output.put_line(v_hsal);
end;
/