package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yj0  reason: default package */
/* loaded from: classes3.dex */
public final class yj0 {
    public final nf9 a;
    public final gi1 b;
    public final lu4 c;
    public final l96 d;
    public final ArrayList e;

    public yj0(nf9 nf9Var, gi1 gi1Var, lu4 lu4Var, l96 l96Var) {
        nf9Var.getClass();
        this.a = nf9Var;
        this.b = gi1Var;
        this.c = lu4Var;
        this.d = l96Var;
        this.e = new ArrayList(ks3.a);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            obj.getClass();
            yj0 yj0Var = (yj0) obj;
            if (!this.b.equals(yj0Var.b) || !c16.i(this.a, yj0Var.a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        sb.append(this.d);
        sb.append(": '");
        sb.append(v66.a(this.b));
        sb.append('\'');
        x3b x3bVar = oaa.E;
        nf9 nf9Var = this.a;
        if (!c16.i(nf9Var, x3bVar)) {
            sb.append(",scope:");
            sb.append(nf9Var);
        }
        ArrayList arrayList = this.e;
        if (!arrayList.isEmpty()) {
            sb.append(",binds:");
            sl1.h0(arrayList, sb, ",", new nj0(1), 60);
        }
        sb.append(']');
        return sb.toString();
    }
}
