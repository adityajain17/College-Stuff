create or replace trigger test after update on employee
for each row
begin
dbms_output.put_line('Before Updating '|| :old.firstname);
dbms_output.put_line('After  Updating '|| :new.firstname);
end;
/