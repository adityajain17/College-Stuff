create or replace function search(pi in number)
return float
is
x float;
begin
select cost into x from parts where pid=pi;
return x;
end;
/
