package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xw9  reason: default package */
/* loaded from: classes.dex */
public final class xw9 implements ye6, Serializable {
    public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(xw9.class, Object.class, "b");
    public volatile vt4 a;
    public volatile Object b;

    @Override // defpackage.ye6
    public final boolean d() {
        if (this.b != p40.J) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ye6
    public final Object getValue() {
        Object obj = this.b;
        p40 p40Var = p40.J;
        if (obj != p40Var) {
            return obj;
        }
        vt4 vt4Var = this.a;
        if (vt4Var != null) {
            Object invoke = vt4Var.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, p40Var, invoke)) {
                if (atomicReferenceFieldUpdater.get(this) != p40Var) {
                    return this.b;
                }
            }
            this.a = null;
            return invoke;
        }
        return this.b;
    }

    public final String toString() {
        if (d()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
