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
                            <form class="layui-form" action="/shopcar/add" method="post"
                                  lay-filter="component-form-group">
                                <input class="form-control" type="hidden" name="id" value="${shopcar.id}">
                                <div class="layui-form-item">
                                    <label class="layui-form-label">商品ID</label>
                                    <div class="layui-input-block">
                                        <input type="text" name="goodsId" lay-verify="required" placeholder="商品ID"
                                               autocomplete="off" class="layui-input" value="${shopcar.goodsId }">
                                    </div>
                                </div>

                                <div class="layui-form-item">
                                    <label class="layui-form-label">用户ID</label>
                                    <div class="layui-input-block">
                                        <input type="text" name="userId" lay-verify="required|tel" placeholder="用户ID"
                                               autocomplete="off" class="layui-input" value="${shopcar.userId }">
                                    </div>
                                </div>

                                <div class="layui-form-item">
                                    <label class="layui-form-label">商品数量</label>
                                    <div class="layui-input-block">
                                        <input type="text" name="num" lay-verify="required" placeholder="商品数量"
                                               autocomplete="off" class="layui-input" value="${shopcar.num }">
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