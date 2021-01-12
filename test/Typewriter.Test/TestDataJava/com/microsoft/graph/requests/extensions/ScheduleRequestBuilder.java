// Template Source: BaseEntityRequestBuilder.java.tt
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
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Schedule Request Builder.
 */
public class ScheduleRequestBuilder extends BaseRequestBuilder<Schedule> {

    /**
     * The request builder for the Schedule
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ScheduleRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ScheduleRequest instance
     */
    @Nonnull
    public ScheduleRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ScheduleRequest instance
     */
    @Nonnull
    public ScheduleRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.ScheduleRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the TimeOff collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public TimeOffCollectionRequestBuilder timesOff() {
        return new TimeOffCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("timesOff"), getClient(), null);
    }

    /**
     * Gets a request builder for the TimeOff item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public TimeOffRequestBuilder timesOff(@Nonnull final String id) {
        return new TimeOffRequestBuilder(getRequestUrlWithAdditionalSegment("timesOff") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the TimeOffRequest collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public TimeOffRequestCollectionRequestBuilder timeOffRequests() {
        return new TimeOffRequestCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("timeOffRequests"), getClient(), null);
    }

    /**
     * Gets a request builder for the TimeOffRequest item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public TimeOffRequestRequestBuilder timeOffRequests(@Nonnull final String id) {
        return new TimeOffRequestRequestBuilder(getRequestUrlWithAdditionalSegment("timeOffRequests") + "/" + id, getClient(), null);
    }
}
