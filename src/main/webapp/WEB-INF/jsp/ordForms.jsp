<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ include file="./head.jsp" %>
<div class="page-content">
    <div class="layui-tab tab" lay-filter="xbs_tab" lay-allowclose="false">
        <div class="layui-tab-content" style="overflow-y:auto;">
            <div class="x-body">
                <div class="layui-fluid">
                    <div class="layui-card">
                        <div class="layui-card-header">添加</div>
                        <div class="layui-card-body" style="padding: 15px;">
                            <form class="layui-form" action="/ord/add" method="post"
                                  lay-filter="component-form-group">
                                <input class="form-control" type="hidden" name="id" value="${ord.id}">
                                <div class="layui-form-item">
                                    <label class="layui-form-label">商品ID</label>
                                    <div class="layui-input-block">
                                        <input type="text" name="goodsId" lay-verify="reordired" placeholder="商品ID"
                                               autocomplete="off" class="layui-input" value="${ord.goodsId }">
                                    </div>
                                </div>

                                <div class="layui-form-item">
                                    <label class="layui-form-label">用户ID</label>
                                    <div class="layui-input-block">
                                        <input type="text" name="userId" lay-verify="reordired|tel" placeholder="用户ID"
                                               autocomplete="off" class="layui-input" value="${ord.userId }">
                                    </div>
                                </div>


                                <div class="layui-form-item">
                                    <label class="layui-form-label">地址ID</label>
                                    <div class="layui-input-block">
                                        <input type="text" name="addressId" lay-verify="reordired" placeholder="地址ID"
                                               autocomplete="off" class="layui-input" value="${ord.addressId }">
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">商品数量</label>
                                    <div class="layui-input-block">
                                        <input type="text" name="num" lay-verify="reordired" placeholder="商品数量"
                                               autocomplete="off" class="layui-input" value="${ord.num }">
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">商品价格</label>
                                    <div class="layui-input-block">
                                        <input type="text" name="price" lay-verify="reordired" placeholder="商品价格"
                                               autocomplete="off" class="layui-input" value="${ord.price }">
                                    </div>
                                </div>

                                <div class="layui-form-item">
                                    <label class="layui-form-label">订单编号</label>
                                    <div class="layui-input-block">
                                        <input type="text" name="ordNo" lay-verify="reordired" placeholder="订单编号"
                                               autocomplete="off" class="layui-input" value="${ord.ordNo }">
                                    </div>
                                </div>


                                <div class="layui-form-item">
                                    <label class="layui-form-label">订单状态</label>
                                    <div class="layui-input-block">
                                        <select id="ordState" name="ordState">
                                            <option value="">请选择状态</option>
                                            <option value="0" ${ord.ordState==0?'selected':'' }>未付款</option>
                                            <option value="1" ${ord.ordState==1?'selected':'' }>已支付</option>
                                            <option value="2" ${ord.ordState==2?'selected':'' }>已发货</option>
                                            <option value="3" ${ord.ordState==3?'selected':'' }>已到货</option>
                                            <option value="4" ${ord.ordState==4?'selected':'' }>已签收</option>
                                            <option value="5" ${ord.ordState==5?'selected':'' }>结束订单</option>
                                            <option value="6" ${ord.ordState==6?'selected':'' }>退货中</option>
                                        </select>
                                    </div>
                                </div>

                                <div class="layui-form-item layui-layout-admin">
                                    <div class="layui-input-block">
                                        <div class="layui-footer" style="left: 0;">
                                            <button class="layui-btn" lay-submit="" lay-filter="component-form-demo1"
                                                    type="submit">立即提交
                                            </button>
                                            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
                                        </div>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>