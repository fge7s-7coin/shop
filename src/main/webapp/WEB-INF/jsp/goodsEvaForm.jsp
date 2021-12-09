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
                            <form class="layui-form" action="/goodseva/add" method="post"
                                  lay-filter="component-form-group">
                                <input class="form-control" type="hidden" name="id" value="${goodsEvaluatelist.id}">
                                <div class="layui-form-item">
                                    <label class="layui-form-label">商品ID</label>
                                    <div class="layui-input-block">
                                        <input type="text" name="goodsId" lay-verify="required" placeholder="商品ID"
                                               autocomplete="off" class="layui-input" value="${goodsEvaluatelist.goodsId }">
                                    </div>
                                </div>

                                <div class="layui-form-item">
                                    <label class="layui-form-label">用户Id</label>
                                    <div class="layui-input-block">
                                        <input type="tel" name="userId" lay-verify="required|tel" placeholder="用户Id"
                                               autocomplete="off" class="layui-input" value="${goodsEvaluatelist.userId }">
                                    </div>
                                </div>

                                <div class="layui-form-item">
                                    <label class="layui-form-label">商品描述</label>
                                    <div class="layui-input-block">
                                        <input type="text" name="comment" lay-verify="required" placeholder="商品描述"
                                               autocomplete="off" class="layui-input" value="${goodsEvaluatelist.comment }">
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">图片地址</label>
                                    <div class="layui-input-block">
                                        <input type="text" name="picture" lay-verify="required" placeholder="图片地址"
                                               autocomplete="off" class="layui-input" value="${goodsEvaluatelist.picture }">
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">评价等级</label>
                                    <div class="layui-input-block">
                                        <select id="level" name="level">
                                            <option value="">请选择等级</option>
                                            <option value="0" ${goodsEvaluatelist.level==0?'selected':'' }>0</option>
                                            <option value="1" ${goodsEvaluatelist.level==1?'selected':'' }>1</option>
                                            <option value="2" ${goodsEvaluatelist.level==2?'selected':'' }>2</option>
                                            <option value="3" ${goodsEvaluatelist.level==3?'selected':'' }>3</option>
                                            <option value="4" ${goodsEvaluatelist.level==4?'selected':'' }>4</option>
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