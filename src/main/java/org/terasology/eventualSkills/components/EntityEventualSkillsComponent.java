/*
 * Copyright 2015 MovingBlocks
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
package org.terasology.eventualSkills.components;

import com.google.common.collect.Maps;
import org.terasology.entitySystem.Component;
import org.terasology.network.Replicate;

import java.util.Map;

public class EntityEventualSkillsComponent implements Component {
    @Replicate
    public String currentSkillInTraining;
    @Replicate
    public int currentSkillLevelInTraining;
    @Replicate
    public int currentSkillRankInTraining;
    @Replicate
    public int currentTrainingTargetSkillPoints;
    @Replicate
    public int currentTrainingCurrentSkillPoints;
    @Replicate
    public long trainingLastTimeComputedSkillPoints;

    // a map of the skill and how many skill points have already been acquired.  These must always be lowercased, otherwise chaos.
    @Replicate
    public Map<String, Integer> partiallyLearnedSkills = Maps.newHashMap();
}
