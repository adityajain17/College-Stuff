declare
mark1 number;
mark2 number;
mark3 number;
t number;
grade char(1);
begin
mark1:=&mark1;
mark2:=&mark2;
mark3:=&mark3;
t:=(mark1+mark2+mark3)/3;
case
when t<50 then grade:='F';
when t<60 then grade:='E';
when t<70 then grade:='D';
when t<80 then grade:='C';
when t<90 then grade:='B';
else grade:='A';
end case;
dbms_output.put_line('Grade is '|| grade);
end;
/
