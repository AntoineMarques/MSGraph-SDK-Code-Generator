// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph2.callrecords.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph2.callrecords.models.extensions.Endpoint;
import com.microsoft.graph2.callrecords.models.extensions.FailureInfo;
import com.microsoft.graph2.callrecords.models.extensions.Media;
import com.microsoft.graph.models.extensions.EntityType3;
import com.microsoft.graph.models.extensions.Call;
import com.microsoft.graph2.callrecords.models.extensions.Session;
import com.microsoft.graph2.callrecords.models.extensions.Photo;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.EntityType3CollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Segment.
 */
public class Segment extends Entity implements IJsonBackedObject {


    /**
     * The Start Date Time.
     * 
     */
    @SerializedName("startDateTime")
    @Expose
    public java.util.Calendar startDateTime;

    /**
     * The End Date Time.
     * 
     */
    @SerializedName("endDateTime")
    @Expose
    public java.util.Calendar endDateTime;

    /**
     * The Caller.
     * 
     */
    @SerializedName("caller")
    @Expose
    public Endpoint caller;

    /**
     * The Callee.
     * 
     */
    @SerializedName("callee")
    @Expose
    public Endpoint callee;

    /**
     * The Failure Info.
     * 
     */
    @SerializedName("failureInfo")
    @Expose
    public FailureInfo failureInfo;

    /**
     * The Media.
     * 
     */
    @SerializedName("media")
    @Expose
    public java.util.List<Media> media;

    /**
     * The Ref Types.
     * 
     */
    public EntityType3CollectionPage refTypes;

    /**
     * The Ref Type.
     * 
     */
    @SerializedName("refType")
    @Expose
    public Call refType;

    /**
     * The Session Ref.
     * 
     */
    @SerializedName("sessionRef")
    @Expose
    public Session sessionRef;

    /**
     * The Photo.
     * 
     */
    @SerializedName("photo")
    @Expose
    public Photo photo;


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
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;


        if (json.has("refTypes")) {
            refTypes = serializer.deserializeObject(json.get("refTypes").toString(), EntityType3CollectionPage.class);
        }
    }
}
