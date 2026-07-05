package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t14  reason: default package */
/* loaded from: classes3.dex */
public final class t14 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final g14 e;
    public final ArrayList f;

    public t14(String str, String str2, String str3, String str4, g14 g14Var, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = g14Var;
        this.f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof t14) {
                t14 t14Var = (t14) obj;
                if (!this.a.equals(t14Var.a) || !this.b.equals(t14Var.b) || !this.c.equals(t14Var.c) || !this.d.equals(t14Var.d) || !c16.i(this.e, t14Var.e) || !this.f.equals(t14Var.f)) {
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
        int j = eub.j(eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        g14 g14Var = this.e;
        if (g14Var == null) {
            hashCode = 0;
        } else {
            hashCode = g14Var.hashCode();
        }
        return this.f.hashCode() + ((j + hashCode) * 31);
    }

    public final String toString() {
        StringBuilder y = nk2.y("ExploreSection(id=", this.a, ", title=", this.b, ", subtitle=");
        nk2.C(y, this.c, ", type=", this.d, ", more=");
        y.append(this.e);
        y.append(", items=");
        y.append(this.f);
        y.append(")");
        return y.toString();
    }
}
