declare
t employee.ssn%type;
name employee.firstname%type;
procedure query_emp (p_id IN employee.ssn%type,p_name out employee.firstname%type)
is
begin
select firstname into p_name from employee where ssn=p_id;
end query_emp;
begin
t:='&t';
query_emp(t,name);
dbms_output.put_line(name);
end;
/