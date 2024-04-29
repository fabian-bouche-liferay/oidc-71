<html>
	<body>
		<form id="autoSubmitForm" data-senna-off="true" class="loginForm" method="post" action="${origin}/-/login/openid_connect_request?p_p_state=maximized">
			<input type="hidden" name="_com_liferay_login_web_portlet_LoginPortlet_OPEN_ID_CONNECT_PROVIDER_NAME" value="${oidc_provider_name}" />
		</form>
		<h1>Signing in to ${oidc_provider_name}</h1>
		<script type="text/javascript">
            document.getElementById('autoSubmitForm').submit();
		</script>
	</body>
</html>
