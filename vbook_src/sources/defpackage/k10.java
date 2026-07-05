package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k10  reason: default package */
/* loaded from: classes.dex */
public final class k10 implements m10 {
    public final vk8 a;

    public k10(vk8 vk8Var) {
        this.a = vk8Var;
    }

    @Override // defpackage.m10
    public final vk8 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof k10) && c16.i(this.a, ((k10) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        vk8 vk8Var = this.a;
        if (vk8Var == null) {
            return 0;
        }
        return vk8Var.hashCode();
    }

    public final String toString() {
        return "Loading(painter=" + this.a + ")";
    }
}
