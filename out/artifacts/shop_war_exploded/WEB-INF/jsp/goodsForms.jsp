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
                            <form class="layui-form" action="/goods/add" method="post"
                                  lay-filter="component-form-group">
                                <input class="form-control" type="hidden" name="id" value="${goods.id}">
                                <div class="layui-form-item">
                                <label class="layui-form-label">商品名称</label>
                                <div class="layui-input-block">
                                    <input type="text" name="goodsName" lay-verify="required" placeholder="商品名称"
                                           autocomplete="off" class="layui-input" value="${goods.goodsName }">
                                </div>
                            </div>

                                <div class="layui-form-item">
                                    <label class="layui-form-label">商品价格</label>
                                    <div class="layui-input-block">
                                        <input type="text" name="price" lay-verify="required|tel" placeholder="商品价格"
                                               autocomplete="off" class="layui-input" value="${goods.price }">
                                    </div>
                                </div>

                                <div class="layui-form-item">
                                    <label class="layui-form-label">商品描述</label>
                                    <div class="layui-input-block">
                                        <input type="text" name="describtion" lay-verify="required" placeholder="商品描述"
                                               autocomplete="off" class="layui-input" value="${goods.describtion }">
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">商品数量</label>
                                    <div class="layui-input-block">
                                        <input type="text" name="num" lay-verify="required" placeholder="商品数量"
                                               autocomplete="off" class="layui-input" value="${goods.num }">
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">图片地址</label>
                                    <div class="layui-input-block">
                                        <input type="text" name="picture" lay-verify="required" placeholder="图片地址"
                                               autocomplete="off" class="layui-input" value="${goods.picture }">
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">商场厂家</label>
                                    <div class="layui-input-block">
                                        <input type="text" name="manufacturer" lay-verify="required" placeholder="生产厂家"
                                               autocomplete="off" class="layui-input" value="${goods.manufacturer }">
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">商品类别</label>
                                    <div class="layui-input-block">
                                        <input type="text" name="smallTypeId" lay-verify="required" placeholder="商品类别"
                                               autocomplete="off" class="layui-input" value="${goods.smallTypeId }">
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">商品状态</label>
                                    <div class="layui-input-block">
                                        <select id="state" name="state">
                                            <option value="">请选择状态</option>
                                            <option value="0" ${goods.state==0?'selected':'' }>上架</option>
                                            <option value="1" ${goods.state==1?'selected':'' }>下架</option>

                                        </select>
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">商品评分</label>
                                    <div class="layui-input-block">
                                        <select id="score" name="score">
                                            <option value="">请选择评分</option>
                                            <option value="0" ${goods.score==0?'selected':'' }>1</option>
                                            <option value="1" ${goods.score==1?'selected':'' }>2</option>

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