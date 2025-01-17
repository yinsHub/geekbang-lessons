/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.geektimes.enterprise.inject.standard.event;

import javax.enterprise.inject.spi.*;
import javax.enterprise.inject.spi.configurator.AnnotatedTypeConfigurator;

/**
 * The {@link ProcessSyntheticAnnotatedType }event is fired by the container
 * If an extension calls {@link BeforeBeanDiscovery#addAnnotatedType(AnnotatedType, String)}
 * or {@link AfterTypeDiscovery#addAnnotatedType(AnnotatedType, String)},
 * the type passed must be added to the set of discovered types.
 *
 * @author <a href="mailto:mercyblitz@gmail.com">Mercy</a>
 * @see BeforeBeanDiscovery#addAnnotatedType(AnnotatedType, String)
 * @see AfterTypeDiscovery#addAnnotatedType(AnnotatedType, String)
 * @since 1.0.0
 */
public class ProcessSyntheticAnnotatedTypeEvent implements ProcessSyntheticAnnotatedType {

    @Override
    public Extension getSource() {
        return null;
    }

    @Override
    public AnnotatedType getAnnotatedType() {
        return null;
    }

    @Override
    public void setAnnotatedType(AnnotatedType type) {

    }

    @Override
    public AnnotatedTypeConfigurator configureAnnotatedType() {
        return null;
    }

    @Override
    public void veto() {

    }
}
