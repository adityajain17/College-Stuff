declare
begin
insert into chef values(&c,'&cn');
dbms_output.put_line('record inserted');
end;
/