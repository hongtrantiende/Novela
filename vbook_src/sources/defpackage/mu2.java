package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mu2  reason: default package */
/* loaded from: classes3.dex */
public final class mu2 extends oh5 {
    public final d82 C;
    public final te5 D;
    public final Object E;
    public final /* synthetic */ int a = 1;
    public final ii5 b;
    public final zg5 c;
    public final jv4 d;
    public final jv4 e;
    public final n45 f;

    public mu2(te5 te5Var, rh5 rh5Var) {
        s11 s11Var;
        rh5Var.getClass();
        this.D = te5Var;
        this.C = rh5Var.f;
        this.b = rh5Var.a;
        this.c = rh5Var.d;
        this.d = rh5Var.b;
        this.e = rh5Var.g;
        Object obj = rh5Var.e;
        if (obj instanceof s11) {
            s11Var = (s11) obj;
        } else {
            s11Var = null;
        }
        if (s11Var == null) {
            s11.a.getClass();
            s11Var = r11.b;
        }
        this.E = s11Var;
        this.f = rh5Var.c;
    }

    @Override // defpackage.og5
    public final n45 a() {
        switch (this.a) {
            case 0:
                return this.f;
            default:
                return this.f;
        }
    }

    @Override // defpackage.oh5
    public final s11 b() {
        int i = this.a;
        Object obj = this.E;
        switch (i) {
            case 0:
                return (s11) obj;
            default:
                return ctd.d((byte[]) obj);
        }
    }

    @Override // defpackage.oh5
    public final jv4 c() {
        switch (this.a) {
            case 0:
                return this.d;
            default:
                return this.d;
        }
    }

    @Override // defpackage.oh5
    public final jv4 d() {
        switch (this.a) {
            case 0:
                return this.e;
            default:
                return this.e;
        }
    }

    @Override // defpackage.oh5
    public final ii5 e() {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return this.b;
        }
    }

    @Override // defpackage.oh5
    public final zg5 f() {
        switch (this.a) {
            case 0:
                return this.c;
            default:
                return this.c;
        }
    }

    @Override // defpackage.m82
    public final d82 q() {
        switch (this.a) {
            case 0:
                return this.C;
            default:
                return this.C;
        }
    }

    @Override // defpackage.oh5
    public final te5 y0() {
        int i = this.a;
        te5 te5Var = this.D;
        switch (i) {
            case 0:
                return te5Var;
            default:
                return (dy9) te5Var;
        }
    }

    public mu2(dy9 dy9Var, byte[] bArr, oh5 oh5Var) {
        this.D = dy9Var;
        this.E = bArr;
        this.b = oh5Var.e();
        this.c = oh5Var.f();
        this.d = oh5Var.c();
        this.e = oh5Var.d();
        this.f = oh5Var.a();
        this.C = oh5Var.q();
    }
}
