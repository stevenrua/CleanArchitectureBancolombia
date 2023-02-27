package co.com.storecar.mongo.repository;

import co.com.storecar.mongo.generic.models.StoredEvent;

public class DocumentEventStored {
    private String aggregateRootId;

    private StoredEvent storedEvent;

    public DocumentEventStored() {
    }

    public String getAggregateRootId() {
        return aggregateRootId;
    }

    public void setAggregateRootId(String aggregateRootId) {
        this.aggregateRootId = aggregateRootId;
    }

    public StoredEvent getStoredEvent() {
        return storedEvent;
    }

    public void setStoredEvent(StoredEvent storedEvent) {
        this.storedEvent = storedEvent;
    }
}
