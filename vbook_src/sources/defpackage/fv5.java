package defpackage;

import java.io.Serializable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fv5  reason: default package */
/* loaded from: classes.dex */
public final class fv5 implements ye6, Serializable {
    public final Object a;

    public fv5(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.ye6
    public final boolean d() {
        return true;
    }

    @Override // defpackage.ye6
    public final Object getValue() {
        return this.a;
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
