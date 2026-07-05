package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f25  reason: default package */
/* loaded from: classes.dex */
public final class f25 implements h25 {
    public final float a;

    public f25(float f) {
        this.a = f;
        if (rg3.a(f, nae.e) > 0) {
            return;
        }
        ov5.a("Provided min size should be larger than zero.");
    }

    @Override // defpackage.h25
    public final ArrayList a(r13 r13Var, int i, int i2) {
        return ade.m(i, Math.max((i + i2) / (r13Var.X0(this.a) + i2), 1), i2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f25) {
            if (rg3.b(this.a, ((f25) obj).a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }
}
