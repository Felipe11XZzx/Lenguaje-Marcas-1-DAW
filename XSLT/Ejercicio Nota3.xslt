<?xml version="1.0"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

	<xsl:template match="/">
		<html>
			<head>
				<title> Notas Bachillerato </title>
			</head>
			<body>
				<h1>Alumnos Itaca:</h1>
				<ol>
					<xsl:for-each select="estudiantes/estudiante">
						<li>
							Nombre Del Estudiante:
							<xsl:value-of select="nombre" />
							<br></br>
						</li>
							<xsl:for-each select="calificaciones/materia">
							
							<xsl:if test="nota &lt; 45">
								<p style='color: red;'>							
								<xsl:value-of select="nombre" /> 
								<br></br>
								<xsl:value-of select="nota" /> :
								SUSPENSO</p>
							</xsl:if>
							
							<xsl:if test="nota &gt;= 44 and nota &lt; 55">
								<p style="color: orange;">							
								<xsl:value-of select="nombre" />
								<br></br>
								<xsl:value-of select="nota" /> :
								SUFICIENTE</p>
							</xsl:if>
							
							<xsl:if test="nota &gt; 55 and nota &lt; 65">
								<p style="color: blue;">							
								<xsl:value-of select="nombre" />
								<br></br>
								<xsl:value-of select="nota" /> :
								BIEN</p>
							</xsl:if>
							
							<xsl:if test="nota &gt; 65 and nota &lt; 76">
								<p style="color: brown;">							
								<xsl:value-of select="nombre" />
								<br></br>
								<xsl:value-of select="nota" /> :
								NOTABLE</p>
							</xsl:if>
							
							<xsl:if test="nota &gt; 76 and nota &lt; 101">
								<p style="color: green;">							
								<xsl:value-of select="nombre" />
								<br></br>
								<xsl:value-of select="nota" /> :
								SOBRESALIENTE</p>
							</xsl:if>
							</xsl:for-each>
						</xsl:for-each>
						
						<br></br>
				</ol>
			</body>
		</html>
	</xsl:template>

</xsl:stylesheet>
