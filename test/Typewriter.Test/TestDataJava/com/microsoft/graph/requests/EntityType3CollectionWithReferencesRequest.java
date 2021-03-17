// Template Source: BaseEntityCollectionWithReferencesRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph2.callrecords.models.Segment;
import com.microsoft.graph.models.EntityType3;
import com.microsoft.graph.models.Recipient;
import com.microsoft.graph2.callrecords.models.Session;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.models.EntityType3;
import com.microsoft.graph.requests.EntityType3WithReferenceRequest;
import com.microsoft.graph.requests.EntityType3ReferenceRequestBuilder;
import com.microsoft.graph.requests.EntityType3WithReferenceRequestBuilder;
import com.microsoft.graph.requests.EntityType3CollectionWithReferencesRequest;
import com.microsoft.graph.requests.EntityType3CollectionWithReferencesRequest;
import com.microsoft.graph.requests.EntityType3CollectionWithReferencesRequestBuilder;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequest;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Entity Type3Collection With References Request.
 * @deprecated entityType3 is deprecated. Please use singletonEntity1.
 */
@Deprecated
public class EntityType3CollectionWithReferencesRequest extends BaseCollectionWithReferencesRequest<EntityType3, EntityType3WithReferenceRequest, EntityType3ReferenceRequestBuilder, EntityType3WithReferenceRequestBuilder, EntityType3CollectionResponse, EntityType3CollectionWithReferencesPage, EntityType3CollectionWithReferencesRequest> {

    /**
     * The request builder for this collection of EntityType3
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EntityType3CollectionWithReferencesRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EntityType3CollectionResponse.class, EntityType3CollectionWithReferencesPage.class, EntityType3CollectionWithReferencesRequestBuilder.class);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public EntityType3CollectionWithReferencesRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    @Nonnull
    public EntityType3CollectionWithReferencesRequest filter(@Nonnull final String value) {
        addFilterOption(value);
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    @Nonnull
    public EntityType3CollectionWithReferencesRequest orderBy(@Nonnull final String value) {
        addOrderByOption(value);
        return this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public EntityType3CollectionWithReferencesRequest select(@Nonnull final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    @Nonnull
    public EntityType3CollectionWithReferencesRequest top(final int value) {
        addTopOption(value);
        return this;
    }

    /**
     * Sets the count value for the request
     *
     * @param value whether or not to return the count of objects with the request
     * @return the updated request
     */
    @Nonnull
    public EntityType3CollectionWithReferencesRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public EntityType3CollectionWithReferencesRequest count() {
        addCountOption(true);
        return this;
    }
}
