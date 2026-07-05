package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wta  reason: default package */
/* loaded from: classes3.dex */
public final class wta {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final uta e;
    public final List f;

    public wta(String str, String str2, String str3, String str4, uta utaVar, List list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = utaVar;
        this.f = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof wta) {
                wta wtaVar = (wta) obj;
                if (!this.a.equals(wtaVar.a) || !this.b.equals(wtaVar.b) || !this.c.equals(wtaVar.c) || !this.d.equals(wtaVar.d) || !c16.i(this.e, wtaVar.e) || !this.f.equals(wtaVar.f)) {
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
        uta utaVar = this.e;
        if (utaVar == null) {
            hashCode = 0;
        } else {
            hashCode = utaVar.hashCode();
        }
        return this.f.hashCode() + ((j + hashCode) * 31);
    }

    public final String toString() {
        StringBuilder y = nk2.y("SourceExploreSection(id=", this.a, ", title=", this.b, ", subtitle=");
        nk2.C(y, this.c, ", type=", this.d, ", more=");
        y.append(this.e);
        y.append(", items=");
        y.append(this.f);
        y.append(")");
        return y.toString();
    }
}
