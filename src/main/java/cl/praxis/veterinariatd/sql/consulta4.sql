SELECT s.sucursal_nombre,
       tm.tipo_mascota_descripcion,
       COUNT(a.mascota_id) AS cantidad_mascotas_atendidas
FROM atencion a
         INNER JOIN sucursal s ON a.sucursal_id = s.sucursal_id
         INNER JOIN mascota m ON a.mascota_id = m.mascota_id
         INNER JOIN tipo_mascota tm ON m.tipo_mascota_id = tm.tipo_mascota_id
GROUP BY s.sucursal_id, tm.tipo_mascota_id;
