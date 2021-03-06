USE [master]
GO
/****** Object:  Database [SoalQuis]    Script Date: 10/10/2017 10:14:39 AM ******/
CREATE DATABASE [SoalQuis]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'SoalQuis', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL11.MSSQLSERVER\MSSQL\DATA\SoalQuis.mdf' , SIZE = 4096KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'SoalQuis_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL11.MSSQLSERVER\MSSQL\DATA\SoalQuis_log.ldf' , SIZE = 1024KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [SoalQuis] SET COMPATIBILITY_LEVEL = 110
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [SoalQuis].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [SoalQuis] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [SoalQuis] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [SoalQuis] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [SoalQuis] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [SoalQuis] SET ARITHABORT OFF 
GO
ALTER DATABASE [SoalQuis] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [SoalQuis] SET AUTO_CREATE_STATISTICS ON 
GO
ALTER DATABASE [SoalQuis] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [SoalQuis] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [SoalQuis] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [SoalQuis] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [SoalQuis] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [SoalQuis] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [SoalQuis] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [SoalQuis] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [SoalQuis] SET  DISABLE_BROKER 
GO
ALTER DATABASE [SoalQuis] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [SoalQuis] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [SoalQuis] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [SoalQuis] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [SoalQuis] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [SoalQuis] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [SoalQuis] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [SoalQuis] SET RECOVERY FULL 
GO
ALTER DATABASE [SoalQuis] SET  MULTI_USER 
GO
ALTER DATABASE [SoalQuis] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [SoalQuis] SET DB_CHAINING OFF 
GO
ALTER DATABASE [SoalQuis] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [SoalQuis] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
EXEC sys.sp_db_vardecimal_storage_format N'SoalQuis', N'ON'
GO
USE [SoalQuis]
GO
/****** Object:  Table [dbo].[Category]    Script Date: 10/10/2017 10:14:39 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Category](
	[Id] [int] IDENTITY(1,1) NOT NULL,
	[Name] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_Category] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[SEQUENCE]    Script Date: 10/10/2017 10:14:39 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[SEQUENCE](
	[SEQ_NAME] [varchar](50) NOT NULL,
	[SEQ_COUNT] [numeric](28, 0) NULL,
PRIMARY KEY CLUSTERED 
(
	[SEQ_NAME] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Soal]    Script Date: 10/10/2017 10:14:39 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Soal](
	[Id] [int] IDENTITY(1,1) NOT NULL,
	[Kata] [nvarchar](50) NOT NULL,
	[Hint] [nvarchar](60) NOT NULL,
	[Category_Id] [int] NOT NULL,
 CONSTRAINT [PK_Soal] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET IDENTITY_INSERT [dbo].[Category] ON 

INSERT [dbo].[Category] ([Id], [Name]) VALUES (1, N'App Mobile')
INSERT [dbo].[Category] ([Id], [Name]) VALUES (2, N'Buah')
SET IDENTITY_INSERT [dbo].[Category] OFF
INSERT [dbo].[SEQUENCE] ([SEQ_NAME], [SEQ_COUNT]) VALUES (N'SEQ_GEN', CAST(0 AS Numeric(28, 0)))
SET IDENTITY_INSERT [dbo].[Soal] ON 

INSERT [dbo].[Soal] ([Id], [Kata], [Hint], [Category_Id]) VALUES (1, N'Instagram', N'Aplikasi pembuat story life', 1)
INSERT [dbo].[Soal] ([Id], [Kata], [Hint], [Category_Id]) VALUES (2, N'GO-RIDE', N'Aplikasi transportasi online', 1)
INSERT [dbo].[Soal] ([Id], [Kata], [Hint], [Category_Id]) VALUES (3, N'GRAB TAXI', N'Aplikasi transportasi online', 1)
INSERT [dbo].[Soal] ([Id], [Kata], [Hint], [Category_Id]) VALUES (4, N'LINE', N'Aplikasi chatting dengan ciri khas stiker', 1)
INSERT [dbo].[Soal] ([Id], [Kata], [Hint], [Category_Id]) VALUES (5, N'Whatsapp', N'Aplikasi chatting dengan login nomer handphone', 1)
INSERT [dbo].[Soal] ([Id], [Kata], [Hint], [Category_Id]) VALUES (6, N'Youtube', N'Aplikasi berbasis video online', 1)
INSERT [dbo].[Soal] ([Id], [Kata], [Hint], [Category_Id]) VALUES (7, N'Telegram', N'Aplikasi chatting dengan game di group chat', 1)
INSERT [dbo].[Soal] ([Id], [Kata], [Hint], [Category_Id]) VALUES (8, N'Jobs Street', N'Aplikasi pencari pekerjaan', 1)
INSERT [dbo].[Soal] ([Id], [Kata], [Hint], [Category_Id]) VALUES (9, N'Mobile Legends', N'Aplikasi game MOBA', 1)
INSERT [dbo].[Soal] ([Id], [Kata], [Hint], [Category_Id]) VALUES (10, N'Spotify', N'Aplikasi berbasis musik online', 1)
INSERT [dbo].[Soal] ([Id], [Kata], [Hint], [Category_Id]) VALUES (11, N'JOOX', N'Aplikasi berbasis musik online', 1)
INSERT [dbo].[Soal] ([Id], [Kata], [Hint], [Category_Id]) VALUES (12, N'Semangka', N'Warna daging buahnya merah dan ada bijinya', 2)
INSERT [dbo].[Soal] ([Id], [Kata], [Hint], [Category_Id]) VALUES (13, N'Apel', N'Biasanya warna kulitnya merah, tapi ada juga hijau', 2)
INSERT [dbo].[Soal] ([Id], [Kata], [Hint], [Category_Id]) VALUES (14, N'Nanas', N'Ada durinya di kulitnya', 2)
INSERT [dbo].[Soal] ([Id], [Kata], [Hint], [Category_Id]) VALUES (15, N'Jambu', N'Sering dijadiin bahan rujak', 2)
INSERT [dbo].[Soal] ([Id], [Kata], [Hint], [Category_Id]) VALUES (16, N'Mangga', N'Ada buah dari Indramayu', 2)
INSERT [dbo].[Soal] ([Id], [Kata], [Hint], [Category_Id]) VALUES (17, N'Jeruk', N'Buah ini juga ada yang memakai nama Bali', 2)
INSERT [dbo].[Soal] ([Id], [Kata], [Hint], [Category_Id]) VALUES (18, N'Manggis', N'Jumlah isi daging buah sering diprediksi dari kulit', 2)
INSERT [dbo].[Soal] ([Id], [Kata], [Hint], [Category_Id]) VALUES (19, N'Anggur', N'Bulet-bulet, kecil, banyak', 2)
INSERT [dbo].[Soal] ([Id], [Kata], [Hint], [Category_Id]) VALUES (20, N'Ceri', N'Biasanya warna merah', 2)
SET IDENTITY_INSERT [dbo].[Soal] OFF
ALTER TABLE [dbo].[Soal]  WITH CHECK ADD  CONSTRAINT [FK_Soal_Category] FOREIGN KEY([Category_Id])
REFERENCES [dbo].[Category] ([Id])
GO
ALTER TABLE [dbo].[Soal] CHECK CONSTRAINT [FK_Soal_Category]
GO
USE [master]
GO
ALTER DATABASE [SoalQuis] SET  READ_WRITE 
GO
