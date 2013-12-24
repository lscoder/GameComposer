package de.mirkosertic.gameengine.sprites;

import java.util.HashMap;
import java.util.Map;

import de.mirkosertic.gameengine.core.GameComponent;
import de.mirkosertic.gameengine.core.GameObjectInstance;
import de.mirkosertic.gameengine.event.GameEventManager;
import de.mirkosertic.gameengine.event.Property;
import de.mirkosertic.gameengine.types.ResourceName;

public class SpriteComponent extends GameComponent implements Sprite {

    static final String TYPE = "SpriteComponent";

    private final GameObjectInstance objectInstance;
    private final Property<ResourceName> resourceName;

    private SpriteComponent(GameObjectInstance aObjectInstance) {
        this(aObjectInstance, aObjectInstance.getOwnerGameObject().getComponentTemplate(SpriteComponentTemplate.class));
    }

    SpriteComponent(GameObjectInstance aObjectInstance, SpriteComponentTemplate aTemplate) {
        objectInstance = aObjectInstance;

        GameEventManager theEventManager = aObjectInstance.getOwnerGameObject().getGameScene().getRuntime().getEventManager();

        resourceName = registerProperty(new Property<ResourceName>(this, "resourceName", aTemplate.resourceNameProperty().get(), theEventManager));
    }

    @Override
    public String getTypeKey() {
        return TYPE;
    }

    public Property<ResourceName> resourceNameProperty() {
        return resourceName;
    }

    @Override
    public Map<String, Object> serialize() {
        Map<String, Object> theResult = new HashMap<String, Object>();
        theResult.put(TYPE_ATTRIBUTE, TYPE);
        return theResult;
    }

    @Override
    public SpriteComponentTemplate getTemplate() {
        return objectInstance.getOwnerGameObject().getComponentTemplate(SpriteComponentTemplate.class);
    }

    public static SpriteComponent deserialize(GameObjectInstance aObjectInstance, Map<String, Object> aSerializedData) {
        return new SpriteComponent(aObjectInstance);
    }
}