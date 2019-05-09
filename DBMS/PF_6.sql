create or replace PROCEDURE squareNum(x IN number) IS 
t number;
BEGIN 
  t:=x*x;
  dbms_output.put_line(t); 
END;
/