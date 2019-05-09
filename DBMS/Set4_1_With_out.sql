create or replace procedure get_info (re date)
is
saname varchar(20);
boatname varchar(20);
col varchar(20);
begin
select sname,bname,color into saname,boatname,col from sailor natural join reserves natural join boats where day=re;
dbms_output.put_line(saname);
dbms_output.put_line(boatname);
dbms_output.put_line(col);
end;
/