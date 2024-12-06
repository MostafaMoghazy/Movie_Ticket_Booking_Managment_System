-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 24, 2024 at 02:56 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `moviebook`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin2`
--

CREATE TABLE `admin2` (
  `email` varchar(100) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `admin2`
--

INSERT INTO `admin2` (`email`, `username`, `password`) VALUES
('youssefayman55@gmail.com', 'ahmed77', '123456789'),
('amrnabil77@gmail.com', 'amr77', 'amrnabil77'),
('drhadeer77@gmail.com', 'drhadeer', 'drhadeer123'),
('mostafa77@gmail.com', 'mostafa77', 'mostafa77'),
('youssefayman55666@gmail.com', 'youssef77', 'youssef77'),
('youssefayman5555@gmail.com', 'youssef7788', '123456789');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `id` int(100) NOT NULL,
  `type` varchar(100) NOT NULL,
  `movieTitle` varchar(100) NOT NULL,
  `quantity` int(100) NOT NULL,
  `total` double NOT NULL,
  `date` date DEFAULT NULL,
  `time` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`id`, `type`, `movieTitle`, `quantity`, `total`, `date`, `time`) VALUES
(15, 'Special & Normal Class', 'SpiderMan - NoWayHome', 4, 70, '2024-05-22', '09:23:39'),
(16, 'Special Class', 'SpiderMan - NoWayHome', 3, 75, '2024-05-22', '09:40:50'),
(18, 'Special & Normal Class', 'SpiderMan - NoWayHome', 9, 165, '2024-05-22', '14:38:47'),
(19, 'Special & Normal Class', 'SpiderMan - NoWayHome', 6, 135, '2024-05-22', '14:42:18'),
(20, 'Special & Normal Class', 'SpiderMan - NoWayHome', 3, 60, '2024-05-24', '10:13:57'),
(21, 'Special & Normal Class', 'SpiderMan - NoWayHome', 5, 110, '2024-05-24', '10:15:28'),
(22, 'Special Class', 'SpiderMan - NoWayHome', 2, 50, '2024-05-24', '10:16:10'),
(23, 'Special Class', 'SpiderMan - NoWayHome', 2, 50, '2024-05-24', '10:17:50'),
(24, 'Special Class', 'SpiderMan - NoWayHome', 1, 25, '2024-05-24', '10:24:17'),
(25, 'Special & Normal Class', 'SpiderMan - NoWayHome', 2, 35, '2024-05-24', '10:24:28'),
(26, 'Special & Normal Class', 'SpiderMan - NoWayHome', 3, 60, '2024-05-24', '10:26:18'),
(27, 'Special & Normal Class', 'SpiderMan - NoWayHome', 3, 60, '2024-05-24', '13:19:58'),
(28, 'Special & Normal Class', 'SpiderMan - NoWayHome', 3, 60, '2024-05-24', '13:21:30'),
(29, 'Special Class', 'HarryPotter- And the Deathly Hallows', 2, 50, '2024-05-24', '13:54:29'),
(30, 'Special Class', 'HarryPotter- And the Deathly Hallows', 3, 75, '2024-05-24', '13:56:09'),
(31, 'Special & Normal Class', 'HarryPotter- And the Deathly Hallows', 4, 70, '2024-05-24', '13:57:36'),
(32, 'Normal Class ', 'SpiderMan - NoWayHome', 1, 10, '2024-05-24', '13:57:46'),
(33, 'Special & Normal Class', 'HarryPotter- And the Deathly Hallows', 6, 120, '2024-05-24', '13:58:12'),
(34, 'Special Class', 'HarryPotter- And the Deathly Hallows', 1, 25, '2024-05-24', '14:02:50'),
(35, 'Special Class', 'SpiderMan - NoWayHome', 1, 25, '2024-05-24', '14:05:25'),
(36, 'Special & Normal Class', 'HarryPotter- And the Deathly Hallows', 4, 85, '2024-05-24', '14:33:37'),
(37, 'Special & Normal Class', 'HarryPotter- And the Deathly Hallows', 4, 85, '2024-05-24', '14:52:35');

-- --------------------------------------------------------

--
-- Table structure for table `customer_info`
--

CREATE TABLE `customer_info` (
  `id` int(100) NOT NULL,
  `customer_id` int(100) NOT NULL,
  `type` varchar(100) NOT NULL,
  `quantity` int(100) NOT NULL,
  `total` double NOT NULL,
  `movieTitle` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `customer_info`
--

INSERT INTO `customer_info` (`id`, `customer_id`, `type`, `quantity`, `total`, `movieTitle`) VALUES
(15, 15, 'Special & Normal Class', 4, 70, 'SpiderMan - NoWayHome'),
(16, 16, 'Special Class', 3, 75, 'SpiderMan - NoWayHome'),
(17, 17, 'Special Class', 3, 75, 'SpiderMan - NoWayHome'),
(18, 18, 'Special & Normal Class', 9, 165, 'SpiderMan - NoWayHome'),
(19, 19, 'Special & Normal Class', 6, 135, 'SpiderMan - NoWayHome'),
(20, 20, 'Special & Normal Class', 3, 60, 'SpiderMan - NoWayHome'),
(21, 21, 'Special & Normal Class', 5, 110, 'SpiderMan - NoWayHome'),
(22, 22, 'Special Class', 2, 50, 'SpiderMan - NoWayHome'),
(23, 23, 'Special Class', 2, 50, 'SpiderMan - NoWayHome'),
(24, 24, 'Special Class', 1, 25, 'SpiderMan - NoWayHome'),
(25, 25, 'Special & Normal Class', 2, 35, 'SpiderMan - NoWayHome'),
(26, 26, 'Special & Normal Class', 3, 60, 'SpiderMan - NoWayHome'),
(27, 27, 'Special & Normal Class', 3, 60, 'SpiderMan - NoWayHome'),
(28, 28, 'Special & Normal Class', 3, 60, 'SpiderMan - NoWayHome'),
(29, 29, 'Special Class', 2, 50, 'HarryPotter- And the Deathly Hallows'),
(30, 30, 'Special Class', 3, 75, 'HarryPotter- And the Deathly Hallows'),
(31, 31, 'Special & Normal Class', 4, 70, 'HarryPotter- And the Deathly Hallows'),
(32, 32, 'Normal Class ', 1, 10, 'SpiderMan - NoWayHome'),
(33, 33, 'Special & Normal Class', 6, 120, 'HarryPotter- And the Deathly Hallows'),
(34, 34, 'Special Class', 1, 25, 'HarryPotter- And the Deathly Hallows'),
(35, 35, 'Special Class', 1, 25, 'SpiderMan - NoWayHome'),
(36, 36, 'Special & Normal Class', 4, 85, 'HarryPotter- And the Deathly Hallows'),
(37, 37, 'Special & Normal Class', 4, 85, 'HarryPotter- And the Deathly Hallows');

-- --------------------------------------------------------

--
-- Table structure for table `movie`
--

CREATE TABLE `movie` (
  `id` int(255) NOT NULL,
  `movieTitle` varchar(100) NOT NULL,
  `genre` varchar(100) NOT NULL,
  `duration` varchar(100) NOT NULL,
  `image` varchar(500) NOT NULL,
  `date` date DEFAULT NULL,
  `current` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `movie`
--

INSERT INTO `movie` (`id`, `movieTitle`, `genre`, `duration`, `image`, `date`, `current`) VALUES
(2, 'SpiderMan - NoWayHome', 'Fantasy/Action', '2:25:00', 'C:\\\\Users\\\\Mostafa\\\\Desktop\\\\lastVersion\\\\lastVersion\\\\moviesdata\\\\src\\\\Images\\\\unnamed.png', '2021-05-20', 'Showing'),
(2, 'HarryPotter- And the Deathly Hallows', 'Fantasy/Adventure', '2:25:00', 'C:\\\\Users\\\\Mostafa\\\\Desktop\\\\MovieTicketBookingManagmentSystem Group5\\\\moviesdata\\\\src\\\\Images\\\\DH2soundtrack.jpg', '2011-05-09', 'Showing');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin2`
--
ALTER TABLE `admin2`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `customer_info`
--
ALTER TABLE `customer_info`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=38;

--
-- AUTO_INCREMENT for table `customer_info`
--
ALTER TABLE `customer_info`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=38;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
