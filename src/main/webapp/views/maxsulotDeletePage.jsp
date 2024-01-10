<%@ page import="org.najot.model.Maxsulot" %>
<%@include file="/views/header.jsp"%>
<% Maxsulot maxsulot = (Maxsulot) request.getAttribute("maxsulot"); %>
<div class="container-fluid">
  <h3 class="m-3">Rostdan bu maxsulotni o'chirmoqchimisiz? </h3>
    <input type="hidden" name="id" value="<%=maxsulot.getId()%>" readonly disabled>
    <div class="mb-3">
      <label for="exampleFormControlInput1" class="form-label">Nomi</label>
      <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="name.." name="nomi" value="<%=maxsulot.getNomi()%>" readonly disabled>
    </div>
    <div class="mb-3">
      <label for="exampleFormControlInput2" class="form-label">Narxi</label>
      <input type="text" class="form-control" id="exampleFormControlInput2" name="narxi" value="<%=maxsulot.getNarxi()%>" readonly disabled>
    </div>
  <a class="btn btn-danger w-25" href="<%=request.getContextPath()%>/maxsulot/delete/<%=maxsulot.getId()%>">Confirm</a>
  <a class="btn btn-secondary w-25" href="<%=request.getContextPath()%>/maxsulotlar">Back</a>


</div>
<%@include file="/views/footer.jsp"%>
