SELECT i.inventario_nombre,i.inventario_marca,t.tipo_producto_descripcion,s.sucursal_nombre
FROM inventario  i INNER JOIN tipo_producto t ON i.tipo_producto_id = t.tipo_producto_id
INNER JOIN sucursal s ON i.sucursal_id = s.sucursal_id
WHERE i.sucursal_id = 2;