/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package pw.oliver.jmkb.avroclasses;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
/** A Things Location entity is defined as the last known location of the Thing. A Thing can have multiple Locations if all Locations are different representations of same Location with different encodingType. */
@org.apache.avro.specific.AvroGenerated
public class Location extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 2414982106693178962L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Location\",\"namespace\":\"pw.oliver.jmkb.avroclasses\",\"doc\":\"A Things Location entity is defined as the last known location of the Thing. A Thing can have multiple Locations if all Locations are different representations of same Location with different encodingType.\",\"fields\":[{\"name\":\"iotId\",\"type\":\"string\",\"doc\":\"iotId of this Location\"},{\"name\":\"name\",\"type\":\"string\",\"doc\":\"Name of the Location\"},{\"name\":\"description\",\"type\":\"string\",\"doc\":\"Description of the Location\"},{\"name\":\"encodingType\",\"type\":\"string\",\"doc\":\"Representation/encoding type of the Location\"},{\"name\":\"location\",\"type\":{\"type\":\"record\",\"name\":\"LocationType\",\"doc\":\"The type of the location, for example Point\",\"fields\":[{\"name\":\"type\",\"type\":\"string\",\"doc\":\"Name of the LocationType\"},{\"name\":\"coordinates\",\"type\":\"string\",\"doc\":\"Coordinates for the LocationType\"}]},\"doc\":\"LocationType containing the actual location of the Thing\"},{\"name\":\"Things\",\"type\":[\"null\",\"string\"],\"doc\":\"Things associated with this Location\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Location> ENCODER =
      new BinaryMessageEncoder<Location>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Location> DECODER =
      new BinaryMessageDecoder<Location>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Location> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Location> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Location>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Location to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Location from a ByteBuffer. */
  public static Location fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** iotId of this Location */
  @Deprecated public java.lang.CharSequence iotId;
  /** Name of the Location */
  @Deprecated public java.lang.CharSequence name;
  /** Description of the Location */
  @Deprecated public java.lang.CharSequence description;
  /** Representation/encoding type of the Location */
  @Deprecated public java.lang.CharSequence encodingType;
  /** LocationType containing the actual location of the Thing */
  @Deprecated public pw.oliver.jmkb.avroclasses.LocationType location;
  /** Things associated with this Location */
  @Deprecated public java.lang.CharSequence Things;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Location() {}

  /**
   * All-args constructor.
   * @param iotId iotId of this Location
   * @param name Name of the Location
   * @param description Description of the Location
   * @param encodingType Representation/encoding type of the Location
   * @param location LocationType containing the actual location of the Thing
   * @param Things Things associated with this Location
   */
  public Location(java.lang.CharSequence iotId, java.lang.CharSequence name, java.lang.CharSequence description, java.lang.CharSequence encodingType, pw.oliver.jmkb.avroclasses.LocationType location, java.lang.CharSequence Things) {
    this.iotId = iotId;
    this.name = name;
    this.description = description;
    this.encodingType = encodingType;
    this.location = location;
    this.Things = Things;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return iotId;
    case 1: return name;
    case 2: return description;
    case 3: return encodingType;
    case 4: return location;
    case 5: return Things;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: iotId = (java.lang.CharSequence)value$; break;
    case 1: name = (java.lang.CharSequence)value$; break;
    case 2: description = (java.lang.CharSequence)value$; break;
    case 3: encodingType = (java.lang.CharSequence)value$; break;
    case 4: location = (pw.oliver.jmkb.avroclasses.LocationType)value$; break;
    case 5: Things = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'iotId' field.
   * @return iotId of this Location
   */
  public java.lang.CharSequence getIotId() {
    return iotId;
  }

  /**
   * Sets the value of the 'iotId' field.
   * iotId of this Location
   * @param value the value to set.
   */
  public void setIotId(java.lang.CharSequence value) {
    this.iotId = value;
  }

  /**
   * Gets the value of the 'name' field.
   * @return Name of the Location
   */
  public java.lang.CharSequence getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * Name of the Location
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'description' field.
   * @return Description of the Location
   */
  public java.lang.CharSequence getDescription() {
    return description;
  }

  /**
   * Sets the value of the 'description' field.
   * Description of the Location
   * @param value the value to set.
   */
  public void setDescription(java.lang.CharSequence value) {
    this.description = value;
  }

  /**
   * Gets the value of the 'encodingType' field.
   * @return Representation/encoding type of the Location
   */
  public java.lang.CharSequence getEncodingType() {
    return encodingType;
  }

  /**
   * Sets the value of the 'encodingType' field.
   * Representation/encoding type of the Location
   * @param value the value to set.
   */
  public void setEncodingType(java.lang.CharSequence value) {
    this.encodingType = value;
  }

  /**
   * Gets the value of the 'location' field.
   * @return LocationType containing the actual location of the Thing
   */
  public pw.oliver.jmkb.avroclasses.LocationType getLocation() {
    return location;
  }

  /**
   * Sets the value of the 'location' field.
   * LocationType containing the actual location of the Thing
   * @param value the value to set.
   */
  public void setLocation(pw.oliver.jmkb.avroclasses.LocationType value) {
    this.location = value;
  }

  /**
   * Gets the value of the 'Things' field.
   * @return Things associated with this Location
   */
  public java.lang.CharSequence getThings() {
    return Things;
  }

  /**
   * Sets the value of the 'Things' field.
   * Things associated with this Location
   * @param value the value to set.
   */
  public void setThings(java.lang.CharSequence value) {
    this.Things = value;
  }

  /**
   * Creates a new Location RecordBuilder.
   * @return A new Location RecordBuilder
   */
  public static pw.oliver.jmkb.avroclasses.Location.Builder newBuilder() {
    return new pw.oliver.jmkb.avroclasses.Location.Builder();
  }

  /**
   * Creates a new Location RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Location RecordBuilder
   */
  public static pw.oliver.jmkb.avroclasses.Location.Builder newBuilder(pw.oliver.jmkb.avroclasses.Location.Builder other) {
    return new pw.oliver.jmkb.avroclasses.Location.Builder(other);
  }

  /**
   * Creates a new Location RecordBuilder by copying an existing Location instance.
   * @param other The existing instance to copy.
   * @return A new Location RecordBuilder
   */
  public static pw.oliver.jmkb.avroclasses.Location.Builder newBuilder(pw.oliver.jmkb.avroclasses.Location other) {
    return new pw.oliver.jmkb.avroclasses.Location.Builder(other);
  }

  /**
   * RecordBuilder for Location instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Location>
    implements org.apache.avro.data.RecordBuilder<Location> {

    /** iotId of this Location */
    private java.lang.CharSequence iotId;
    /** Name of the Location */
    private java.lang.CharSequence name;
    /** Description of the Location */
    private java.lang.CharSequence description;
    /** Representation/encoding type of the Location */
    private java.lang.CharSequence encodingType;
    /** LocationType containing the actual location of the Thing */
    private pw.oliver.jmkb.avroclasses.LocationType location;
    private pw.oliver.jmkb.avroclasses.LocationType.Builder locationBuilder;
    /** Things associated with this Location */
    private java.lang.CharSequence Things;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(pw.oliver.jmkb.avroclasses.Location.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.iotId)) {
        this.iotId = data().deepCopy(fields()[0].schema(), other.iotId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.description)) {
        this.description = data().deepCopy(fields()[2].schema(), other.description);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.encodingType)) {
        this.encodingType = data().deepCopy(fields()[3].schema(), other.encodingType);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.location)) {
        this.location = data().deepCopy(fields()[4].schema(), other.location);
        fieldSetFlags()[4] = true;
      }
      if (other.hasLocationBuilder()) {
        this.locationBuilder = pw.oliver.jmkb.avroclasses.LocationType.newBuilder(other.getLocationBuilder());
      }
      if (isValidValue(fields()[5], other.Things)) {
        this.Things = data().deepCopy(fields()[5].schema(), other.Things);
        fieldSetFlags()[5] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Location instance
     * @param other The existing instance to copy.
     */
    private Builder(pw.oliver.jmkb.avroclasses.Location other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.iotId)) {
        this.iotId = data().deepCopy(fields()[0].schema(), other.iotId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.description)) {
        this.description = data().deepCopy(fields()[2].schema(), other.description);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.encodingType)) {
        this.encodingType = data().deepCopy(fields()[3].schema(), other.encodingType);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.location)) {
        this.location = data().deepCopy(fields()[4].schema(), other.location);
        fieldSetFlags()[4] = true;
      }
      this.locationBuilder = null;
      if (isValidValue(fields()[5], other.Things)) {
        this.Things = data().deepCopy(fields()[5].schema(), other.Things);
        fieldSetFlags()[5] = true;
      }
    }

    /**
      * Gets the value of the 'iotId' field.
      * iotId of this Location
      * @return The value.
      */
    public java.lang.CharSequence getIotId() {
      return iotId;
    }

    /**
      * Sets the value of the 'iotId' field.
      * iotId of this Location
      * @param value The value of 'iotId'.
      * @return This builder.
      */
    public pw.oliver.jmkb.avroclasses.Location.Builder setIotId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.iotId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'iotId' field has been set.
      * iotId of this Location
      * @return True if the 'iotId' field has been set, false otherwise.
      */
    public boolean hasIotId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'iotId' field.
      * iotId of this Location
      * @return This builder.
      */
    public pw.oliver.jmkb.avroclasses.Location.Builder clearIotId() {
      iotId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'name' field.
      * Name of the Location
      * @return The value.
      */
    public java.lang.CharSequence getName() {
      return name;
    }

    /**
      * Sets the value of the 'name' field.
      * Name of the Location
      * @param value The value of 'name'.
      * @return This builder.
      */
    public pw.oliver.jmkb.avroclasses.Location.Builder setName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.name = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * Name of the Location
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'name' field.
      * Name of the Location
      * @return This builder.
      */
    public pw.oliver.jmkb.avroclasses.Location.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'description' field.
      * Description of the Location
      * @return The value.
      */
    public java.lang.CharSequence getDescription() {
      return description;
    }

    /**
      * Sets the value of the 'description' field.
      * Description of the Location
      * @param value The value of 'description'.
      * @return This builder.
      */
    public pw.oliver.jmkb.avroclasses.Location.Builder setDescription(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.description = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'description' field has been set.
      * Description of the Location
      * @return True if the 'description' field has been set, false otherwise.
      */
    public boolean hasDescription() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'description' field.
      * Description of the Location
      * @return This builder.
      */
    public pw.oliver.jmkb.avroclasses.Location.Builder clearDescription() {
      description = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'encodingType' field.
      * Representation/encoding type of the Location
      * @return The value.
      */
    public java.lang.CharSequence getEncodingType() {
      return encodingType;
    }

    /**
      * Sets the value of the 'encodingType' field.
      * Representation/encoding type of the Location
      * @param value The value of 'encodingType'.
      * @return This builder.
      */
    public pw.oliver.jmkb.avroclasses.Location.Builder setEncodingType(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.encodingType = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'encodingType' field has been set.
      * Representation/encoding type of the Location
      * @return True if the 'encodingType' field has been set, false otherwise.
      */
    public boolean hasEncodingType() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'encodingType' field.
      * Representation/encoding type of the Location
      * @return This builder.
      */
    public pw.oliver.jmkb.avroclasses.Location.Builder clearEncodingType() {
      encodingType = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'location' field.
      * LocationType containing the actual location of the Thing
      * @return The value.
      */
    public pw.oliver.jmkb.avroclasses.LocationType getLocation() {
      return location;
    }

    /**
      * Sets the value of the 'location' field.
      * LocationType containing the actual location of the Thing
      * @param value The value of 'location'.
      * @return This builder.
      */
    public pw.oliver.jmkb.avroclasses.Location.Builder setLocation(pw.oliver.jmkb.avroclasses.LocationType value) {
      validate(fields()[4], value);
      this.locationBuilder = null;
      this.location = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'location' field has been set.
      * LocationType containing the actual location of the Thing
      * @return True if the 'location' field has been set, false otherwise.
      */
    public boolean hasLocation() {
      return fieldSetFlags()[4];
    }

    /**
     * Gets the Builder instance for the 'location' field and creates one if it doesn't exist yet.
     * LocationType containing the actual location of the Thing
     * @return This builder.
     */
    public pw.oliver.jmkb.avroclasses.LocationType.Builder getLocationBuilder() {
      if (locationBuilder == null) {
        if (hasLocation()) {
          setLocationBuilder(pw.oliver.jmkb.avroclasses.LocationType.newBuilder(location));
        } else {
          setLocationBuilder(pw.oliver.jmkb.avroclasses.LocationType.newBuilder());
        }
      }
      return locationBuilder;
    }

    /**
     * Sets the Builder instance for the 'location' field
     * LocationType containing the actual location of the Thing
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public pw.oliver.jmkb.avroclasses.Location.Builder setLocationBuilder(pw.oliver.jmkb.avroclasses.LocationType.Builder value) {
      clearLocation();
      locationBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'location' field has an active Builder instance
     * LocationType containing the actual location of the Thing
     * @return True if the 'location' field has an active Builder instance
     */
    public boolean hasLocationBuilder() {
      return locationBuilder != null;
    }

    /**
      * Clears the value of the 'location' field.
      * LocationType containing the actual location of the Thing
      * @return This builder.
      */
    public pw.oliver.jmkb.avroclasses.Location.Builder clearLocation() {
      location = null;
      locationBuilder = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'Things' field.
      * Things associated with this Location
      * @return The value.
      */
    public java.lang.CharSequence getThings() {
      return Things;
    }

    /**
      * Sets the value of the 'Things' field.
      * Things associated with this Location
      * @param value The value of 'Things'.
      * @return This builder.
      */
    public pw.oliver.jmkb.avroclasses.Location.Builder setThings(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.Things = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'Things' field has been set.
      * Things associated with this Location
      * @return True if the 'Things' field has been set, false otherwise.
      */
    public boolean hasThings() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'Things' field.
      * Things associated with this Location
      * @return This builder.
      */
    public pw.oliver.jmkb.avroclasses.Location.Builder clearThings() {
      Things = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Location build() {
      try {
        Location record = new Location();
        record.iotId = fieldSetFlags()[0] ? this.iotId : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.name = fieldSetFlags()[1] ? this.name : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.description = fieldSetFlags()[2] ? this.description : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.encodingType = fieldSetFlags()[3] ? this.encodingType : (java.lang.CharSequence) defaultValue(fields()[3]);
        if (locationBuilder != null) {
          record.location = this.locationBuilder.build();
        } else {
          record.location = fieldSetFlags()[4] ? this.location : (pw.oliver.jmkb.avroclasses.LocationType) defaultValue(fields()[4]);
        }
        record.Things = fieldSetFlags()[5] ? this.Things : (java.lang.CharSequence) defaultValue(fields()[5]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Location>
    WRITER$ = (org.apache.avro.io.DatumWriter<Location>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Location>
    READER$ = (org.apache.avro.io.DatumReader<Location>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
