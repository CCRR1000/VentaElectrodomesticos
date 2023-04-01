
/***********************************
 * ESTABLECIMIENTOS
 ***********************************/

INSERT INTO Espacios.Establecimiento VALUES ('B001','BODEGA','BODEGA','7a Avenida 7-77 zona 7');
INSERT INTO Espacios.Establecimiento VALUES ('S001','SUCURSAL CENTRAL','SUCURSAL','3a Avenida 3-33 zona 3');
INSERT INTO Espacios.Establecimiento VALUES ('S002','SUCURSAL NORTE','SUCURSAL','1a Avenida 1-11 zona 1');
INSERT INTO Espacios.Establecimiento VALUES ('S003','SUCURSAL SUR','SUCURSAL','5a Avenida 5-55 zona 5');



/***********************************
 * EMPLEADOS
 ***********************************/

/* ADMINISTRADORES */
INSERT INTO Personal.Empleado (usuario,contrasena,cui,rol,nombre,apellido,salario) VALUES ('ADMIN001','admin001','7586822852118','ADMINISTRADOR','Sofia Isabella','Garcia Martinez','10000.00');
INSERT INTO Personal.Empleado (usuario,contrasena,cui,rol,nombre,apellido,salario) VALUES ('ADMIN002','admin002','9554309510527','ADMINISTRADOR','Mateo Sebastian','Rodriguez Perez','10000.00');

/* ENCARGADOS DE BODEGA */
INSERT INTO Personal.Empleado VALUES ('BODEGA001','bodega001','2269346801801','BODEGA','B001','Camila Valentina','Hernandez Torres','8000.00');
INSERT INTO Personal.Empleado VALUES ('BODEGA002','bodega002','6822644130211','BODEGA','B001','Santiago Daniel','Flores Castro','8000.00');
INSERT INTO Personal.Empleado VALUES ('BODEGA003','bodega003','8749460581301','BODEGA','B001','Gabriela Victoria','Ramirez Diaz','8000.00');
INSERT INTO Personal.Empleado VALUES ('BODEGA004','bodega004','4714971532213','BODEGA','B001','Juan Carlos','Gomez Aguilar','8000.00');
INSERT INTO Personal.Empleado VALUES ('BODEGA005','bodega005','6856325451213','BODEGA','B001','Natalia Fernanda','Mendoza Sanchez','8000.00');

/* ENCARGADOS DE INVENTARIO */
INSERT INTO Personal.Empleado VALUES ('INVEN001','inven001','4861533900215','INVENTARIO','S001','Luis Alberto','Vargas Ortiz','6000.00');
INSERT INTO Personal.Empleado VALUES ('INVEN002','inven002','9387851950102','INVENTARIO','S001','Andrea Isabel','Gonzalez Flores','6000.00');
INSERT INTO Personal.Empleado VALUES ('INVEN003','inven003','6197495210920','INVENTARIO','S002','Miguel Antonio','Rivera Medina','6000.00');
INSERT INTO Personal.Empleado VALUES ('INVEN004','inven004','5038850092227','INVENTARIO','S002','Daniela Alejandra','Leon Castro','6000.00');
INSERT INTO Personal.Empleado VALUES ('INVEN005','inven005','8176828381119','INVENTARIO','S003','Diego Eduardo','Jimenez Reyes','6000.00');
INSERT INTO Personal.Empleado VALUES ('INVEN006','inven006','9984729090929','INVENTARIO','S003','Ana Maria','Diaz Perez','6000.00');

