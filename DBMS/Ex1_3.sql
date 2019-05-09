begin
delete from empcopy where round((sysdate-birthday)/365,0)>60;
dbms_output.put_line('Records Deleted');
end;
/