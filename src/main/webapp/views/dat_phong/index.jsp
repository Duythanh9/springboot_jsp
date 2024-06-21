<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
          integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-md-12">
            <a href="/dat-phong/create">Add</a>
            <table class="table table-hover table-bordered">
                <thead>
                <tr>
                    <th>ID</th>
                    <th>Ma Dat Phong</th>
                    <th>Ghi Chu Dat Phong</th>
                    <th>Ten Loai Phong</th>
                    <th>So Nguoi </th>
                    <th>Trang Thai</th>
                    <th>Thao Tac</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${data}" var="dp">
                    <tr>
                        <td>${dp.id}</td>
                        <td>${dp.maDatPhong}</td>
                        <td>${dp.ghiChu}</td>
                        <td>${dp.loaiPhong.tenLoaiPhong}</td>
                        <td>${dp.loaiPhong.soNguoi}</td>
                        <td>${dp.trangThai}</td>
                        <td>
                            <a href="/dat-phong/delete/${dp.id}">Delete</a>
                            <a href="/dat-phong/edit/${dp.id}">Update</a>
                        </td>
                    </tr>
                </c:forEach>

                </tbody>
            </table>
        </div>
    </div>
</div>

</body>
</html>