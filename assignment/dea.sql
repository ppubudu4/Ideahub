-- phpMyAdmin SQL Dump
-- version 4.8.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 15, 2018 at 04:45 PM
-- Server version: 10.1.32-MariaDB
-- PHP Version: 7.2.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dea`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `username` varchar(10) NOT NULL,
  `password` varchar(10) NOT NULL,
  `name` varchar(20) NOT NULL,
  `email` varchar(20) NOT NULL,
  `contactno` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`username`, `password`, `name`, `email`, `contactno`) VALUES
('achintha', '123', 'achinthad', '123', '123'),
('akila', '123', 'akilabada', '123', '123');

-- --------------------------------------------------------

--
-- Table structure for table `dates`
--

CREATE TABLE `dates` (
  `date` varchar(50) NOT NULL,
  `event_ID` int(11) NOT NULL,
  `events` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dates`
--

INSERT INTO `dates` (`date`, `event_ID`, `events`) VALUES
('2018-02-12', 1, 'wwww'),
('1', 2, '3'),
('2018-07-10', 3, 'saldjnlsasac'),
('2018-07-10', 4, 'aksdnja'),
('2018-07-24', 5, 'sahjdbas'),
('2018-07-10', 6, 'ajgdv'),
('2018-07-23', 7, 'asjgvad'),
('2018-07-10', 8, 'jjjjjjjjjjjjjjjjjjjjjjjjjjjjj'),
('2018-07-10', 9, 'eeeeeeeeeeeeeeeeeeeeeeeee'),
('2018-07-10', 10, 'ttttttttttttttttttttttttttttt'),
('2018-07-09', 11, 'rrrrrrrrrrrrrrrrrrrrrrrrrr'),
('2018-07-10', 12, 'dddddddddddddddddd'),
('2018-07-10', 13, 'dddddddddddddddddd'),
('2018-07-16', 14, 'ffffffffffffffffffffffffffffffffff'),
('2018-07-16', 15, 'vvvvvvvvvvvvvvvvvvvvvvvvvvvvv'),
('2018-07-16', 16, 'ssssssssssssssss'),
('2018-07-16', 17, 'aaaaaaaaaaaaaaaaaaaaaa'),
('2018-07-16', 18, 'zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz'),
('2018-07-18', 19, 'bbbbbbbbbbbbbbbbbbbbbbbb'),
('null', 20, 'null');

-- --------------------------------------------------------

--
-- Table structure for table `events_image`
--

