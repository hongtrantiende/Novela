package defpackage;

import java.util.Iterator;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jee  reason: default package */
/* loaded from: classes.dex */
public final class jee extends dee {
    public final /* synthetic */ mee E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jee(mee meeVar) {
        super(4);
        this.E = meeVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.E.get(entry.getKey());
            if (obj2 != null && obj2.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dee, java.util.Collection, java.util.Set
    public final int hashCode() {
        return cae.B(this.E.entrySet());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return r().listIterator(0);
    }

    @Override // defpackage.hwd
    public final jwc k() {
        return r().listIterator(0);
    }

    @Override // defpackage.dee
    public final vde s() {
        return new hee(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.E.d.size();
    }
}
