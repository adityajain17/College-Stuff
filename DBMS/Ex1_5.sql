begin
delete from employee where salary<2000;
dbms_output.put_line('Records Deleted');
end;
/