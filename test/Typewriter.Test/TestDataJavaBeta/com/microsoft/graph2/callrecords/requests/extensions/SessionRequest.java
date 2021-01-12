// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph2.callrecords.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph2.callrecords.models.extensions.Session;
import com.microsoft.graph2.callrecords.requests.extensions.SegmentCollectionRequestBuilder;
import com.microsoft.graph2.callrecords.requests.extensions.SegmentRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Session Request.
 */
public class SessionRequest extends BaseRequest<Session> {
	
    /**
     * The request for the Session
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SessionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Session.class);
    }

    /**
     * Gets the Session from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.Future<? super Session> futureGet() {
        return futureSend(HttpMethod.GET, null);
    }

    /**
     * Gets the Session from the service
     *
     * @return the Session from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Session get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.Future<? super Session> futureDelete() {
        return futureSend(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public Session delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this Session with a source
     *
     * @param sourceSession the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.Future<? super Session> futurePatch(@Nonnull final Session sourceSession) {
        return futureSend(HttpMethod.PATCH, sourceSession);
    }

    /**
     * Patches this Session with a source
     *
     * @param sourceSession the source object with updates
     * @return the updated Session
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Session patch(@Nonnull final Session sourceSession) throws ClientException {
        return send(HttpMethod.PATCH, sourceSession);
    }

    /**
     * Creates a Session with a new object
     *
     * @param newSession the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.Future<? super Session> futurePost(@Nonnull final Session newSession) {
        return futureSend(HttpMethod.POST, newSession);
    }

    /**
     * Creates a Session with a new object
     *
     * @param newSession the new object to create
     * @return the created Session
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Session post(@Nonnull final Session newSession) throws ClientException {
        return send(HttpMethod.POST, newSession);
    }

    /**
     * Creates a Session with a new object
     *
     * @param newSession the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.Future<? super Session> futurePut(@Nonnull final Session newSession) {
        return futureSend(HttpMethod.PUT, newSession);
    }

    /**
     * Creates a Session with a new object
     *
     * @param newSession the object to create/update
     * @return the created Session
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Session put(@Nonnull final Session newSession) throws ClientException {
        return send(HttpMethod.PUT, newSession);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public SessionRequest select(@Nonnull final String value) {
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
     public SessionRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

