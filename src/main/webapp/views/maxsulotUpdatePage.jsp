<%@ page import="org.najot.model.Maxsulot" %>
<%@include file="/views/header.jsp"%>
<% Maxsulot maxsulot = (Maxsulot) request.getAttribute("maxsulot"); %>
<div class="container-fluid">
  <h3 class="m-3">Update this Item</h3>
  <form class="m-3 p-3 w-75 card" method="post" action="<%=request.getContextPath()%>/maxsulot/update">
    <input type="hidden" name="id" value="<%=maxsulot.getId()%>">
    <div class="mb-3">
      <label for="exampleFormControlInput1" class="form-label">Nomi</label>
      <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="name.." name="nomi" value="<%=maxsulot.getNomi()%>">
    </div>
    <div class="mb-3">
      <label for="exampleFormControlInput2" class="form-label">Narxi</label>
      <input type="text" class="form-control" id="exampleFormControlInput2" name="narxi" value="<%=maxsulot.getNarxi()%>">
    </div>
    <input type="submit" class="btn btn-primary w-25">
  </form>
</div>
<%@include file="/views/footer.jsp"%>
