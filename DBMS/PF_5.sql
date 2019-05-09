DECLARE 
   a number;
   fact number;
   num number;
PROCEDURE squareNum(x IN number) IS 
BEGIN 
  num:=x;
  fact:=1;
  while(num>0)
  loop
  fact:=fact*num;
  num:=num-1;
  end loop;
  dbms_output.put_line(fact);
END;
BEGIN 
   a:= 5; 
   squareNum(a);  
END; 
/