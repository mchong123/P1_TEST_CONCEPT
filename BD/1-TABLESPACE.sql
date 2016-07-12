
-----------------------
-- Descripcion: Para ejecutar exitosamente estos script crear las carpetas que figuran en el codigo. users y index en la ruta especificada.
-- Crea el TableSpace para alojar a los esquemas
-----------------------

create tablespace TS_USER
Datafile 'D:\tablespace\users\TS_USER.ora'
size 3m
extent management local autoallocate;

/
----------------------
--Crea el tableSpace para alojar todos los indices
----------------------
create tablespace TS_INDEX
Datafile 'D:\tablespace\index\TS_INDEX.ora'
size 3m
extent management local autoallocate;


