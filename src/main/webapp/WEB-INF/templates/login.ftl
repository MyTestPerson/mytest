<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login</title>
</head>
<body>

<h1>Login</h1>

<br><br>


<form name="user" method="post" action="/login">

    <label for="email" >Username</label>
    <input type="email" id="email" name="email" value="user" autofocus>

    <br>

    <label for="password">Password</label>
    <input type="password" id="password" name="password" value="1111" autofocus>

    <#if Session.SPRING_SECURITY_LAST_EXCEPTION?? && Session.SPRING_SECURITY_LAST_EXCEPTION.message?has_content>
        <@spring.message "login.bad.credentials"/>
    </#if>

    <br>

    <br>

    <button type="submit">Sign in</button>

</form>

</body>
</html>