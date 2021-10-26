package io.oasp.bce.java.general.common.impl;

import io.oasp.bce.java.general.common.api.Property;
import io.oasp.bce.java.general.common.base.AbstractProperty;

/**
 * Implementation of {@link Property}.
 */
public class PropertyImpl<V> extends AbstractProperty<V> {

  private V value;

  /**
   * The constructor.
   *
   * @param name the {@link #getName() name} of this property.
   */
  public PropertyImpl(String name) {

    super(name);
  }

  @Override
  public V get() {

    return this.value;
  }

  @Override
  public void set(V value) {

    this.value = value;
  }
}
