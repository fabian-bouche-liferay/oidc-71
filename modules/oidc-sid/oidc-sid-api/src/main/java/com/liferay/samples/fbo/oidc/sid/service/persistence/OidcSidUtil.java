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

package com.liferay.samples.fbo.oidc.sid.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.samples.fbo.oidc.sid.model.OidcSid;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the oidc sid service. This utility wraps <code>com.liferay.samples.fbo.oidc.sid.service.persistence.impl.OidcSidPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OidcSidPersistence
 * @generated
 */
public class OidcSidUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(OidcSid oidcSid) {
		getPersistence().clearCache(oidcSid);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, OidcSid> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<OidcSid> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OidcSid> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OidcSid> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<OidcSid> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static OidcSid update(OidcSid oidcSid) {
		return getPersistence().update(oidcSid);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static OidcSid update(
		OidcSid oidcSid, ServiceContext serviceContext) {

		return getPersistence().update(oidcSid, serviceContext);
	}

	/**
	 * Returns all the oidc sids where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching oidc sids
	 */
	public static List<OidcSid> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the oidc sids where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OidcSidModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of oidc sids
	 * @param end the upper bound of the range of oidc sids (not inclusive)
	 * @return the range of matching oidc sids
	 */
	public static List<OidcSid> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the oidc sids where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OidcSidModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of oidc sids
	 * @param end the upper bound of the range of oidc sids (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching oidc sids
	 */
	public static List<OidcSid> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<OidcSid> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the oidc sids where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OidcSidModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of oidc sids
	 * @param end the upper bound of the range of oidc sids (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching oidc sids
	 */
	public static List<OidcSid> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<OidcSid> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first oidc sid in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching oidc sid
	 * @throws NoSuchOidcSidException if a matching oidc sid could not be found
	 */
	public static OidcSid findByUuid_First(
			String uuid, OrderByComparator<OidcSid> orderByComparator)
		throws com.liferay.samples.fbo.oidc.sid.exception.
			NoSuchOidcSidException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first oidc sid in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching oidc sid, or <code>null</code> if a matching oidc sid could not be found
	 */
	public static OidcSid fetchByUuid_First(
		String uuid, OrderByComparator<OidcSid> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last oidc sid in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching oidc sid
	 * @throws NoSuchOidcSidException if a matching oidc sid could not be found
	 */
	public static OidcSid findByUuid_Last(
			String uuid, OrderByComparator<OidcSid> orderByComparator)
		throws com.liferay.samples.fbo.oidc.sid.exception.
			NoSuchOidcSidException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last oidc sid in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching oidc sid, or <code>null</code> if a matching oidc sid could not be found
	 */
	public static OidcSid fetchByUuid_Last(
		String uuid, OrderByComparator<OidcSid> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the oidc sids before and after the current oidc sid in the ordered set where uuid = &#63;.
	 *
	 * @param OidcSidId the primary key of the current oidc sid
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next oidc sid
	 * @throws NoSuchOidcSidException if a oidc sid with the primary key could not be found
	 */
	public static OidcSid[] findByUuid_PrevAndNext(
			long OidcSidId, String uuid,
			OrderByComparator<OidcSid> orderByComparator)
		throws com.liferay.samples.fbo.oidc.sid.exception.
			NoSuchOidcSidException {

		return getPersistence().findByUuid_PrevAndNext(
			OidcSidId, uuid, orderByComparator);
	}

	/**
	 * Removes all the oidc sids where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of oidc sids where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching oidc sids
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns all the oidc sids where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching oidc sids
	 */
	public static List<OidcSid> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the oidc sids where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OidcSidModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of oidc sids
	 * @param end the upper bound of the range of oidc sids (not inclusive)
	 * @return the range of matching oidc sids
	 */
	public static List<OidcSid> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the oidc sids where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OidcSidModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of oidc sids
	 * @param end the upper bound of the range of oidc sids (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching oidc sids
	 */
	public static List<OidcSid> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<OidcSid> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the oidc sids where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OidcSidModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of oidc sids
	 * @param end the upper bound of the range of oidc sids (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching oidc sids
	 */
	public static List<OidcSid> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<OidcSid> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first oidc sid in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching oidc sid
	 * @throws NoSuchOidcSidException if a matching oidc sid could not be found
	 */
	public static OidcSid findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<OidcSid> orderByComparator)
		throws com.liferay.samples.fbo.oidc.sid.exception.
			NoSuchOidcSidException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first oidc sid in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching oidc sid, or <code>null</code> if a matching oidc sid could not be found
	 */
	public static OidcSid fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<OidcSid> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last oidc sid in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching oidc sid
	 * @throws NoSuchOidcSidException if a matching oidc sid could not be found
	 */
	public static OidcSid findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<OidcSid> orderByComparator)
		throws com.liferay.samples.fbo.oidc.sid.exception.
			NoSuchOidcSidException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last oidc sid in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching oidc sid, or <code>null</code> if a matching oidc sid could not be found
	 */
	public static OidcSid fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<OidcSid> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the oidc sids before and after the current oidc sid in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param OidcSidId the primary key of the current oidc sid
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next oidc sid
	 * @throws NoSuchOidcSidException if a oidc sid with the primary key could not be found
	 */
	public static OidcSid[] findByUuid_C_PrevAndNext(
			long OidcSidId, String uuid, long companyId,
			OrderByComparator<OidcSid> orderByComparator)
		throws com.liferay.samples.fbo.oidc.sid.exception.
			NoSuchOidcSidException {

		return getPersistence().findByUuid_C_PrevAndNext(
			OidcSidId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the oidc sids where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of oidc sids where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching oidc sids
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the oidc sid where sid = &#63; or throws a <code>NoSuchOidcSidException</code> if it could not be found.
	 *
	 * @param sid the sid
	 * @return the matching oidc sid
	 * @throws NoSuchOidcSidException if a matching oidc sid could not be found
	 */
	public static OidcSid findBySid(String sid)
		throws com.liferay.samples.fbo.oidc.sid.exception.
			NoSuchOidcSidException {

		return getPersistence().findBySid(sid);
	}

	/**
	 * Returns the oidc sid where sid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sid the sid
	 * @return the matching oidc sid, or <code>null</code> if a matching oidc sid could not be found
	 */
	public static OidcSid fetchBySid(String sid) {
		return getPersistence().fetchBySid(sid);
	}

	/**
	 * Returns the oidc sid where sid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sid the sid
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching oidc sid, or <code>null</code> if a matching oidc sid could not be found
	 */
	public static OidcSid fetchBySid(String sid, boolean useFinderCache) {
		return getPersistence().fetchBySid(sid, useFinderCache);
	}

	/**
	 * Removes the oidc sid where sid = &#63; from the database.
	 *
	 * @param sid the sid
	 * @return the oidc sid that was removed
	 */
	public static OidcSid removeBySid(String sid)
		throws com.liferay.samples.fbo.oidc.sid.exception.
			NoSuchOidcSidException {

		return getPersistence().removeBySid(sid);
	}

	/**
	 * Returns the number of oidc sids where sid = &#63;.
	 *
	 * @param sid the sid
	 * @return the number of matching oidc sids
	 */
	public static int countBySid(String sid) {
		return getPersistence().countBySid(sid);
	}

	/**
	 * Returns the oidc sid where sessionId = &#63; or throws a <code>NoSuchOidcSidException</code> if it could not be found.
	 *
	 * @param sessionId the session ID
	 * @return the matching oidc sid
	 * @throws NoSuchOidcSidException if a matching oidc sid could not be found
	 */
	public static OidcSid findBySessionId(String sessionId)
		throws com.liferay.samples.fbo.oidc.sid.exception.
			NoSuchOidcSidException {

		return getPersistence().findBySessionId(sessionId);
	}

	/**
	 * Returns the oidc sid where sessionId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sessionId the session ID
	 * @return the matching oidc sid, or <code>null</code> if a matching oidc sid could not be found
	 */
	public static OidcSid fetchBySessionId(String sessionId) {
		return getPersistence().fetchBySessionId(sessionId);
	}

	/**
	 * Returns the oidc sid where sessionId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sessionId the session ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching oidc sid, or <code>null</code> if a matching oidc sid could not be found
	 */
	public static OidcSid fetchBySessionId(
		String sessionId, boolean useFinderCache) {

		return getPersistence().fetchBySessionId(sessionId, useFinderCache);
	}

	/**
	 * Removes the oidc sid where sessionId = &#63; from the database.
	 *
	 * @param sessionId the session ID
	 * @return the oidc sid that was removed
	 */
	public static OidcSid removeBySessionId(String sessionId)
		throws com.liferay.samples.fbo.oidc.sid.exception.
			NoSuchOidcSidException {

		return getPersistence().removeBySessionId(sessionId);
	}

	/**
	 * Returns the number of oidc sids where sessionId = &#63;.
	 *
	 * @param sessionId the session ID
	 * @return the number of matching oidc sids
	 */
	public static int countBySessionId(String sessionId) {
		return getPersistence().countBySessionId(sessionId);
	}

	/**
	 * Caches the oidc sid in the entity cache if it is enabled.
	 *
	 * @param oidcSid the oidc sid
	 */
	public static void cacheResult(OidcSid oidcSid) {
		getPersistence().cacheResult(oidcSid);
	}

	/**
	 * Caches the oidc sids in the entity cache if it is enabled.
	 *
	 * @param oidcSids the oidc sids
	 */
	public static void cacheResult(List<OidcSid> oidcSids) {
		getPersistence().cacheResult(oidcSids);
	}

	/**
	 * Creates a new oidc sid with the primary key. Does not add the oidc sid to the database.
	 *
	 * @param OidcSidId the primary key for the new oidc sid
	 * @return the new oidc sid
	 */
	public static OidcSid create(long OidcSidId) {
		return getPersistence().create(OidcSidId);
	}

	/**
	 * Removes the oidc sid with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param OidcSidId the primary key of the oidc sid
	 * @return the oidc sid that was removed
	 * @throws NoSuchOidcSidException if a oidc sid with the primary key could not be found
	 */
	public static OidcSid remove(long OidcSidId)
		throws com.liferay.samples.fbo.oidc.sid.exception.
			NoSuchOidcSidException {

		return getPersistence().remove(OidcSidId);
	}

	public static OidcSid updateImpl(OidcSid oidcSid) {
		return getPersistence().updateImpl(oidcSid);
	}

	/**
	 * Returns the oidc sid with the primary key or throws a <code>NoSuchOidcSidException</code> if it could not be found.
	 *
	 * @param OidcSidId the primary key of the oidc sid
	 * @return the oidc sid
	 * @throws NoSuchOidcSidException if a oidc sid with the primary key could not be found
	 */
	public static OidcSid findByPrimaryKey(long OidcSidId)
		throws com.liferay.samples.fbo.oidc.sid.exception.
			NoSuchOidcSidException {

		return getPersistence().findByPrimaryKey(OidcSidId);
	}

	/**
	 * Returns the oidc sid with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param OidcSidId the primary key of the oidc sid
	 * @return the oidc sid, or <code>null</code> if a oidc sid with the primary key could not be found
	 */
	public static OidcSid fetchByPrimaryKey(long OidcSidId) {
		return getPersistence().fetchByPrimaryKey(OidcSidId);
	}

	/**
	 * Returns all the oidc sids.
	 *
	 * @return the oidc sids
	 */
	public static List<OidcSid> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the oidc sids.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OidcSidModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of oidc sids
	 * @param end the upper bound of the range of oidc sids (not inclusive)
	 * @return the range of oidc sids
	 */
	public static List<OidcSid> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the oidc sids.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OidcSidModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of oidc sids
	 * @param end the upper bound of the range of oidc sids (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of oidc sids
	 */
	public static List<OidcSid> findAll(
		int start, int end, OrderByComparator<OidcSid> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the oidc sids.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OidcSidModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of oidc sids
	 * @param end the upper bound of the range of oidc sids (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of oidc sids
	 */
	public static List<OidcSid> findAll(
		int start, int end, OrderByComparator<OidcSid> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the oidc sids from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of oidc sids.
	 *
	 * @return the number of oidc sids
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static Set<String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static OidcSidPersistence getPersistence() {
		return _persistence;
	}

	private static volatile OidcSidPersistence _persistence;

}