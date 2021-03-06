/*
 * Copyright 2016 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terasology.magicalstats.event;

import org.terasology.entitySystem.entity.EntityRef;
import org.terasology.entitySystem.event.Event;

/**
 * Event sent when an entity reaches full mana if previously on less than full mana.
 * Created by monkey on 12/4/16.
 */
public class FullManaEvent implements Event {
        private EntityRef instigator;

        public FullManaEvent(EntityRef instigator) {
            this.instigator = instigator;
        }

        public EntityRef getInstigator() {
            return instigator;
        }
}
