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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OidcSidLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see OidcSidLocalService
 * @generated
 */
public class OidcSidLocalServiceWrapper
	implements OidcSidLocalService, ServiceWrapper<OidcSidLocalService> {

	public OidcSidLocalServiceWrapper(OidcSidLocalService oidcSidLocalService) {
		_oidcSidLocalService = oidcSidLocalService;
	}

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
	@Override
	public com.liferay.samples.fbo.oidc.sid.model.OidcSid addOidcSid(
		com.liferay.samples.fbo.oidc.sid.model.OidcSid oidcSid) {

		return _oidcSidLocalService.addOidcSid(oidcSid);
	}

	/**
	 * Creates a new oidc sid with the primary key. Does not add the oidc sid to the database.
	 *
	 * @param OidcSidId the primary key for the new oidc sid
	 * @return the new oidc sid
	 */
	@Override
	public com.liferay.samples.fbo.oidc.sid.model.OidcSid createOidcSid(
		long OidcSidId) {

		return _oidcSidLocalService.createOidcSid(OidcSidId);
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
	@Override
	public com.liferay.samples.fbo.oidc.sid.model.OidcSid deleteOidcSid(
			long OidcSidId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _oidcSidLocalService.deleteOidcSid(OidcSidId);
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
	@Override
	public com.liferay.samples.fbo.oidc.sid.model.OidcSid deleteOidcSid(
		com.liferay.samples.fbo.oidc.sid.model.OidcSid oidcSid) {

		return _oidcSidLocalService.deleteOidcSid(oidcSid);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _oidcSidLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _oidcSidLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _oidcSidLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _oidcSidLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _oidcSidLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _oidcSidLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _oidcSidLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.liferay.samples.fbo.oidc.sid.model.OidcSid fetchOidcSid(
		long OidcSidId) {

		return _oidcSidLocalService.fetchOidcSid(OidcSidId);
	}

	/**
	 * Returns the oidc sid with the matching UUID and company.
	 *
	 * @param uuid the oidc sid's UUID
	 * @param companyId the primary key of the company
	 * @return the matching oidc sid, or <code>null</code> if a matching oidc sid could not be found
	 */
	@Override
	public com.liferay.samples.fbo.oidc.sid.model.OidcSid
		fetchOidcSidByUuidAndCompanyId(String uuid, long companyId) {

		return _oidcSidLocalService.fetchOidcSidByUuidAndCompanyId(
			uuid, companyId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _oidcSidLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.samples.fbo.oidc.sid.model.OidcSid getBySessionId(
			String sessionId)
		throws com.liferay.samples.fbo.oidc.sid.exception.
			NoSuchOidcSidException {

		return _oidcSidLocalService.getBySessionId(sessionId);
	}

	@Override
	public com.liferay.samples.fbo.oidc.sid.model.OidcSid getBySid(String sid)
		throws com.liferay.samples.fbo.oidc.sid.exception.
			NoSuchOidcSidException {

		return _oidcSidLocalService.getBySid(sid);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _oidcSidLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _oidcSidLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the oidc sid with the primary key.
	 *
	 * @param OidcSidId the primary key of the oidc sid
	 * @return the oidc sid
	 * @throws PortalException if a oidc sid with the primary key could not be found
	 */
	@Override
	public com.liferay.samples.fbo.oidc.sid.model.OidcSid getOidcSid(
			long OidcSidId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _oidcSidLocalService.getOidcSid(OidcSidId);
	}

	/**
	 * Returns the oidc sid with the matching UUID and company.
	 *
	 * @param uuid the oidc sid's UUID
	 * @param companyId the primary key of the company
	 * @return the matching oidc sid
	 * @throws PortalException if a matching oidc sid could not be found
	 */
	@Override
	public com.liferay.samples.fbo.oidc.sid.model.OidcSid
			getOidcSidByUuidAndCompanyId(String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _oidcSidLocalService.getOidcSidByUuidAndCompanyId(
			uuid, companyId);
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
	@Override
	public java.util.List<com.liferay.samples.fbo.oidc.sid.model.OidcSid>
		getOidcSids(int start, int end) {

		return _oidcSidLocalService.getOidcSids(start, end);
	}

	/**
	 * Returns the number of oidc sids.
	 *
	 * @return the number of oidc sids
	 */
	@Override
	public int getOidcSidsCount() {
		return _oidcSidLocalService.getOidcSidsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _oidcSidLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _oidcSidLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public com.liferay.samples.fbo.oidc.sid.model.OidcSid updateOidcSid(
		com.liferay.samples.fbo.oidc.sid.model.OidcSid oidcSid) {

		return _oidcSidLocalService.updateOidcSid(oidcSid);
	}

	@Override
	public OidcSidLocalService getWrappedService() {
		return _oidcSidLocalService;
	}

	@Override
	public void setWrappedService(OidcSidLocalService oidcSidLocalService) {
		_oidcSidLocalService = oidcSidLocalService;
	}

	private OidcSidLocalService _oidcSidLocalService;

}