<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

  <xsl:template match="/">
    <html>
      <body>
        <h2>Empleados con salario superior a 50,000:</h2>
        <table border="1">
          <tr>
            <th>Nombre</th>
            <th>Salario</th>
          </tr>
          <xsl:apply-templates select="empleados/empleado[salario > 50000]" />
        </table>
      </body>
    </html>
  </xsl:template>

  <xsl:template match="empleado">
    <tr>
      <td><xsl:value-of select="nombre"/></td>
      <td><xsl:value-of select="salario"/></td>
    </tr>
  </xsl:template>

</xsl:stylesheet>
