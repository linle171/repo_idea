<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- 网页使用的语言 -->
<html lang="zh-CN">
<head>
    <!-- 指定字符集 -->
    <meta charset="utf-8">
    <!-- 使用Edge最新的浏览器的渲染方式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!-- viewport视口：网页可以根据设置的宽度自动进行适配，在浏览器的内部虚拟一个容器，容器的宽度与设备的宽度相同。
    width: 默认宽度与设备的宽度相同
    initial-scale: 初始的缩放比，为1:1 -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>添加用户</title>

    <!-- 1. 导入CSS的全局样式 -->
    <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
    <!-- 2. jQuery导入，建议使用1.9以上的版本 -->
    <script src="${pageContext.request.contextPath}/js/jquery-3.3.1.min.js"></script>
    <!-- 3. 导入bootstrap的js文件 -->
    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
</head>
<body>
    <script>
        $(function (){
            $('#dept_name').blur(function (){
                let name = $(this).val();

                if((name != null) && (name !== "")){
                    $.ajax({
                        url: "${pageContext.request.contextPath}/dept/findByNameToId",
                        type: "GET",
                        data: {dept_name:name},
                        contentType: "application/json;charset=UTF-8",
                        success: function (param) {
                            if (param.flag) {
                                //设置span的内容体
                                $("#spanMsg").html("<font color='green'>" + param.msg + "</font>");
                            } else if (!param.flag) {
                                $("#spanMsg").html("<font color='red'>" + param.msg + "</font>");
                            }
                        },
                        error: function () {
                            alert("请求处理失败!");
                        }
                    })
                    <%--$.post("${pageContext.request.contextPath}/dept/findByNameToId",data,function (param){--%>
                    <%--    alert(param.flag);--%>
                    <%--    if(param.flag){--%>
                    <%--        //设置span的内容体--%>
                    <%--        $("#spanMsg").html("<font color='red'>" +param.msg+"</font>");--%>
                    <%--    }else if(!param.flag){--%>
                    <%--        $("#spanMsg").html("<font color='green'>" +param.msg+"</font>");--%>
                    <%--    }--%>
                    <%--},"json")--%>
                }

            })
        });

    </script>
    <div class="container">
        <center><h3>添加账户</h3></center>
        <div class="row">
            <div class="col-lg-3"></div>
            <div class="col-lg-6">
                <div class="form-group">
                    <label for="dept_name">部门：</label>
                    <input type="text" class="form-control" id="dept_name" name="dept_name" placeholder="请输入部门">
                    <span id="spanMsg"></span>
                </div>
                <form action="${pageContext.request.contextPath}/emp/addEmployee" method="post">
                    <div class="form-group">
                        <label for="emp_name">姓名：</label>
                        <input type="text" class="form-control" id="emp_name" name="emp_name" placeholder="请输入姓名">
                    </div>
                    <div class="form-group">
                        <label for="dept_id">部门编号：</label>
                        <input type="text" class="form-control" id="dept_id" name="dept_id" placeholder="请输入部门编号">
                    </div>
                    <div class="form-group">
                        <label for="job_name">职位：</label>
                        <input type="text" class="form-control" id="job_name" name="job_name" placeholder="请输入职位">
                    </div>
                    <div class="form-group">
                        <label for="join_date">入职时间：</label>
                        <input type="text" class="form-control" id="join_date" name="join_date" placeholder="请输入入职时间">
                    </div>
                    <div class="form-group">
                        <label for="telephone">联系电话：</label>
                        <input type="text" class="form-control" id="telephone" name="telephone" placeholder="请输入联系电话">
                    </div>

                    <div class="form-group" style="text-align: center">
                        <input class="btn btn-primary" type="submit" value="提交" />
                        <input class="btn btn-default" type="reset" value="重置" />
                        <input class="btn btn-default" type="button" onclick="history.go(-1)" value="返回" />
                    </div>
                </form>
            </div>
            <div class="col-lg-3"></div>
        </div>
    </div>
</body>
</html>