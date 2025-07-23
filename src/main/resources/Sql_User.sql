USE [CodeDB_1]
GO

/****** Object:  Table [dbo].[MeganetV2.1AppUsers]    Script Date: 01/07/2025 14:29:44 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[MeganetVAppUsers](
    [id] [int] IDENTITY(1,1) NOT NULL,
    [alan1] [varchar](255) NULL,
    [alan10] [varchar](255) NULL,
    [alan2] [varchar](255) NULL,
    [alan3] [varchar](255) NULL,
    [alan4] [varchar](255) NULL,
    [alan5] [varchar](255) NULL,
    [alan6] [varchar](255) NULL,
    [alan7] [varchar](255) NULL,
    [alan8] [varchar](255) NULL,
    [alan9] [varchar](255) NULL,
    [alinanFiyatTeklifi] [bit] NOT NULL,
    [alinanSiparis] [bit] NOT NULL,
    [alisFaturasi] [bit] NOT NULL,
    [alisIadeFaturasi] [bit] NOT NULL,
    [bakiyeGorsun] [bit] NOT NULL,
    [barkodDizayni] [varchar](255) NULL,
    [barkodYaziciAdi] [varchar](255) NULL,
    [belgeDizayn] [varchar](255) NULL,
    [belgeHarfi] [varchar](255) NULL,
    [cariKartAcar] [bit] NOT NULL,
    [created] [datetime2](6) NULL,
    [depoTransfer] [bit] NOT NULL,
    [fisListelesin] [bit] NOT NULL,
    [fisSiler] [bit] NOT NULL,
    [fiseGirebilsin] [bit] NOT NULL,
    [fiyatDegistirir] [bit] NOT NULL,
    [fiyatTipleri] [varchar](255) NULL,
    [iskontoYapabilir] [bit] NOT NULL,
    [kasaId] [varchar](255) NULL,
    [kdvKullanilacak] [bit] NOT NULL,
    [kdvOrani] [real] NOT NULL,
    [nushaAdet] [smallint] NOT NULL,
    [ozelKod3Id] [bigint] NULL,
    [password] [varchar](255) NULL,
    [pesinVadeli] [int] NOT NULL,
    [renkBeden] [varchar](255) NULL,
    [sabitFiyat] [bit] NOT NULL,
    [satisFaturasi] [bit] NOT NULL,
    [satisIadeFaturasi] [bit] NOT NULL,
    [sayim] [bit] NOT NULL,
    [sayimEnvanterGorur] [bit] NOT NULL,
    [stokCikisBelgesi] [bit] NOT NULL,
    [stokGirisBelgesi] [bit] NOT NULL,
    [subeId] [varchar](255) NULL,
    [updated] [datetime2](6) NULL,
    [username] [varchar](255) NULL,
    [varsayilanCariKodu] [varchar](255) NULL,
    [varsayilanPersonelKodu] [varchar](255) NULL,
    [verilenFiyatTeklifi] [bit] NOT NULL,
    [verilenSiparis] [bit] NOT NULL,
    [winkaKullaniciId] [varchar](255) NULL,
    [yaziciAdi] [varchar](255) NULL,
    PRIMARY KEY CLUSTERED
(
[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
    ) ON [PRIMARY]
    GO

