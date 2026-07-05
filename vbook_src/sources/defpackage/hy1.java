package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hy1  reason: default package */
/* loaded from: classes3.dex */
public final class hy1 extends pf8 {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public hy1(rf8 rf8Var, s11 s11Var) {
        rf8Var.getClass();
        s11Var.getClass();
        this.b = s11Var;
        this.c = rf8Var.b();
        this.d = rf8Var.a();
        this.e = rf8Var.d();
        this.f = rf8Var.c();
    }

    @Override // defpackage.rf8
    public final Long a() {
        int i = this.a;
        Object obj = this.d;
        switch (i) {
            case 0:
                Long a = ((rf8) this.b).a();
                if (a != null) {
                    Long j = ((z12) obj).j(a.longValue());
                    if (j != null && j.longValue() >= 0) {
                        return j;
                    }
                }
                return null;
            default:
                return (Long) obj;
        }
    }

    @Override // defpackage.rf8
    public final e32 b() {
        switch (this.a) {
            case 0:
                return ((rf8) this.b).b();
            default:
                return (e32) this.c;
        }
    }

    @Override // defpackage.rf8
    public final n45 c() {
        switch (this.a) {
            case 0:
                return (n45) ((ye6) this.f).getValue();
            default:
                return (n45) this.f;
        }
    }

    @Override // defpackage.rf8
    public final ii5 d() {
        switch (this.a) {
            case 0:
                return ((rf8) this.b).d();
            default:
                return (ii5) this.e;
        }
    }

    @Override // defpackage.pf8
    public final s11 e() {
        switch (this.a) {
            case 0:
                return ((z12) this.d).p((s11) ((vt4) this.c).invoke(), (d82) this.e);
            default:
                return (s11) this.b;
        }
    }

    public hy1(rf8 rf8Var, vt4 vt4Var, z12 z12Var, d82 d82Var) {
        rf8Var.getClass();
        z12Var.getClass();
        d82Var.getClass();
        this.b = rf8Var;
        this.c = vt4Var;
        this.d = z12Var;
        this.e = d82Var;
        this.f = ipe.x(sk6.c, new ve(this, 27));
    }
}
