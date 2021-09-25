<html>
  <center>

     <h1>C&aacute;lculo de masa corporal</h1>

<%
     String nombre=(String)request.getAttribute("NOMBRE");
     String proc=(String)request.getAttribute("PROCEDENCIA");
     double imc=(double)request.getAttribute("IMC");
%>

<h3>El imc de <%=nombre%> originario de <%=proc%> es:</h3>
<h4><%=String.format("%10.3f",imc)%></h4>

  </center>
</html>

