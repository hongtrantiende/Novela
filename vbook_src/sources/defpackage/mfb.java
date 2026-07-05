package defpackage;

import java.io.Serializable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mfb  reason: default package */
/* loaded from: classes.dex */
public final class mfb implements ye6, Serializable {
    public vt4 a;
    public volatile Object b;
    public final Object c;

    public mfb(vt4 vt4Var) {
        vt4Var.getClass();
        this.a = vt4Var;
        this.b = p40.J;
        this.c = this;
    }

    @Override // defpackage.ye6
    public final boolean d() {
        if (this.b != p40.J) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ye6
    public final Object getValue() {
        Object obj;
        Object obj2 = this.b;
        p40 p40Var = p40.J;
        if (obj2 != p40Var) {
            return obj2;
        }
        synchronized (this.c) {
            obj = this.b;
            if (obj == p40Var) {
                vt4 vt4Var = this.a;
                vt4Var.getClass();
                obj = vt4Var.invoke();
                this.b = obj;
                this.a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (d()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
