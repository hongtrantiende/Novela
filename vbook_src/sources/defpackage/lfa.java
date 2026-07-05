package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lfa  reason: default package */
/* loaded from: classes.dex */
public final class lfa {
    public final v72 a;
    public final v72 b;
    public final v72 c;
    public final v72 d;
    public final v72 e;
    public final v72 f;
    public final v72 g;
    public final v72 h;

    public lfa(v72 v72Var, v72 v72Var2, v72 v72Var3, v72 v72Var4, v72 v72Var5) {
        su9 su9Var = zea.e;
        su9 su9Var2 = zea.g;
        su9 su9Var3 = zea.h;
        this.a = v72Var;
        this.b = v72Var2;
        this.c = v72Var3;
        this.d = v72Var4;
        this.e = v72Var5;
        this.f = su9Var;
        this.g = su9Var2;
        this.h = su9Var3;
    }

    public final v72 a() {
        return this.a;
    }

    public final v72 b() {
        return this.d;
    }

    public final v72 c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lfa)) {
            return false;
        }
        lfa lfaVar = (lfa) obj;
        if (c16.i(this.a, lfaVar.a) && c16.i(this.b, lfaVar.b) && c16.i(this.c, lfaVar.c) && c16.i(this.d, lfaVar.d) && c16.i(this.e, lfaVar.e) && c16.i(this.f, lfaVar.f) && c16.i(this.g, lfaVar.g) && c16.i(this.h, lfaVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        int hashCode3 = this.d.hashCode();
        int hashCode4 = this.e.hashCode();
        int hashCode5 = this.f.hashCode();
        int hashCode6 = this.g.hashCode();
        return this.h.hashCode() + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.a + ", small=" + this.b + ", medium=" + this.c + ", large=" + this.d + ", largeIncreased=" + this.f + ", extraLarge=" + this.e + ", extralargeIncreased=" + this.g + ", extraExtraLarge=" + this.h + ")";
    }

    public lfa() {
        this(zea.a, zea.b, zea.c, zea.d, zea.f);
    }
}
