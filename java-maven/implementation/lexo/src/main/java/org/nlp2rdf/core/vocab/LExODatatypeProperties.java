package org.nlp2rdf.core.vocab;

import com.hp.hpl.jena.ontology.DatatypeProperty;
import com.hp.hpl.jena.ontology.OntModel;

/**
 * This class was automatically generated from http://persistence.uni-leipzig.org/nlp2rdf/ontologies/vm/lexo#
 * @author croeder
 *
*/

public enum LExODatatypeProperties {

    /**
     * SPARQL construct query -> Put the valid SPARQL construct queries here.
     */
    construct;

    String uri;

    LExODatatypeProperties() {
        this.uri = "$preferredNamespaceUri" + name();
    }

    public String getUri() {
        return uri;
    }

    @Override
    public String toString() {
        return "$preferredNamespacePrefix:" + name();
    }

    public DatatypeProperty getDatatypeProperty(OntModel model) {
        return model.createDatatypeProperty(getUri());
    }
}
