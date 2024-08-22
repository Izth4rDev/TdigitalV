SELECT m.mascota_nombre, me.medico_nombre, me.medico_apellidos,ta.tipo_atencion_descripcion
FROM mascota m
    INNER JOIN atencion a ON m.mascota_id = a.mascota_id
    INNER JOIN tipo_atencion ta ON a.tipo_atencion_id = ta.tipo_atencion_id
    INNER JOIN medico me ON a.medico_id = me.medico_id
    INNER JOIN sucursal s ON a.sucursal_id = s.sucursal_id
WHERE a.sucursal_id = 1;