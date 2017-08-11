<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- ... -->
<p>Name: <c:out value="${language.name}"/></p>
<p>creator: <c:out value="${language.creator}"/></p>
<p>current ver: <c:out value="${language.currentVersion}"/></p><br>
<a href="/">Delete</a>
<a href="/">Edit</a>
