// ------------------------------------------------------------------------------
//  Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
// <auto-generated/>

// Template Source: EntityRequestBuilder.cs.tt

namespace Microsoft.Graph
{
    using System;
    using System.Collections.Generic;
    using System.IO;

    /// <summary>
    /// The type UserRequestBuilder.
    /// </summary>
    public partial class UserRequestBuilder : DirectoryObjectRequestBuilder, IUserRequestBuilder
    {

        /// <summary>
        /// Constructs a new UserRequestBuilder.
        /// </summary>
        /// <param name="requestUrl">The URL for the built request.</param>
        /// <param name="client">The <see cref="IBaseClient"/> for handling requests.</param>
        public UserRequestBuilder(
            string requestUrl,
            IBaseClient client)
            : base(requestUrl, client)
        {
        }

        /// <summary>
        /// Builds the request.
        /// </summary>
        /// <returns>The built request.</returns>
        public new IUserRequest Request()
        {
            return this.Request(null);
        }

        /// <summary>
        /// Builds the request.
        /// </summary>
        /// <param name="options">The query and header options for the request.</param>
        /// <returns>The built request.</returns>
        public new IUserRequest Request(IEnumerable<Option> options)
        {
            return new UserRequest(this.RequestUrl, this.Client, options);
        }
    
        /// <summary>
        /// Gets the request builder for UserDelta.
        /// </summary>
        /// <returns>The <see cref="IUserDeltaRequestBuilder"/>.</returns>
        public IUserDeltaRequestBuilder Delta()
        {
            return new UserDeltaRequestBuilder(
                this.AppendSegmentToRequestUrl("microsoft.graph.delta"),
                this.Client);
        }

        /// <summary>
        /// Gets the request builder for UserDelta.
        /// </summary>
        /// <returns>The <see cref="IUserDeltaRequestBuilder"/>.</returns>
        public IUserDeltaRequestBuilder Delta(
            string token = null)
        {
            return new UserDeltaRequestBuilder(
                this.AppendSegmentToRequestUrl("microsoft.graph.delta"),
                this.Client,
                token);
        }
    
    }
}
