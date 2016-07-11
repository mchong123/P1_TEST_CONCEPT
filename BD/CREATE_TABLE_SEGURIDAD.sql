---------------------
--  TABLA LOGIN : Esta tabla almacenara datos de usuarios que se crearan y que puedan ingresar al sistema
--  CAMPO ESTADO
--  1 --> ACTIVO
--  2 --> BLOQUEADO
--  3 --> CANCELADO
---------------------

CREATE TABLE SEGURIDAD.LOGIN(
ID_LOGIN VARCHAR2(10) PRIMARY KEY USING INDEX (CREATE INDEX LOGIN_ID_IDX
                                                  ON SEGURIDAD.LOGIN(ID_LOGIN)),
USUARIO VARCHAR2(20) UNIQUE USING INDEX(CREATE INDEX LOGIN_USUARIO_IDX
                                                  ON SEGURIDAD.LOGIN(USUARIO)),
CLAVE VARCHAR2(20),

ESTADO VARCHAR2(1), 

CONSTRAINT LOGIN_ESTADO_CK CHECK (ESTADO BETWEEN 1 AND 3)
)


