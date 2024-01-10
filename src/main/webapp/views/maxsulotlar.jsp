<%@ page import="org.najot.model.Maxsulot" %>
<%@ page import="java.util.List" %>
<%@include file="/views/header.jsp"%>
<% maxsulotlarIsActive = "active"; %>

<div class="container-fluid">
    <h3 class="m-3">Maxsulotlar ro'yxati: </h3>
    <table class="table m-3 w-75 table-bordered">
        <thead>
        <tr>
            <th scope="col">id</th>
            <th scope="col">Nomi</th>
            <th scope="col">Narxi</th>
            <th scope="col"></th>
        </tr>
        </thead>
        <tbody>
        <% List<Maxsulot> maxsulotList = (List<Maxsulot>) request.getAttribute("maxsulotlar"); %>
        <% for (Maxsulot maxsulot : maxsulotList) {%>
            <tr>
                <th scope="row"><%=maxsulot.getId()%></th>
                <td><%=maxsulot.getNomi()%></td>
                <td><%=maxsulot.getNarxi()%></td>
                <td class="w-25">
                    <a href="<%=request.getContextPath()%>/maxsulot/<%=maxsulot.getId()%>" class="btn btn-sm btn-info"><img src="<%=request.getContextPath()%>/images/icons/eye-fill.svg"></a>
                    <a href="<%=request.getContextPath()%>/maxsulot/update/<%=maxsulot.getId()%>" class="btn btn-sm btn-warning"><img src="<%=request.getContextPath()%>/images/icons/pencil-fill.svg"></a>
                    <a href="<%=request.getContextPath()%>/maxsulot/delete-page/<%=maxsulot.getId()%>" class="btn btn-sm btn-danger"><img src="<%=request.getContextPath()%>/images/icons/trash-fill.svg"></a>
                </td>
            </tr>
        <% }%>
        </tbody>
    </table>
</div>

<%@include file="/views/footer.jsp"%>
