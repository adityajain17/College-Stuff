declare
num_1 number;
num_2 number;
num_3 number;
begin
num_1:=&num_1;
num_2:=&num_2;
num_3:=&num_3;
if (num_1>=num_2) AND (num_1>=num_3)
then
dbms_output.put_line(num_1 || ' is greatest');
elsif (num_2>=num_1) AND (num_2>=num_3)
then
dbms_output.put_line(num_2 || ' is greatest');
elsif (num_3>=num_1) AND (num_3>=num_2)
then
dbms_output.put_line(num_3 || ' is greatest');
else
dbms_output.put_line('All are equal');
END IF;
end;
/
