// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph2.callrecords.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph2.callrecords.models.extensions.Option;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Option Request.
 */
public class OptionRequest extends BaseRequest<Option> {
	
    /**
     * The request for the Option
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OptionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Option.class);
    }

    /**
     * Gets the Option from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.Future<? super Option> futureGet() {
        return futureSend(HttpMethod.GET, null);
    }

    /**
     * Gets the Option from the service
     *
     * @return the Option from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Option get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.Future<? super Option> futureDelete() {
        return futureSend(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public Option delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this Option with a source
     *
     * @param sourceOption the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.Future<? super Option> futurePatch(@Nonnull final Option sourceOption) {
        return futureSend(HttpMethod.PATCH, sourceOption);
    }

    /**
     * Patches this Option with a source
     *
     * @param sourceOption the source object with updates
     * @return the updated Option
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Option patch(@Nonnull final Option sourceOption) throws ClientException {
        return send(HttpMethod.PATCH, sourceOption);
    }

    /**
     * Creates a Option with a new object
     *
     * @param newOption the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.Future<? super Option> futurePost(@Nonnull final Option newOption) {
        return futureSend(HttpMethod.POST, newOption);
    }

    /**
     * Creates a Option with a new object
     *
     * @param newOption the new object to create
     * @return the created Option
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Option post(@Nonnull final Option newOption) throws ClientException {
        return send(HttpMethod.POST, newOption);
    }

    /**
     * Creates a Option with a new object
     *
     * @param newOption the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.Future<? super Option> futurePut(@Nonnull final Option newOption) {
        return futureSend(HttpMethod.PUT, newOption);
    }

    /**
     * Creates a Option with a new object
     *
     * @param newOption the object to create/update
     * @return the created Option
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Option put(@Nonnull final Option newOption) throws ClientException {
        return send(HttpMethod.PUT, newOption);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public OptionRequest select(@Nonnull final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public OptionRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

