package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ol6  reason: default package */
/* loaded from: classes.dex */
public final class ol6 {
    public final hm8 A;
    public final hm8 B;
    public ipb a;
    public final ek9 b;
    public final bsa c;
    public final s6f d;
    public wub e;
    public final hm8 f;
    public final hm8 g;
    public sc6 h;
    public final hm8 i;
    public ps j;
    public final hm8 k;
    public final hm8 l;
    public final hm8 m;
    public final hm8 n;
    public final hm8 o;
    public boolean p;
    public final hm8 q;
    public final p86 r;
    public final hm8 s;
    public final hm8 t;
    public xt4 u;
    public final h72 v;
    public final h72 w;
    public final h72 x;
    public final ljc y;
    public long z;

    /* JADX WARN: Type inference failed for: r8v1, types: [s6f, java.lang.Object] */
    public ol6(ipb ipbVar, ek9 ek9Var, bsa bsaVar) {
        this.a = ipbVar;
        this.b = ek9Var;
        this.c = bsaVar;
        ?? obj = new Object();
        ps psVar = qs.a;
        long j = fxb.b;
        jub jubVar = new jub(psVar, j, (fxb) null);
        obj.a = jubVar;
        obj.b = new lu0(psVar, jubVar.b);
        this.d = obj;
        Boolean bool = Boolean.FALSE;
        this.f = yae.z(bool);
        this.g = yae.z(new rg3(nae.e));
        this.i = yae.z(null);
        this.k = yae.z(l35.a);
        this.l = yae.z(bool);
        this.m = yae.z(bool);
        this.n = yae.z(bool);
        this.o = yae.z(bool);
        this.p = true;
        this.q = yae.z(Boolean.TRUE);
        this.r = new p86(bsaVar);
        this.s = yae.z(bool);
        this.t = yae.z(bool);
        this.u = new vb6(9);
        this.v = new h72(this, 1);
        this.w = new h72(this, 2);
        this.x = new h72(this, 3);
        this.y = lre.c();
        this.z = zl1.i;
        this.A = yae.z(new fxb(j));
        this.B = yae.z(new fxb(j));
    }

    public final l35 a() {
        return (l35) this.k.getValue();
    }

    public final boolean b() {
        return ((Boolean) this.f.getValue()).booleanValue();
    }

    public final sc6 c() {
        sc6 sc6Var = this.h;
        if (sc6Var != null && sc6Var.t()) {
            return sc6Var;
        }
        return null;
    }

    public final gvb d() {
        return (gvb) this.i.getValue();
    }

    public final void e(long j) {
        this.B.setValue(new fxb(j));
    }

    public final void f(long j) {
        this.A.setValue(new fxb(j));
    }
}
