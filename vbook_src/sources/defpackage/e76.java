package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e76  reason: default package */
/* loaded from: classes.dex */
public final class e76 {
    public final int a;
    public final yna b;
    public final List c;
    public final int d;
    public final int e;
    public final int f;
    public final String g;
    public e76 h = null;

    public e76(int i, yna ynaVar, List list, int i2, int i3, int i4, String str) {
        this.a = i;
        this.b = ynaVar;
        this.c = list;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e76) {
                e76 e76Var = (e76) obj;
                if (this.a != e76Var.a || !this.b.equals(e76Var.b) || !this.c.equals(e76Var.c) || this.d != e76Var.d || this.e != e76Var.e || this.f != e76Var.f || !this.g.equals(e76Var.g) || !c16.i(this.h, e76Var.h)) {
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
        int j = eub.j(hl5.a(this.f, hl5.a(this.e, hl5.a(this.d, eub.l((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, this.c, 31), 31), 31), 31), 31, this.g);
        e76 e76Var = this.h;
        if (e76Var == null) {
            hashCode = 0;
        } else {
            hashCode = e76Var.hashCode();
        }
        return j + hashCode;
    }

    public final String toString() {
        e76 e76Var = this.h;
        StringBuilder sb = new StringBuilder("KF8Section(index=");
        sb.append(this.a);
        sb.append(", skeleton=");
        sb.append(this.b);
        sb.append(", frags=");
        sb.append(this.c);
        sb.append(", fragEnd=");
        sb.append(this.d);
        sb.append(", length=");
        rs8.q(this.e, this.f, ", totalLength=", ", href=", sb);
        sb.append(this.g);
        sb.append(", next=");
        sb.append(e76Var);
        sb.append(")");
        return sb.toString();
    }
}
