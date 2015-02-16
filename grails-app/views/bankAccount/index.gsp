<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<meta name="layout" content="main" />
<title>${message}</title>
</head>
<body>
	<div class="body">
		<p>BankAccounts</p>
		<g:each in="${bankAccounts}" var="bankAccount">
			<p>
				${bankAccounts.accountNumber}
			</p>
		</g:each>
	</div>
</body>
</html>