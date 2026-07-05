package defpackage;

import java.io.Serializable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d9b  reason: default package */
/* loaded from: classes.dex */
public final class d9b implements c9b, Serializable {
    public final transient Object a = new Object();
    public final c9b b;
    public volatile transient boolean c;
    public transient Object d;

    public d9b(c9b c9bVar) {
        c9bVar.getClass();
        this.b = c9bVar;
    }

    @Override // defpackage.c9b
    public final Object get() {
        if (!this.c) {
            synchronized (this.a) {
                try {
                    if (!this.c) {
                        Object obj = this.b.get();
                        this.d = obj;
                        this.c = true;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (this.c) {
            obj = "<supplier that returned " + this.d + ">";
        } else {
            obj = this.b;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
