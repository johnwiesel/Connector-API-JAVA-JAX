/*
 * ConnectorAPI
 *
 * This file was automatically generated by APIMATIC BETA v2.0 on 02/18/2016
 */
package io.itembase.connector.interfaces;

import java.util.*;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import io.itembase.connector.models.*;

public interface ConnectionsInterface {
    /**
     * Request buyer data manipulation
     * @param    connectionId    Required parameter: TODO: type description here
     * @param    buyerId    Required parameter: Buyer original reference, the id as defined at the connected source platform
	 * @return	Returns the ConnectionsBuyersResponse response from the API call*/
    @PUT
    @Path("/connections/{connectionId}/buyers/{buyerId}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public ConnectionsBuyersResponse updateConnectionsBuyersByConnectionId(
            @PathParam("connectionId") String connectionId,
            @PathParam("buyerId") String buyerId);
    /**
     * Request buyer data manipulation
     * @param    connectionId    Required parameter: TODO: type description here
     * @param    buyerId    Required parameter: Buyer original reference, the id as defined at the connected source platform
	 * @return	Returns the ConnectionsBuyersResponse response from the API call*/
    @PATCH
    @Path("/connections/{connectionId}/buyers/{buyerId}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public ConnectionsBuyersResponse updateConnectionsBuyersByConnectionId(
            @PathParam("connectionId") String connectionId,
            @PathParam("buyerId") String buyerId);
    /**
     * Request buyers data
     * @param    connectionId    Required parameter: TODO: type description here
     * @param    buyerId    Required parameter: Buyer original reference, the id as defined at the connected source platform
	 * @return	Returns the ConnectionsBuyersResponse response from the API call*/
    @GET
    @Path("/connections/{connectionId}/buyers/{buyerId}")
    @Produces(MediaType.APPLICATION_JSON)
    public ConnectionsBuyersResponse getConnectionsBuyersByConnectionId(
            @PathParam("connectionId") String connectionId,
            @PathParam("buyerId") String buyerId);
    /**
     * Request product data manipulation
     * @param    connectionId    Required parameter: TODO: type description here
     * @param    productId    Required parameter: Product original reference, the id as defined at the connected source platform
	 * @return	Returns the ConnectionsProductsResponse response from the API call*/
    @PUT
    @Path("/connections/{connectionId}/products/{productId}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public ConnectionsProductsResponse updateConnectionsProductsByConnectionId(
            @PathParam("connectionId") String connectionId,
            @PathParam("productId") String productId);
    /**
     * Request product data manipulation
     * @param    connectionId    Required parameter: TODO: type description here
     * @param    productId    Required parameter: Product original reference, the id as defined at the connected source platform
	 * @return	Returns the ConnectionsProductsResponse response from the API call*/
    @PATCH
    @Path("/connections/{connectionId}/products/{productId}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public ConnectionsProductsResponse updateConnectionsProductsByConnectionId(
            @PathParam("connectionId") String connectionId,
            @PathParam("productId") String productId);
    /**
     * Request products data
     * @param    createdAtFrom    Optional parameter: Set this datetime parameter to any ISO8601 datetime to request entities that were created at or after this datetime.
     * @param    createdAtTo    Optional parameter: Set this datetime parameter to any ISO8601 datetime to request entities that were created at or before this datetime.
     * @param    updatedAtFrom    Optional parameter: Set this datetime parameter to any ISO8601 datetime to request entities that were updated at or after this datetime.
     * @param    updatedAtTo    Optional parameter: Set this datetime parameter to any ISO8601 datetime to request entities that were updated at or before this datetime.
     * @param    connectionId    Required parameter: TODO: type description here
	 * @return	Returns the ConnectionsProductsResponse response from the API call*/
    @GET
    @Path("/connections/{connectionId}/products")
    @Produces(MediaType.APPLICATION_JSON)
    public ConnectionsProductsResponse getConnectionsProductsByConnectionId(
            @QueryParam("created_at_from") Date createdAtFrom,
            @QueryParam("created_at_to") Date createdAtTo,
            @QueryParam("updated_at_from") Date updatedAtFrom,
            @QueryParam("updated_at_to") Date updatedAtTo,
            @PathParam("connectionId") String connectionId);
    /**
     * Request transaction data manipulation
     * @param    connectionId    Required parameter: TODO: type description here
     * @param    transactionId    Required parameter: Transaction original reference, the id as defined at the connected source platform
	 * @return	Returns the ConnectionsTransactionsResponse response from the API call*/
    @PUT
    @Path("/connections/{connectionId}/transactions/{transactionId}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public ConnectionsTransactionsResponse updateConnectionsTransactionsByConnectionId(
            @PathParam("connectionId") String connectionId,
            @PathParam("transactionId") String transactionId);
    /**
     * Request transaction data manipulation
     * @param    connectionId    Required parameter: TODO: type description here
     * @param    transactionId    Required parameter: Transaction original reference, the id as defined at the connected source platform
	 * @return	Returns the ConnectionsTransactionsResponse response from the API call*/
    @PATCH
    @Path("/connections/{connectionId}/transactions/{transactionId}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public ConnectionsTransactionsResponse updateConnectionsTransactionsByConnectionId(
            @PathParam("connectionId") String connectionId,
            @PathParam("transactionId") String transactionId);
    /**
     * Request transactions data
     * @param    connectionId    Required parameter: TODO: type description here
	 * @return	Returns the ConnectionsTransactionsResponse response from the API call*/
    @GET
    @Path("/connections/{connectionId}/transactions")
    @Produces(MediaType.APPLICATION_JSON)
    public ConnectionsTransactionsResponse getConnectionsTransactionsByConnectionId(
            @PathParam("connectionId") String connectionId);
}