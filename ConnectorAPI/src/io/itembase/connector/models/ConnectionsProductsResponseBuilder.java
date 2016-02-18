/*
 * ConnectorAPI
 *
 * This file was automatically generated by APIMATIC BETA v2.0 on 02/18/2016
 */
package io.itembase.connector.models;

import java.util.*;

public class ConnectionsProductsResponseBuilder {
    //the instance to build
    private ConnectionsProductsResponse connectionsProductsResponse;

    /**
     * Default constructor to initialize the instance
     */
    public ConnectionsProductsResponseBuilder() {
        connectionsProductsResponse = new ConnectionsProductsResponse();
    }

    public ConnectionsProductsResponseBuilder connectionUuid(String connectionUuid) {
        connectionsProductsResponse.setConnectionUuid(connectionUuid);
        return this;
    }

    public ConnectionsProductsResponseBuilder createdAt(String createdAt) {
        connectionsProductsResponse.setCreatedAt(createdAt);
        return this;
    }

    public ConnectionsProductsResponseBuilder createdBy(String createdBy) {
        connectionsProductsResponse.setCreatedBy(createdBy);
        return this;
    }

    public ConnectionsProductsResponseBuilder jobId(String jobId) {
        connectionsProductsResponse.setJobId(jobId);
        return this;
    }

    public ConnectionsProductsResponseBuilder name(String name) {
        connectionsProductsResponse.setName(name);
        return this;
    }

    public ConnectionsProductsResponseBuilder status(LinkedHashMap<String, Object> status) {
        connectionsProductsResponse.setStatus(status);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ConnectionsProductsResponse build() {
        return connectionsProductsResponse;
    }
}