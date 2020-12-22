// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.extensions.Recipient;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import com.microsoft.graph.serializer.ISerializer;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Onenote Page Forward Parameter Set.
 */
public class OnenotePageForwardParameterSet {
    /**
     * The to Recipients.
     * 
     */
    @SerializedName(value = "toRecipients", alternate = {"ToRecipients"})
    @Expose
	@Nullable
    public java.util.List<Recipient> toRecipients;

    /**
     * The details.
     * 
     */
    @SerializedName(value = "details", alternate = {"Details"})
    @Expose
	@Nullable
    public String details;

    /**
     * The comment.
     * 
     */
    @SerializedName(value = "comment", alternate = {"Comment"})
    @Expose
	@Nullable
    public String comment;


    /**
     * Instiaciates a new OnenotePageForwardParameterSet
     */
    public OnenotePageForwardParameterSet() {}
    /**
     * Instiaciates a new OnenotePageForwardParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected OnenotePageForwardParameterSet(@Nonnull final OnenotePageForwardParameterSetBuilder builder) {
        this.toRecipients = builder.toRecipients;
        this.details = builder.details;
        this.comment = builder.comment;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static OnenotePageForwardParameterSetBuilder newBuilder() {
        return new OnenotePageForwardParameterSetBuilder();
    }
    /**
     * Fluent builder for the OnenotePageForwardParameterSet
     */
    public static final class OnenotePageForwardParameterSetBuilder {
        /**
         * The toRecipients parameter value
         */
        @Nullable
        protected java.util.List<Recipient> toRecipients;
        /**
         * Sets the ToRecipients
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public OnenotePageForwardParameterSetBuilder withToRecipients(@Nullable final java.util.List<Recipient> val) {
            this.toRecipients = val;
            return this;
        }
        /**
         * The details parameter value
         */
        @Nullable
        protected String details;
        /**
         * Sets the Details
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public OnenotePageForwardParameterSetBuilder withDetails(@Nullable final String val) {
            this.details = val;
            return this;
        }
        /**
         * The comment parameter value
         */
        @Nullable
        protected String comment;
        /**
         * Sets the Comment
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public OnenotePageForwardParameterSetBuilder withComment(@Nullable final String val) {
            this.comment = val;
            return this;
        }
        /**
         * Instanciates a new OnenotePageForwardParameterSetBuilder
         */
        @Nullable
        protected OnenotePageForwardParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public OnenotePageForwardParameterSet build() {
            return new OnenotePageForwardParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.toRecipients != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("toRecipients", toRecipients));
        }
        if(this.details != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("details", details));
        }
        if(this.comment != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("comment", comment));
        }
        return result;
    }
    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    @Nullable
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    @Nullable
    public ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
