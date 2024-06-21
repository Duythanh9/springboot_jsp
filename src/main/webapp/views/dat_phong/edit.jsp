<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<%--@elvariable id="detail" type=""--%>
<form:form action="/dat-phong/update/${detail.id}" method="post" modelAttribute="detail"  >
    <div>
        Ma Dat Phong:
        <form:input  path="maDatPhong"></form:input>
    </div>
    <div>
        Ghi Chu Dat Phong:
        <form:input path="ghiChu"></form:input>
    </div>
    <div>
        Ten Loai Phong:
        <form:select path="loaiPhong">
            <form:options items="${dsLoaiPhong}" itemLabel="tenLoaiPhong" itemValue="id"></form:options>
        </form:select>
    </div>
    <div>
        So Nguoi:
        <form:select path="loaiPhong">
           <form:options items="${dsLoaiPhong}" itemLabel="soNguoi" itemValue="id"></form:options>
        </form:select>
     </div>
    <div>
        Trang Thai:
        <form:input path="trangThai"></form:input>
    </div>
    <div>
        <button type="submit">Update</button>
    </div>

</form:form>

</body>
</html>