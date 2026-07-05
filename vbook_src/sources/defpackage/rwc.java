package defpackage;

import java.io.Serializable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rwc  reason: default package */
/* loaded from: classes.dex */
public final class rwc implements ye6, Serializable {
    public vt4 a;
    public Object b;

    @Override // defpackage.ye6
    public final boolean d() {
        if (this.b != p40.J) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ye6
    public final Object getValue() {
        if (this.b == p40.J) {
            vt4 vt4Var = this.a;
            vt4Var.getClass();
            this.b = vt4Var.invoke();
            this.a = null;
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
