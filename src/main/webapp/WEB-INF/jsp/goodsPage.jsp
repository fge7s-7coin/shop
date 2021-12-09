<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%> 
<%@ include file="./head.jsp" %>
<div class="page-content">
    <div class="layui-tab tab" lay-filter="xbs_tab" lay-allowclose="false">
        <div class="layui-tab-content" style="overflow-y:auto;">
            <div class="x-body">
                <div class="layui-row">
                    <form class="layui-form layui-col-md12 x-so" action="/goods/list" method="post">
                        <input type="text" name="id" placeholder="请输入商品id" autocomplete="off" class="layui-input">
                        <button class="layui-btn" lay-submit="" lay-filter="sreach" type="submit">
                            <i class="layui-icon">
                                &#xe615;
                            </i>
                        </button>
                        <a class="layui-btn" href="/goods/forms"><i class="layui-icon"></i>添加</a>
                    </form>
                </div>
                <xblock style="height:30px;">
                	<span>用户列表</span>
                    <span class="x-right" style="line-height: 30px">
                        	共有数据：${fn:length(goodslist)} 条
                    </span>
                </xblock>
                <table class="layui-table">
                    <thead>
                        <tr>
                            <th>商品名称</th>
							<th>价格</th>
							<th>描述</th>
		                    <th>数量</th>
                            <th>图片</th>
                            <th>生产厂家</th>
                            <th>商品类别</th>
                            <th>状态</th>
                            <th>评价得分</th>
                            <th>操作</th>
		                </tr>
                    </thead>
                    <tbody>
<%--                    items和controller对应--%>
                        <c:forEach items="${goodslist}" var="goods">
							<tr>
								<td>
									${goods.goodsName}
								</a></td>

								<td>
									${goods.price}
								</td>

								<td>
									${goods.describtion}
								</td>
                                <td>
                                        ${goods.num}

                                </td>
                                <td>
                                        ${goods.picture}
                                </td>
                                <td>
                                        ${goods.manufacturer}
                                </td>
                                <td>
                                        ${goods.smallTypeId}

                                </td>
                                <td>
                                        ${goods.state}
                                </td>
                                <td>
                                        ${goods.score}
                                </td>
								<td class="td-manage">
				    				<a href="/goods/form?id=${goods.id}" role="button" class="btn btn-info"><i class="layui-icon">
                                        &#xe642;
                                    </i></a>
									<a href="javascript:;" role="button" class="btn btn-danger" onclick="goods_del(this,'${goods.id}')"><i class="layui-icon">
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
function goods_del(obj,id){
    layer.confirm('确认要删除吗？',function(index){
    	$.ajax({
            url:"/goods/delGoods?id="+id,
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