package io.oasp.bce.java.general.common.base;

import io.oasp.bce.java.general.common.api.Property;
import io.oasp.bce.java.general.common.impl.PropertyImpl; // base should not depend on impl

//use qualified name instead of import statement for JavaDoc only references
/**
 * Abstract base implementation of {@link Property}.
 *
 * @see PropertyImpl
 */
public abstract class AbstractProperty<V> implements Property<V> {

  private final String name;

  /**
   * The constructor.
   *
   * @param name the {@link #getName() name} of this property.
   */
  public AbstractProperty(String name) {

    super();
    this.name = name;
  }

  @Override
  public String getName() {

    return this.name;
  }

}
