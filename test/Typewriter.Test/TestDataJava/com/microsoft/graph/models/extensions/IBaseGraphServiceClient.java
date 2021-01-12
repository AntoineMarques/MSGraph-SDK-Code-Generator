// Template Source: IBaseClient.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.requests.extensions.EntityType3CollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EntityType3RequestBuilder;
import com.microsoft.graph.requests.extensions.SingletonEntity1RequestBuilder;
import com.microsoft.graph.requests.extensions.SingletonEntity2RequestBuilder;
import com.microsoft.graph2.callrecords.requests.extensions.SingletonEntity1RequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Graph Service Client.
 */
public interface IBaseGraphServiceClient extends IBaseClient {

    /**
     * Gets the collection of TestTypes objects
     *
     * @return the request builder for the collection of TestTypes objects
     * @deprecated entityType3 is deprecated. Please use singletonEntity1.
     */
    @Deprecated
    @Nonnull
    EntityType3CollectionRequestBuilder testTypes();

    /**
     * Gets a single TestTypes
     *
     * @param id the id of the TestTypes to retrieve
     * @return the request builder for the TestTypes object
     * @deprecated entityType3 is deprecated. Please use singletonEntity1.
     */
    @Deprecated
    @Nonnull
    EntityType3RequestBuilder testTypes(@Nonnull final String id);

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the SingletonEntity1
     */
    @Nonnull
    SingletonEntity1RequestBuilder singletonProperty1();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the SingletonEntity2
     */
    @Nonnull
    SingletonEntity2RequestBuilder singletonProperty2();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the SingletonEntity1
     */
    @Nonnull
    SingletonEntity1RequestBuilder singletonProperty3();

}