/* VENDEDORES */
INSERT INTO Personal.Empleado VALUES ('VENDE001','vende001','3110761971218','VENDEDOR','S001','Victor Raul','Sanchez Flores','4000.00');
INSERT INTO Personal.Empleado VALUES ('VENDE002','vende002','5673245222109','VENDEDOR','S001','Carmen Patricia','Ruiz Garcia','4000.00');
INSERT INTO Personal.Empleado VALUES ('VENDE003','vende003','4341542282112','VENDEDOR','S001','Jorge Alberto','Hernandez Rodriguez','4000.00');
INSERT INTO Personal.Empleado VALUES ('VENDE004','vende004','2568646650815','VENDEDOR','S001','Diana Lucia','Torres Garcia','4000.00');
INSERT INTO Personal.Empleado VALUES ('VENDE005','vende005','8441090911123','VENDEDOR','S002','Juan Pablo','Romero Torres','4000.00');
INSERT INTO Personal.Empleado VALUES ('VENDE006','vende006','6254628692123','VENDEDOR','S002','Martina Elizabeth','Gonzalez Hernandez','4000.00');
INSERT INTO Personal.Empleado VALUES ('VENDE007','vende007','3080779181304','VENDEDOR','S002','Francisco Javier','Marquez Ruiz','4000.00');
INSERT INTO Personal.Empleado VALUES ('VENDE008','vende008','6260018631520','VENDEDOR','S002','Luciana Maribel','Medina Romero','4000.00');
INSERT INTO Personal.Empleado VALUES ('VENDE009','vende009','9039384642117','VENDEDOR','S003','Gabriel Alejandro','Gonzalez Sanchez','4000.00');
INSERT INTO Personal.Empleado VALUES ('VENDE010','vende010','2008060481104','VENDEDOR','S003','Ana Carolina','Ortiz Ramirez','4000.00');
INSERT INTO Personal.Empleado VALUES ('VENDE011','vende011','3239865060503','VENDEDOR','S003','Jose Manuel','Perez Garcia','4000.00');
INSERT INTO Personal.Empleado VALUES ('VENDE012','vende012','5504256091904','VENDEDOR','S003','Valeria Isabella','Diaz Romero','4000.00');



/***********************************
 * CLIENTES
 ***********************************/

INSERT INTO GestionVenta.Cliente VALUES ('7054718-4','Bruno Gonzalez','59724408','Ciudad');
INSERT INTO GestionVenta.Cliente VALUES ('2184209-5','Tomas Martinez','25286997','Ciudad');
INSERT INTO GestionVenta.Cliente VALUES ('671718-6','Vilma Gomez','23694915','Ciudad');
INSERT INTO GestionVenta.Cliente VALUES ('6303494-1','Camila Sanchez','72125801','Ciudad');
INSERT INTO GestionVenta.Cliente VALUES ('734246-9','Juan Lopez','21736780','Ciudad');
INSERT INTO GestionVenta.Cliente VALUES ('7069178-9','Sofia Rodriguez','69146279','Ciudad');
INSERT INTO GestionVenta.Cliente VALUES ('568069-1','Natalia Fernandez','58433893','Ciudad');
INSERT INTO GestionVenta.Cliente VALUES ('1545093-5','Matias Garcia','24723763','Ciudad');
INSERT INTO GestionVenta.Cliente VALUES ('460062-9','Isaura Diaz','68980325','Ciudad');
INSERT INTO GestionVenta.Cliente VALUES ('8036368-3','Lucas Perez','36919225','Ciudad');



/***********************************
 * PRODUCTOS
 ***********************************/

