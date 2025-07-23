USE [CodeDB_1]
GO

/****** Object:  Table [dbo].[MeganetV2Token]    Script Date: 18/06/2025 10:40:01 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[MeganetVToken](
	[token] [varchar](255) NOT NULL,
	[user_id] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[token] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO

ALTER TABLE [dbo].[MeganetV2Token]  WITH CHECK ADD  CONSTRAINT [FK7reoxq4h821llj6ayujkenb8x] FOREIGN KEY([user_id])
REFERENCES [dbo].[MeganetV2AppUsers] ([id])
GO

ALTER TABLE [dbo].[MeganetV2Token] CHECK CONSTRAINT [FK7reoxq4h821llj6ayujkenb8x]
GO

