// ------------------------------------------------------------------------------
//  Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
// <auto-generated/>

// Template Source: Templates\CSharp\Requests\EntityRequestBuilder.cs.tt

namespace Microsoft.Graph2.CallRecords
{
    using System;
    using System.Collections.Generic;
    using System.IO;

    /// <summary>
    /// The type CallRecordRequestBuilder.
    /// </summary>
    public partial class CallRecordRequestBuilder : Microsoft.Graph.EntityRequestBuilder, ICallRecordRequestBuilder
    {

        /// <summary>
        /// Constructs a new CallRecordRequestBuilder.
        /// </summary>
        /// <param name="requestUrl">The URL for the built request.</param>
        /// <param name="client">The <see cref="Microsoft.Graph.IBaseClient"/> for handling requests.</param>
        public CallRecordRequestBuilder(
            string requestUrl,
            Microsoft.Graph.IBaseClient client)
            : base(requestUrl, client)
        {
        }

        /// <summary>
        /// Builds the request.
        /// </summary>
        /// <returns>The built request.</returns>
        public new ICallRecordRequest Request()
        {
            return this.Request(null);
        }

        /// <summary>
        /// Builds the request.
        /// </summary>
        /// <param name="options">The query and header options for the request.</param>
        /// <returns>The built request.</returns>
        public new ICallRecordRequest Request(IEnumerable<Microsoft.Graph.Option> options)
        {
            return new CallRecordRequest(this.RequestUrl, this.Client, options);
        }
    
        /// <summary>
        /// Gets the request builder for Sessions.
        /// </summary>
        /// <returns>The <see cref="ICallRecordSessionsCollectionRequestBuilder"/>.</returns>
        public ICallRecordSessionsCollectionRequestBuilder Sessions
        {
            get
            {
                return new CallRecordSessionsCollectionRequestBuilder(this.AppendSegmentToRequestUrl("sessions"), this.Client);
            }
        }

        /// <summary>
        /// Gets the request builder for Recipients.
        /// </summary>
        /// <returns>The <see cref="ICallRecordRecipientsCollectionRequestBuilder"/>.</returns>
        public ICallRecordRecipientsCollectionRequestBuilder Recipients
        {
            get
            {
                return new CallRecordRecipientsCollectionRequestBuilder(this.AppendSegmentToRequestUrl("recipients"), this.Client);
            }
        }
    
    }
}
