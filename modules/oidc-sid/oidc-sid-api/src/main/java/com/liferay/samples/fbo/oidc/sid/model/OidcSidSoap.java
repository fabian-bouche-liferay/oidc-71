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

package com.liferay.samples.fbo.oidc.sid.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.samples.fbo.oidc.sid.service.http.OidcSidServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class OidcSidSoap implements Serializable {

	public static OidcSidSoap toSoapModel(OidcSid model) {
		OidcSidSoap soapModel = new OidcSidSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setOidcSidId(model.getOidcSidId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setSessionId(model.getSessionId());
		soapModel.setSid(model.getSid());
		soapModel.setJwksUri(model.getJwksUri());
		soapModel.setStatus(model.isStatus());

		return soapModel;
	}

	public static OidcSidSoap[] toSoapModels(OidcSid[] models) {
		OidcSidSoap[] soapModels = new OidcSidSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static OidcSidSoap[][] toSoapModels(OidcSid[][] models) {
		OidcSidSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new OidcSidSoap[models.length][models[0].length];
		}
		else {
			soapModels = new OidcSidSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static OidcSidSoap[] toSoapModels(List<OidcSid> models) {
		List<OidcSidSoap> soapModels = new ArrayList<OidcSidSoap>(
			models.size());

		for (OidcSid model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new OidcSidSoap[soapModels.size()]);
	}

	public OidcSidSoap() {
	}

	public long getPrimaryKey() {
		return _OidcSidId;
	}

	public void setPrimaryKey(long pk) {
		setOidcSidId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getOidcSidId() {
		return _OidcSidId;
	}

	public void setOidcSidId(long OidcSidId) {
		_OidcSidId = OidcSidId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getSessionId() {
		return _sessionId;
	}

	public void setSessionId(String sessionId) {
		_sessionId = sessionId;
	}

	public String getSid() {
		return _sid;
	}

	public void setSid(String sid) {
		_sid = sid;
	}

	public String getJwksUri() {
		return _jwksUri;
	}

	public void setJwksUri(String jwksUri) {
		_jwksUri = jwksUri;
	}

	public boolean getStatus() {
		return _status;
	}

	public boolean isStatus() {
		return _status;
	}

	public void setStatus(boolean status) {
		_status = status;
	}

	private String _uuid;
	private long _OidcSidId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _sessionId;
	private String _sid;
	private String _jwksUri;
	private boolean _status;

}