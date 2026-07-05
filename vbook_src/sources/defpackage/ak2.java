package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ak2  reason: default package */
/* loaded from: classes3.dex */
public final class ak2 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final String f;
    public final long g;
    public final String h;
    public final String i;
    public final String j;
    public final long k;
    public final long l;

    public ak2(String str, String str2, String str3, int i, int i2, String str4, long j, String str5, String str6, String str7, long j2, long j3) {
        hl5.z(str, str2, str3, str7);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = i2;
        this.f = str4;
        this.g = j;
        this.h = str5;
        this.i = str6;
        this.j = str7;
        this.k = j2;
        this.l = j3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ak2) {
                ak2 ak2Var = (ak2) obj;
                if (!c16.i(this.a, ak2Var.a) || !c16.i(this.b, ak2Var.b) || !c16.i(this.c, ak2Var.c) || this.d != ak2Var.d || this.e != ak2Var.e || !this.f.equals(ak2Var.f) || this.g != ak2Var.g || !this.h.equals(ak2Var.h) || !this.i.equals(ak2Var.i) || !c16.i(this.j, ak2Var.j) || this.k != ak2Var.k || this.l != ak2Var.l) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.l) + hl5.c(eub.j(eub.j(eub.j(hl5.c(eub.j(hl5.a(this.e, hl5.a(this.d, eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31), 31, this.f), this.g, 31), 31, this.h), 31, this.i), 31, this.j), this.k, 31);
    }

    public final String toString() {
        StringBuilder y = nk2.y("DbAiTtsModel(id=", this.a, ", name=", this.b, ", language=");
        a82.u(this.d, this.c, ", sampleRate=", ", numSpeakers=", y);
        nk2.z(this.e, ", speakers=", this.f, ", sizeBytes=", y);
        y.append(this.g);
        y.append(", gender=");
        y.append(this.h);
        nk2.C(y, ", modelType=", this.i, ", modelFormat=", this.j);
        rs8.x(y, ", createAt=", this.k, ", updateAt=");
        return hl5.q(y, this.l, ")");
    }
}
