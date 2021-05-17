package com.onelogin.saml2.settings;

/**
 * A handler to be invoked when a SAML response has been successfully processed due to enabled compatibility mode
 */
public interface CompatibilityModeViolationHandler {

    /**
     * Performs an action in reaction to a SAML response being accepted due to compatibility mode.
     * @param issuers the issuers of the SAML response, useful for locating the IdPs which sent the response
     * @param hasConditions true if there was a Conditions element in the response, false otherwise
     * @param amountOfAuthnStatements the amount of AuthnStatement elements in the response
     */
    void handleCompatibilityModeAssistedReponse(Iterable<String> issuers, boolean hasConditions, int amountOfAuthnStatements);
}
