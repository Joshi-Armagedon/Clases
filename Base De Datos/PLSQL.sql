CREATE TABLE Monito(
    id_monito number(3),
    nombre varchar(10),
    edad number(2)
);

CREATE OR REPLACE PROCEDURE sp_altita
       (p_nombre varchar, p_edad number) 
      IS
      v_conteo number(2);
      BEGIN
        SELECT COUNT(*)
        INTO v_conteo
        FROM Monito
        WHERE nombre = p_nombre AND edad = p_edad;
        IF v_conteo > 0 THEN
            dbms_output.put_line('El registro ya existe');
        ELSE
            INSERT INTO Monito VALUES (sq_monito.nextval, p_nombre, p_edad);
            END IF;
      END;

CREATE SEQUENCE sq_monito
START WITH 10
INCREMENT BY 1;