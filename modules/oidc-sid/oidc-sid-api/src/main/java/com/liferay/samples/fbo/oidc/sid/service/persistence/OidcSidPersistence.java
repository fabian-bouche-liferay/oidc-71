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

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.samples.fbo.oidc.sid.exception.NoSuchOidcSidException;
import com.liferay.samples.fbo.oidc.sid.model.OidcSid;

import java.io.Serializable;

import java.util.Map;
import java.util.Set;

/**
 * The persistence interface for the oidc sid service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OidcSidUtil
 * @generated
 */
@ProviderType
public interface OidcSidPersistence extends BasePersistence<OidcSid> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OidcSidUtil} to access the oidc sid persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */
	@Override
	public Map<Serializable, OidcSid> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys);

	/**
	 * Returns all the oidc sids where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching oidc sids
	 */
	public java.util.List<OidcSid> findByUuid(String uuid);

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
	public java.util.List<OidcSid> findByUuid(String uuid, int start, int end);

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
	public java.util.List<OidcSid> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OidcSid>
			orderByComparator);

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
	public java.util.List<OidcSid> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OidcSid>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first oidc sid in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching oidc sid
	 * @throws NoSuchOidcSidException if a matching oidc sid could not be found
	 */
	public OidcSid findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<OidcSid>
				orderByComparator)
		throws NoSuchOidcSidException;

	/**
	 * Returns the first oidc sid in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching oidc sid, or <code>null</code> if a matching oidc sid could not be found
	 */
	public OidcSid fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<OidcSid>
			orderByComparator);

	/**
	 * Returns the last oidc sid in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching oidc sid
	 * @throws NoSuchOidcSidException if a matching oidc sid could not be found
	 */
	public OidcSid findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<OidcSid>
				orderByComparator)
		throws NoSuchOidcSidException;

	/**
	 * Returns the last oidc sid in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching oidc sid, or <code>null</code> if a matching oidc sid could not be found
	 */
	public OidcSid fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<OidcSid>
			orderByComparator);

	/**
	 * Returns the oidc sids before and after the current oidc sid in the ordered set where uuid = &#63;.
	 *
	 * @param OidcSidId the primary key of the current oidc sid
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next oidc sid
	 * @throws NoSuchOidcSidException if a oidc sid with the primary key could not be found
	 */
	public OidcSid[] findByUuid_PrevAndNext(
			long OidcSidId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<OidcSid>
				orderByComparator)
		throws NoSuchOidcSidException;

	/**
	 * Removes all the oidc sids where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of oidc sids where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching oidc sids
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns all the oidc sids where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching oidc sids
	 */
	public java.util.List<OidcSid> findByUuid_C(String uuid, long companyId);

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
	public java.util.List<OidcSid> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<OidcSid> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OidcSid>
			orderByComparator);

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
	public java.util.List<OidcSid> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OidcSid>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first oidc sid in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching oidc sid
	 * @throws NoSuchOidcSidException if a matching oidc sid could not be found
	 */
	public OidcSid findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<OidcSid>
				orderByComparator)
		throws NoSuchOidcSidException;

	/**
	 * Returns the first oidc sid in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching oidc sid, or <code>null</code> if a matching oidc sid could not be found
	 */
	public OidcSid fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<OidcSid>
			orderByComparator);

	/**
	 * Returns the last oidc sid in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching oidc sid
	 * @throws NoSuchOidcSidException if a matching oidc sid could not be found
	 */
	public OidcSid findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<OidcSid>
				orderByComparator)
		throws NoSuchOidcSidException;

	/**
	 * Returns the last oidc sid in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching oidc sid, or <code>null</code> if a matching oidc sid could not be found
	 */
	public OidcSid fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<OidcSid>
			orderByComparator);

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
	public OidcSid[] findByUuid_C_PrevAndNext(
			long OidcSidId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<OidcSid>
				orderByComparator)
		throws NoSuchOidcSidException;

	/**
	 * Removes all the oidc sids where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of oidc sids where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching oidc sids
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the oidc sid where sid = &#63; or throws a <code>NoSuchOidcSidException</code> if it could not be found.
	 *
	 * @param sid the sid
	 * @return the matching oidc sid
	 * @throws NoSuchOidcSidException if a matching oidc sid could not be found
	 */
	public OidcSid findBySid(String sid) throws NoSuchOidcSidException;

	/**
	 * Returns the oidc sid where sid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sid the sid
	 * @return the matching oidc sid, or <code>null</code> if a matching oidc sid could not be found
	 */
	public OidcSid fetchBySid(String sid);

	/**
	 * Returns the oidc sid where sid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sid the sid
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching oidc sid, or <code>null</code> if a matching oidc sid could not be found
	 */
	public OidcSid fetchBySid(String sid, boolean useFinderCache);

	/**
	 * Removes the oidc sid where sid = &#63; from the database.
	 *
	 * @param sid the sid
	 * @return the oidc sid that was removed
	 */
	public OidcSid removeBySid(String sid) throws NoSuchOidcSidException;

	/**
	 * Returns the number of oidc sids where sid = &#63;.
	 *
	 * @param sid the sid
	 * @return the number of matching oidc sids
	 */
	public int countBySid(String sid);

	/**
	 * Returns the oidc sid where sessionId = &#63; or throws a <code>NoSuchOidcSidException</code> if it could not be found.
	 *
	 * @param sessionId the session ID
	 * @return the matching oidc sid
	 * @throws NoSuchOidcSidException if a matching oidc sid could not be found
	 */
	public OidcSid findBySessionId(String sessionId)
		throws NoSuchOidcSidException;

	/**
	 * Returns the oidc sid where sessionId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sessionId the session ID
	 * @return the matching oidc sid, or <code>null</code> if a matching oidc sid could not be found
	 */
	public OidcSid fetchBySessionId(String sessionId);

	/**
	 * Returns the oidc sid where sessionId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sessionId the session ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching oidc sid, or <code>null</code> if a matching oidc sid could not be found
	 */
	public OidcSid fetchBySessionId(String sessionId, boolean useFinderCache);

	/**
	 * Removes the oidc sid where sessionId = &#63; from the database.
	 *
	 * @param sessionId the session ID
	 * @return the oidc sid that was removed
	 */
	public OidcSid removeBySessionId(String sessionId)
		throws NoSuchOidcSidException;

	/**
	 * Returns the number of oidc sids where sessionId = &#63;.
	 *
	 * @param sessionId the session ID
	 * @return the number of matching oidc sids
	 */
	public int countBySessionId(String sessionId);

	/**
	 * Caches the oidc sid in the entity cache if it is enabled.
	 *
	 * @param oidcSid the oidc sid
	 */
	public void cacheResult(OidcSid oidcSid);

	/**
	 * Caches the oidc sids in the entity cache if it is enabled.
	 *
	 * @param oidcSids the oidc sids
	 */
	public void cacheResult(java.util.List<OidcSid> oidcSids);

	/**
	 * Creates a new oidc sid with the primary key. Does not add the oidc sid to the database.
	 *
	 * @param OidcSidId the primary key for the new oidc sid
	 * @return the new oidc sid
	 */
	public OidcSid create(long OidcSidId);

	/**
	 * Removes the oidc sid with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param OidcSidId the primary key of the oidc sid
	 * @return the oidc sid that was removed
	 * @throws NoSuchOidcSidException if a oidc sid with the primary key could not be found
	 */
	public OidcSid remove(long OidcSidId) throws NoSuchOidcSidException;

	public OidcSid updateImpl(OidcSid oidcSid);

	/**
	 * Returns the oidc sid with the primary key or throws a <code>NoSuchOidcSidException</code> if it could not be found.
	 *
	 * @param OidcSidId the primary key of the oidc sid
	 * @return the oidc sid
	 * @throws NoSuchOidcSidException if a oidc sid with the primary key could not be found
	 */
	public OidcSid findByPrimaryKey(long OidcSidId)
		throws NoSuchOidcSidException;

	/**
	 * Returns the oidc sid with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param OidcSidId the primary key of the oidc sid
	 * @return the oidc sid, or <code>null</code> if a oidc sid with the primary key could not be found
	 */
	public OidcSid fetchByPrimaryKey(long OidcSidId);

	/**
	 * Returns all the oidc sids.
	 *
	 * @return the oidc sids
	 */
	public java.util.List<OidcSid> findAll();

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
	public java.util.List<OidcSid> findAll(int start, int end);

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
	public java.util.List<OidcSid> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OidcSid>
			orderByComparator);

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
	public java.util.List<OidcSid> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OidcSid>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the oidc sids from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of oidc sids.
	 *
	 * @return the number of oidc sids
	 */
	public int countAll();

	@Override
	public Set<String> getBadColumnNames();

}