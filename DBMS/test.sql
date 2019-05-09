DECLARE 
a number(2) := 1;
mark number;
BEGIN 
WHILE a <=3
LOOP 
mark:=&mark;
dbms_output.put_line(mark);
a := a + 1; 
END LOOP; 
END; 
/ 