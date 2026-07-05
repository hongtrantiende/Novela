package org.mozilla.javascript;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.function.BiFunction;
import org.mozilla.javascript.Hashtable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public class Hashtable implements Serializable, Iterable<Entry> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final long serialVersionUID = -7151554912419543747L;
    private final HashMap<Object, Entry> map = new HashMap<>();
    private Entry first = null;
    private Entry last = null;

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static final class Iter implements Iterator<Entry> {
        private Entry pos;

        public Iter(Entry entry) {
            Entry b = Hashtable.b();
            b.next = entry;
            this.pos = b;
        }

        private void skipDeleted() {
            while (true) {
                Entry entry = this.pos.next;
                if (entry != null && entry.deleted) {
                    this.pos = entry;
                } else {
                    return;
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            skipDeleted();
            Entry entry = this.pos;
            if (entry != null && entry.next != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public Entry next() {
            Entry entry;
            skipDeleted();
            Entry entry2 = this.pos;
            if (entry2 != null && (entry = entry2.next) != null) {
                this.pos = entry;
                return entry;
            }
            xk5.g();
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ Entry b() {
        return makeDummy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Entry lambda$put$0(Entry entry, Object obj, Object obj2, Entry entry2) {
        if (entry2 == null) {
            if (this.first == null) {
                this.last = entry;
                this.first = entry;
                return entry;
            }
            Entry entry3 = this.last;
            entry3.next = entry;
            entry.prev = entry3;
            this.last = entry;
            return entry;
        }
        entry2.value = obj;
        return entry2;
    }

    private static Entry makeDummy() {
        Entry entry = new Entry();
        entry.clear();
        return entry;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.function.Consumer, java.lang.Object] */
    public void clear() {
        iterator().forEachRemaining(new Object());
        if (this.first != null) {
            Entry makeDummy = makeDummy();
            this.last.next = makeDummy;
            this.last = makeDummy;
            this.first = makeDummy;
        }
        this.map.clear();
    }

    @Deprecated
    public Object delete(Object obj) {
        Entry remove = this.map.remove(new Entry(obj, null));
        if (remove == null) {
            return null;
        }
        if (remove == this.first) {
            if (remove == this.last) {
                remove.clear();
                remove.prev = null;
            } else {
                Entry entry = remove.next;
                this.first = entry;
                entry.prev = null;
                Entry entry2 = entry.next;
                if (entry2 != null) {
                    entry2.prev = entry;
                }
            }
        } else {
            Entry entry3 = remove.prev;
            entry3.next = remove.next;
            remove.prev = null;
            Entry entry4 = remove.next;
            if (entry4 != null) {
                entry4.prev = entry3;
            } else {
                this.last = entry3;
            }
        }
        Object obj2 = remove.value;
        remove.clear();
        return obj2;
    }

    public boolean deleteEntry(Object obj) {
        Entry remove = this.map.remove(new Entry(obj, null));
        if (remove == null) {
            return false;
        }
        if (remove == this.first) {
            if (remove == this.last) {
                remove.clear();
                remove.prev = null;
            } else {
                Entry entry = remove.next;
                this.first = entry;
                entry.prev = null;
                Entry entry2 = entry.next;
                if (entry2 != null) {
                    entry2.prev = entry;
                }
            }
        } else {
            Entry entry3 = remove.prev;
            entry3.next = remove.next;
            remove.prev = null;
            Entry entry4 = remove.next;
            if (entry4 != null) {
                entry4.prev = entry3;
            } else {
                this.last = entry3;
            }
        }
        remove.clear();
        return true;
    }

    @Deprecated
    public Object get(Object obj) {
        Entry entry = this.map.get(new Entry(obj, null));
        if (entry == null) {
            return null;
        }
        return entry.value;
    }

    public Entry getEntry(Object obj) {
        return this.map.get(new Entry(obj, null));
    }

    public boolean has(Object obj) {
        return this.map.containsKey(new Entry(obj, null));
    }

    @Override // java.lang.Iterable
    public Iterator<Entry> iterator() {
        return new Iter(this.first);
    }

    public void put(Object obj, final Object obj2) {
        final Entry entry = new Entry(obj, obj2);
        this.map.compute(entry, new BiFunction() { // from class: h45
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj3, Object obj4) {
                Hashtable.Entry lambda$put$0;
                lambda$put$0 = Hashtable.this.lambda$put$0(entry, obj2, obj3, (Hashtable.Entry) obj4);
                return lambda$put$0;
            }
        });
    }

    public int size() {
        return this.map.size();
    }

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static final class Entry implements Serializable {
        private static final long serialVersionUID = 4086572107122965503L;
        boolean deleted;
        final int hashCode;
        Object key;
        Entry next;
        Entry prev;
        Object value;

        public Entry(Object obj, Object obj2) {
            if (obj instanceof Number) {
                if (!(obj instanceof Double) && !(obj instanceof BigInteger)) {
                    this.key = Double.valueOf(((Number) obj).doubleValue());
                } else {
                    this.key = obj;
                }
            } else if (obj instanceof ConsString) {
                this.key = obj.toString();
            } else {
                this.key = obj;
            }
            if (this.key == null) {
                this.hashCode = 0;
            } else if (obj.equals(ScriptRuntime.negativeZeroObj)) {
                this.hashCode = 0;
            } else {
                this.hashCode = this.key.hashCode();
            }
            this.value = obj2;
        }

        public void clear() {
            Object obj = Undefined.instance;
            this.key = obj;
            this.value = obj;
            this.deleted = true;
        }

        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                return ScriptRuntime.sameZero(this.key, ((Entry) obj).key);
            } catch (ClassCastException unused) {
                return false;
            }
        }

        public int hashCode() {
            return this.hashCode;
        }

        public Object key() {
            return this.key;
        }

        public Object value() {
            return this.value;
        }

        public Entry() {
            this.hashCode = 0;
        }
    }
}
