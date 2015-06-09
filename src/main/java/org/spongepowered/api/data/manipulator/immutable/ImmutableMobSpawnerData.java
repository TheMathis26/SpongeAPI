/*
 * This file is part of SpongeAPI, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered <https://www.spongepowered.org>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.spongepowered.api.data.manipulator.immutable;

import org.spongepowered.api.data.DataManipulator;
import org.spongepowered.api.data.ImmutableDataManipulator;
import org.spongepowered.api.data.manipulator.mutable.MobSpawnerData;
import org.spongepowered.api.data.value.immutable.ImmutablePossibleEntitiesToSpawnValue;
import org.spongepowered.api.data.value.immutable.ImmutableValue;
import org.spongepowered.api.data.value.mutable.Value;
import org.spongepowered.api.entity.EntityType;
import org.spongepowered.api.util.weighted.WeightedEntity;

import java.util.Collection;

import javax.annotation.Nullable;

public interface ImmutableMobSpawnerData extends ImmutableDataManipulator<ImmutableMobSpawnerData, MobSpawnerData> {

    ImmutableValue<Short, ImmutableMobSpawnerData> remainingDelay();

    ImmutableValue<Short, ImmutableMobSpawnerData> minimumSpawnDelay();

    ImmutableValue<Short, ImmutableMobSpawnerData> maximumSpawnDelay();

    ImmutableValue<Short, ImmutableMobSpawnerData> spawnCount();

    ImmutableValue<Short, ImmutableMobSpawnerData> maximumNearbyEntities();

    ImmutableValue<Short, ImmutableMobSpawnerData> requiredPlayerRange();

    ImmutableValue<Short, ImmutableMobSpawnerData> spawnRange();

    ImmutablePossibleEntitiesToSpawnValue<ImmutableMobSpawnerData> possibleEntitiesToSpawn();


    interface ImmutableNextEntityToSpawnValue extends Value<WeightedEntity, MobSpawnerData> {

        ImmutableMobSpawnerData set(EntityType type, @Nullable Collection<DataManipulator<?, ?>> additionalProperties);

    }

}