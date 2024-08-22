SELECT s.sucursal_nombre,
       me.medico_nombre,
       me.medico_apellidos,
       COUNT(a.atencion_id) AS cantidad_cirugias
FROM atencion a
         INNER JOIN sucursal s ON a.sucursal_id = s.sucursal_id
         INNER JOIN medico me ON a.medico_id = me.medico_id
         INNER JOIN tipo_atencion ta ON a.tipo_atencion_id = ta.tipo_atencion_id
WHERE ta.tipo_atencion_descripcion = 'Cirugia'
GROUP BY s.sucursal_nombre, me.medico_nombre, me.medico_apellidos
ORDER BY cantidad_cirugias DESC
LIMIT 10;
