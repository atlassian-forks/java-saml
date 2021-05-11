package com.onelogin.saml2.settings;

/**
 * A handler to be invoked when a SAML response without a Conditions block has been encountered and processing those
 * exceptions is allowed by settings.
 */
public interface ConditionlessResponseHandler {

    /**
     * Performs an action in reaction to a SAML response without a Conditions element being received.
     * @param issuers the issuers of the SAML response, useful for locating the IdPs
     */
    void handleConditionlessResponse(Iterable<String> issuers);
}
