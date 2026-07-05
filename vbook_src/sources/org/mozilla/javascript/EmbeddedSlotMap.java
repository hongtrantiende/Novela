package org.mozilla.javascript;

import java.util.Iterator;
import java.util.Objects;
import org.mozilla.javascript.SlotMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public class EmbeddedSlotMap implements SlotMap {
    private static final int INITIAL_SLOT_SIZE = 4;
    private int count;
    private Slot firstAdded;
    private Slot lastAdded;
    private Slot[] slots;

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static final class Iter implements Iterator<Slot> {
        private Slot next;

        public Iter(Slot slot) {
            this.next = slot;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.next != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public Slot next() {
            Slot slot = this.next;
            if (slot != null) {
                this.next = slot.orderedNext;
                return slot;
            }
            xk5.g();
            return null;
        }
    }

    private static void addKnownAbsentSlot(Slot[] slotArr, Slot slot) {
        int slotIndex = getSlotIndex(slotArr.length, slot.indexOrHash);
        slot.next = slotArr[slotIndex];
        slotArr[slotIndex] = slot;
    }

    private static void copyTable(Slot[] slotArr, Slot[] slotArr2) {
        for (Slot slot : slotArr) {
            while (slot != null) {
                Slot slot2 = slot.next;
                addKnownAbsentSlot(slotArr2, slot);
                slot = slot2;
            }
        }
    }

    private void createNewSlot(Slot slot) {
        int i = this.count;
        if (i == 0) {
            this.slots = new Slot[4];
        }
        int i2 = (i + 1) * 4;
        Slot[] slotArr = this.slots;
        if (i2 > slotArr.length * 3) {
            Slot[] slotArr2 = new Slot[slotArr.length * 2];
            copyTable(slotArr, slotArr2);
            this.slots = slotArr2;
        }
        insertNewSlot(slot);
    }

    private static int getSlotIndex(int i, int i2) {
        return (i - 1) & i2;
    }

    private void insertNewSlot(Slot slot) {
        this.count++;
        Slot slot2 = this.lastAdded;
        if (slot2 != null) {
            slot2.orderedNext = slot;
        }
        if (this.firstAdded == null) {
            this.firstAdded = slot;
        }
        this.lastAdded = slot;
        addKnownAbsentSlot(this.slots, slot);
    }

    private void removeSlot(Slot slot, Slot slot2, int i, Object obj) {
        this.count--;
        if (slot2 == slot) {
            this.slots[i] = slot.next;
        } else {
            slot2.next = slot.next;
        }
        Slot slot3 = this.firstAdded;
        if (slot == slot3) {
            this.firstAdded = slot.orderedNext;
            slot3 = null;
        } else {
            while (true) {
                Slot slot4 = slot3.orderedNext;
                if (slot4 == slot) {
                    break;
                }
                slot3 = slot4;
            }
            slot3.orderedNext = slot.orderedNext;
        }
        if (slot == this.lastAdded) {
            this.lastAdded = slot3;
        }
    }

    @Override // org.mozilla.javascript.SlotMap
    public void add(Slot slot) {
        if (this.slots == null) {
            this.slots = new Slot[4];
        }
        insertNewSlot(slot);
    }

    @Override // org.mozilla.javascript.SlotMap
    public <S extends Slot> S compute(Object obj, int i, SlotMap.SlotComputer<S> slotComputer) {
        int i2;
        if (obj != null) {
            i2 = obj.hashCode();
        } else {
            i2 = i;
        }
        Slot[] slotArr = this.slots;
        if (slotArr != null) {
            int slotIndex = getSlotIndex(slotArr.length, i2);
            Slot slot = this.slots[slotIndex];
            Slot slot2 = slot;
            while (slot != null && (i2 != slot.indexOrHash || !Objects.equals(slot.name, obj))) {
                slot2 = slot;
                slot = slot.next;
            }
            if (slot != null) {
                S compute = slotComputer.compute(obj, i, slot);
                if (compute == null) {
                    removeSlot(slot, slot2, slotIndex, obj);
                    return compute;
                }
                if (!slot.equals(compute)) {
                    if (slot2 == slot) {
                        this.slots[slotIndex] = compute;
                    } else {
                        slot2.next = compute;
                    }
                    compute.next = slot.next;
                    Slot slot3 = this.firstAdded;
                    if (slot == slot3) {
                        this.firstAdded = compute;
                    } else {
                        while (slot3 != null) {
                            Slot slot4 = slot3.orderedNext;
                            if (slot4 == slot) {
                                break;
                            }
                            slot3 = slot4;
                        }
                        if (slot3 != null) {
                            slot3.orderedNext = compute;
                        }
                    }
                    compute.orderedNext = slot.orderedNext;
                    if (slot == this.lastAdded) {
                        this.lastAdded = compute;
                    }
                }
                return compute;
            }
        }
        S compute2 = slotComputer.compute(obj, i, null);
        if (compute2 != null) {
            createNewSlot(compute2);
        }
        return compute2;
    }

    @Override // org.mozilla.javascript.SlotMap
    public boolean isEmpty() {
        if (this.count == 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator<Slot> iterator() {
        return new Iter(this.firstAdded);
    }

    @Override // org.mozilla.javascript.SlotMap
    public Slot modify(Object obj, int i, int i2) {
        int i3;
        if (obj != null) {
            i3 = obj.hashCode();
        } else {
            i3 = i;
        }
        Slot[] slotArr = this.slots;
        if (slotArr != null) {
            Slot slot = this.slots[getSlotIndex(slotArr.length, i3)];
            while (slot != null && (i3 != slot.indexOrHash || !Objects.equals(slot.name, obj))) {
                slot = slot.next;
            }
            if (slot != null) {
                return slot;
            }
        }
        Slot slot2 = new Slot(obj, i, i2);
        createNewSlot(slot2);
        return slot2;
    }

    @Override // org.mozilla.javascript.SlotMap
    public Slot query(Object obj, int i) {
        if (this.slots == null) {
            return null;
        }
        if (obj != null) {
            i = obj.hashCode();
        }
        for (Slot slot = this.slots[getSlotIndex(this.slots.length, i)]; slot != null; slot = slot.next) {
            if (i == slot.indexOrHash && Objects.equals(slot.name, obj)) {
                return slot;
            }
        }
        return null;
    }

    @Override // org.mozilla.javascript.SlotMap
    public int size() {
        return this.count;
    }
}
