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

package com.liferay.samples.fbo.oidc.sid.service;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.samples.fbo.oidc.sid.model.OidcSid;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for OidcSid. This utility wraps
 * <code>com.liferay.samples.fbo.oidc.sid.service.impl.OidcSidLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see OidcSidLocalService
 * @generated
 */
public class OidcSidLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.samples.fbo.oidc.sid.service.impl.OidcSidLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the oidc sid to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OidcSidLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param oidcSid the oidc sid
	 * @return the oidc sid that was added
	 */
	public static OidcSid addOidcSid(OidcSid oidcSid) {
		return getService().addOidcSid(oidcSid);
	}

	/**
	 * Creates a new oidc sid with the primary key. Does not add the oidc sid to the database.
	 *
	 * @param OidcSidId the primary key for the new oidc sid
	 * @return the new oidc sid
	 */
	public static OidcSid createOidcSid(long OidcSidId) {
		return getService().createOidcSid(OidcSidId);
	}

	/**
	 * Deletes the oidc sid with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OidcSidLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param OidcSidId the primary key of the oidc sid
	 * @return the oidc sid that was removed
	 * @throws PortalException if a oidc sid with the primary key could not be found
	 */
	public static OidcSid deleteOidcSid(long OidcSidId) throws PortalException {
		return getService().deleteOidcSid(OidcSidId);
	}

	/**
	 * Deletes the oidc sid from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OidcSidLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param oidcSid the oidc sid
	 * @return the oidc sid that was removed
	 */
	public static OidcSid deleteOidcSid(OidcSid oidcSid) {
		return getService().deleteOidcSid(oidcSid);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.samples.fbo.oidc.sid.model.impl.OidcSidModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.samples.fbo.oidc.sid.model.impl.OidcSidModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static OidcSid fetchOidcSid(long OidcSidId) {
		return getService().fetchOidcSid(OidcSidId);
	}

	/**
	 * Returns the oidc sid with the matching UUID and company.
	 *
	 * @param uuid the oidc sid's UUID
	 * @param companyId the primary key of the company
	 * @return the matching oidc sid, or <code>null</code> if a matching oidc sid could not be found
	 */
	public static OidcSid fetchOidcSidByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().fetchOidcSidByUuidAndCompanyId(uuid, companyId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static OidcSid getBySessionId(String sessionId)
		throws com.liferay.samples.fbo.oidc.sid.exception.
			NoSuchOidcSidException {

		return getService().getBySessionId(sessionId);
	}

	public static OidcSid getBySid(String sid)
		throws com.liferay.samples.fbo.oidc.sid.exception.
			NoSuchOidcSidException {

		return getService().getBySid(sid);
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the oidc sid with the primary key.
	 *
	 * @param OidcSidId the primary key of the oidc sid
	 * @return the oidc sid
	 * @throws PortalException if a oidc sid with the primary key could not be found
	 */
	public static OidcSid getOidcSid(long OidcSidId) throws PortalException {
		return getService().getOidcSid(OidcSidId);
	}

	/**
	 * Returns the oidc sid with the matching UUID and company.
	 *
	 * @param uuid the oidc sid's UUID
	 * @param companyId the primary key of the company
	 * @return the matching oidc sid
	 * @throws PortalException if a matching oidc sid could not be found
	 */
	public static OidcSid getOidcSidByUuidAndCompanyId(
			String uuid, long companyId)
		throws PortalException {

		return getService().getOidcSidByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of all the oidc sids.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.samples.fbo.oidc.sid.model.impl.OidcSidModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of oidc sids
	 * @param end the upper bound of the range of oidc sids (not inclusive)
	 * @return the range of oidc sids
	 */
	public static List<OidcSid> getOidcSids(int start, int end) {
		return getService().getOidcSids(start, end);
	}

	/**
	 * Returns the number of oidc sids.
	 *
	 * @return the number of oidc sids
	 */
	public static int getOidcSidsCount() {
		return getService().getOidcSidsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the oidc sid in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OidcSidLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param oidcSid the oidc sid
	 * @return the oidc sid that was updated
	 */
	public static OidcSid updateOidcSid(OidcSid oidcSid) {
		return getService().updateOidcSid(oidcSid);
	}

	public static OidcSidLocalService getService() {
		return _service;
	}

	private static volatile OidcSidLocalService _service;

}