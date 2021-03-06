/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents information about an action configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/ActionConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActionConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The configuration data for the action.
     * </p>
     */
    private java.util.Map<String, String> configuration;

    /**
     * <p>
     * The configuration data for the action.
     * </p>
     * 
     * @return The configuration data for the action.
     */

    public java.util.Map<String, String> getConfiguration() {
        return configuration;
    }

    /**
     * <p>
     * The configuration data for the action.
     * </p>
     * 
     * @param configuration
     *        The configuration data for the action.
     */

    public void setConfiguration(java.util.Map<String, String> configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * The configuration data for the action.
     * </p>
     * 
     * @param configuration
     *        The configuration data for the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionConfiguration withConfiguration(java.util.Map<String, String> configuration) {
        setConfiguration(configuration);
        return this;
    }

    public ActionConfiguration addConfigurationEntry(String key, String value) {
        if (null == this.configuration) {
            this.configuration = new java.util.HashMap<String, String>();
        }
        if (this.configuration.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.configuration.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Configuration.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionConfiguration clearConfigurationEntries() {
        this.configuration = null;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActionConfiguration == false)
            return false;
        ActionConfiguration other = (ActionConfiguration) obj;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public ActionConfiguration clone() {
        try {
            return (ActionConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.ActionConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
