USE oneclickcar;

-- Inserción de datos en la tabla Users
INSERT INTO users (id_user, full_name, phone_number, email, birth_date, password, type_user) VALUES
(1, 'Juan Santos', '1234567890', 'oneclickcarcontacto@gmail.com', '1990-01-01', 'password1', 'admin'),
(2, 'Luis Meléndez', '0987654321', 'luis@example.com', '1992-02-02', 'password2', 'client'),
(3, 'Libertad Rivas', '2345678901', 'libertad@example.com', '1993-03-03', 'password3', 'client'),
(4, 'Antonio Rosas', '3456789012', 'antonio@example.com', '1994-04-04', 'password4', 'client'),
(5, 'Sergio Rolón', '4567890123', 'sergio@example.com', '1995-05-05', 'password5', 'client'),
(6, 'Andrés Hernández', '5678901234', 'andres@example.com', '1996-06-06', 'password6', 'client');


-- Inserción de datos en la tabla Cars
INSERT INTO `OneClickCar`.`cars` 
(`id_cars`, `type`, `brand`, `name`, `year`, `kilometer`, `transmission`, `price`, `img`, `owners`, `description`, `verified`, `sold`, `nu_serial`, `users_id_user`) VALUES
(1, 'Sedan', 'Chevrolet', 'Cavalier', 2021, 51000, 'Manual', 320000, 'https://res.cloudinary.com/duqki6x6t/image/upload/v1727889397/CARROS%20ACTUALIZACION/SEDAN/jzmc4om5b6305qnkarzp.jpg', 2, 'Llevate este excelente vehículo en óptimas condiciones. Ha pasado todas las revisiones (mécanica y legal), así que contacta al vendedor para más información, cita para revisión o compra.', 1, 0, 'SFABK3AB5PA093101', 2),
(2,'Sedan', 'KIA', 'Forte', 2019, 97000, 'Manual', 217000, 'https://res.cloudinary.com/duqki6x6t/image/upload/v1727889397/CARROS%20ACTUALIZACION/SEDAN/xrw9p0u81kudod72eo9z.jpg', 1, 'Llevate este excelente vehículo en óptimas condiciones. Ha pasado todas las revisiones (mécanica y legal), así que contacta al vendedor para más información, cita para revisión o compra.', 1, 0, 'SFABK3AB5PA093102', 3),
(3, 'Sedan', 'KIA', 'Forte', 2022, 38000, 'Manual', 280000, 'https://res.cloudinary.com/duqki6x6t/image/upload/v1727889397/CARROS%20ACTUALIZACION/SEDAN/pfmdsxdozg4muh8rsm7i.jpg', 1, 'Llevate este excelente vehículo en óptimas condiciones. Ha pasado todas las revisiones (mécanica y legal), así que contacta al vendedor para más información, cita para revisión o compra.', 1, 0, 'SFABK3AB5PA093103', 4),
(4, 'Sedán', 'Toyota', 'Corolla', 2020, 76000, 'Automático', 250000, 'https://res.cloudinary.com/duqki6x6t/image/upload/v1727889397/CARROS%20ACTUALIZACION/SEDAN/jzcifbic9pvzj0ntw8ek.jpg', 1, 'Llevate este excelente vehículo en óptimas condiciones. Ha pasado todas las revisiones (mécanica y legal), así que contacta al vendedor para más información, cita para revisión o compra.', 1, 0, 'SFABK3AB5PA093104', 5),
(5, 'Sedán', 'Dodge', 'Attitude', 2021, 66000, 'Automático', 190000, 'https://res.cloudinary.com/duqki6x6t/image/upload/v1727889397/CARROS%20ACTUALIZACION/SEDAN/r7yx7ajnarxwyrjskiob.jpg', 2, 'Llevate este excelente vehículo en óptimas condiciones. Ha pasado todas las revisiones (mécanica y legal), así que contacta al vendedor para más información, cita para revisión o compra.', 1, 0, 'SFABK3AB5PA093105', 6),
(6, 'Coupé', 'Ford', 'Mustang', 2014, 164000, 'Manual', 170000, 'https://res.cloudinary.com/duqki6x6t/image/upload/v1727889395/CARROS%20ACTUALIZACION/COUPE/m2scaucxbiugsglz9pyv.jpg', 1, 'Llevate este excelente vehículo en óptimas condiciones. Ha pasado todas las revisiones (mécanica y legal), así que contacta al vendedor para más información, cita para revisión o compra.', 1, 0,'SFABK3AB5PA093106', 2),
(7, 'Coupé', 'Ford', 'Mustang', 2023, 2100, 'Manual', 445000, 'https://res.cloudinary.com/duqki6x6t/image/upload/v1727889396/CARROS%20ACTUALIZACION/COUPE/bs7ya0ncrne3rhw3wcxn.jpg', 1, 'Llevate este excelente vehículo en óptimas condiciones. Ha pasado todas las revisiones (mécanica y legal), así que contacta al vendedor para más información, cita para revisión o compra.', 1, 0, 'SFABK3AB5PA093107', 3),
(8, 'Coupé', 'Chevrolet', 'Camaro', 2017, 92000, 'Manual', 315000, 'https://res.cloudinary.com/duqki6x6t/image/upload/v1727889395/CARROS%20ACTUALIZACION/COUPE/vdrke72dax4bguhazerg.jpg', 1, 'Llevate este excelente vehículo en óptimas condiciones. Ha pasado todas las revisiones (mécanica y legal), así que contacta al vendedor para más información, cita para revisión o compra.', 1, 0, 'SFABK3AB5PA093108', 4),
(9, 'Coupé', 'Audi', 'A5', 2021, 43000, 'Automático', 387000, 'https://res.cloudinary.com/duqki6x6t/image/upload/v1727892329/CARROS%20ACTUALIZACION/COUPE/gxutrhmdgnz3bzvgvhkr.jpg', 1, 'Llevate este excelente vehículo en óptimas condiciones. Ha pasado todas las revisiones (mécanica y legal), así que contacta al vendedor para más información, cita para revisión o compra.', 1, 0, 'SFABK3AB5PA093109', 5),
(10,'Coupé', 'BMW', 'Serie 4', 2012, 149000, 'Automático', 187000, 'https://res.cloudinary.com/duqki6x6t/image/upload/v1727889395/CARROS%20ACTUALIZACION/COUPE/dcouwfbl2ke6bcvaydho.jpg', 3, 'Llevate este excelente vehículo en óptimas condiciones. Ha pasado todas las revisiones (mécanica y legal), así que contacta al vendedor para más información, cita para revisión o compra.', 1, 0, 'SFABK3AB5PA093110', 6),
(11,'SUV', 'Nissan', 'X-trail', 2014, 133000, 'Manual', 183000, 'https://res.cloudinary.com/duqki6x6t/image/upload/v1727889398/CARROS%20ACTUALIZACION/SUV/gvdimlttgnvwyc2tihfy.jpg', 1, 'Llevate este excelente vehículo en óptimas condiciones. Ha pasado todas las revisiones (mécanica y legal), así que contacta al vendedor para más información, cita para revisión o compra.', 1, 0, 'SFABK3AB5PA093111', 2),
(12,'SUV', 'Toyota', 'RAV-4', 2018, 117000, 'Manual', 264000, 'https://res.cloudinary.com/duqki6x6t/image/upload/v1727897951/CARROS%20ACTUALIZACION/SUV/gquq5ocroeosm3bab8ht.jpg', 1, 'Llevate este excelente vehículo en óptimas condiciones. Ha pasado todas las revisiones (mécanica y legal), así que contacta al vendedor para más información, cita para revisión o compra.', 1, 0, 'SFABK3AB5PA093112', 3),
(13,'SUV', 'Honda', 'CRV', 2011, 204000, 'Manual', 132000, 'https://res.cloudinary.com/duqki6x6t/image/upload/v1727889397/CARROS%20ACTUALIZACION/SUV/b4at9o8h4vmpszdbpwcq.jpg', 1, 'Llevate este excelente vehículo en óptimas condiciones. Ha pasado todas las revisiones (mécanica y legal), así que contacta al vendedor para más información, cita para revisión o compra.', 1, 0, 'SFABK3AB5PA093113', 4),
(14,'SUV', 'Volkswagen', 'Tiguan', 2024, 9000, 'Automático', 567000, 'https://res.cloudinary.com/duqki6x6t/image/upload/v1727889398/CARROS%20ACTUALIZACION/SUV/chl5pccvbihfxvvok1b6.jpg', 1, 'Llevate este excelente vehículo en óptimas condiciones. Ha pasado todas las revisiones (mécanica y legal), así que contacta al vendedor para más información, cita para revisión o compra.', 1, 0, 'SFABK3AB5PA093114', 5),
(15,'SUV', 'Mazda', 'CX-5', 2019, 149000, 'Automático', 187000, 'https://res.cloudinary.com/duqki6x6t/image/upload/v1727889397/CARROS%20ACTUALIZACION/SUV/idvczoi3mmsjpramflwj.jpg', 3, 'Llevate este excelente vehículo en óptimas condiciones. Ha pasado todas las revisiones (mécanica y legal), así que contacta al vendedor para más información, cita para revisión o compra.', 1, 0, 'SFABK3AB5PA093115', 6),
(16,'Hatchback', 'Mazda', '3', 2016, 141000, 'Manual', 160000, 'https://res.cloudinary.com/duqki6x6t/image/upload/v1727896775/CARROS%20ACTUALIZACION/HATCHBACK/shyx5azgolm4rtaycwyo.jpg', 1, 'Llevate este excelente vehículo en óptimas condiciones. Ha pasado todas las revisiones (mécanica y legal), así que contacta al vendedor para más información, cita para revisión o compra.', 1, 0, 'SFABK3AB5PA093116', 2),
(17, 'Hatchback', 'Volkswagen', 'Polo', 2017, 63000, 'Manual', 189000, 'https://res.cloudinary.com/duqki6x6t/image/upload/v1727889396/CARROS%20ACTUALIZACION/HATCHBACK/cg5xuvfhmnodgrlwdgcb.jpg', 1, 'Llevate este excelente vehículo en óptimas condiciones. Ha pasado todas las revisiones (mécanica y legal), así que contacta al vendedor para más información, cita para revisión o compra.', 1, 0, 'SFABK3AB5PA093117', 3),
(18,'Hatchback', 'KIA', 'Rio', 2023, 27000, 'Manual', 287000, 'https://res.cloudinary.com/duqki6x6t/image/upload/v1727889396/CARROS%20ACTUALIZACION/HATCHBACK/tuzm5cvgolblv42girrv.jpg', 1, 'Llevate este excelente vehículo en óptimas condiciones. Ha pasado todas las revisiones (mécanica y legal), así que contacta al vendedor para más información, cita para revisión o compra.', 1, 0, 'SFABK3AB5PA093118', 4),
(19,'Hatchback', 'Ford', 'Fiesta', 2008, 214000, 'Automático', 83000, 'https://res.cloudinary.com/duqki6x6t/image/upload/v1727889396/CARROS%20ACTUALIZACION/HATCHBACK/wv7qch7reot3295h7qab.jpg', 1, 'Llevate este excelente vehículo en óptimas condiciones. Ha pasado todas las revisiones (mécanica y legal), así que contacta al vendedor para más información, cita para revisión o compra.', 1, 0, 'SFABK3AB5PA093119', 5),
(20,'Hatchback', 'Chevrolet', 'Aveo', 2024, 14000, 'Automático', 290000, 'https://res.cloudinary.com/duqki6x6t/image/upload/v1727889395/CARROS%20ACTUALIZACION/HATCHBACK/mqgonenyxaxpd9atu8as.jpg', 2, 'Llevate este excelente vehículo en óptimas condiciones. Ha pasado todas las revisiones (mécanica y legal), así que contacta al vendedor para más información, cita para revisión o compra.', 1, 0, 'SFABK3AB5PA093120', 6),
(21,'Pick Up', 'Nissan', 'Frontier', 2010, 188000, 'Manual', 197000, 'https://res.cloudinary.com/duqki6x6t/image/upload/v1727889397/CARROS%20ACTUALIZACION/PICK%20UP/iikuqbp7nxlsgpz93qh9.jpg', 1, 'Llevate este excelente vehículo en óptimas condiciones. Ha pasado todas las revisiones (mécanica y legal), así que contacta al vendedor para más información, cita para revisión o compra.', 1, 0, 'SFABK3AB5PA093121', 2),
(22, 'Pick Up', 'Dodge', 'Ram 1500 TRX', 2021, 57000, 'Manual', 580000, 'https://res.cloudinary.com/duqki6x6t/image/upload/v1727889396/CARROS%20ACTUALIZACION/PICK%20UP/yf137l97v50bv7dayqy3.jpg', 1, 'Llevate este excelente vehículo en óptimas condiciones. Ha pasado todas las revisiones (mécanica y legal), así que contacta al vendedor para más información, cita para revisión o compra.', 1, 0, 'SFABK3AB5PA093122', 3),
(23, 'Pick Up', 'Ford', 'Ranger', 2023, 124000, 'Manual', 254000, 'https://res.cloudinary.com/duqki6x6t/image/upload/v1727889397/CARROS%20ACTUALIZACION/PICK%20UP/romyos7pv8vhha3tqffo.jpg', 1, 'Llevate este excelente vehículo en óptimas condiciones. Ha pasado todas las revisiones (mécanica y legal), así que contacta al vendedor para más información, cita para revisión o compra.', 1, 0, 'SFABK3AB5PA093123', 4),
(24, 'Pick Up', 'Chevrolet', 'Cheyenne', 2015, 120000, 'Automático', 350000, 'https://res.cloudinary.com/duqki6x6t/image/upload/v1727889396/CARROS%20ACTUALIZACION/PICK%20UP/yhr9xizivzm5wvfnjzft.jpg', 1, 'Llevate este excelente vehículo en óptimas condiciones. Ha pasado todas las revisiones (mécanica y legal), así que contacta al vendedor para más información, cita para revisión o compra.', 1, 0, 'SFABK3AB5PA093124', 5),
(25, 'Pick Up', 'Toyota', 'Hilux', 55000, 15000, 'Automático', 270000, 'https://res.cloudinary.com/duqki6x6t/image/upload/v1727889397/CARROS%20ACTUALIZACION/PICK%20UP/uysztqhhyomm9yl3a3pp.jpg', 2, 'Llevate este excelente vehículo en óptimas condiciones. Ha pasado todas las revisiones (mécanica y legal), así que contacta al vendedor para más información, cita para revisión o compra.', 1, 0, 'SFABK3AB5PA093125', 6),
(26, 'VAN', 'Nissan', 'Urvan', 2017, 244000, 'Manual', 167000, 'https://res.cloudinary.com/duqki6x6t/image/upload/v1727889399/CARROS%20ACTUALIZACION/VAN/bqkedgz11mkxojw57oiz.jpg', 1, 'Llevate este excelente vehículo en óptimas condiciones. Ha pasado todas las revisiones (mécanica y legal), así que contacta al vendedor para más información, cita para revisión o compra.', 1, 0, 'SFABK3AB5PA093126', 2),
(27, 'VAN', 'Toyota', 'Hiace', 2019, 157000, 'Manual', 230000, 'https://res.cloudinary.com/duqki6x6t/image/upload/v1727889399/CARROS%20ACTUALIZACION/VAN/tizxegacbbkfwlc88hzo.jpg', 1, 'Llevate este excelente vehículo en óptimas condiciones. Ha pasado todas las revisiones (mécanica y legal), así que contacta al vendedor para más información, cita para revisión o compra.', 1, 0, 'SFABK3AB5PA093127', 3),
(28,'VAN', 'Ford', 'Transit', 2020, 174000, 'Manual', 285000, 'https://res.cloudinary.com/duqki6x6t/image/upload/v1727889398/CARROS%20ACTUALIZACION/VAN/ctmgfch57gxydh7r0bwg.jpg', 1, 'Llevate este excelente vehículo en óptimas condiciones. Ha pasado todas las revisiones (mécanica y legal), así que contacta al vendedor para más información, cita para revisión o compra.', 1, 0, 'SFABK3AB5PA093128', 4),
(29, 'VAN', 'Volkswagen', 'Transporter', 2012, 280000, 'Automático', 145000, 'https://res.cloudinary.com/duqki6x6t/image/upload/v1727889399/CARROS%20ACTUALIZACION/VAN/tizxegacbbkfwlc88hzo.jpg', 1, 'Llevate este excelente vehículo en óptimas condiciones. Ha pasado todas las revisiones (mécanica y legal), así que contacta al vendedor para más información, cita para revisión o compra.', 1, 0, 'SFABK3AB5PA093129', 5),
(30, 'VAN', 'Mercedes', 'Sprinter', 2021, 180000, 'Automático', 300000, 'https://res.cloudinary.com/duqki6x6t/image/upload/v1727898730/CARROS%20ACTUALIZACION/VAN/dsebewpjrkkut6qpk1bs.jpg', 3, 'Llevate este excelente vehículo en óptimas condiciones. Ha pasado todas las revisiones (mécanica y legal), así que contacta al vendedor para más información, cita para revisión o compra.', 1, 1, 'SFABK3AB5PA093130', 6),
(31, 'VAN', 'Nissan', 'Urvan', 2018, 284000, 'Manual', 123000, 'https://res.cloudinary.com/duqki6x6t/image/upload/v1727889399/CARROS%20ACTUALIZACION/VAN/bqkedgz11mkxojw57oiz.jpg', 1, 'Llevate este excelente vehículo en óptimas condiciones. Ha pasado todas las revisiones (mécanica y legal), así que contacta al vendedor para más información, cita para revisión o compra.', 1, 1, 'SFABK3AB5PA093131',3),
(32, 'VAN', 'Toyota', 'Hiace', 2018, 145000, 'Manual', 233000, 'https://res.cloudinary.com/duqki6x6t/image/upload/v1727889399/CARROS%20ACTUALIZACION/VAN/tizxegacbbkfwlc88hzo.jpg', 1, 'Llevate este excelente vehículo en óptimas condiciones. Ha pasado todas las revisiones (mécanica y legal), así que contacta al vendedor para más información, cita para revisión o compra.', 1, 1, 'SFABK3AB5PA093132',4),
(33, 'VAN', 'Ford', 'Transit', 2021, 133000, 'Manual', 244000, 'https://res.cloudinary.com/duqki6x6t/image/upload/v1727889398/CARROS%20ACTUALIZACION/VAN/ctmgfch57gxydh7r0bwg.jpg', 1, 'Llevate este excelente vehículo en óptimas condiciones. Ha pasado todas las revisiones (mécanica y legal), así que contacta al vendedor para más información, cita para revisión o compra.', 1, 1, 'SFABK3AB5PA093133',5),
(34, 'VAN', 'Volkswagen', 'Transporter', 2013, 270000, 'Automático', 156000, 'https://res.cloudinary.com/duqki6x6t/image/upload/v1727889399/CARROS%20ACTUALIZACION/VAN/tizxegacbbkfwlc88hzo.jpg', 1, 'Llevate este excelente vehículo en óptimas condiciones. Ha pasado todas las revisiones (mécanica y legal), así que contacta al vendedor para más información, cita para revisión o compra.', 1, 1, 'SFABK3AB5PA093134',6),
(35,"VAN", "Mercedes", "Sprinter", 2020, 170000, "Automático", 
310000, "https://res.cloudinary.com/duqki6x6t/image/upload/v1727898730/CARROS%20ACTUALIZACION/VAN/dsebewpjrkkut6qpk1bs.jpg", 3,
"Llevate este excelente vehículo en óptimas condiciones. Ha pasado todas las 
revisiones (mécanica y legal), así que contacta al vendedor para más información, 
cita para revisión",1,1, "SFABK3AB5PA093135", 2);

-- Inserción de datos en la tabla Comments
INSERT INTO comments (id_comment, content, rating, comment_date, approved, sellers_id_seller, users_id_user) VALUES
(1, 'Excelente servicio, muy recomendado.', 5, '2024-01-01', 1, 2, 2),
(2, 'El coche está en muy buen estado.', 4, '2024-01-02', 1, 3, 3),
(3, 'Me encantó el vehículo, excelente compra.', 5, '2024-01-03', 1, 4, 4),
(4, 'Buena atención al cliente, todo perfecto.', 5, '2024-01-04', 1, 5, 5),
(5, 'Me ayudaron a encontrar el coche ideal.', 5, '2024-01-05', 1, 6, 6);

-- Inserción de datos en la tabla Payment_method
INSERT INTO payment_methods (id_card, name_card, type_card, number_card, date_card, cvv_card, users_id_user) VALUES
(1, 'Luis Meléndez', 'Visa', '4154187326118117', '2025-10-01', '123', 2),
(2, 'Libertad Rivas', 'MasterCard', '317349875390931', '2024-09-01', '456', 3),
(3, 'Antonio Rosas', 'American Express', '371449635398431', '2023-08-01', '789', 4),
(4, 'Sergio Rolón', 'Discover', '6011000990139424', '2026-07-01', '012', 5),
(5, 'Adrián Hernández', 'Visa', '5231789940139574', '2025-06-01', '345', 6);

-- Inserción de datos en la tabla Deposit_method
INSERT INTO deposit_methods (id_account, name_account, name_bank, account_bank, users_id_user) VALUES
(1, 'Luis Meléndez', 'BBVA', '1234567890', 2),
(2, 'Libertad Rivas', 'Banamex', '0987654321', 3),
(3,'Antonio Rosas', 'Banorte', '2345678901', 4),
(4, 'Sergio Rolón', 'Santander', '3456789012', 5),
(5, 'Andrés Hernández', 'HSBC', '4567890123', 6);

-- Inserción de datos en la tabla Transactions
INSERT INTO transactions (id_transaction, date_transaction, users_id_buyer, users_id_seller, cars_id_cars, payment_method_id_card, deposit_method_id_account) VALUES
(1, '2024-10-01', 2, 1, 1, 1, 1),
(2, '2024-10-02', 3, 2, 2, 2, 2),
(3, '2024-10-03', 4, 3, 12, 3, 3),
(4, '2024-10-04', 5, 4, 17, 4, 4),
(5, '2024-10-05', 6, 5, 22, 5, 5);

