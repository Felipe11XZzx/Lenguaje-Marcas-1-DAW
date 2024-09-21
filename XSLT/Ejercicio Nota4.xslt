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
							<xsl:value-of select="title" />
							BY
							<xsl:value-of select="author" />
							<br></br>

							<xsl:value-of select="genre" />
							Date Of Publication
							<xsl:value-of select="year" />
							Publisher:
							<xsl:value-of select="publisher"></xsl:value-of>
							<xsl:choose>
								<xsl:when test="author= 'J.K. Rowling'">
									<p style="color: red;">The Author Is: J.K. Rowling</p>
								</xsl:when>
								<xsl:when test="author= 'Jyoji Morikawa'">
									<p style="color: blue;">The Author Is: Jyoji Morikawa</p>
								</xsl:when>
								<xsl:otherwise>
									<p style="color: green;">The Author Is Book: Other</p>
								</xsl:otherwise>
							</xsl:choose>
						</li>
						<br></br>
					</xsl:for-each>
				</ol>
			</body>
		</html>
	</xsl:template>

</xsl:stylesheet>
