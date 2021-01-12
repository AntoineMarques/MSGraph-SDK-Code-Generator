// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.Schedule;
import com.microsoft.graph.requests.extensions.TimeOffCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TimeOffRequestBuilder;
import com.microsoft.graph.requests.extensions.TimeOffRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TimeOffRequestRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Schedule Request.
 */
public class ScheduleRequest extends BaseRequest<Schedule> {
	
    /**
     * The request for the Schedule
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ScheduleRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Schedule.class);
    }

    /**
     * Gets the Schedule from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.Future<? super Schedule> futureGet() {
        return futureSend(HttpMethod.GET, null);
    }

    /**
     * Gets the Schedule from the service
     *
     * @return the Schedule from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Schedule get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.Future<? super Schedule> futureDelete() {
        return futureSend(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public Schedule delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this Schedule with a source
     *
     * @param sourceSchedule the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.Future<? super Schedule> futurePatch(@Nonnull final Schedule sourceSchedule) {
        return futureSend(HttpMethod.PATCH, sourceSchedule);
    }

    /**
     * Patches this Schedule with a source
     *
     * @param sourceSchedule the source object with updates
     * @return the updated Schedule
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Schedule patch(@Nonnull final Schedule sourceSchedule) throws ClientException {
        return send(HttpMethod.PATCH, sourceSchedule);
    }

    /**
     * Creates a Schedule with a new object
     *
     * @param newSchedule the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.Future<? super Schedule> futurePost(@Nonnull final Schedule newSchedule) {
        return futureSend(HttpMethod.POST, newSchedule);
    }

    /**
     * Creates a Schedule with a new object
     *
     * @param newSchedule the new object to create
     * @return the created Schedule
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Schedule post(@Nonnull final Schedule newSchedule) throws ClientException {
        return send(HttpMethod.POST, newSchedule);
    }

    /**
     * Creates a Schedule with a new object
     *
     * @param newSchedule the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.Future<? super Schedule> futurePut(@Nonnull final Schedule newSchedule) {
        return futureSend(HttpMethod.PUT, newSchedule);
    }

    /**
     * Creates a Schedule with a new object
     *
     * @param newSchedule the object to create/update
     * @return the created Schedule
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Schedule put(@Nonnull final Schedule newSchedule) throws ClientException {
        return send(HttpMethod.PUT, newSchedule);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ScheduleRequest select(@Nonnull final String value) {
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
     public ScheduleRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

