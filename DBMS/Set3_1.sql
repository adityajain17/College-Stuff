create or replace function get_details (name varchar,re date)
return varchar
is
ans varchar(20);
begin
select bname into ans from boats where bid in (select bid from reserves natural join sailor where sname=name and day=re);
return ans;
end;
/