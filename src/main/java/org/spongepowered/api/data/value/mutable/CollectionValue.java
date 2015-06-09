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
package org.spongepowered.api.data.value.mutable;

import com.google.common.base.Predicate;
import org.spongepowered.api.data.value.ValueContainer;
import org.spongepowered.api.data.value.immutable.ImmutableCollectionValue;

import java.util.Collection;

public interface CollectionValue<E, C extends Collection<E>, V extends CollectionValue<E, C, V, I, S>, I extends ImmutableCollectionValue<E, C, I, V, S>, S extends ValueContainer<S>> extends
                                                                                                                                                                                       Value<C, S>, Iterable<E> {

    int size();

    V add(E value);

    V addAll(Iterable<E> values);

    V remove(E value);

    V removeAll(Iterable<E> values);

    V removeAll(Predicate<E> predicate);

    boolean contains(E value);

    boolean containsAll(Iterable<E> iterable);

    V filter(Predicate<? super E> predicate);

    C getAll();

    @Override
    I asImmutable();
}
