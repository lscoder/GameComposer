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
package de.mirkosertic.gameengine.process;

import de.mirkosertic.gameengine.annotations.InheritedClassInformation;
import de.mirkosertic.gameengine.annotations.ReflectiveField;
import de.mirkosertic.gameengine.event.GameEvent;

@InheritedClassInformation
public class StartProcess extends GameEvent {

    public static final String EVENTTYPE = "StartProcess";

    private static final StartProcessClassInformation CIINSTANCE = new StartProcessClassInformation();

    @ReflectiveField
    public final GameProcess process;

    public StartProcess(GameProcess aProcess) {
        super(EVENTTYPE);
        process = aProcess;
    }

    @Override
    public StartProcessClassInformation getClassInformation() {
        return CIINSTANCE;
    }
}
