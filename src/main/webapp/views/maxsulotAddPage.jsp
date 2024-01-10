<%@include file="/views/header.jsp"%>
<div class="container-fluid">
  <h3 class="m-3">Adding new Item</h3>
  <form class="m-3 p-3 w-75 card" method="post" action="<%=request.getContextPath()%>/maxsulot/add">
    <div class="mb-3">
      <label for="exampleFormControlInput1" class="form-label">Nomi</label>
      <input type="text" class="form-control" id="exampleFormControlInput1" name="nomi" required>
    </div>
    <div class="mb-3">
      <label for="exampleFormControlInput2" class="form-label">Narxi</label>
      <input type="text" class="form-control" id="exampleFormControlInput2" name="narxi" required>
    </div>
    <input type="submit" class="btn btn-primary w-25">
  </form>
</div>
<%@include file="/views/footer.jsp"%>
