<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%> 
<%@ include file="./head.jsp" %>
<div class="page-content">
    <div class="layui-tab tab" lay-filter="xbs_tab" lay-allowclose="false">
        <div class="layui-tab-content" style="overflow-y:auto;">
            <div class="x-body">
                <div class="layui-row">
                    <form class="layui-form layui-col-md12 x-so" action="/address/list" method="post">
                        <input type="text" name="consignee" placeholder="请输入用户名" autocomplete="off" class="layui-input">
                        <button class="layui-btn" lay-submit="" lay-filter="sreach" type="submit">
                            <i class="layui-icon">
                                &#xe615;
                            </i>
                        </button>
                        <a class="layui-btn" href="/address/forms"><i class="layui-icon"></i>添加</a>
                    </form>
                </div>
                <xblock style="height:30px;">
                	<span>用户列表</span>
                    <span class="x-right" style="line-height: 30px">
<%--                        和controller中的返回值有关--%>
                        	共有数据：${fn:length(addressList)} 条
                    </span>
                </xblock>
                <table class="layui-table">
                    <thead>
                        <tr>
                            <th>姓名</th>
							<th>电话号</th>
							<th>地址</th>
                            <th>用户id</th>
		                    <th>操作</th>
		                </tr>
                    </thead>
                    <tbody>
<%--                    items和controller对应--%>
                        <c:forEach items="${addressList}" var="address">
							<tr>
								<td>
									${address.consignee}
								</a></td>
								<td>
									${address.consigneeTel}
								</td>
								<td>
									${address.address}
								</td>
                                <td>
                                        ${address.userId}
                                </td>
								<td class="td-manage">
				    				<a href="/address/form?id=${address.id}" role="button" class="btn btn-info"><i class="layui-icon">
                                        &#xe642;
                                    </i></a>
									<a href="javascript:;" role="button" class="btn btn-danger" onclick="address_del(this,'${address.id}')"><i class="layui-icon">
                                        &#xe640;
                                    </i></a>
								</td>
							</tr>
							</c:forEach>
                        </tr>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>
<script>
function address_del(obj,id){
    layer.confirm('确认要删除吗？',function(index){
    	$.ajax({
            url:"/address/delAddress?id="+id,
            type:"post",
            success:function (result) {
                // console.info(result);
                if (result == 1){
                	$(obj).parents("tr").remove();
                    layer.msg('已删除!',{icon:1,time:1000});
                }else {
                	layer.msg('删除失败!',{icon:2,time:1000});
                }
            }
        });
    });
}
</script>