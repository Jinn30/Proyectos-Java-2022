-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 09-05-2023 a las 01:11:18
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `farmacenter`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comerciales`
--

CREATE TABLE `comerciales` (
  `ID` int(20) NOT NULL,
  `Codigo` text NOT NULL,
  `Nombre` text NOT NULL,
  `Laboratorio` text NOT NULL,
  `Presentacion` text NOT NULL,
  `Cantidad` int(11) NOT NULL,
  `Precio` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `comerciales`
--

INSERT INTO `comerciales` (`ID`, `Codigo`, `Nombre`, `Laboratorio`, `Presentacion`, `Cantidad`, `Precio`) VALUES
(1, '001', 'NOLOTIL', 'BOEHRINGER', 'CAPSULAS DURAS', 18, 3000),
(3, '002', 'ASPIRINA', 'BAYER', 'TABLETAS', 6, 1200);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `genericos`
--

CREATE TABLE `genericos` (
  `ID` int(20) NOT NULL,
  `Codigo` text NOT NULL,
  `Nombre` text NOT NULL,
  `Laboratorio` text NOT NULL,
  `Presentacion` text NOT NULL,
  `ANDA` text NOT NULL,
  `Cantidad` int(11) NOT NULL,
  `Precio` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `genericos`
--

INSERT INTO `genericos` (`ID`, `Codigo`, `Nombre`, `Laboratorio`, `Presentacion`, `ANDA`, `Cantidad`, `Precio`) VALUES
(2, '001', 'ACETAMINOFÉN', 'PERRIGO', 'TABLETA, LIBERACIÓN PROLONGADA; ORAL', '#075077', 20, 2000),
(3, '002', 'AMOXICILINA', 'SANDOZ', 'COMPRIMIDO; ORAL', '#065256', 10, 4500),
(4, '003', 'ANTIZOL', 'PAR PHARM INC', 'INYECTABLE;INYECCIÓN', '020696', 10, 6000),
(5, '004', 'NAPROXENO', 'GENÉRICOS DE GLENMARK', 'COMPRIMIDO; ORAL', '#078250', 15, 2500);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `comerciales`
--
ALTER TABLE `comerciales`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `genericos`
--
ALTER TABLE `genericos`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `comerciales`
--
ALTER TABLE `comerciales`
  MODIFY `ID` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `genericos`
--
ALTER TABLE `genericos`
  MODIFY `ID` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
