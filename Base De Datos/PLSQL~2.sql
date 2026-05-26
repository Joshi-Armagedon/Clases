CREATE OR REPLACE PROCEDURE sp_cambio
       (p_nombre varchar, p_id number)
      IS
      v_conteo number;
      BEGIN
        SELECT COUNT(*)
        INTO v_conteo
        FROM MONITO
        WHERE id_monito = p_id;
        
        IF v_conteo > 0 THEN
          UPDATE Monito
          SET nombre = p_nombre
          WHERE id_monito = p_id;
        ELSE
            dbms_output.put_line('El usuario no existe');
        END IF;
      END sp_cambio;

select * from Monito;

exec sp_cambio('Meow',12)