INSERT INTO Stock.Producto VALUES ('6572999314093','Lavadora','Samsung','5000.00','Lavadora de carga frontal de 7 kg.');
INSERT INTO Stock.Producto VALUES ('7541718504009','Refrigerador','LG','5100.00','Refrigerador de dos puertas con capacidad de 500 litros.');
INSERT INTO Stock.Producto VALUES ('1316990073218','Estufa','Whirlpool','1600.00','Estufa de gas de 6 quemadores y horno electrico.');
INSERT INTO Stock.Producto VALUES ('6313550344426','Secadora','Bosch','4290.00','Secadora electrica de carga frontal de 8 kg.');
INSERT INTO Stock.Producto VALUES ('9249319781313','Horno','General Electric','450.00','Horno electrico de acero inoxidable.');
INSERT INTO Stock.Producto VALUES ('2417379719097','Microondas','Samsung','650.00','Microondas de 1000 watts con funcion de grill.');
INSERT INTO Stock.Producto VALUES ('9704654213090','Licuadora','Oster','580.00','Licuadora de 10 velocidades con vaso de vidrio.');
INSERT INTO Stock.Producto VALUES ('2333137751556','Batidora','Sharp','690.00','Batidora de mano de 5 velocidades con accesorios.');
INSERT INTO Stock.Producto VALUES ('5845751360594','Tostadora','Black+Decker','350.00','Tostadora de 2 rebanadas con funcion de descongelamiento.');
INSERT INTO Stock.Producto VALUES ('4489278536254','Cafetera','Bosch','580.00','Cafetera de capsulas con deposito de agua de 2 litros.');
INSERT INTO Stock.Producto VALUES ('3200978407158','Aspiradora','Dyson','4500.00','Aspiradora sin cable con tecnologia Cyclone.');
INSERT INTO Stock.Producto VALUES ('4938816169297','Plancha','Hitachi','220.00','Plancha de vapor con suela de ceramica.');
INSERT INTO Stock.Producto VALUES ('3055335899290','Ventilador','Philips','465.00','Ventilador de torre con control remoto.');
INSERT INTO Stock.Producto VALUES ('9136225593277','Refrigerador','Philips','12000.00','Refrigerador de dos puertas con capacidad de 700 litros.');
INSERT INTO Stock.Producto VALUES ('7225309188747','Deshumidificador','Frigidaire','1600.00','Deshumidificador portatil de 70 pintas.');
INSERT INTO Stock.Producto VALUES ('8921160582814','Calefactor','Samsung','495.00','Calefactor electrico con termostato programable.');
INSERT INTO Stock.Producto VALUES ('1453071773331','Cafetera','Hamilton Beach','490.00','Cafetera de capsulas con deposito de agua de 5 litros.');
INSERT INTO Stock.Producto VALUES ('6649131125509','Microondas','Sony','835.00','Microondas de 1000 watts.');
INSERT INTO Stock.Producto VALUES ('3470106186111','Cafetera express','General Electric','649.00','Cafetera express de acero inoxidable.');
INSERT INTO Stock.Producto VALUES ('6600846251877','Estufa','Sony','1500.00','Estufa de gas de 6 quemadores.');
INSERT INTO Stock.Producto VALUES ('3356514414413','Licuadora','Panasonic','470.00','Licuadora personal de 900 watts con vasos portatiles.');
INSERT INTO Stock.Producto VALUES ('3932046799197','Plancha de pelo','LG','540.00','Plancha de pelo profesional de ceramica.');
INSERT INTO Stock.Producto VALUES ('1779401896569','Batidora de mano','Whirlpool','575.00','Batidora de mano de 3 velocidades con accesorios.');
INSERT INTO Stock.Producto VALUES ('4669878957357','Vaporera','Oster','325.00','Vaporera electrica de acero inoxidable.');
INSERT INTO Stock.Producto VALUES ('7353809138211','Lavavajillas','Whirlpool','3490.00','Lavavajillas de 60 cm con sistema de secado automatico');
INSERT INTO Stock.Producto VALUES ('4610557967562','Horno','Bosch','475.00','Horno electrico con sistema de limpieza automatica');
INSERT INTO Stock.Producto VALUES ('4619378033486','Aspiradora','Panasonic','5140.00','Aspiradora sin cable con tecnologia ciclonica');
INSERT INTO Stock.Producto VALUES ('9368256336381','Plancha','Philips','265.00','Plancha de vapor con tecnologia OptimalTEMP');
INSERT INTO Stock.Producto VALUES ('2425633084222','Estufa electrica','Remington','7350.00','Estufa electrica de aceite con termostato regulable');
INSERT INTO Stock.Producto VALUES ('3750669982425','Licuadora','Black+Decker','265.00','Licuadora con jarra de cristal y 2 velocidades');



/***********************************
 * EXISTENCIAS
 ***********************************/

