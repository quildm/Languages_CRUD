<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- ... -->
<title>Languages</title>
<p>Languages</p>
<table class="table">
<c:forEach items="${languages}" var="language">
	<tr>    
		<td>Name: <c:out value="${language.name}"/></td>
		<td>creator: <c:out value="${language.creator}"/></td>
		<td>current ver: <c:out value="${language.currentVersion}"/></td>
		<td><a href="/languages/delete/${loop.index}">Delete</a></td>
		<td><a href="/">Edit</a></td>
	 </tr>
</c:forEach>
</table><br>
<form action="/">
  Name:<br>
  <input type="text" name="name">
  <br>
  Creator:<br>
  <input type="text" name="creator">
  <br>
  Version:<br>
  <input type="text" name="version">
  <br>
  <br>
  <input type="submit" value="Submit">
</form> 
<!-- ... -->