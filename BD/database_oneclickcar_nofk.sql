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
-- Table `OneClickCar`.`Users`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `OneClickCar`.`Users` (
  `id_user` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `full_name` VARCHAR(80) NOT NULL,
  `phone_number` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `birth_date` DATE NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `type_user` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_user`))
ENGINE = InnoDB
COMMENT = '	';


-- -----------------------------------------------------
-- Table `OneClickCar`.`Cars`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `OneClickCar`.`Cars` (
  `id_car` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `type` VARCHAR(45) NOT NULL,
  `brand` VARCHAR(45) NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `year` YEAR NOT NULL,
  `kilometer` INT NOT NULL,
  `transmission` VARCHAR(45) NOT NULL,
  `price` INT UNSIGNED NOT NULL,
  `img` VARCHAR(200) NOT NULL,
  `owners` INT UNSIGNED NOT NULL,
  `description` LONGTEXT NOT NULL,
  `verified` TINYINT UNSIGNED NOT NULL,
  `sold` TINYINT UNSIGNED NOT NULL,
  `Seller_id_user` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`id_car`, `Seller_id_user`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `OneClickCar`.`Comments`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `OneClickCar`.`Comments` (
  `id_comment` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `content` TEXT NOT NULL,
  `rating` INT NOT NULL,
  `comment_date` DATE NOT NULL,
  `approved` TINYINT NOT NULL,
  `Buyer_id_user` INT UNSIGNED NOT NULL,
  `Seller_id_user` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`id_comment`, `Buyer_id_user`, `Seller_id_user`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `OneClickCar`.`Payment_method`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `OneClickCar`.`Payment_method` (
  `id_card` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `name_card` VARCHAR(45) NOT NULL,
  `type_card` VARCHAR(45) NOT NULL,
  `number_card` VARCHAR(16) NOT NULL,
  `date_card` DATE NOT NULL,
  `cvv_card` VARCHAR(3) NOT NULL,
  `Users_id_user` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`id_card`, `Users_id_user`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `OneClickCar`.`Deposit_method`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `OneClickCar`.`Deposit_method` (
  `id_account` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `name_account` VARCHAR(45) NOT NULL,
  `name_bank` VARCHAR(45) NOT NULL,
  `account_bank` VARCHAR(18) NOT NULL,
  `Users_id_user` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`id_account`, `Users_id_user`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `OneClickCar`.`Transactions`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `OneClickCar`.`Transactions` (
  `id_transaction` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `date_transaction` DATE NOT NULL,
  `Buyer_id_user` INT UNSIGNED NOT NULL,
  `Seller_id_user` INT UNSIGNED NOT NULL,
  `Cars_id_car` INT UNSIGNED NOT NULL,
  `Payment_method_id_card` INT UNSIGNED NOT NULL,
  `Deposit_method_id_account` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`id_transaction`, `Buyer_id_user`, `Seller_id_user`, `Cars_id_car`, `Payment_method_id_card`, `Deposit_method_id_account`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
