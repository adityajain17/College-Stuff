declare
c_id number;
cname varchar2(20);
begin
c_id:=&c_id;
cname:='&cname';
update chef set chefname=cname where chefid=c_id;
dbms_output.put_line('record updated');
end;
/