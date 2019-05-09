declare
v_ssn employee.ssn%type;
v_fname employee.firstname%type;
begin
select ssn,firstname into v_ssn,v_fname from employee where firstname='Robert';
dbms_output.put_line(v_ssn); 
dbms_output.put_line(v_fname);
end;
/