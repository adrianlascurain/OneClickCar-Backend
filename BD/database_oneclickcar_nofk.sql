-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema OneClickCar
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema OneClickCar
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `OneClickCar` DEFAULT CHARACTER SET utf8 ;
USE `OneClickCar` ;

-- -----------------------------------------------------
-- Table `OneClickCar`.`users`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `OneClickCar`.`users` (
  `id_user` INT UNSIGNED NOT NULL,
  `full_name` VARCHAR(80) NOT NULL,
  `phone_number` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `birth_date` VARCHAR(10) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `type_user` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_user`))
ENGINE = InnoDB
COMMENT = '	';


-- -----------------------------------------------------
-- Table `OneClickCar`.`cars`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `OneClickCar`.`cars` (
  `id_cars` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `type` VARCHAR(45) NOT NULL,
  `brand` VARCHAR(45) NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `year` VARCHAR(10) NOT NULL,
  `kilometer` INT NOT NULL,
  `transmission` VARCHAR(45) NOT NULL,
  `price` INT UNSIGNED NOT NULL,
  `img` VARCHAR(200) NOT NULL,
  `owners` INT UNSIGNED NOT NULL,
  `description` LONGTEXT NOT NULL,
  `verified` TINYINT UNSIGNED NOT NULL,
  `sold` TINYINT UNSIGNED NOT NULL,
  `nu_serial` VARCHAR(17) NOT NULL,
  `users_id_user` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`id_cars`, `users_id_user`),
  UNIQUE INDEX `nu_serial_UNIQUE` (`nu_serial` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `OneClickCar`.`comments`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `OneClickCar`.`comments` (
  `id_comment` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `content` TEXT NOT NULL,
  `rating` INT NOT NULL,
  `comment_date` VARCHAR(10) NOT NULL,
  `approved` TINYINT NOT NULL,
  `sellers_id_seller` INT UNSIGNED NOT NULL,
  `users_id_user` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`id_comment`, `sellers_id_seller`, `users_id_user`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `OneClickCar`.`payment_methods`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `OneClickCar`.`payment_methods` (
  `id_card` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `name_card` VARCHAR(45) NOT NULL,
  `type_card` VARCHAR(45) NOT NULL,
  `number_card` VARCHAR(16) NOT NULL,
  `date_card` VARCHAR(10) NOT NULL,
  `cvv_card` VARCHAR(3) NOT NULL,
  `users_id_user` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`id_card`, `users_id_user`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `OneClickCar`.`deposit_methods`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `OneClickCar`.`deposit_methods` (
  `id_account` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `name_account` VARCHAR(45) NOT NULL,
  `name_bank` VARCHAR(45) NOT NULL,
  `account_bank` VARCHAR(16) NOT NULL,
  `users_id_user` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`id_account`, `users_id_user`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `OneClickCar`.`transactions`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `OneClickCar`.`transactions` (
  `id_transaction` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `date_transaction` VARCHAR(10) NOT NULL,
  `users_id_buyer` INT UNSIGNED NOT NULL,
  `users_id_seller` INT UNSIGNED NOT NULL,
  `cars_id_cars` INT UNSIGNED NOT NULL,
  `payment_method_id_card` INT UNSIGNED NOT NULL,
  `deposit_method_id_account` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`id_transaction`, `users_id_buyer`, `users_id_seller`, `cars_id_cars`, `payment_method_id_card`, `deposit_method_id_account`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
