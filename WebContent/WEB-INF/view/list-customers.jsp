<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Customers</title>

    <link type="text/css"
          rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/style.css">

</head>
<body>

	<div id="wrapper">
	     <div id="header">
	         <h2>CRM - Customer Ralationship Manager</h2>
	     </div>
	</div>
    <div id="container">
         <div id="content">
         
         <!-- add our html table here -->
         
         <table>
               <tr>
                  <th>First Name</th>
                  <th>Last Name</th>
                  <th>Email</th>
               </tr>
         
         <!-- loop over print the customers -->
         <c:forEach var="tempCustomer" items="${customers}">
         
              <tr>
                  <td> ${tempCustomer.firstName}</td>
                  <td> ${tempCustomer.lastName}</td>
                  <td> ${tempCustomer.email}</td>
              </tr> 
         
         </c:forEach>
         
         </table>
         
         </div>
    
    </div>

</body>
</html>