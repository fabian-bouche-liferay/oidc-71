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

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.samples.fbo.oidc.sid.model.OidcSid;
import com.liferay.samples.fbo.oidc.sid.model.OidcSidModel;
import com.liferay.samples.fbo.oidc.sid.model.OidcSidSoap;

import java.io.Serializable;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;

import java.sql.Blob;
import java.sql.Types;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the OidcSid service. Represents a row in the &quot;OIDCSID_OidcSid&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>OidcSidModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link OidcSidImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OidcSidImpl
 * @generated
 */
@JSON(strict = true)
public class OidcSidModelImpl
	extends BaseModelImpl<OidcSid> implements OidcSidModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a oidc sid model instance should use the <code>OidcSid</code> interface instead.
	 */
	public static final String TABLE_NAME = "OIDCSID_OidcSid";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"OidcSidId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}, {"sessionId", Types.VARCHAR},
		{"sid", Types.VARCHAR}, {"jwksUri", Types.VARCHAR},
		{"issuer", Types.VARCHAR}, {"alg", Types.VARCHAR},
		{"status", Types.BOOLEAN}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("OidcSidId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("sessionId", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("sid", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("jwksUri", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("issuer", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("alg", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("status", Types.BOOLEAN);
	}

	public static final String TABLE_SQL_CREATE =
		"create table OIDCSID_OidcSid (uuid_ VARCHAR(75) null,OidcSidId LONG not null primary key,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,sessionId VARCHAR(75) null,sid VARCHAR(75) null,jwksUri VARCHAR(75) null,issuer VARCHAR(75) null,alg VARCHAR(75) null,status BOOLEAN)";

	public static final String TABLE_SQL_DROP = "drop table OIDCSID_OidcSid";

	public static final String ORDER_BY_JPQL =
		" ORDER BY oidcSid.OidcSidId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY OIDCSID_OidcSid.OidcSidId ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(
		com.liferay.samples.fbo.oidc.sid.service.util.ServiceProps.get(
			"value.object.entity.cache.enabled.com.liferay.samples.fbo.oidc.sid.model.OidcSid"),
		true);

	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(
		com.liferay.samples.fbo.oidc.sid.service.util.ServiceProps.get(
			"value.object.finder.cache.enabled.com.liferay.samples.fbo.oidc.sid.model.OidcSid"),
		true);

	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(
		com.liferay.samples.fbo.oidc.sid.service.util.ServiceProps.get(
			"value.object.column.bitmask.enabled.com.liferay.samples.fbo.oidc.sid.model.OidcSid"),
		true);

	public static final long COMPANYID_COLUMN_BITMASK = 1L;

	public static final long SESSIONID_COLUMN_BITMASK = 2L;

	public static final long SID_COLUMN_BITMASK = 4L;

	public static final long UUID_COLUMN_BITMASK = 8L;

	public static final long OIDCSIDID_COLUMN_BITMASK = 16L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static OidcSid toModel(OidcSidSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		OidcSid model = new OidcSidImpl();

		model.setUuid(soapModel.getUuid());
		model.setOidcSidId(soapModel.getOidcSidId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setSessionId(soapModel.getSessionId());
		model.setSid(soapModel.getSid());
		model.setJwksUri(soapModel.getJwksUri());
		model.setIssuer(soapModel.getIssuer());
		model.setAlg(soapModel.getAlg());
		model.setStatus(soapModel.isStatus());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<OidcSid> toModels(OidcSidSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<OidcSid> models = new ArrayList<OidcSid>(soapModels.length);

		for (OidcSidSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(
		com.liferay.samples.fbo.oidc.sid.service.util.ServiceProps.get(
			"lock.expiration.time.com.liferay.samples.fbo.oidc.sid.model.OidcSid"));

	public OidcSidModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _OidcSidId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setOidcSidId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _OidcSidId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

		Map<String, Function<OidcSid, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<OidcSid, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<OidcSid, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((OidcSid)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<OidcSid, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<OidcSid, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(OidcSid)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<OidcSid, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<OidcSid, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, OidcSid>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			OidcSid.class.getClassLoader(), OidcSid.class, ModelWrapper.class);

		try {
			Constructor<OidcSid> constructor =
				(Constructor<OidcSid>)proxyClass.getConstructor(
					InvocationHandler.class);

			return invocationHandler -> {
				try {
					return constructor.newInstance(invocationHandler);
				}
				catch (ReflectiveOperationException
							reflectiveOperationException) {

					throw new InternalError(reflectiveOperationException);
				}
			};
		}
		catch (NoSuchMethodException noSuchMethodException) {
			throw new InternalError(noSuchMethodException);
		}
	}

	private static final Map<String, Function<OidcSid, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<OidcSid, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<OidcSid, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<OidcSid, Object>>();
		Map<String, BiConsumer<OidcSid, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<OidcSid, ?>>();

		attributeGetterFunctions.put(
			"uuid",
			new Function<OidcSid, Object>() {

				@Override
				public Object apply(OidcSid oidcSid) {
					return oidcSid.getUuid();
				}

			});
		attributeSetterBiConsumers.put(
			"uuid",
			new BiConsumer<OidcSid, Object>() {

				@Override
				public void accept(OidcSid oidcSid, Object uuidObject) {
					oidcSid.setUuid((String)uuidObject);
				}

			});
		attributeGetterFunctions.put(
			"OidcSidId",
			new Function<OidcSid, Object>() {

				@Override
				public Object apply(OidcSid oidcSid) {
					return oidcSid.getOidcSidId();
				}

			});
		attributeSetterBiConsumers.put(
			"OidcSidId",
			new BiConsumer<OidcSid, Object>() {

				@Override
				public void accept(OidcSid oidcSid, Object OidcSidIdObject) {
					oidcSid.setOidcSidId((Long)OidcSidIdObject);
				}

			});
		attributeGetterFunctions.put(
			"companyId",
			new Function<OidcSid, Object>() {

				@Override
				public Object apply(OidcSid oidcSid) {
					return oidcSid.getCompanyId();
				}

			});
		attributeSetterBiConsumers.put(
			"companyId",
			new BiConsumer<OidcSid, Object>() {

				@Override
				public void accept(OidcSid oidcSid, Object companyIdObject) {
					oidcSid.setCompanyId((Long)companyIdObject);
				}

			});
		attributeGetterFunctions.put(
			"userId",
			new Function<OidcSid, Object>() {

				@Override
				public Object apply(OidcSid oidcSid) {
					return oidcSid.getUserId();
				}

			});
		attributeSetterBiConsumers.put(
			"userId",
			new BiConsumer<OidcSid, Object>() {

				@Override
				public void accept(OidcSid oidcSid, Object userIdObject) {
					oidcSid.setUserId((Long)userIdObject);
				}

			});
		attributeGetterFunctions.put(
			"userName",
			new Function<OidcSid, Object>() {

				@Override
				public Object apply(OidcSid oidcSid) {
					return oidcSid.getUserName();
				}

			});
		attributeSetterBiConsumers.put(
			"userName",
			new BiConsumer<OidcSid, Object>() {

				@Override
				public void accept(OidcSid oidcSid, Object userNameObject) {
					oidcSid.setUserName((String)userNameObject);
				}

			});
		attributeGetterFunctions.put(
			"createDate",
			new Function<OidcSid, Object>() {

				@Override
				public Object apply(OidcSid oidcSid) {
					return oidcSid.getCreateDate();
				}

			});
		attributeSetterBiConsumers.put(
			"createDate",
			new BiConsumer<OidcSid, Object>() {

				@Override
				public void accept(OidcSid oidcSid, Object createDateObject) {
					oidcSid.setCreateDate((Date)createDateObject);
				}

			});
		attributeGetterFunctions.put(
			"modifiedDate",
			new Function<OidcSid, Object>() {

				@Override
				public Object apply(OidcSid oidcSid) {
					return oidcSid.getModifiedDate();
				}

			});
		attributeSetterBiConsumers.put(
			"modifiedDate",
			new BiConsumer<OidcSid, Object>() {

				@Override
				public void accept(OidcSid oidcSid, Object modifiedDateObject) {
					oidcSid.setModifiedDate((Date)modifiedDateObject);
				}

			});
		attributeGetterFunctions.put(
			"sessionId",
			new Function<OidcSid, Object>() {

				@Override
				public Object apply(OidcSid oidcSid) {
					return oidcSid.getSessionId();
				}

			});
		attributeSetterBiConsumers.put(
			"sessionId",
			new BiConsumer<OidcSid, Object>() {

				@Override
				public void accept(OidcSid oidcSid, Object sessionIdObject) {
					oidcSid.setSessionId((String)sessionIdObject);
				}

			});
		attributeGetterFunctions.put(
			"sid",
			new Function<OidcSid, Object>() {

				@Override
				public Object apply(OidcSid oidcSid) {
					return oidcSid.getSid();
				}

			});
		attributeSetterBiConsumers.put(
			"sid",
			new BiConsumer<OidcSid, Object>() {

				@Override
				public void accept(OidcSid oidcSid, Object sidObject) {
					oidcSid.setSid((String)sidObject);
				}

			});
		attributeGetterFunctions.put(
			"jwksUri",
			new Function<OidcSid, Object>() {

				@Override
				public Object apply(OidcSid oidcSid) {
					return oidcSid.getJwksUri();
				}

			});
		attributeSetterBiConsumers.put(
			"jwksUri",
			new BiConsumer<OidcSid, Object>() {

				@Override
				public void accept(OidcSid oidcSid, Object jwksUriObject) {
					oidcSid.setJwksUri((String)jwksUriObject);
				}

			});
		attributeGetterFunctions.put(
			"issuer",
			new Function<OidcSid, Object>() {

				@Override
				public Object apply(OidcSid oidcSid) {
					return oidcSid.getIssuer();
				}

			});
		attributeSetterBiConsumers.put(
			"issuer",
			new BiConsumer<OidcSid, Object>() {

				@Override
				public void accept(OidcSid oidcSid, Object issuerObject) {
					oidcSid.setIssuer((String)issuerObject);
				}

			});
		attributeGetterFunctions.put(
			"alg",
			new Function<OidcSid, Object>() {

				@Override
				public Object apply(OidcSid oidcSid) {
					return oidcSid.getAlg();
				}

			});
		attributeSetterBiConsumers.put(
			"alg",
			new BiConsumer<OidcSid, Object>() {

				@Override
				public void accept(OidcSid oidcSid, Object algObject) {
					oidcSid.setAlg((String)algObject);
				}

			});
		attributeGetterFunctions.put(
			"status",
			new Function<OidcSid, Object>() {

				@Override
				public Object apply(OidcSid oidcSid) {
					return oidcSid.getStatus();
				}

			});
		attributeSetterBiConsumers.put(
			"status",
			new BiConsumer<OidcSid, Object>() {

				@Override
				public void accept(OidcSid oidcSid, Object statusObject) {
					oidcSid.setStatus((Boolean)statusObject);
				}

			});

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return "";
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		_columnBitmask |= UUID_COLUMN_BITMASK;

		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@JSON
	@Override
	public long getOidcSidId() {
		return _OidcSidId;
	}

	@Override
	public void setOidcSidId(long OidcSidId) {
		_OidcSidId = OidcSidId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException portalException) {
			return "";
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return "";
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public String getSessionId() {
		if (_sessionId == null) {
			return "";
		}
		else {
			return _sessionId;
		}
	}

	@Override
	public void setSessionId(String sessionId) {
		_columnBitmask |= SESSIONID_COLUMN_BITMASK;

		if (_originalSessionId == null) {
			_originalSessionId = _sessionId;
		}

		_sessionId = sessionId;
	}

	public String getOriginalSessionId() {
		return GetterUtil.getString(_originalSessionId);
	}

	@JSON
	@Override
	public String getSid() {
		if (_sid == null) {
			return "";
		}
		else {
			return _sid;
		}
	}

	@Override
	public void setSid(String sid) {
		_columnBitmask |= SID_COLUMN_BITMASK;

		if (_originalSid == null) {
			_originalSid = _sid;
		}

		_sid = sid;
	}

	public String getOriginalSid() {
		return GetterUtil.getString(_originalSid);
	}

	@JSON
	@Override
	public String getJwksUri() {
		if (_jwksUri == null) {
			return "";
		}
		else {
			return _jwksUri;
		}
	}

	@Override
	public void setJwksUri(String jwksUri) {
		_jwksUri = jwksUri;
	}

	@JSON
	@Override
	public String getIssuer() {
		if (_issuer == null) {
			return "";
		}
		else {
			return _issuer;
		}
	}

	@Override
	public void setIssuer(String issuer) {
		_issuer = issuer;
	}

	@JSON
	@Override
	public String getAlg() {
		if (_alg == null) {
			return "";
		}
		else {
			return _alg;
		}
	}

	@Override
	public void setAlg(String alg) {
		_alg = alg;
	}

	@JSON
	@Override
	public boolean getStatus() {
		return _status;
	}

	@JSON
	@Override
	public boolean isStatus() {
		return _status;
	}

	@Override
	public void setStatus(boolean status) {
		_status = status;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(
			PortalUtil.getClassNameId(OidcSid.class.getName()));
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			getCompanyId(), OidcSid.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public OidcSid toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, OidcSid>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		OidcSidImpl oidcSidImpl = new OidcSidImpl();

		oidcSidImpl.setUuid(getUuid());
		oidcSidImpl.setOidcSidId(getOidcSidId());
		oidcSidImpl.setCompanyId(getCompanyId());
		oidcSidImpl.setUserId(getUserId());
		oidcSidImpl.setUserName(getUserName());
		oidcSidImpl.setCreateDate(getCreateDate());
		oidcSidImpl.setModifiedDate(getModifiedDate());
		oidcSidImpl.setSessionId(getSessionId());
		oidcSidImpl.setSid(getSid());
		oidcSidImpl.setJwksUri(getJwksUri());
		oidcSidImpl.setIssuer(getIssuer());
		oidcSidImpl.setAlg(getAlg());
		oidcSidImpl.setStatus(isStatus());

		oidcSidImpl.resetOriginalValues();

		return oidcSidImpl;
	}

	@Override
	public int compareTo(OidcSid oidcSid) {
		long primaryKey = oidcSid.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof OidcSid)) {
			return false;
		}

		OidcSid oidcSid = (OidcSid)object;

		long primaryKey = oidcSid.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		_originalUuid = _uuid;

		_originalCompanyId = _companyId;

		_setOriginalCompanyId = false;

		_setModifiedDate = false;
		_originalSessionId = _sessionId;

		_originalSid = _sid;

		_columnBitmask = 0;
	}

	@Override
	public CacheModel<OidcSid> toCacheModel() {
		OidcSidCacheModel oidcSidCacheModel = new OidcSidCacheModel();

		oidcSidCacheModel.uuid = getUuid();

		String uuid = oidcSidCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			oidcSidCacheModel.uuid = null;
		}

		oidcSidCacheModel.OidcSidId = getOidcSidId();

		oidcSidCacheModel.companyId = getCompanyId();

		oidcSidCacheModel.userId = getUserId();

		oidcSidCacheModel.userName = getUserName();

		String userName = oidcSidCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			oidcSidCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			oidcSidCacheModel.createDate = createDate.getTime();
		}
		else {
			oidcSidCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			oidcSidCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			oidcSidCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		oidcSidCacheModel.sessionId = getSessionId();

		String sessionId = oidcSidCacheModel.sessionId;

		if ((sessionId != null) && (sessionId.length() == 0)) {
			oidcSidCacheModel.sessionId = null;
		}

		oidcSidCacheModel.sid = getSid();

		String sid = oidcSidCacheModel.sid;

		if ((sid != null) && (sid.length() == 0)) {
			oidcSidCacheModel.sid = null;
		}

		oidcSidCacheModel.jwksUri = getJwksUri();

		String jwksUri = oidcSidCacheModel.jwksUri;

		if ((jwksUri != null) && (jwksUri.length() == 0)) {
			oidcSidCacheModel.jwksUri = null;
		}

		oidcSidCacheModel.issuer = getIssuer();

		String issuer = oidcSidCacheModel.issuer;

		if ((issuer != null) && (issuer.length() == 0)) {
			oidcSidCacheModel.issuer = null;
		}

		oidcSidCacheModel.alg = getAlg();

		String alg = oidcSidCacheModel.alg;

		if ((alg != null) && (alg.length() == 0)) {
			oidcSidCacheModel.alg = null;
		}

		oidcSidCacheModel.status = isStatus();

		return oidcSidCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<OidcSid, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<OidcSid, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<OidcSid, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply((OidcSid)this);

			if (value == null) {
				sb.append("null");
			}
			else if (value instanceof Blob || value instanceof Date ||
					 value instanceof Map || value instanceof String) {

				sb.append(
					"\"" + StringUtil.replace(value.toString(), "\"", "'") +
						"\"");
			}
			else {
				sb.append(value);
			}

			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		Map<String, Function<OidcSid, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<OidcSid, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<OidcSid, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((OidcSid)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, OidcSid>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private String _uuid;
	private String _originalUuid;
	private long _OidcSidId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _sessionId;
	private String _originalSessionId;
	private String _sid;
	private String _originalSid;
	private String _jwksUri;
	private String _issuer;
	private String _alg;
	private boolean _status;
	private long _columnBitmask;
	private OidcSid _escapedModel;

}