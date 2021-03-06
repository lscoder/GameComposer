/*
 * Copyright 2016 Mirko Sertic
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.mirkosertic.gameengine.playerscore;

import de.mirkosertic.gameengine.core.BehaviorType;
import de.mirkosertic.gameengine.core.BehaviorUnmarshaller;
import de.mirkosertic.gameengine.core.GameObjectInstance;
import de.mirkosertic.gameengine.core.GameRuntime;

import java.util.Map;

public class PlayerScoreBehaviorUnmarshaller implements BehaviorUnmarshaller<PlayerScoreBehavior> {

    @Override
    public BehaviorType getTypeKey() {
        return PlayerScoreBehavior.TYPE;
    }

    @Override
    public PlayerScoreBehavior deserialize(GameRuntime aRuntime, GameObjectInstance aObjectInstance, Map<String, Object> aSerializedData) {
        return PlayerScoreBehavior.deserialize(aObjectInstance, aSerializedData);
    }
}
