// ------------------------------------------------------------------------------
//  Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
// <auto-generated/>

// Template Source: IEntityRequest.cs.tt

namespace Microsoft.Graph
{
    using System;
    using System.IO;
    using System.Net.Http;
    using System.Threading;
    using System.Linq.Expressions;

    /// <summary>
    /// The interface IPlannerGroupRequest.
    /// </summary>
    public partial interface IPlannerGroupRequest : IBaseRequest
    {
        /// <summary>
        /// Creates the specified PlannerGroup using POST.
        /// </summary>
        /// <param name="plannerGroupToCreate">The PlannerGroup to create.</param>
        /// <param name="cancellationToken">The <see cref="CancellationToken"/> for the request.</param>
        /// <returns>The created PlannerGroup.</returns>
        System.Threading.Tasks.Task<PlannerGroup> CreateAsync(PlannerGroup plannerGroupToCreate, CancellationToken cancellationToken = default);

        /// <summary>
        /// Creates the specified PlannerGroup using POST and returns a <see cref="GraphResponse{PlannerGroup}"/> object.
        /// </summary>
        /// <param name="plannerGroupToCreate">The PlannerGroup to create.</param>
        /// <param name="cancellationToken">The <see cref="CancellationToken"/> for the request.</param>
        /// <returns>The <see cref="GraphResponse{PlannerGroup}"/> object of the request.</returns>
        System.Threading.Tasks.Task<GraphResponse<PlannerGroup>> CreateResponseAsync(PlannerGroup plannerGroupToCreate, CancellationToken cancellationToken = default);

        /// <summary>
        /// Deletes the specified PlannerGroup.
        /// </summary>
        /// <param name="cancellationToken">The <see cref="CancellationToken"/> for the request.</param>
        /// <returns>The task to await.</returns>
        System.Threading.Tasks.Task DeleteAsync(CancellationToken cancellationToken = default);

        /// <summary>
        /// Deletes the specified PlannerGroup and returns a <see cref="GraphResponse"/> object.
        /// </summary>
        /// <param name="cancellationToken">The <see cref="CancellationToken"/> for the request.</param>
        /// <returns>The task of <see cref="GraphResponse"/> to await.</returns>
        System.Threading.Tasks.Task<GraphResponse> DeleteResponseAsync(CancellationToken cancellationToken = default);

        /// <summary>
        /// Gets the specified PlannerGroup.
        /// </summary>
        /// <param name="cancellationToken">The <see cref="CancellationToken"/> for the request.</param>
        /// <returns>The PlannerGroup.</returns>
        System.Threading.Tasks.Task<PlannerGroup> GetAsync(CancellationToken cancellationToken = default);

        /// <summary>
        /// Gets the specified PlannerGroup and returns a <see cref="GraphResponse{PlannerGroup}"/> object.
        /// </summary>
        /// <param name="cancellationToken">The <see cref="CancellationToken"/> for the request.</param>
        /// <returns>The <see cref="GraphResponse{PlannerGroup}"/> object of the request.</returns>
        System.Threading.Tasks.Task<GraphResponse<PlannerGroup>> GetResponseAsync(CancellationToken cancellationToken = default);

        /// <summary>
        /// Updates the specified PlannerGroup using PATCH.
        /// </summary>
        /// <param name="plannerGroupToUpdate">The PlannerGroup to update.</param>
        /// <param name="cancellationToken">The <see cref="CancellationToken"/> for the request.</param>
        /// <exception cref="ClientException">Thrown when an object returned in a response is used for updating an object in Microsoft Graph.</exception>
        /// <returns>The updated PlannerGroup.</returns>
        System.Threading.Tasks.Task<PlannerGroup> UpdateAsync(PlannerGroup plannerGroupToUpdate, CancellationToken cancellationToken = default);

        /// <summary>
        /// Updates the specified PlannerGroup using PATCH and returns a <see cref="GraphResponse{PlannerGroup}"/> object.
        /// </summary>
        /// <param name="plannerGroupToUpdate">The PlannerGroup to update.</param>
        /// <param name="cancellationToken">The <see cref="CancellationToken"/> for the request.</param>
        /// <exception cref="ClientException">Thrown when an object returned in a response is used for updating an object in Microsoft Graph.</exception>
        /// <returns>The <see cref="GraphResponse{PlannerGroup}"/> object of the request.</returns>
        System.Threading.Tasks.Task<GraphResponse<PlannerGroup>> UpdateResponseAsync(PlannerGroup plannerGroupToUpdate, CancellationToken cancellationToken = default);

        /// <summary>
        /// Updates the specified PlannerGroup using PUT.
        /// </summary>
        /// <param name="plannerGroupToUpdate">The PlannerGroup object to update.</param>
        /// <param name="cancellationToken">The <see cref="CancellationToken"/> for the request.</param>
        /// <returns>The task to await.</returns>
        System.Threading.Tasks.Task<PlannerGroup> PutAsync(PlannerGroup plannerGroupToUpdate, CancellationToken cancellationToken = default);

        /// <summary>
        /// Updates the specified PlannerGroup using PUT and returns a <see cref="GraphResponse{PlannerGroup}"/> object.
        /// </summary>
        /// <param name="plannerGroupToUpdate">The PlannerGroup object to update.</param>
        /// <param name="cancellationToken">The <see cref="CancellationToken"/> for the request.</param>
        /// <returns>The task of <see cref="GraphResponse{PlannerGroup}"/> to await.</returns>
        System.Threading.Tasks.Task<GraphResponse<PlannerGroup>> PutResponseAsync(PlannerGroup plannerGroupToUpdate, CancellationToken cancellationToken = default);

        /// <summary>
        /// Adds the specified expand value to the request.
        /// </summary>
        /// <param name="value">The expand value.</param>
        /// <returns>The request object to send.</returns>
        IPlannerGroupRequest Expand(string value);

        /// <summary>
        /// Adds the specified expand value to the request.
        /// </summary>
        /// <param name="expandExpression">The expression from which to calculate the expand value.</param>
        /// <returns>The request object to send.</returns>
        IPlannerGroupRequest Expand(Expression<Func<PlannerGroup, object>> expandExpression);

        /// <summary>
        /// Adds the specified select value to the request.
        /// </summary>
        /// <param name="value">The select value.</param>
        /// <returns>The request object to send.</returns>
        IPlannerGroupRequest Select(string value);

        /// <summary>
        /// Adds the specified select value to the request.
        /// </summary>
        /// <param name="selectExpression">The expression from which to calculate the select value.</param>
        /// <returns>The request object to send.</returns>
        IPlannerGroupRequest Select(Expression<Func<PlannerGroup, object>> selectExpression);

    }
}
