/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package backtype.storm.security.auth;

import java.security.Principal;

/**
 * A Principal that represents a user.
 */
public class SingleUserPrincipal implements Principal {

    private final String _userName;

    public SingleUserPrincipal(String userName) {
        _userName = userName;
    }

    @Override
    public boolean equals(Object another) {
        if (another instanceof SingleUserPrincipal) {
            return _userName.equals(((SingleUserPrincipal) another)._userName);
        }
        return false;
    }

    @Override
    public String getName() {
        return _userName;
    }

    @Override
    public String toString() {
        return this.getName();
    }

    @Override
    public int hashCode() {
        return _userName.hashCode();
    }
}
