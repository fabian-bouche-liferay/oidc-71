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

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link OidcSid}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OidcSid
 * @generated
 */
public class OidcSidWrapper implements ModelWrapper<OidcSid>, OidcSid {

	public OidcSidWrapper(OidcSid oidcSid) {
		_oidcSid = oidcSid;
	}

	@Override
	public Class<?> getModelClass() {
		return OidcSid.class;
	}

	@Override
	public String getModelClassName() {
		return OidcSid.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("OidcSidId", getOidcSidId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("sessionId", getSessionId());
		attributes.put("sid", getSid());
		attributes.put("jwksUri", getJwksUri());
		attributes.put("issuer", getIssuer());
		attributes.put("alg", getAlg());
		attributes.put("status", isStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long OidcSidId = (Long)attributes.get("OidcSidId");

		if (OidcSidId != null) {
			setOidcSidId(OidcSidId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String sessionId = (String)attributes.get("sessionId");

		if (sessionId != null) {
			setSessionId(sessionId);
		}

		String sid = (String)attributes.get("sid");

		if (sid != null) {
			setSid(sid);
		}

		String jwksUri = (String)attributes.get("jwksUri");

		if (jwksUri != null) {
			setJwksUri(jwksUri);
		}

		String issuer = (String)attributes.get("issuer");

		if (issuer != null) {
			setIssuer(issuer);
		}

		String alg = (String)attributes.get("alg");

		if (alg != null) {
			setAlg(alg);
		}

		Boolean status = (Boolean)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	@Override
	public Object clone() {
		return new OidcSidWrapper((OidcSid)_oidcSid.clone());
	}

	@Override
	public int compareTo(OidcSid oidcSid) {
		return _oidcSid.compareTo(oidcSid);
	}

	/**
	 * Returns the alg of this oidc sid.
	 *
	 * @return the alg of this oidc sid
	 */
	@Override
	public String getAlg() {
		return _oidcSid.getAlg();
	}

	/**
	 * Returns the company ID of this oidc sid.
	 *
	 * @return the company ID of this oidc sid
	 */
	@Override
	public long getCompanyId() {
		return _oidcSid.getCompanyId();
	}

	/**
	 * Returns the create date of this oidc sid.
	 *
	 * @return the create date of this oidc sid
	 */
	@Override
	public Date getCreateDate() {
		return _oidcSid.getCreateDate();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _oidcSid.getExpandoBridge();
	}

	/**
	 * Returns the issuer of this oidc sid.
	 *
	 * @return the issuer of this oidc sid
	 */
	@Override
	public String getIssuer() {
		return _oidcSid.getIssuer();
	}

	/**
	 * Returns the jwks uri of this oidc sid.
	 *
	 * @return the jwks uri of this oidc sid
	 */
	@Override
	public String getJwksUri() {
		return _oidcSid.getJwksUri();
	}

	/**
	 * Returns the modified date of this oidc sid.
	 *
	 * @return the modified date of this oidc sid
	 */
	@Override
	public Date getModifiedDate() {
		return _oidcSid.getModifiedDate();
	}

	/**
	 * Returns the oidc sid ID of this oidc sid.
	 *
	 * @return the oidc sid ID of this oidc sid
	 */
	@Override
	public long getOidcSidId() {
		return _oidcSid.getOidcSidId();
	}

	/**
	 * Returns the primary key of this oidc sid.
	 *
	 * @return the primary key of this oidc sid
	 */
	@Override
	public long getPrimaryKey() {
		return _oidcSid.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _oidcSid.getPrimaryKeyObj();
	}

	/**
	 * Returns the session ID of this oidc sid.
	 *
	 * @return the session ID of this oidc sid
	 */
	@Override
	public String getSessionId() {
		return _oidcSid.getSessionId();
	}

	/**
	 * Returns the sid of this oidc sid.
	 *
	 * @return the sid of this oidc sid
	 */
	@Override
	public String getSid() {
		return _oidcSid.getSid();
	}

	/**
	 * Returns the status of this oidc sid.
	 *
	 * @return the status of this oidc sid
	 */
	@Override
	public boolean getStatus() {
		return _oidcSid.getStatus();
	}

	/**
	 * Returns the user ID of this oidc sid.
	 *
	 * @return the user ID of this oidc sid
	 */
	@Override
	public long getUserId() {
		return _oidcSid.getUserId();
	}

	/**
	 * Returns the user name of this oidc sid.
	 *
	 * @return the user name of this oidc sid
	 */
	@Override
	public String getUserName() {
		return _oidcSid.getUserName();
	}

	/**
	 * Returns the user uuid of this oidc sid.
	 *
	 * @return the user uuid of this oidc sid
	 */
	@Override
	public String getUserUuid() {
		return _oidcSid.getUserUuid();
	}

	/**
	 * Returns the uuid of this oidc sid.
	 *
	 * @return the uuid of this oidc sid
	 */
	@Override
	public String getUuid() {
		return _oidcSid.getUuid();
	}

	@Override
	public int hashCode() {
		return _oidcSid.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _oidcSid.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _oidcSid.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _oidcSid.isNew();
	}

	/**
	 * Returns <code>true</code> if this oidc sid is status.
	 *
	 * @return <code>true</code> if this oidc sid is status; <code>false</code> otherwise
	 */
	@Override
	public boolean isStatus() {
		return _oidcSid.isStatus();
	}

	@Override
	public void persist() {
		_oidcSid.persist();
	}

	/**
	 * Sets the alg of this oidc sid.
	 *
	 * @param alg the alg of this oidc sid
	 */
	@Override
	public void setAlg(String alg) {
		_oidcSid.setAlg(alg);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_oidcSid.setCachedModel(cachedModel);
	}

	/**
	 * Sets the company ID of this oidc sid.
	 *
	 * @param companyId the company ID of this oidc sid
	 */
	@Override
	public void setCompanyId(long companyId) {
		_oidcSid.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this oidc sid.
	 *
	 * @param createDate the create date of this oidc sid
	 */
	@Override
	public void setCreateDate(Date createDate) {
		_oidcSid.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {

		_oidcSid.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_oidcSid.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_oidcSid.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	 * Sets the issuer of this oidc sid.
	 *
	 * @param issuer the issuer of this oidc sid
	 */
	@Override
	public void setIssuer(String issuer) {
		_oidcSid.setIssuer(issuer);
	}

	/**
	 * Sets the jwks uri of this oidc sid.
	 *
	 * @param jwksUri the jwks uri of this oidc sid
	 */
	@Override
	public void setJwksUri(String jwksUri) {
		_oidcSid.setJwksUri(jwksUri);
	}

	/**
	 * Sets the modified date of this oidc sid.
	 *
	 * @param modifiedDate the modified date of this oidc sid
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_oidcSid.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_oidcSid.setNew(n);
	}

	/**
	 * Sets the oidc sid ID of this oidc sid.
	 *
	 * @param OidcSidId the oidc sid ID of this oidc sid
	 */
	@Override
	public void setOidcSidId(long OidcSidId) {
		_oidcSid.setOidcSidId(OidcSidId);
	}

	/**
	 * Sets the primary key of this oidc sid.
	 *
	 * @param primaryKey the primary key of this oidc sid
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		_oidcSid.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_oidcSid.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	 * Sets the session ID of this oidc sid.
	 *
	 * @param sessionId the session ID of this oidc sid
	 */
	@Override
	public void setSessionId(String sessionId) {
		_oidcSid.setSessionId(sessionId);
	}

	/**
	 * Sets the sid of this oidc sid.
	 *
	 * @param sid the sid of this oidc sid
	 */
	@Override
	public void setSid(String sid) {
		_oidcSid.setSid(sid);
	}

	/**
	 * Sets whether this oidc sid is status.
	 *
	 * @param status the status of this oidc sid
	 */
	@Override
	public void setStatus(boolean status) {
		_oidcSid.setStatus(status);
	}

	/**
	 * Sets the user ID of this oidc sid.
	 *
	 * @param userId the user ID of this oidc sid
	 */
	@Override
	public void setUserId(long userId) {
		_oidcSid.setUserId(userId);
	}

	/**
	 * Sets the user name of this oidc sid.
	 *
	 * @param userName the user name of this oidc sid
	 */
	@Override
	public void setUserName(String userName) {
		_oidcSid.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this oidc sid.
	 *
	 * @param userUuid the user uuid of this oidc sid
	 */
	@Override
	public void setUserUuid(String userUuid) {
		_oidcSid.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this oidc sid.
	 *
	 * @param uuid the uuid of this oidc sid
	 */
	@Override
	public void setUuid(String uuid) {
		_oidcSid.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<OidcSid> toCacheModel() {
		return _oidcSid.toCacheModel();
	}

	@Override
	public OidcSid toEscapedModel() {
		return new OidcSidWrapper(_oidcSid.toEscapedModel());
	}

	@Override
	public String toString() {
		return _oidcSid.toString();
	}

	@Override
	public OidcSid toUnescapedModel() {
		return new OidcSidWrapper(_oidcSid.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _oidcSid.toXmlString();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof OidcSidWrapper)) {
			return false;
		}

		OidcSidWrapper oidcSidWrapper = (OidcSidWrapper)object;

		if (Objects.equals(_oidcSid, oidcSidWrapper._oidcSid)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _oidcSid.getStagedModelType();
	}

	@Override
	public OidcSid getWrappedModel() {
		return _oidcSid;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _oidcSid.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _oidcSid.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_oidcSid.resetOriginalValues();
	}

	private final OidcSid _oidcSid;

}