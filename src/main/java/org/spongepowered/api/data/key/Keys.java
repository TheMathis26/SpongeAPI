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
package org.spongepowered.api.data.key;

import org.spongepowered.api.data.manipulator.mutable.block.AttachedData;
import org.spongepowered.api.data.manipulator.mutable.block.AxisData;
import org.spongepowered.api.data.manipulator.mutable.block.BigMushroomData;
import org.spongepowered.api.data.manipulator.mutable.block.BrickData;
import org.spongepowered.api.data.manipulator.mutable.block.ComparatorData;
import org.spongepowered.api.data.manipulator.mutable.block.ConnectedDirectionData;
import org.spongepowered.api.data.manipulator.mutable.block.DecayableData;
import org.spongepowered.api.data.manipulator.mutable.block.DirectionalData;
import org.spongepowered.api.data.manipulator.mutable.block.DirtData;
import org.spongepowered.api.data.manipulator.mutable.block.DisarmedData;
import org.spongepowered.api.data.manipulator.mutable.block.DisguisedBlockData;
import org.spongepowered.api.data.manipulator.mutable.block.DoublePlantData;
import org.spongepowered.api.data.manipulator.mutable.block.DropData;
import org.spongepowered.api.data.manipulator.mutable.block.ExtendedData;
import org.spongepowered.api.data.manipulator.mutable.block.FilledData;
import org.spongepowered.api.data.manipulator.mutable.block.FluidLevelData;
import org.spongepowered.api.data.manipulator.mutable.block.GrowthData;
import org.spongepowered.api.data.manipulator.mutable.block.HingeData;
import org.spongepowered.api.data.manipulator.mutable.block.InWallData;
import org.spongepowered.api.data.manipulator.mutable.block.InstrumentData;
import org.spongepowered.api.data.manipulator.mutable.block.LayeredData;
import org.spongepowered.api.data.manipulator.mutable.block.MoistureData;
import org.spongepowered.api.data.manipulator.mutable.block.OccupiedData;
import org.spongepowered.api.data.manipulator.mutable.block.OpenData;
import org.spongepowered.api.data.manipulator.mutable.block.PistonData;
import org.spongepowered.api.data.manipulator.mutable.block.PlantData;
import org.spongepowered.api.data.manipulator.mutable.block.PortionData;
import org.spongepowered.api.data.manipulator.mutable.block.PoweredData;
import org.spongepowered.api.data.manipulator.mutable.block.PrismarineData;
import org.spongepowered.api.data.manipulator.mutable.block.QuartzData;
import org.spongepowered.api.data.manipulator.mutable.block.RailDirectionData;
import org.spongepowered.api.data.manipulator.mutable.block.RedstonePoweredData;
import org.spongepowered.api.data.manipulator.mutable.block.SandData;
import org.spongepowered.api.data.manipulator.mutable.block.SandstoneData;
import org.spongepowered.api.data.manipulator.mutable.block.SeamlessData;
import org.spongepowered.api.data.manipulator.mutable.block.ShrubData;
import org.spongepowered.api.data.manipulator.mutable.block.SignalOutputData;
import org.spongepowered.api.data.manipulator.mutable.block.SlabData;
import org.spongepowered.api.data.manipulator.mutable.block.SnowedData;
import org.spongepowered.api.data.manipulator.mutable.block.StairShapeData;
import org.spongepowered.api.data.manipulator.mutable.block.StoneData;
import org.spongepowered.api.data.manipulator.mutable.block.SuspendedData;
import org.spongepowered.api.data.manipulator.mutable.block.TreeData;
import org.spongepowered.api.data.manipulator.mutable.block.WallData;
import org.spongepowered.api.data.manipulator.mutable.block.WireAttachmentData;
import org.spongepowered.api.data.type.*;
import org.spongepowered.api.data.value.ValueStore;
import org.spongepowered.api.data.value.mutable.MapValue;
import org.spongepowered.api.util.Axis;
import org.spongepowered.api.util.Direction;

import java.util.*;

public final class Keys {
    private Keys() {}

    /**
     * @see AttachedData#attached()
     */
    public static final UniKey<Boolean> ATTACHED = null;

    /**
     * @see AxisData#axis()
     */
    public static final UniKey<Axis> AXIS = null;

    /**
     * @see BigMushroomData#type()
     */
    public static final UniKey<BigMushroomType> BIG_MUSHROOM_TYPE = null;

    /**
     * @see BrickData#type()
     */
    public static final UniKey<BrickType> BRICK_TYPE = null;

    /**
     * @see ComparatorData#type()
     */
    public static final UniKey<ComparatorData> COMPARATOR_TYPE = null;

    /**
     * @see ConnectedDirectionData#connectedDirections()
     */
    public static final UniKey<Set<Direction>> CONNECTED_DIRECTIONS = null;

    /**
     * @see ConnectedDirectionData#connectedNorth()
     */
    public static final UniKey<Boolean> CONNECTED_NORTH = null;

    /**
     * @see ConnectedDirectionData#connectedSouth()
     */
    public static final UniKey<Boolean> CONNECTED_SOUTH = null;

    /**
     * @see ConnectedDirectionData#connectedEast()
     */
    public static final UniKey<Boolean> CONNECTED_EAST = null;

    /**
     * @see ConnectedDirectionData#connectedWest()
     */
    public static final UniKey<Boolean> CONNECTED_WEST = null;

