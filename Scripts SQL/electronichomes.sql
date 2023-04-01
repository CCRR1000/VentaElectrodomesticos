
CREATE DATABASE electronichomes;

\c electronichomes

CREATE SCHEMA Espacios;
CREATE SCHEMA Stock;
CREATE SCHEMA GestionVenta;
CREATE SCHEMA Personal;

CREATE TABLE Espacios.Establecimiento (
    id VARCHAR(4) NOT NULL,
    nombre VARCHAR(30) NOT NULL,
    tipo VARCHAR(15) NOT NULL,
    direccion VARCHAR(100) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE Personal.Empleado (
    usuario VARCHAR(10) NOT NULL,
    contrasena VARCHAR(20) NOT NULL,
    cui VARCHAR(20) NOT NULL,
    rol VARCHAR(20) NOT NULL,
    establecimiento VARCHAR(4),
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    salario DECIMAL(8,2) NOT NULL,
    PRIMARY KEY (usuario),
    FOREIGN KEY(establecimiento) REFERENCES Espacios.Establecimiento(id)
);

CREATE TABLE Stock.Producto (
    codigo_barras VARCHAR(15) NOT NULL,
    nombre VARCHAR(50) NOT NULL,
    marca VARCHAR(50) NOT NULL,
    precio DECIMAL(8,2) NOT NULL,
    descripcion VARCHAR(50) NOT NULL,
    PRIMARY KEY(codigo_barras)
);

CREATE TABLE Stock.Existencia (
    producto VARCHAR(15) NOT NULL,
    establecimiento VARCHAR(4) NOT NULL,
    cantidad INT NOT NULL,
    PRIMARY KEY(producto,establecimiento),
    FOREIGN KEY(producto) REFERENCES Stock.Producto(codigo_barras),
    FOREIGN KEY(establecimiento) REFERENCES Espacios.Establecimiento(id)
);

CREATE TABLE GestionVenta.Cliente (
    nit VARCHAR(20) NOT NULL,
    nombre VARCHAR(50) NOT NULL,
    telefono VARCHAR(10),
    direccion VARCHAR(100),
    PRIMARY KEY (nit)
);

CREATE TABLE GestionVenta.Factura (
    noDocumento VARCHAR(10) NOT NULL,
    cliente VARCHAR(20) NOT NULL,
    fecha DATE NOT NULL,
    subtotal DECIMAL(8,2) NOT NULL,
    descuento DECIMAL(8,2) NOT NULL,
    total DECIMAL(8,2) NOT NULL,
    vendedor VARCHAR(10) NOT NULL,
    sucursal VARCHAR(4) NOT NULL,
    PRIMARY KEY (noDocumento),
    FOREIGN KEY (cliente) REFERENCES GestionVenta.Cliente(nit),
    FOREIGN KEY (vendedor) REFERENCES Personal.Empleado(usuario),
    FOREIGN KEY (sucursal) REFERENCES Espacios.Establecimiento(id)
);

CREATE TABLE GestionVenta.Venta (
    factura VARCHAR(10) NOT NULL,
    producto VARCHAR(15) NOT NULL,
    unidades INT NOT NULL,
    monto DECIMAL(8,2) NOT NULL,
    PRIMARY KEY (factura,producto),
    FOREIGN KEY (factura) REFERENCES GestionVenta.Factura(noDocumento),
    FOREIGN KEY (producto) REFERENCES Stock.Producto(codigo_barras)
);

\dt *.*


