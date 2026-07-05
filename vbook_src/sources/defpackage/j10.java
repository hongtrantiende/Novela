package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: j10  reason: default package */
/* loaded from: classes.dex */
public final class j10 implements m10 {
    public final vk8 a;
    public final tw3 b;

    public j10(vk8 vk8Var, tw3 tw3Var) {
        this.a = vk8Var;
        this.b = tw3Var;
    }

    @Override // defpackage.m10
    public final vk8 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof j10) {
                j10 j10Var = (j10) obj;
                if (!c16.i(this.a, j10Var.a) || !this.b.equals(j10Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        vk8 vk8Var = this.a;
        if (vk8Var == null) {
            hashCode = 0;
        } else {
            hashCode = vk8Var.hashCode();
        }
        return this.b.hashCode() + (hashCode * 31);
    }

    public final String toString() {
        return "Error(painter=" + this.a + ", result=" + this.b + ")";
    }
}
