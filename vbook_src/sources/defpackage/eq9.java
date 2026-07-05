package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: eq9  reason: default package */
/* loaded from: classes.dex */
public final class eq9 {
    public final long a;
    public final long b;
    public final long c;
    public final y22 d;
    public final ok0 e;
    public final boolean f;
    public final qh9 g;
    public final sz9 h;
    public final m12 i;

    public eq9(long j, long j2, long j3, y22 y22Var, ok0 ok0Var, boolean z, qh9 qh9Var, sz9 sz9Var, m12 m12Var) {
        y22Var.getClass();
        ok0Var.getClass();
        sz9Var.getClass();
        m12Var.getClass();
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = y22Var;
        this.e = ok0Var;
        this.f = z;
        this.g = qh9Var;
        this.h = sz9Var;
        this.i = m12Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof eq9) {
                eq9 eq9Var = (eq9) obj;
                if (!az5.a(this.a, eq9Var.a) || !az5.a(this.b, eq9Var.b) || !az5.a(this.c, eq9Var.c) || !c16.i(this.d, eq9Var.d) || !c16.i(this.e, eq9Var.e) || this.f != eq9Var.f || !c16.i(this.g, eq9Var.g) || !c16.i(this.h, eq9Var.h) || Float.compare(nae.e, nae.e) != 0 || !c16.i(this.i, eq9Var.i)) {
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
        int i = az5.c;
        int k = eub.k((this.e.hashCode() + ((this.d.hashCode() + hl5.a(0, hl5.c(hl5.c(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31), 31)) * 31)) * 31, 31, this.f);
        qh9 qh9Var = this.g;
        if (qh9Var == null) {
            hashCode = 0;
        } else {
            hashCode = qh9Var.hashCode();
        }
        return this.i.hashCode() + nk2.d(nae.e, eub.k((this.h.hashCode() + ((k + hashCode) * 31)) * 31, 31, false), 31);
    }

    public final String toString() {
        return "ResetParams(containerSize=" + ((Object) az5.b(this.a)) + ", contentSize=" + ((Object) az5.b(this.b)) + ", contentOriginSize=" + ((Object) az5.b(this.c)) + ", rotation=0, contentScale=" + this.d + ", alignment=" + this.e + ", rtlLayoutDirection=" + this.f + ", readMode=" + this.g + ", scalesCalculator=" + this.h + ", limitOffsetWithinBaseVisibleRect=false, containerWhitespaceMultiple=0.0, containerWhitespace=" + this.i + ')';
    }
}
