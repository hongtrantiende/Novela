package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: em  reason: default package */
/* loaded from: classes.dex */
public final class em {
    public wea a;
    public long b;
    public tc6 c;
    public float d;
    public lea e;

    public em(wea weaVar, long j, tc6 tc6Var, float f, lea leaVar) {
        this.a = weaVar;
        this.b = j;
        this.c = tc6Var;
        this.d = f;
        this.e = leaVar;
    }

    public static em a(em emVar) {
        return new em(emVar.a, emVar.b, emVar.c, emVar.d, emVar.e);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof em) {
                em emVar = (em) obj;
                if (!c16.i(this.a, emVar.a) || !dna.a(this.b, emVar.b) || this.c != emVar.c || Float.compare(this.d, emVar.d) != 0 || !c16.i(this.e, emVar.e)) {
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
        int c = hl5.c(this.a.hashCode() * 31, this.b, 31);
        int d = nk2.d(this.d, (this.c.hashCode() + c) * 31, 31);
        lea leaVar = this.e;
        if (leaVar == null) {
            hashCode = 0;
        } else {
            hashCode = leaVar.hashCode();
        }
        return d + hashCode;
    }

    public final String toString() {
        wea weaVar = this.a;
        String f = dna.f(this.b);
        tc6 tc6Var = this.c;
        float f2 = this.d;
        lea leaVar = this.e;
        return "ShadowKey(shape=" + weaVar + ", size=" + f + ", layoutDirection=" + tc6Var + ", density=" + f2 + ", shadow=" + leaVar + ")";
    }
}
