---------------------------------------------------------------------------------------------------------
-- La creacion del usuario se realizara dentro del usuario con privilegios de system
-- Se le dara privilegios de dba solo por motivos de desarrollo
---------------------------------------------------------------------------------------------------------

CREATE USER SEGURIDAD IDENTIFIED BY welcome1 DEFAULT TABLESPACE TS_USER;
/

GRANT DBA TO SEGURIDAD
/


