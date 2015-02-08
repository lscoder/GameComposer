package de.mirkosertic.gameengine.physic;

import de.mirkosertic.gameengine.type.*;

public class ApplyImpulseToGameObjectInstanceClassInformation extends de.mirkosertic.gameengine.event.GameEventClassInformation {

  public static final Field<ApplyImpulseToGameObjectInstance, de.mirkosertic.gameengine.core.GameObjectInstance> INSTANCE = new Field<ApplyImpulseToGameObjectInstance, de.mirkosertic.gameengine.core.GameObjectInstance>("instance", de.mirkosertic.gameengine.core.GameObjectInstance.class) {
    @Override
    public de.mirkosertic.gameengine.core.GameObjectInstance getValue(ApplyImpulseToGameObjectInstance aObject) {
      return aObject.instance;
    }
  };

  public static final Field<ApplyImpulseToGameObjectInstance, de.mirkosertic.gameengine.type.Force> FORCE = new Field<ApplyImpulseToGameObjectInstance, de.mirkosertic.gameengine.type.Force>("force", de.mirkosertic.gameengine.type.Force.class) {
    @Override
    public de.mirkosertic.gameengine.type.Force getValue(ApplyImpulseToGameObjectInstance aObject) {
      return aObject.force;
    }
  };

  public ApplyImpulseToGameObjectInstanceClassInformation() {
    register(INSTANCE);
    register(FORCE);
  }
}