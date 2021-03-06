-- phpMyAdmin SQL Dump
-- version 4.9.3
-- https://www.phpmyadmin.net/
--
-- Host: localhost:8889
-- Waktu pembuatan: 31 Jul 2020 pada 15.24
-- Versi server: 5.7.26
-- Versi PHP: 7.4.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mahasiswa`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `identitas`
--

CREATE TABLE `identitas` (
  `nim` int(15) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `alamat` text NOT NULL,
  `jeniskelamin` varchar(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `identitas`
--

INSERT INTO `identitas` (`nim`, `nama`, `alamat`, `jeniskelamin`) VALUES
(1855201005, 'CITRA MIRNAWATI', 'JL SERAM NO 14 03/02 KEL KLAMPOK KEC SANANWETAN KOTA BLITAR', 'P'),
(1855201016, 'CHOIRUNNUFATUL ', 'DSN SUKOREJO 02/04 KEL SUKOREJO KEC UDANAWU KAB BLITAR', 'P'),
(1855201036, 'AHMAD WILDAN ALFARIZY', 'JL MANGGAR 03/08 KEL SUKOREJO KEC SUKOREJO KAB BLITAR', 'L'),
(1855201045, 'AANG SURYO WIYONO', 'DSN PRAYAN 07/02 KEL SUBONTORO KEC BOYOLANGU KAB TULUNGAGUNG', 'L'),
(1855201015, 'MUJAWADATUL KHULUQ', 'DSN BUKUR 03/05 KEL POPOH KEC SELOPURO KAB BLITAR', 'L'),
(1855201019, 'WALIDATUL ISNA KHASANAH', 'DSN TEGALREJO 01/011 KEL SAWENTAR KEC KANIGORO KAB BLITAR', 'L'),
(1855201018, 'FATURRAHMAN', 'DSN PUNDENSARI 01/02 KEL JEBLOG KEC TALUN KAB BLITAR', 'P'),
(1855201023, 'KRISNA FREDY NUR CAHYA', 'JL CIMANDIRI NO 23 02/09 KEL TANGGUNG KEC KEPANJENKIDUL KOTA BLITAR', 'P'),
(1855201024, 'MOH. SARIF HIDAYATULLOH', 'DSN KEMLOKO 01/04 KEL KEMLOKO KEC NGLEGOK KAB BLITAR', 'P'),
(1855201035, 'REKHAN FAHMI SUGIANTO', 'DSN PLUMBANGAN 03/02 KEL PLUMBANGAN KEC DOKO KAB BLITAR', 'P'),
(1855201026, 'YUSUF KHOMARUDIN AKHMAD', 'DSN KEMBANGAN 03/09 KEL SUMBERJO KEC SANANKULON KAB BLITAR', 'P'),
(1855201031, 'NICO FREDIANSYAH', 'JL CAKRANINGRAT 001/003 KEL SENTUL KEC KEPANJENKIDUL KAB BLITAR', 'L'),
(1855201025, 'TATIMATUL KURIYAH', 'DSN SUMBER 1 03/02 KEL SUMBER KEC SANANKULON KAB BLITAR', 'L'),
(1855201041, 'MIFTAKHUL ULUM ', 'DSN PANTIMULYO 06/03 KEL KENDALREJO KEC TALUN KAB BLITAR', 'L'),
(1855201012, 'MUH. FATWA ZAYYINI FATHI', 'DSN PANDANARUM 04/01 KEL PANDANARUM KEC SUTOJAYAN KAB BLITAR', 'L'),
(1855201027, 'DHIAZME AYU NINGSIH', 'DSN BETEK 01/02 KEL REJOSO KEC BINANGUN KAB BLITAR', 'P'),
(1855201042, 'RIPKA FARIDATUL MAULIDA', 'DSN KRAJAN 07/01 KEL GAMPINGAN KEC PAGAK KAB MALANG', 'P'),
(1855201004, 'M. MAULANA IKHSAN', 'DSN BANGGLE 03/03 KEL BANGGLE KEC KANIGORO KAB BLITAR', 'P'),
(1855201017, 'ENDAH SRI WAHYUNI', 'LINGKUNGAN KENDALDOYONG 04/01 KEL TOGOGAN KEC SRENGAT KAB BLITAR', 'P'),
(1855201009, 'DEWI LESTARI', 'DSN CENTONG 03/03 KEL PURWOREJO KEC SANANKULON KAB BLITAR', 'P'),
(1855201010, 'MUHAMMAD NAUFAL SA\'ID D', 'DSN PUNDENSARI 02/02 KEL JEBLOG KEC TALUN KAB BLITAR', 'L'),
(1855201002, 'DIMAS IBNU MALIK', 'JL. CITARIK NO 16 02/08 KEL BENDO KEC KEPANJENKIDUL KOTA BLITAR', 'L'),
(1855201003, 'MOH. SUGIARTO', 'DSN GAJAH 04/03 KEL PAPUNGAN KEC KANIGORO KAB BLITAR', 'L'),
(1855201038, 'IZULMA SULTAN AQIL', 'JL KALI GLAGAH 02/09 KEL TANJUNGSARI KEC SUKOREJO KOTA BLITAR', 'L'),
(1855201032, 'MUHAMMAD HAIKAL BAZIWILHAN', 'DSN KEDUNGLURAH 019/007 KEL KEDUNGLURAH KEC POGALAN KAB TRENGGALEK', 'P'),
(1855201064, 'MUHAMMAD HAEKAL AZAIM', 'DSN SUKOREJO 001/002 KEL SUKOREJO KEC WATES KAB BLITAR', 'P'),
(1855201058, 'WAHYU ADI SAPUTRO', 'PECUK 003/004 KEL PECUK KEC PATIANROWO KAB NGANJUK ', 'P'),
(1855201059, 'DIKKY SETYAWAN', 'DSN SUMBERJO 002/015 KEL KARANGREJO KEC GARUM KAB BLITAR', 'P'),
(1855201078, 'ALFIAN DWI SUSILO', 'DSN MOJOREJO 024/005 KEL MOJOREJO KEC WATES KAB BLITAR', 'P');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
