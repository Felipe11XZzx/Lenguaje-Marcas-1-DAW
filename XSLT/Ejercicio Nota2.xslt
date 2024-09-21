<?xml version="1.0"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

	<xsl:template match="/">
		<html>
			<head>
				<title> Ejercicio 11 </title>
			</head>
			<body>
				<h1>List Of Books</h1>
				<ol>
					<xsl:for-each select="library/book">
						<li>
							<xsl:value-of select="title" /> BY <xsl:value-of
								select="author" />
							<br></br>
							<xsl:value-of
								select="genre" /> Date Of Publication <xsl:value-of
								select="year" /> Publisher: <xsl:value-of
								select="publisher"></xsl:value-of>
							<xsl:if test="genre = 'Novel'">
							<p style= "color: red;">El Genero De El Libro Es Una Novela</p>
							</xsl:if>
						</li>
						<br></br>
					</xsl:for-each>
				</ol>
			</body>
		</html>
	</xsl:template>

</xsl:stylesheet>
