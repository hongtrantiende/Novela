package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t9  reason: default package */
/* loaded from: classes3.dex */
public final class t9 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final Map f;
    public final m9 g;
    public final long h;
    public final ab i;
    public final String j;

    public t9(String str, String str2, String str3, int i, int i2, Map map, m9 m9Var, long j, ab abVar, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        map.getClass();
        m9Var.getClass();
        abVar.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = i2;
        this.f = map;
        this.g = m9Var;
        this.h = j;
        this.i = abVar;
        this.j = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t9)) {
            return false;
        }
        t9 t9Var = (t9) obj;
        if (c16.i(this.a, t9Var.a) && c16.i(this.b, t9Var.b) && c16.i(this.c, t9Var.c) && this.d == t9Var.d && this.e == t9Var.e && c16.i(this.f, t9Var.f) && this.g == t9Var.g && this.h == t9Var.h && this.i == t9Var.i && c16.i(this.j, t9Var.j)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int c = hl5.c((this.g.hashCode() + rs8.a(hl5.a(this.e, hl5.a(this.d, eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31), 31, this.f)) * 31, this.h, 31);
        return this.j.hashCode() + ((this.i.hashCode() + c) * 31);
    }

    public final String toString() {
        StringBuilder y = nk2.y("AiTtsModel(id=", this.a, ", name=", this.b, ", language=");
        a82.u(this.d, this.c, ", sampleRate=", ", numSpeakers=", y);
        y.append(this.e);
        y.append(", speakers=");
        y.append(this.f);
        y.append(", gender=");
        y.append(this.g);
        y.append(", sizeBytes=");
        y.append(this.h);
        y.append(", modelType=");
        y.append(this.i);
        y.append(", modelFormat=");
        y.append(this.j);
        y.append(")");
        return y.toString();
    }
}
