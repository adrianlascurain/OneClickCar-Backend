USE oneclickcar;

-- Inserción de datos en la tabla Users
INSERT INTO Users (id_user, full_name, phone_number, email, birth_date, password, type_user) VALUES
(1, 'Juan Santos', '1234567890', 'oneclickcarcontacto@gmail.com', '1990-01-01', 'password1', 'administrador'),
(2, 'Luis Meléndez', '0987654321', 'luis@example.com', '1992-02-02', 'password2', 'cliente'),
(3, 'Libertad Rivas', '2345678901', 'libertad@example.com', '1993-03-03', 'password3', 'cliente'),
(4, 'Antonio Rosas', '3456789012', 'antonio@example.com', '1994-04-04', 'password4', 'cliente'),
(5, 'Sergio Rolón', '4567890123', 'sergio@example.com', '1995-05-05', 'password5', 'cliente'),
(6, 'Andrés Hernández', '5678901234', 'andres@example.com', '1996-06-06', 'password6', 'cliente');


-- Inserción de datos en la tabla Cars
INSERT INTO Cars (id_cars, type, brand, name, year, kilometer, transmission, price, img, owners, description, verified, sold, Users_id_user) VALUES
(1, 'Sedán', 'Chevrolet', 'Cavalier', 2021, 51000, 'Manual', 320000, 'https://res.cloudinary.com/duqki6x6t/image/upload/v1727889397/CARROS%20ACTUALIZACION/SEDAN/jzmc4om5b6305qnkarzp.jpg', 2, 'Llevate este excelente vehículo en óptimas condiciones. Ha pasado todas las revisiones (mécanica y legal), así que contacta al vendedor para más información, cita para revisión o compra.', 1, 0, 2),
(2, 'Sedán', 'KIA', 'Forte', 2019, 97000, 'Manual', 217000, 'https://res.cloudinary.com/duqki6x6t/image/upload/v1727889397/CARROS%20ACTUALIZACION/SEDAN/xrw9p0u81kudod72eo9z.jpg', 1, 'Llevate este excelente vehículo en óptimas condiciones. Ha pasado todas las revisiones (mécanica y legal), así que contacta al vendedor para más información, cita para revisión o compra.', 1, 0, 3),
(12, 'SUV', 'Toyota', 'RAV-4', 2018, 117000, 'Manual', 264000, 'https://res.cloudinary.com/duqki6x6t/image/upload/v1727897951/CARROS%20ACTUALIZACION/SUV/gquq5ocroeosm3bab8ht.jpg', 1, 'Llevate este excelente vehículo en óptimas condiciones. Ha pasado todas las revisiones (mécanica y legal), así que contacta al vendedor para más información, cita para revisión o compra.', 1, 0, 4),
(17, 'Hatchback', 'Volkswagen', 'Polo', 2017, 63000, 'Manual', 189000, 'https://res.cloudinary.com/duqki6x6t/image/upload/v1727899396/CARROS%20ACTUALIZACION/HATCHBACK/cg5xuvfhmnodgrlwdgcb.jpg', 1, 'Llevate este excelente vehículo en óptimas condiciones. Ha pasado todas las revisiones (mécanica y legal), así que contacta al vendedor para más información, cita para revisión o compra.', 1, 0, 5),
(22, 'Pick Up', 'Dodge', 'Ram 1500 TRX', 2021, 57000, 'Manual', 580000, 'https://res.cloudinary.com/duqki6x6t/image/upload/v1727899396/CARROS%20ACTUALIZACION/PICK%20UP/yf137l97v50bv7dayqy3.jpg', 1, 'Llevate este excelente vehículo en óptimas condiciones. Ha pasado todas las revisiones (mécanica y legal), así que contacta al vendedor para más información, cita para revisión o compra.', 1, 0, 6);

-- Inserción de datos en la tabla Comments
INSERT INTO Comments (id_comment, content, rating, comment_date, approved, Sellers_id_seller, Users_id_user) VALUES
(1, 'Excelente servicio, muy recomendado.', 5, '2024-01-01', 1, 2, 2),
(2, 'El coche está en muy buen estado.', 4, '2024-01-02', 1, 3, 3),
(3, 'Me encantó el vehículo, excelente compra.', 5, '2024-01-03', 1, 4, 4),
(4, 'Buena atención al cliente, todo perfecto.', 5, '2024-01-04', 1, 5, 5),
(5, 'Me ayudaron a encontrar el coche ideal.', 5, '2024-01-05', 1, 6, 6);

-- Inserción de datos en la tabla Payment_method
INSERT INTO Payment_method (id_card, name_card, type_card, number_card, date_card, cvv_card, Users_id_user) VALUES
(1, 'Luis Meléndez', 'Visa', '4154187326118117', '2025-10-01', '123', 2),
(2, 'Libertad Rivas', 'MasterCard', '317349875390931', '2024-09-01', '456', 3),
(3, 'Antonio Rosas', 'American Express', '371449635398431', '2023-08-01', '789', 4),
(4, 'Sergio Rolón', 'Discover', '6011000990139424', '2026-07-01', '012', 5),
(5, 'Andrés Hernández', 'Visa', '5231789940139574', '2025-06-01', '345', 6);

-- Inserción de datos en la tabla Deposit_method
INSERT INTO Deposit_method (id_account, name_account, name_bank, account_bank, Users_id_user) VALUES
(1, 'Luis Meléndez', 'BBVA', '1234567890', 2),
(2, 'Libertad Rivas', 'Banamex', '0987654321', 3),
(3,'Antonio Rosas', 'Banorte', '2345678901', 4),
(4, 'Sergio Rolón', 'Santander', '3456789012', 5),
(5, 'Andrés Hernández', 'HSBC', '4567890123', 6);

-- Inserción de datos en la tabla Transactions
INSERT INTO Transactions (id_transaction, date_transaction, Users_id_buyer, Users_id_seller, Cars_id_cars, Payment_method_id_card, Deposit_method_id_account) VALUES
(1, '2024-10-01', 2, 1, 1, 1, 1),
(2, '2024-10-02', 3, 2, 2, 2, 2),
(3, '2024-10-03', 4, 3, 12, 3, 3),
(4, '2024-10-04', 5, 4, 17, 4, 4),
(5, '2024-10-05', 6, 5, 22, 5, 5);

