<#if Session.user??>
<ul>
    <li>
        <a href="${Request.contextPath}/${Session.user.project.code}/profile">Gavin Hu</a>
    </li>
    <li>
        <a href="${Request.contextPath}/logout">退出</a>
    </li>
</ul>
<#else>
<ul>
    <li>
        <a href="${Request.contextPath}/login">登录</a>
    </li>
</ul>
</#if>