/* EXISTENCIAS EN BODEGA */
INSERT INTO Stock.Existencia VALUES ('6572999314093','B001','28');
INSERT INTO Stock.Existencia VALUES ('7541718504009','B001','27');
INSERT INTO Stock.Existencia VALUES ('1316990073218','B001','27');
INSERT INTO Stock.Existencia VALUES ('6313550344426','B001','16');
INSERT INTO Stock.Existencia VALUES ('9249319781313','B001','18');
INSERT INTO Stock.Existencia VALUES ('2417379719097','B001','30');
INSERT INTO Stock.Existencia VALUES ('9704654213090','B001','12');
INSERT INTO Stock.Existencia VALUES ('2333137751556','B001','22');
INSERT INTO Stock.Existencia VALUES ('5845751360594','B001','10');
INSERT INTO Stock.Existencia VALUES ('4489278536254','B001','21');
INSERT INTO Stock.Existencia VALUES ('3200978407158','B001','28');
INSERT INTO Stock.Existencia VALUES ('4938816169297','B001','19');
INSERT INTO Stock.Existencia VALUES ('3055335899290','B001','11');
INSERT INTO Stock.Existencia VALUES ('9136225593277','B001','11');
INSERT INTO Stock.Existencia VALUES ('7225309188747','B001','30');
INSERT INTO Stock.Existencia VALUES ('8921160582814','B001','22');
INSERT INTO Stock.Existencia VALUES ('1453071773331','B001','21');
INSERT INTO Stock.Existencia VALUES ('6649131125509','B001','27');
INSERT INTO Stock.Existencia VALUES ('3470106186111','B001','24');
INSERT INTO Stock.Existencia VALUES ('6600846251877','B001','19');
INSERT INTO Stock.Existencia VALUES ('3356514414413','B001','10');
INSERT INTO Stock.Existencia VALUES ('3932046799197','B001','20');
INSERT INTO Stock.Existencia VALUES ('1779401896569','B001','21');
INSERT INTO Stock.Existencia VALUES ('4669878957357','B001','20');
INSERT INTO Stock.Existencia VALUES ('7353809138211','B001','26');
INSERT INTO Stock.Existencia VALUES ('4610557967562','B001','17');
INSERT INTO Stock.Existencia VALUES ('4619378033486','B001','18');
INSERT INTO Stock.Existencia VALUES ('9368256336381','B001','11');
INSERT INTO Stock.Existencia VALUES ('2425633084222','B001','26');
INSERT INTO Stock.Existencia VALUES ('3750669982425','B001','26');

/* EXISTENCIAS EN SUCURSAL CENTRAL */
INSERT INTO Stock.Existencia VALUES ('6572999314093','S001','17');
INSERT INTO Stock.Existencia VALUES ('7541718504009','S001','14');
INSERT INTO Stock.Existencia VALUES ('1316990073218','S001','8');
INSERT INTO Stock.Existencia VALUES ('6313550344426','S001','12');
INSERT INTO Stock.Existencia VALUES ('9249319781313','S001','5');
INSERT INTO Stock.Existencia VALUES ('2417379719097','S001','6');
INSERT INTO Stock.Existencia VALUES ('9704654213090','S001','7');
INSERT INTO Stock.Existencia VALUES ('2333137751556','S001','19');
INSERT INTO Stock.Existencia VALUES ('5845751360594','S001','19');
INSERT INTO Stock.Existencia VALUES ('4489278536254','S001','6');
INSERT INTO Stock.Existencia VALUES ('3200978407158','S001','19');
INSERT INTO Stock.Existencia VALUES ('4938816169297','S001','5');
INSERT INTO Stock.Existencia VALUES ('3055335899290','S001','20');
INSERT INTO Stock.Existencia VALUES ('9136225593277','S001','17');
INSERT INTO Stock.Existencia VALUES ('7225309188747','S001','18');
INSERT INTO Stock.Existencia VALUES ('8921160582814','S001','13');
INSERT INTO Stock.Existencia VALUES ('1453071773331','S001','8');
INSERT INTO Stock.Existencia VALUES ('6649131125509','S001','11');
INSERT INTO Stock.Existencia VALUES ('3470106186111','S001','9');
INSERT INTO Stock.Existencia VALUES ('6600846251877','S001','5');
INSERT INTO Stock.Existencia VALUES ('3356514414413','S001','7');
INSERT INTO Stock.Existencia VALUES ('3932046799197','S001','15');
INSERT INTO Stock.Existencia VALUES ('1779401896569','S001','20');
INSERT INTO Stock.Existencia VALUES ('4669878957357','S001','15');
INSERT INTO Stock.Existencia VALUES ('7353809138211','S001','14');
INSERT INTO Stock.Existencia VALUES ('4610557967562','S001','5');
INSERT INTO Stock.Existencia VALUES ('4619378033486','S001','12');
INSERT INTO Stock.Existencia VALUES ('9368256336381','S001','8');
INSERT INTO Stock.Existencia VALUES ('2425633084222','S001','12');
INSERT INTO Stock.Existencia VALUES ('3750669982425','S001','20');

