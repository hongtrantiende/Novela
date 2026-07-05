package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e84  reason: default package */
/* loaded from: classes3.dex */
public final class e84 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final String f;
    public final String g;

    public e84(String str, String str2, String str3, String str4, List list, String str5, String str6) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list;
        this.f = str5;
        this.g = str6;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e84) {
                e84 e84Var = (e84) obj;
                if (!c16.i(this.a, e84Var.a) || !this.b.equals(e84Var.b) || !this.c.equals(e84Var.c) || !this.d.equals(e84Var.d) || !this.e.equals(e84Var.e) || !this.f.equals(e84Var.f) || !this.g.equals(e84Var.g)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.g.hashCode() + eub.j(eub.l(eub.j(eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), this.e, 31), 31, this.f);
    }

    public final String toString() {
        StringBuilder y = nk2.y("ExtensionSettingItem(key=", this.a, ", title=", this.b, ", subtitle=");
        nk2.C(y, this.c, ", defaultValue=", this.d, ", values=");
        y.append(this.e);
        y.append(", mode=");
        y.append(this.f);
        y.append(", format=");
        return s21.q(y, this.g, ")");
    }
}
