/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.kalumet.agent.updater;

import org.apache.kalumet.KalumetException;

/**
 * Exception wrapper for updaters.
 */
public class UpdateException
    extends KalumetException
{

    /**
     * Update exception with the explanation message.
     *
     * @param message the explanation message.
     */
    public UpdateException( String message )
    {
        super( message );
    }

    /**
     * Update exception with the cause.
     *
     * @param cause the cause.
     */
    public UpdateException( Throwable cause )
    {
        super( cause );
    }

    /**
     * Update exception with the explanation message and cause.
     *
     * @param message the explanation message.
     * @param cause   the cause.
     */
    public UpdateException( String message, Throwable cause )
    {
        super( message, cause );
    }

}