/* EXISTENCIAS EN SUCURSAL NORTE */
INSERT INTO Stock.Existencia VALUES ('6572999314093','S002','6');
INSERT INTO Stock.Existencia VALUES ('7541718504009','S002','8');
INSERT INTO Stock.Existencia VALUES ('1316990073218','S002','14');
INSERT INTO Stock.Existencia VALUES ('6313550344426','S002','5');
INSERT INTO Stock.Existencia VALUES ('9249319781313','S002','8');
INSERT INTO Stock.Existencia VALUES ('2417379719097','S002','20');
INSERT INTO Stock.Existencia VALUES ('9704654213090','S002','14');
INSERT INTO Stock.Existencia VALUES ('2333137751556','S002','14');
INSERT INTO Stock.Existencia VALUES ('5845751360594','S002','10');
INSERT INTO Stock.Existencia VALUES ('4489278536254','S002','20');
INSERT INTO Stock.Existencia VALUES ('3200978407158','S002','19');
INSERT INTO Stock.Existencia VALUES ('4938816169297','S002','14');
INSERT INTO Stock.Existencia VALUES ('3055335899290','S002','12');
INSERT INTO Stock.Existencia VALUES ('9136225593277','S002','6');
INSERT INTO Stock.Existencia VALUES ('7225309188747','S002','13');
INSERT INTO Stock.Existencia VALUES ('8921160582814','S002','11');
INSERT INTO Stock.Existencia VALUES ('1453071773331','S002','9');
INSERT INTO Stock.Existencia VALUES ('6649131125509','S002','16');
INSERT INTO Stock.Existencia VALUES ('3470106186111','S002','17');
INSERT INTO Stock.Existencia VALUES ('6600846251877','S002','9');
INSERT INTO Stock.Existencia VALUES ('3356514414413','S002','10');
INSERT INTO Stock.Existencia VALUES ('3932046799197','S002','15');
INSERT INTO Stock.Existencia VALUES ('1779401896569','S002','12');
INSERT INTO Stock.Existencia VALUES ('4669878957357','S002','17');
INSERT INTO Stock.Existencia VALUES ('7353809138211','S002','11');

/* EXISTENCIAS EN SUCURSAL SUR */
INSERT INTO Stock.Existencia VALUES ('6572999314093','S003','13');
INSERT INTO Stock.Existencia VALUES ('7541718504009','S003','14');
INSERT INTO Stock.Existencia VALUES ('1316990073218','S003','10');
INSERT INTO Stock.Existencia VALUES ('6313550344426','S003','17');
INSERT INTO Stock.Existencia VALUES ('9249319781313','S003','14');
INSERT INTO Stock.Existencia VALUES ('2417379719097','S003','12');
INSERT INTO Stock.Existencia VALUES ('9704654213090','S003','8');
INSERT INTO Stock.Existencia VALUES ('2333137751556','S003','8');
INSERT INTO Stock.Existencia VALUES ('5845751360594','S003','11');
INSERT INTO Stock.Existencia VALUES ('4489278536254','S003','14');
INSERT INTO Stock.Existencia VALUES ('3200978407158','S003','19');
INSERT INTO Stock.Existencia VALUES ('4938816169297','S003','13');
INSERT INTO Stock.Existencia VALUES ('3055335899290','S003','19');
INSERT INTO Stock.Existencia VALUES ('9136225593277','S003','10');
INSERT INTO Stock.Existencia VALUES ('7225309188747','S003','20');



/***********************************
 * FACTURAS
 ***********************************/

