begin
select ssn into:a from employee where firstname='Robert';
dbms_output.put_line(:a);
end;
/