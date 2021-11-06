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
                            <form class="layui-form" action="/bigtype/add" method="post"
                                  lay-filter="component-form-group">
                                <input class="form-control" type="hidden" name="id" value="${bigtype.id}">
                                <div class="layui-form-item">
                                    <label class="layui-form-label">商品类型</label>
                                    <div class="layui-input-block">
                                        <input type="text" name="typeName" lay-verify="required" placeholder="商品名称"
                                               autocomplete="off" class="layui-input" value="${bigtype.typeName }">
                                    </div>
                                </div>

<%--                                <div class="layui-form-item">--%>
<%--                                    <label class="layui-form-label">手机号</label>--%>
<%--                                    <div class="layui-input-block">--%>
<%--                                        <input type="text" name="consigneeTel" lay-verify="required" placeholder="手机号"--%>
<%--                                               autocomplete="off" class="layui-input" value="${address.consigneeTel }">--%>
<%--                                    </div>--%>
<%--                                </div>--%>
<%--                                <div class="layui-form-item">--%>
<%--                                    <label class="layui-form-label">性别</label>--%>
<%--                                    <div class="layui-input-block">--%>
<%--                                        <input type="radio" name="sex" value="男"--%>
<%--                                               title="男" ${user.sex != '女'?'checked':'' }>--%>
<%--                                        <div class="layui-unselect layui-form-radio layui-form-radioed"><i--%>
<%--                                                class="layui-anim layui-icon"></i>--%>
<%--                                            <div>男</div>--%>
<%--                                        </div>--%>
<%--                                        <input type="radio" name="sex" value="女"--%>
<%--                                               title="女" ${user.sex == '女'?'checked':'' }>--%>
<%--                                        <div class="layui-unselect layui-form-radio"><i--%>
<%--                                                class="layui-anim layui-icon"></i>--%>
<%--                                            <div>女</div>--%>
<%--                                        </div>--%>
<%--                                        <input type="radio" name="sex" value="gay"--%>
<%--                                               title="gay" ${user.sex == 'gay'?'checked':'' }>--%>
<%--                                        <div class="layui-unselect layui-form-radio"><i--%>
<%--                                                class="layui-anim layui-icon"></i>--%>
<%--                                            <div>gay</div>--%>
<%--                                        </div>--%>
<%--                                    </div>--%>
<%--                                </div>--%>
<%--                                <div class="layui-form-item">--%>
<%--                                    <label class="layui-form-label">地址</label>--%>
<%--                                    <div class="layui-input-block">--%>
<%--                                        <input type="text" name="address" lay-verify="required" placeholder="地址"--%>
<%--                                               autocomplete="off" class="layui-input" value="${address.address }">--%>
<%--                                    </div>--%>
<%--                                </div>--%>
<%--                                <div class="layui-form-item">--%>
<%--                                    <label class="layui-form-label">用户id</label>--%>
<%--                                    <div class="layui-input-block">--%>
<%--                                        <input type="text" name="userId" lay-verify="required" placeholder="用户id"--%>
<%--                                               autocomplete="off" class="layui-input" value="${address.userId }">--%>
<%--                                    </div>--%>
<%--                                </div>--%>
<%--                                <div class="layui-form-item">--%>
<%--                                    <label class="layui-form-label">身份证</label>--%>
<%--                                    <div class="layui-input-block">--%>
<%--                                        <input type="text" name="idCard" lay-verify="required" placeholder="身份证"--%>
<%--                                               autocomplete="off" class="layui-input" value="${user.idCard }">--%>
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