/* FACTURAS SUCURSAL CENTRAL */
INSERT INTO GestionVenta.Factura VALUES ('FC0001','568069-1','2023/02/25','470.00','0','470.00','VENDE004','S001');
INSERT INTO GestionVenta.Factura VALUES ('FC0002','8036368-3','2023/02/29','5140.00','0','5140.00','VENDE001','S001');
INSERT INTO GestionVenta.Factura VALUES ('FC0003','1545093-5','2023/03/04','1160.00','0','1160.00','VENDE001','S001');
INSERT INTO GestionVenta.Factura VALUES ('FC0004','8036368-3','2023/03/08','12000.00','0','12000.00','VENDE003','S001');
INSERT INTO GestionVenta.Factura VALUES ('FC0005','568069-1','2023/03/13','1600.00','0','1600.00','VENDE002','S001');

/* FACTURAS SUCURSAL NORTE */
INSERT INTO GestionVenta.Factura VALUES ('FN0001','671718-6','2023/03/01','1600.00','0','1600.00','VENDE006','S002');
INSERT INTO GestionVenta.Factura VALUES ('FN0002','460062-9','2023/03/05','4290.00','0','4290.00','VENDE005','S002');
INSERT INTO GestionVenta.Factura VALUES ('FN0003','7054718-4','2023/03/07','575.00','0','575.00','VENDE005','S002');
INSERT INTO GestionVenta.Factura VALUES ('FN0004','6303494-1','2023/03/10','350.00','0','350.00','VENDE008','S002');
INSERT INTO GestionVenta.Factura VALUES ('FN0005','2184209-5','2023/03/12','580.00','0','580.00','VENDE006','S002');

/* FACTURAS SUCURSAL SUR */
INSERT INTO GestionVenta.Factura VALUES ('FS0001','460062-9','2023/02/28','4500.00','0','4500.00','VENDE011','S003');
INSERT INTO GestionVenta.Factura VALUES ('FS0002','671718-6','2023/03/03','575.00','0','575.00','VENDE011','S003');
INSERT INTO GestionVenta.Factura VALUES ('FS0003','6303494-1','2023/03/06','580.00','0','580.00','VENDE010','S003');
INSERT INTO GestionVenta.Factura VALUES ('FS0004','7069178-9','2023/03/11','650.00','0','650.00','VENDE009','S003');
INSERT INTO GestionVenta.Factura VALUES ('FS0005','568069-1','2023/03/14','690.00','0','690.00','VENDE012','S003');



/***********************************
 * VENTAS
 ***********************************/

/* VENTAS SUCURSAL CENTRAL */
INSERT INTO GestionVenta.Venta VALUES ('FC0001','3356514414413','1','470.00');
INSERT INTO GestionVenta.Venta VALUES ('FC0002','4619378033486','1','5140.00');
INSERT INTO GestionVenta.Venta VALUES ('FC0003','4489278536254','2','1160.00');
INSERT INTO GestionVenta.Venta VALUES ('FC0004','9136225593277','1','12000.00');
INSERT INTO GestionVenta.Venta VALUES ('FC0005','1316990073218','1','1600.00');

/* VENTAS SUCURSAL NORTE */
INSERT INTO GestionVenta.Venta VALUES ('FN0001','1316990073218','1','1600.00');
INSERT INTO GestionVenta.Venta VALUES ('FN0002','6313550344426','1','4290.00');
INSERT INTO GestionVenta.Venta VALUES ('FN0003','1779401896569','1','575.00');
INSERT INTO GestionVenta.Venta VALUES ('FN0004','5845751360594','1','350.00');
INSERT INTO GestionVenta.Venta VALUES ('FN0005','9704654213090','1','580.00');

/* VENTAS SUCURSAL SUR */
INSERT INTO GestionVenta.Venta VALUES ('FS0001','3200978407158','1','4500.00');
INSERT INTO GestionVenta.Venta VALUES ('FS0002','1779401896569','1','575.00');
INSERT INTO GestionVenta.Venta VALUES ('FS0003','9704654213090','1','580.00');
INSERT INTO GestionVenta.Venta VALUES ('FS0004','2417379719097','1','650.00');
INSERT INTO GestionVenta.Venta VALUES ('FS0005','2333137751556','1','690.00');
