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
                                <input class="form-control" type="hidden" name="id" value="${goodseva.id}">
                                <div class="layui-form-item">
                                    <label class="layui-form-label">商品ID</label>
                                    <div class="layui-input-block">
                                        <input type="text" name="goodsId" lay-verify="required" placeholder="商品ID"
                                               autocomplete="off" class="layui-input" value="${goodseva.goodsId}">
                                    </div>
                                </div>

                                <div class="layui-form-item">
                                    <label class="layui-form-label">用户ID</label>
                                    <div class="layui-input-block">
                                        <input type="tel" name="userId" lay-verify="required|tel" placeholder="用户ID"
                                               autocomplete="off" class="layui-input" value="${goodseva.userId}">
                                    </div>
                                </div>

                                <div class="layui-form-item">
                                    <label class="layui-form-label">商品描述</label>
                                    <div class="layui-input-block">



                                        <textarea  name="comment"  placeholder="商品描述" style="height:100px" class="layui-input" >
                                            ${goodseva.comment}
                                        </textarea>
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">商品图片地址</label>
                                    <div class="layui-input-block">
                                        <input type="text" name="picture" lay-verify="required" placeholder="商品图片地址"
                                               autocomplete="off" class="layui-input" value="${goodseva.picture}">
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">评价等级</label>
                                    <div class="layui-input-block">
                                        <select id="level" name="level">
                                            <option value="">请选择等级</option>
                                            <option value="0" ${goodseva.level==0?'selected':'' }>0</option>
                                            <option value="1" ${goodseva.level==1?'selected':'' }>1</option>
                                            <option value="2" ${goodseva.level==2?'selected':'' }>2</option>
                                            <option value="3" ${goodseva.level==3?'selected':'' }>3</option>
                                            <option value="4" ${goodseva.level==4?'selected':'' }>4</option>
                                        </select>
                                    </div>
                                </div>


<%--                                <div class="layui-form-item">--%>
<%--                                    <label class="layui-form-label">状态</label>--%>
<%--                                    <div class="layui-input-block">--%>
<%--                                        <lesect id="smallTypeId" name="state">--%>
<%--                                            <option value="">请选择状态</option>--%>
<%--                                            <option value="0" ${goods.state==0?'selected':'' }>上架</option>--%>
<%--                                            <option value="1" ${goods.state==1?'selected':'' }>下架</option>--%>
<%--                                        </lesect>--%>
<%--                                    </div>--%>
<%--                                </div>--%>


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