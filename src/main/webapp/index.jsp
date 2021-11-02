<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>WEB Calculator</title>
</head>
<body>
<div>
    <h1>
        WEB Calculator
    </h1>
        <form action="calc" method="post">
            <p>
                Input number A <input type="number" name="a" required />
            </p>
            <p>
                Input number B <input type="number" name="b" required />
            </p>
            <p>
                <input type="submit" value="Calculate" />
            </p>
        </form>
</div>
</body>
</html>