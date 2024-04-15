/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.samples.fbo.oidc.sid.model.impl;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.samples.fbo.oidc.sid.model.OidcSid;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing OidcSid in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class OidcSidCacheModel implements CacheModel<OidcSid>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof OidcSidCacheModel)) {
			return false;
		}

		OidcSidCacheModel oidcSidCacheModel = (OidcSidCacheModel)object;

		if (OidcSidId == oidcSidCacheModel.OidcSidId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, OidcSidId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", OidcSidId=");
		sb.append(OidcSidId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", sessionId=");
		sb.append(sessionId);
		sb.append(", sid=");
		sb.append(sid);
		sb.append(", jwksUri=");
		sb.append(jwksUri);
		sb.append(", status=");
		sb.append(status);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OidcSid toEntityModel() {
		OidcSidImpl oidcSidImpl = new OidcSidImpl();

		if (uuid == null) {
			oidcSidImpl.setUuid("");
		}
		else {
			oidcSidImpl.setUuid(uuid);
		}

		oidcSidImpl.setOidcSidId(OidcSidId);
		oidcSidImpl.setCompanyId(companyId);
		oidcSidImpl.setUserId(userId);

		if (userName == null) {
			oidcSidImpl.setUserName("");
		}
		else {
			oidcSidImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			oidcSidImpl.setCreateDate(null);
		}
		else {
			oidcSidImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			oidcSidImpl.setModifiedDate(null);
		}
		else {
			oidcSidImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (sessionId == null) {
			oidcSidImpl.setSessionId("");
		}
		else {
			oidcSidImpl.setSessionId(sessionId);
		}

		if (sid == null) {
			oidcSidImpl.setSid("");
		}
		else {
			oidcSidImpl.setSid(sid);
		}

		if (jwksUri == null) {
			oidcSidImpl.setJwksUri("");
		}
		else {
			oidcSidImpl.setJwksUri(jwksUri);
		}

		oidcSidImpl.setStatus(status);

		oidcSidImpl.resetOriginalValues();

		return oidcSidImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		OidcSidId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		sessionId = objectInput.readUTF();
		sid = objectInput.readUTF();
		jwksUri = objectInput.readUTF();

		status = objectInput.readBoolean();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(OidcSidId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (sessionId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(sessionId);
		}

		if (sid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(sid);
		}

		if (jwksUri == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(jwksUri);
		}

		objectOutput.writeBoolean(status);
	}

	public String uuid;
	public long OidcSidId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String sessionId;
	public String sid;
	public String jwksUri;
	public boolean status;

}