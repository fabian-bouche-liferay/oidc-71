create table OIDCSID_OidcSid (
	uuid_ VARCHAR(75) null,
	OidcSidId LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	sessionId VARCHAR(75) null,
	sid VARCHAR(75) null,
	jwksUri VARCHAR(75) null,
	issuer VARCHAR(75) null,
	alg VARCHAR(75) null,
	status BOOLEAN
);