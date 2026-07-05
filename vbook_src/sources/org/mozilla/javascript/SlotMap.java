package org.mozilla.javascript;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public interface SlotMap extends Iterable<Slot> {

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    @FunctionalInterface
    /* loaded from: classes3.dex */
    public interface SlotComputer<S extends Slot> {
        S compute(Object obj, int i, Slot slot);
    }

    void add(Slot slot);

    <S extends Slot> S compute(Object obj, int i, SlotComputer<S> slotComputer);

    boolean isEmpty();

    Slot modify(Object obj, int i, int i2);

    Slot query(Object obj, int i);

    int size();
}
