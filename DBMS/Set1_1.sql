declare
cursor pa is select * from parts;
begin
for rec in pa
loop
if rec.pname='screw'
then
update parts set cost=cost+0.15*cost where pid=rec.pid;
elsif rec.pname='bolt'
then
update parts set cost=cost+0.1*cost where pid=rec.pid;
else
update parts set cost=cost+0.2*cost where pid=rec.pid;
end if;
end loop;
end;
/