declare
empssn employee.ssn%type;
begin
empssn:='&empssn';
delete from employee where ssn=empssn;
dbms_output.put_line('Record Deleted');
end;
/