SELECT s.sucursal_id, s.sucursal_nombre, m.medico_nombre, m.medico_apellidos
FROM sucursal s INNER JOIN medico_sucursal ms ON ms.sucursal_id = s.sucursal_id
INNER JOIN medico m ON ms.medico_id = m.medico_id
WHERE s.sucursal_id = 1;