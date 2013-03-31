/**
 * Copyright 2013 Bruno Oliveira, and individual contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.abstractj.kalium.keys;

import org.abstractj.kalium.crypto.Util;
import org.abstractj.kalium.encoders.Hex;

import static org.abstractj.kalium.NaCl.Sodium.PUBLICKEY_BYTES;

public class PublicKey {

    private final byte[] publicKey;

    public PublicKey(byte[] publicKey) {
        this.publicKey = publicKey;
        Util.checkLength(publicKey, PUBLICKEY_BYTES);
    }

    public PublicKey(String publicKey) {
        this.publicKey = Hex.decodeHexString(publicKey);
    }

    public byte[] getBytes() {
        return publicKey;
    }
}