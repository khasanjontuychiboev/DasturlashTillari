<%@ page import="org.najot.model.Maxsulot" %>
<%@ page import="java.util.List" %>
<%@include file="/views/header.jsp"%>
<% Maxsulot maxsulot = (Maxsulot) request.getAttribute("maxsulot");%>
<di class="container-fluid">
    <div class="card w-75 m-5">
        <img src="<%=request.getContextPath()%>/images/img_1.png" class="card-img-top" alt="..." style="width: 300px;">
        <div class="card-body">
            <h5 class="card-title"><%=maxsulot.getNomi()%></h5>
            <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
        </div>
        <ul class="list-group list-group-flush">
            <li class="list-group-item"><b>Maxsulot ID:</b> <%=maxsulot.getId()%></li>
            <li class="list-group-item"><b>Maxsulot nomi:</b> <%=maxsulot.getNomi()%></li>
            <li class="list-group-item"><b>Maxsulot narxi:</b> <%=maxsulot.getNarxi()%></li>
        </ul>
        <div class="card-body">
            <a href="<%=request.getContextPath()%>/maxsulot/update/<%=maxsulot.getId()%>" class="btn btn-sm btn-warning">Update</a>
            <a href="<%=request.getContextPath()%>/maxsulot/delete-page/<%=maxsulot.getId()%>" class="btn btn-sm btn-danger">Delete</a>
        </div>
    </div>
</di>

<%@include file="/views/footer.jsp"%>
