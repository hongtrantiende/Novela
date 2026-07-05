package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: em0  reason: default package */
/* loaded from: classes3.dex */
public final class em0 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final pz0 e;
    public final xt4 f;

    public em0(String str, String str2, String str3, List list, pz0 pz0Var, xt4 xt4Var, int i) {
        pz0Var = (i & 32) != 0 ? null : pz0Var;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = pz0Var;
        this.f = xt4Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof em0) {
                em0 em0Var = (em0) obj;
                if (!this.a.equals(em0Var.a) || !this.b.equals(em0Var.b) || !this.c.equals(em0Var.c) || !this.d.equals(em0Var.d) || !c16.i(this.e, em0Var.e) || !this.f.equals(em0Var.f)) {
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
        int l = eub.l(eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), this.d, 961);
        pz0 pz0Var = this.e;
        if (pz0Var == null) {
            hashCode = 0;
        } else {
            hashCode = pz0Var.hashCode();
        }
        return this.f.hashCode() + ((l + hashCode) * 31);
    }

    public final String toString() {
        StringBuilder y = nk2.y("BlockDescriptor(typeId=", this.a, ", displayName=", this.b, ", description=");
        y.append(this.c);
        y.append(", keywords=");
        y.append(this.d);
        y.append(", icon=null, slash=");
        y.append(this.e);
        y.append(", factory=");
        y.append(this.f);
        y.append(")");
        return y.toString();
    }
}
