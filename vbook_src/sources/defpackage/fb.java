package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fb  reason: default package */
/* loaded from: classes3.dex */
public final class fb {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;
    public final int i;
    public final m9 j;
    public final ab k;
    public final String l;

    public fb(String str, String str2, String str3, long j, String str4, String str5, String str6, int i, int i2, m9 m9Var, ab abVar, String str7) {
        s21.B(str, str2, str3, str4, str5);
        str7.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = i;
        this.i = i2;
        this.j = m9Var;
        this.k = abVar;
        this.l = str7;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof fb) {
                fb fbVar = (fb) obj;
                if (!c16.i(this.a, fbVar.a) || !c16.i(this.b, fbVar.b) || !c16.i(this.c, fbVar.c) || this.d != fbVar.d || !c16.i(this.e, fbVar.e) || !c16.i(this.f, fbVar.f) || !c16.i(this.g, fbVar.g) || this.h != fbVar.h || this.i != fbVar.i || this.j != fbVar.j || this.k != fbVar.k || !c16.i(this.l, fbVar.l)) {
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
        int j = eub.j(eub.j(hl5.c(eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), this.d, 31), 31, this.e), 31, this.f);
        String str = this.g;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int a = hl5.a(this.i, hl5.a(this.h, (j + hashCode) * 31, 31), 31);
        int hashCode2 = this.k.hashCode();
        return this.l.hashCode() + ((hashCode2 + ((this.j.hashCode() + a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder y = nk2.y("AiTtsRemoteModel(id=", this.a, ", name=", this.b, ", language=");
        y.append(this.c);
        y.append(", sizeBytes=");
        y.append(this.d);
        nk2.C(y, ", description=", this.e, ", downloadUrl=", this.f);
        y.append(", checksum=");
        y.append(this.g);
        y.append(", sampleRate=");
        y.append(this.h);
        y.append(", numSpeakers=");
        y.append(this.i);
        y.append(", gender=");
        y.append(this.j);
        y.append(", modelType=");
        y.append(this.k);
        y.append(", modelFormat=");
        y.append(this.l);
        y.append(")");
        return y.toString();
    }
}
