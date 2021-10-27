package io.oasp.bce.java.general.common.api;

import io.oasp.bce.java.general.common.base.AbstractProperty; // API should not depend on Base
import io.oasp.bce.java.general.common.impl.PropertyImpl; // API should not depend on Impl

//use qualified name in link to AbstractProperty instead of import statement for JavaDoc only references
/**
 * Interface for a generic property. Instead of directly implementing this interface please extend
 * {@link AbstractProperty} instead.
 */
public interface Property<V> {

  /**
   * @return the name of this {@link Property}.
   */
  String getName();

  /**
   * @return the current value of this {@link Property}.
   */
  V get();

  /**
   * @param value the new value to set.
   */
  void set(V value);

  /**
   * @param <V> generic type of the value.
   * @param name - see {@link #getName()}.
   * @param value - see {@link #get()}.
   * @return the {@link Property} wrapping the given parameters.
   */
  static <V> Property<V> of(String name, V value) {

    // API should not depend on Impl
    // Solution 1: do not consider PropertyImpl as implementation (rename it to DefaultProperty) and move it to API.
    // Solution 2: create some kind of Factory in API to abstract from implementation it should be really replaceable
    PropertyImpl<V> property = new PropertyImpl<>(name);
    property.set(value);
    return property;
  }

}
