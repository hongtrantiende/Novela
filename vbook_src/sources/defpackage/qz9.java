package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qz9  reason: default package */
/* loaded from: classes3.dex */
public final class qz9 {
    public final boolean a;
    public final uy5 b;
    public final long c;
    public final float d;
    public final int e;

    public qz9(boolean z, uy5 uy5Var, long j, float f, int i) {
        this.a = z;
        this.b = uy5Var;
        this.c = j;
        this.d = f;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof qz9) {
                qz9 qz9Var = (qz9) obj;
                if (this.a != qz9Var.a || !c16.i(this.b, qz9Var.b) || !zy5.b(this.c, qz9Var.c) || Float.compare(this.d, qz9Var.d) != 0 || this.e != qz9Var.e) {
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
        int hashCode2 = Boolean.hashCode(this.a) * 31;
        uy5 uy5Var = this.b;
        if (uy5Var == null) {
            hashCode = 0;
        } else {
            hashCode = uy5Var.hashCode();
        }
        return Integer.hashCode(this.e) + nk2.d(this.d, hl5.c((hashCode2 + hashCode) * 31, this.c, 31), 31);
    }

    public final String toString() {
        String c = zy5.c(this.c);
        StringBuilder sb = new StringBuilder("ScaledRequest(loaded=");
        sb.append(this.a);
        sb.append(", rect=");
        sb.append(this.b);
        sb.append(", pageSize=");
        sb.append(c);
        sb.append(", zoom=");
        sb.append(this.d);
        sb.append(", generation=");
        return rs8.g(this.e, ")", sb);
    }
}
