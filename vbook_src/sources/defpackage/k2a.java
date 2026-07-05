package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k2a  reason: default package */
/* loaded from: classes.dex */
public final class k2a implements x2a {
    public static final yy9 k = new yy9(new zy9(23), new az9(17));
    public final em8 a;
    public float g;
    public final em8 b = new em8(0);
    public final em8 c = new em8(0);
    public final hm8 d = yae.z(Boolean.FALSE);
    public final yu7 e = new yu7();
    public final em8 f = new em8(Integer.MAX_VALUE);
    public final ww2 h = new ww2(new ux9(this, 3));
    public final h23 i = yae.q(new vt4(this) { // from class: j2a
        public final /* synthetic */ k2a b;

        {
            this.b = this;
        }

        @Override // defpackage.vt4
        public final Object invoke() {
            int i = r2;
            boolean z = false;
            k2a k2aVar = this.b;
            switch (i) {
                case 0:
                    if (k2aVar.a.h() < k2aVar.f.h()) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                default:
                    if (k2aVar.a.h() > 0) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
            }
        }
    });
    public final h23 j = yae.q(new vt4(this) { // from class: j2a
        public final /* synthetic */ k2a b;

        {
            this.b = this;
        }

        @Override // defpackage.vt4
        public final Object invoke() {
            int i = r2;
            boolean z = false;
            k2a k2aVar = this.b;
            switch (i) {
                case 0:
                    if (k2aVar.a.h() < k2aVar.f.h()) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                default:
                    if (k2aVar.a.h() > 0) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
            }
        }
    });

    public k2a(int i) {
        this.a = new em8(i);
    }

    @Override // defpackage.x2a
    public final boolean a() {
        return this.h.a();
    }

    @Override // defpackage.x2a
    public final boolean b() {
        return ((Boolean) this.j.getValue()).booleanValue();
    }

    @Override // defpackage.x2a
    public final boolean c() {
        return ((Boolean) this.i.getValue()).booleanValue();
    }

    @Override // defpackage.x2a
    public final float d(float f) {
        return this.h.d(f);
    }

    @Override // defpackage.x2a
    public final Object e(jw7 jw7Var, lu4 lu4Var, m42 m42Var) {
        Object e = this.h.e(jw7Var, lu4Var, m42Var);
        if (e == n82.a) {
            return e;
        }
        return pvc.a;
    }

    public final void f(int i) {
        xt4 xt4Var;
        em8 em8Var = this.a;
        this.f.i(i);
        zqa f = pae.f();
        if (f != null) {
            xt4Var = f.e();
        } else {
            xt4Var = null;
        }
        zqa h = pae.h(f);
        try {
            if (em8Var.h() > i) {
                em8Var.i(i);
            }
        } finally {
            pae.n(f, h, xt4Var);
        }
    }
}
