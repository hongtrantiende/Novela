package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kjc  reason: default package */
/* loaded from: classes.dex */
public class kjc {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final qs5 i;
    public final qs5 j;
    public final qs5 k;
    public final qs5 l;
    public final qs5 m;
    public final int n;
    public final int o;
    public final qs5 p;
    public final ijc q;
    public final qs5 r;
    public final qs5 s;
    public final boolean t;
    public final int u;
    public final rm9 v;
    public final ts5 w;

    static {
        new kjc(new jjc());
        a2d.K(1);
        a2d.K(2);
        a2d.K(3);
        a2d.K(4);
        a82.s(5, 6, 7, 8, 9);
        a82.s(10, 11, 12, 13, 14);
        a82.s(15, 16, 17, 18, 19);
        a82.s(20, 21, 22, 23, 24);
        a82.s(25, 26, 27, 28, 29);
        a82.s(30, 31, 32, 33, 34);
        a2d.K(35);
        a2d.K(36);
        a2d.K(37);
        a2d.K(38);
    }

    public kjc(jjc jjcVar) {
        this.a = jjcVar.a;
        this.b = jjcVar.b;
        this.c = jjcVar.c;
        this.d = jjcVar.d;
        this.e = jjcVar.e;
        this.f = jjcVar.f;
        this.g = jjcVar.g;
        this.h = jjcVar.h;
        this.i = jjcVar.i;
        this.j = jjcVar.j;
        this.k = jjcVar.k;
        this.l = jjcVar.l;
        this.n = jjcVar.n;
        this.m = jjcVar.m;
        this.o = jjcVar.o;
        this.p = jjcVar.p;
        this.q = jjcVar.q;
        this.r = jjcVar.r;
        this.t = jjcVar.s;
        this.s = jjcVar.t;
        this.u = jjcVar.u;
        this.v = rm9.b(jjcVar.v);
        this.w = ts5.j(jjcVar.w);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [jjc, java.lang.Object] */
    public jjc a() {
        ?? obj = new Object();
        obj.c(this);
        return obj;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                kjc kjcVar = (kjc) obj;
                if (this.a == kjcVar.a && this.b == kjcVar.b && this.c == kjcVar.c && this.d == kjcVar.d && this.h == kjcVar.h && this.e == kjcVar.e && this.f == kjcVar.f && this.g == kjcVar.g && this.i.equals(kjcVar.i) && this.j.equals(kjcVar.j) && this.k.equals(kjcVar.k) && this.l.equals(kjcVar.l) && this.n == kjcVar.n && this.m.equals(kjcVar.m) && this.o == kjcVar.o && this.p.equals(kjcVar.p) && this.q.equals(kjcVar.q) && this.s.equals(kjcVar.s) && this.r.equals(kjcVar.r) && this.t == kjcVar.t && this.u == kjcVar.u) {
                    rm9 rm9Var = kjcVar.v;
                    rm9 rm9Var2 = this.v;
                    rm9Var2.getClass();
                    if (nxe.u(rm9Var, rm9Var2) && this.w.equals(kjcVar.w)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = this.i.hashCode();
        int hashCode2 = this.j.hashCode();
        int hashCode3 = this.k.hashCode();
        int hashCode4 = this.l.hashCode();
        int hashCode5 = this.m.hashCode();
        int hashCode6 = this.p.hashCode();
        this.q.getClass();
        int hashCode7 = this.r.hashCode();
        int hashCode8 = this.s.hashCode();
        int hashCode9 = this.v.hashCode();
        return this.w.hashCode() + ((hashCode9 + ((((hashCode8 + ((((hashCode7 + ((((hashCode6 + ((((hashCode5 + ((((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + ((((((((((((((((this.a + 31) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 28629151) + (this.h ? 1 : 0)) * 31) + this.e) * 31) + this.f) * 31) + (this.g ? 1 : 0)) * 31)) * 31)) * 31)) * 961)) * 961) + this.n) * 31)) * 31) + this.o) * 31)) * 31) + 29791) * 961)) * 961) + (this.t ? 1 : 0)) * 31)) * 31) + this.u) * 28629151)) * 31);
    }
}
