<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <style type="text/css">
        #empTable {
            width: 80%;
            border: 1px solid blue;
            margin: 0px auto;
        }

        #empTable th, td {
            border: 1px solid green;
            text-align: center;
        }
    </style>
</head>
<body>
输出7521员工信息：<br/>
工号:${empsMap['7521'].empno}<br/>
姓名:${empsMap['7521'].ename}<br/>
岗位:${empsMap['7521'].job}<br/>
薪资:${empsMap['7521'].sal}<br/>
部门号:${empsMap['7521'].deptno}<br/>
<br/>
遍历EmpMap
<table id="empTable" cellpadding="0px" cellspacing="0px">
    <tr>
        <th>索引</th>
        <th>工号</th>
        <th>姓名</th>
        <th>岗位</th>
        <th>薪资</th>
        <th>部门号</th>
    </tr>
    <#list empsMap ? keys as k>
        <tr>
            <td>${k_index}</td>
            <td>${k}</td>
            <td>${empsMap[k].ename}</td>
            <td>${empsMap[k].job}</td>
            <td>${empsMap[k].sal}</td>
            <td>${empsMap[k].deptno}</td>
        </tr>
    </#list>
</table>
</body>
</html>