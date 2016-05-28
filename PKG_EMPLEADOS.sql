CREATE OR REPLACE PACKAGE PKG_EMPLEADOS IS
 --Consulta lista de empleados por ID.
 PROCEDURE SP_EMPLEADOS_CONSULTAR_ID(P1 IN HR.EMPLOYEES.EMPLOYEE_ID%TYPE, P2 OUT SYS_REFCURSOR);
 
 END PKG_EMPLEADOS;
 /
CREATE OR REPLACE PACKAGE BODY PKG_EMPLEADOS IS

 PROCEDURE SP_EMPLEADOS_CONSULTAR_ID(P1 IN HR.EMPLOYEES.EMPLOYEE_ID%TYPE, P2 OUT SYS_REFCURSOR)
 IS
   
 BEGIN
 
 OPEN P2 FOR 
 SELECT EM.EMPLOYEE_ID,EM.FIRST_NAME, EM.LAST_NAME,EM.DEPARTMENT_ID
 FROM HR.EMPLOYEES EM
 WHERE EM.EMPLOYEE_ID = P1;
 
 END SP_EMPLEADOS_CONSULTAR_ID;
END PKG_EMPLEADOS;
/