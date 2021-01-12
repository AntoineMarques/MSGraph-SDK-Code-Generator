// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.EntityType3;
import com.microsoft.graph.models.extensions.Recipient;
import com.microsoft.graph2.callrecords.models.extensions.Session;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.extensions.EntityType3ForwardParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Entity Type3Request Builder.
 * @deprecated entityType3 is deprecated. Please use singletonEntity1.
 */
@Deprecated
public class EntityType3RequestBuilder extends BaseRequestBuilder<EntityType3> {

    /**
     * The request builder for the EntityType3
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EntityType3RequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the EntityType3Request instance
     */
    @Nonnull
    public EntityType3Request buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the EntityType3Request instance
     */
    @Nonnull
    public EntityType3Request buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.EntityType3Request(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     * @deprecated entityType3 is deprecated. Please use singletonEntity1.
     */
    @Deprecated
    @Nonnull
    public EntityType3ForwardRequestBuilder forward(@Nonnull final EntityType3ForwardParameterSet parameters) {
        return new EntityType3ForwardRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.forward"), getClient(), null, parameters);
    }
}
