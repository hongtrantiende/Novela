package defpackage;

import java.util.AbstractList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c1e  reason: default package */
/* loaded from: classes.dex */
public final class c1e extends AbstractList {
    public final z0e a;
    public final b1e b;

    public c1e(z0e z0eVar, b1e b1eVar) {
        this.a = z0eVar;
        this.b = b1eVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int c = ((q0e) this.a).c(i);
        ((v28) this.b).getClass();
        czd a = czd.a(c);
        if (a == null) {
            return czd.UNKNOWN;
        }
        return a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return ((q0e) this.a).c;
    }
}