    /**
     * @see DecayableData#decayable()
     */
    public static final UniKey<Boolean> DECAYABLE = null;

    /**
     * @see DirectionalData#direction()
     */
    public static final UniKey<Direction> DIRECTION = null;

    /**
     * @see DirtData#type()
     */
    public static final UniKey<DirtType> DIRT_TYPE = null;

    /**
     * @see DisarmedData#disarmed()
     */
    public static final UniKey<Boolean> DISARMED = null;

    /**
     * @see DisguisedBlockData#type()
     */
    public static final UniKey<DisguisedBlockType> DISGUISED_BLOCK_TYPE = null;

    /**
     * @see DoublePlantData#type()
     */
    public static final UniKey<DoublePlantType> DOUBLE_PLANT_TYPE = null;

    /**
     * @see DropData#willDrop()
     */
    public static final UniKey<Boolean> SHOULD_DROP = null;

    /**
     * @see ExtendedData#extended()
     */
    public static final UniKey<Boolean> EXTENDED = null;

    /**
     * @see FilledData#filled()
     */
    public static final UniKey<Boolean> FILLED = null;

    /**
     * @see FluidLevelData#level()
     */
    public static final UniKey<Integer> FLUID_LEVEL = null;

    /**
     * @see GrowthData#growthStage()
     */
    public static final UniKey<Integer> GROWTH_STAGE = null;

    /**
     * @see HingeData#position()
     */
    public static final UniKey<Hinge> HINGE_POSITION = null;

    /**
     * @see InstrumentData#type()
     */
    public static final UniKey<InstrumentType> INSTRUMENT_TYPE = null;

    /**
     * @see InWallData#inWall()
     */
    public static final UniKey<Boolean> IN_WALL = null;

    /**
     * @see LayeredData#layer()
     */
    public static final UniKey<Integer> LAYER = null;

    /**
     * @see MoistureData#moisture()
     */
    public static final UniKey<Integer> MOISTURE = null;

    /**
     * @see OccupiedData#occupied()
     */
    public static final UniKey<Boolean> OCCUPIED = null;

    /**
     * @see OpenData#open()
     */
    public static final UniKey<Boolean> OPEN = null;

    /**
     * @see PistonData#type()
     */
    public static final UniKey<PistonType> PISTON_TYPE = null;

    /**
     * @see PlantData#type()
     */
    public static final UniKey<PlantType> PLANT_TYPE = null;

    /**
     * @see PortionData#type()
     */
    public static final UniKey<PortionType> PORTION_TYPE = null;

    /**
     * @see PoweredData#powered()
     */
    public static final UniKey<Boolean> POWERED = null;

    /**
     * @see PrismarineData#type()
     */
    public static final UniKey<PrismarineType> PRISMARINE_TYPE = null;

    /**
     * @see QuartzData#type()
     */
    public static final UniKey<QuartzType> QUARTZ_TYPE = null;

    /**
     * @see RailDirectionData#railDirection()
     */
    public static final UniKey<RailDirection> RAIL_DIRECTION = null;

    /**
     * @see RedstonePoweredData#power()
     */
    public static final UniKey<Integer> POWER = null;

    /**
     * @see SandData#type()
     */
    public static final UniKey<SandType> SAND_TYPE = null;

    /**
     * @see SandstoneData#type()
     */
    public static final UniKey<SandstoneType> SANDSTONE_TYPE = null;

    /**
     * @see SeamlessData#seamless()
     */
    public static final UniKey<Boolean> SEAMLESS = null;

    /**
     * @see ShrubData#type()
     */
    public static final UniKey<ShrubType> SHRUB_TYPE = null;

    /**
     * @see SignalOutputData#signalOutput()
     */
    public static final UniKey<Integer> SIGNAL_OUTPUT = null;

    /**
     * @see SlabData#type()
     */
    public static final UniKey<SlabType> SLAB_TYPE = null;

    /**
     * @see SnowedData#hasSnow()
     */
    public static final UniKey<Boolean> HAS_SNOW = null;

    /**
     * @see StairShapeData#shape()
     */
    public static final UniKey<StairShape> STAIR_SHAPE = null;

    /**
     * @see StoneData#type()
     */
    public static final UniKey<StoneType> STONE_TYPE = null;

    /**
     * @see SuspendedData#suspended()
     */
    public static final UniKey<Boolean> SUSPENDED = null;

    /**
     * @see TreeData#type()
     */
    public static final UniKey<TreeType> TREE_TYPE = null;

    /**
     * @see WallData#type()
     */
    public static final UniKey<WallType> WALL_TYPE = null;

    /**
     * @see WireAttachmentData#wireAttachment()
     */
    public static final Key<MapValue<Direction, WireAttachmentType, ?>> WIRE_ATTACHMENTS = null;

    /**
     * @see WireAttachmentData#wireAttachmentNorth()
     */
    public static final UniKey<WireAttachmentType> WIRE_ATTACHMENT_NORTH = null;

    /**
     * @see WireAttachmentData#wireAttachmentNorth()
     */
    public static final UniKey<WireAttachmentType> WIRE_ATTACHMENT_SOUTH = null;

    /**
     * @see WireAttachmentData#wireAttachmentNorth()
     */
    public static final UniKey<WireAttachmentType> WIRE_ATTACHMENT_EAST = null;

    /**
     * @see WireAttachmentData#wireAttachmentNorth()
     */
    public static final UniKey<WireAttachmentType> WIRE_ATTACHMENT_WEST = null;

}
