declare
v_name employee.firstname%type;
v_ssn employee.ssn%type;
cursor emp_c is select firstname,ssn from employee;
begin
open emp_c;
for i in 1..5 loop
fetch emp_c into v_name,v_ssn;
exit when emp_c%rowcount>4;
dbms_output.put_line(v_name);
end loop;
close emp_c;
end;
/