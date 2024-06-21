<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<form action="/dat-phong/store" method="post">
    <div>
        Ma Dat Phong:
        <input type="text" name="maDatPhong">
    </div>
    <div>
        Ghi Chu Dat Phong:
        <input type="text" name="ghiChu">
    </div>
    <div>
        Ten Loai Phong:
        <select name="loaiPhong">
            <c:forEach items="${dsLoaiPhong}" var="loaiPhong">
                <option value="${loaiPhong.id}">${loaiPhong.tenLoaiPhong}</option>
            </c:forEach>
        </select>
    </div>
    <div>
        So Nguoi:
        <select name="loaiPhong">
            <c:forEach items="${dsLoaiPhong}" var="loaiPhong">
                <option value="${loaiPhong.id}">${loaiPhong.soNguoi}</option>
            </c:forEach>
        </select>
    </div>
    <div>
        Trang Thai:
        <input type="text" name="trangThai">
    </div>
    <div>
        <button type="submit">Add</button>
    </div>

</form>

</body>
</html>