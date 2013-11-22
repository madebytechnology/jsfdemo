
<?xml version="1.0" encoding="UTF-8"?>
<ui:composition xmlns="http://www.w3.org/1999/xhtml"
        xmlns:ui="http://java.sun.com/jsf/facelets"
        xmlns:f="http://java.sun.com/jsf/core"
        xmlns:h="http://java.sun.com/jsf/html"
        template="/templates/default.xhtml">
        <ui:define name="content">
                <h:form id="personform">
                        <h:panelGrid columns="2">

                                <h:outputText value="Model" />
                                <h:inputText id="model" value="#{watchF.watch.model}" />

                                <h:outputText value="Producer" />
                                <h:inputText id="producer" value="#{watchF.watch.producer}" />

                                <h:outputText value="Price" />
                                <h:inputText id="price" value="#{watchF.watch.price}" >
                                        <f:validateDoubleRange minimum="20.5" maximum="150.5" />
                                </h:inputText>

                                <h:outputText value="Serial Number" />
                                <h:inputText id="serialNumber" value="#{watchF.watch.serialNumber}" validator="#{watchF.serialNumber}" required="#{true}">
                                        <f:validator validatorId="serialNumberValidator" />
                                </h:inputText>

                                <h:outputText value="StrapLength" />
                                <h:inputText id="strapLength" value="#{watchF.watch.strapLength}" />
                        </h:panelGrid>

                        <h:commandButton value="#{msg.watchFormOKButton}"
                                action="#{watchF.addWatchA}" />

                        <h:panelGrid>
                                <h:messages showDetail="#{true}" showSummary="#{false}" />
                        </h:panelGrid>
                </h:form>
        </ui:define>
</ui:composition>