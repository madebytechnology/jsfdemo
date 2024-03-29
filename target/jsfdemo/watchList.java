
<?xml version="1.0" encoding="UTF-8"?>
<ui:composition xmlns="http://www.w3.org/1999/xhtml"
        xmlns:ui="http://java.sun.com/jsf/facelets"
        xmlns:f="http://java.sun.com/jsf/core"
        xmlns:h="http://java.sun.com/jsf/html"
        template="/templates/default.xhtml">

        <ui:define name="content">

                <h:form>

                        <h:dataTable value="#{watchF.allWatch}" var="item">
                                <f:facet name="header">Watchs</f:facet>
                                <h:column>
                                        <f:facet name="header">Model</f:facet>
        #{item.model}
      </h:column>

                                <h:column>
                                        <f:facet name="header">Producer</f:facet>
        #{item.producer}
      </h:column>

                                <h:column>
                                        <f:facet name="header">Price</f:facet>
        #{item.price}
      </h:column>

                                <h:column>
                                        <f:facet name="header">SerialNumber</f:facet>
        #{item.serialNumber}
      </h:column>

                                <h:column>
                                        <f:facet name="header">StrapLength</f:facet>
        #{item.strapLength}
      </h:column>


                        </h:dataTable>

                        <h:commandButton action="home?faces-redirect=true" value='#{msg.watchFormBackButton}'></h:commandButton>

                </h:form>

        </ui:define>

</ui:composition>