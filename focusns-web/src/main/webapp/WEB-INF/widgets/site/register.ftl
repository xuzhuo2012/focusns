<div class="register">
    <div class="register-left">
        <form action="${Request.contextPath}/site/register" method="post">
            <div>
                <label>邮箱</label>
                <input name="email" value="" />
            </div>
            <div>
                <label>密码</label>
                <input type="password" name="password" />
            </div>
            <div>
                <label>昵称</label>
                <input name="username" value="" />
            </div>
            <div class="submit">
                <button type="submit">注册</button>
            </div>
        </form>
    </div>
    <div class="register-right">
        <ul>
            <li class="sina">
                <a href="${Request.contextPath}/oauth/authorize?provider=sina">新浪账号登录</a>
            </li>
            <li class="renren">
                <a href="${Request.contextPath}/oauth/authorize?provider=renren">人人账号登录</a>
            </li>
            <li class="tencent">
                <a href="${Request.contextPath}/oauth/authorize?provider=tencent">腾讯账号登录</a>
            </li>
         </ul>
    </div>
    <br class="clear" />
</div>