CREATE TABLE `events_image` (
  `ID` int(11) NOT NULL,
  `event_ID` int(11) NOT NULL,
  `comment` varchar(50) NOT NULL,
  `photo` mediumblob NOT NULL,
  `username` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `event_comment`
--

CREATE TABLE `event_comment` (
  `event_ID` varchar(50) NOT NULL,
  `comment` varchar(1000) NOT NULL,
  `ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `event_comment`
--

INSERT INTO `event_comment` (`event_ID`, `comment`, `ID`) VALUES
('null', 'null', 1),
('1', 'eeeeeeeeeeeeeeeeeeeee', 2),
('1', 'wwwwwwwwwwwwwwwwww', 3),
('1', 'wwwwwwwwwwwwwwwwww', 4),
('1', 'qqqqqqqqqqqqqqqqqqqqqq', 5),
('1', 'eeeeee', 6),
('1', 'kkkkkkkkkkkkkkkkkkkk', 7),
('1', 'bbbbbbbbbbbbbbbbbbbbb', 8),
('1', 'hhhhhhhhhhhhhhhhhhhh', 9),
('1', 'ddddddddddddd', 10),
('1', 'jjjjjjjjjjjjjjjjj', 11),
('wwww', 'sanaklapa', 12),
('1', 'xxxxxxxxxxxxxxxxxxxxx', 13);

-- --------------------------------------------------------

--
-- Table structure for table `idea`
--

CREATE TABLE `idea` (
  `idea_id` int(11) NOT NULL,
  `Idea` varchar(500) NOT NULL,
  `name` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `idea`
--

INSERT INTO `idea` (`idea_id`, `Idea`, `name`) VALUES
(1, 'wwwwwwwwwwwwwwwwww', 'amal'),
(2, 'wwwwwwwwwwwwwww', 'aaa'),
(3, 'hohohhohoho', 'wewew'),
(4, 'dddddddddd', 'wewe'),
(5, 'qqqqqqqqqqq', 'ww'),
(6, 'dasxa', 'sada'),
(7, 'dddddddddddddddd', 'dww'),
(8, 'djsha', 'sada'),
(9, 'sankalpa', 'sada'),
(10, 'dddddddddddddddddddddddddddd', 'mal'),
(11, 'sdad', 'sankalpa');

-- --------------------------------------------------------

--
-- Table structure for table `idea_comment`
--

CREATE TABLE `idea_comment` (
  `event_id` varchar(10) NOT NULL,
  `comment` varchar(500) NOT NULL,
  `id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `idea_comment`
--

INSERT INTO `idea_comment` (`event_id`, `comment`, `id`) VALUES
('1', 'wwwwwwwwwwww', 1),
('1', 'wwwwwwwwwwww', 2),
('1', 'wwwwwwwwwwww', 3),
('1', 'wwwwwwwwwwww', 4),
('1', 'rrrrrrrrrrrrr', 5),
('1', 'dddddd', 6),
('1', 'hhhhhhhhhhhhhhhhhhhh', 7),
('null', 'jjjjjjjjjjjjjjjjjjjjjjj', 8),
('null', 'dddddddddddddddddddd', 9),
('1', 'ssssssssssssss', 10),
('null', 'zzzzzzzzzzzzzzzzzz', 11),
('1', 'gggggggggggggg', 12),
('1', 'bbbbbbbbbbbbbbbbbb', 13),
('1', 'ffffffffffffffffffff', 14),
('2', 'ffffffffffffffffffffffff', 15),
('1', 'mmmmmmmmmmmm', 16),
('10', 'xxxxxxxxxxxxxxxx', 17);

-- --------------------------------------------------------

--
-- Table structure for table `industry`
--

CREATE TABLE `industry` (
  `name` varchar(10) NOT NULL,
  `password` varchar(10) NOT NULL,
  `email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `industry`
--

INSERT INTO `industry` (`name`, `password`, `email`) VALUES
('omobio', '123', '123'),
('sliit', '1234', 'san@sank.lk'),
('sanka', '1234', 'sankalpa@smartvalley.lk');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `NIC` varchar(10) NOT NULL,
  `name` varchar(20) NOT NULL,
  `degree` varchar(20) NOT NULL,
  `university` varchar(20) NOT NULL,
  `email` varchar(50) NOT NULL,
  `contactno` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`username`, `password`, `NIC`, `name`, `degree`, `university`, `email`, `contactno`) VALUES
('achintha', '1234', '970343547V', 'achintha', 'UCD CS', '', 'dilesha@gmail.com', '0778854986'),
('123', '123', '123', '1234', '123', '', '123', '123'),
('789', '789', '789', '7891', '789', '789', '789', '789'),
('akilabada', '123', '123', 'akila', 'SE', 'plymouth bada', '123bada', '123'),
('sankalpa', '1234', '12345', 'sana', 'CS', 'NSBM', 'sankalpa@smartvalley.lk', '0771500164');

-- --------------------------------------------------------

--
-- Table structure for table `university`
--

CREATE TABLE `university` (
  `name` varchar(10) NOT NULL,
  `password` varchar(10) NOT NULL,
  `email` varchar(50) NOT NULL,
  `contactno` varchar(10) NOT NULL,
  `location` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `university`
--

INSERT INTO `university` (`name`, `password`, `email`, `contactno`, `location`) VALUES
('NSBM', '123', '123', '123456', 'Homagama'),
('sliit', '123', '123', '123', 'malabe'),
('IIT', '123', 'sankalpa@smartvalley.lk', '0771500164', 'Hanthana'),
('IIT3', '321', 'sankalpa@smartvalley.lk', '0771500164', 'Hanthana');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `dates`
--
ALTER TABLE `dates`
  ADD PRIMARY KEY (`event_ID`);

--
-- Indexes for table `events_image`
--
ALTER TABLE `events_image`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `event_comment`
--
ALTER TABLE `event_comment`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `idea`
--
ALTER TABLE `idea`
  ADD PRIMARY KEY (`idea_id`);

--
-- Indexes for table `idea_comment`
--
ALTER TABLE `idea_comment`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `dates`
--
ALTER TABLE `dates`
  MODIFY `event_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT for table `events_image`
--
ALTER TABLE `events_image`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `event_comment`
--
ALTER TABLE `event_comment`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `idea`
--
ALTER TABLE `idea`
  MODIFY `idea_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `idea_comment`
--
ALTER TABLE `idea_comment`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
