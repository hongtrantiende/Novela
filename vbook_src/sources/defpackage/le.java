package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: le */
/* loaded from: classes.dex */
public final class le {
    public Object a;
    public Object b;
    public float c = Float.NaN;
    public final /* synthetic */ qe d;

    public le(qe qeVar) {
        this.d = qeVar;
    }

    public static /* synthetic */ void b(le leVar, float f) {
        leVar.a(f, nae.e);
    }

    public final void a(float f, float f2) {
        boolean z;
        Object obj;
        float f3;
        qe qeVar = this.d;
        dm8 dm8Var = qeVar.f;
        float h = dm8Var.h();
        dm8Var.i(f);
        qeVar.g.i(f2);
        if (!Float.isNaN(h)) {
            if (f >= h) {
                z = true;
            } else {
                z = false;
            }
            jt2 b = qeVar.b();
            hm8 hm8Var = qeVar.c;
            if (dm8Var.h() == b.c(hm8Var.getValue())) {
                float h2 = dm8Var.h();
                if (z) {
                    f3 = 1.0f;
                } else {
                    f3 = -1.0f;
                }
                Object b2 = qeVar.b().b(h2 + f3, z);
                if (b2 == null) {
                    b2 = hm8Var.getValue();
                }
                if (z) {
                    this.a = hm8Var.getValue();
                    this.b = b2;
                } else {
                    this.a = b2;
                    this.b = hm8Var.getValue();
                }
            } else {
                Object b3 = qeVar.b().b(dm8Var.h(), false);
                if (b3 == null) {
                    b3 = hm8Var.getValue();
                }
                Object b4 = qeVar.b().b(dm8Var.h(), true);
                if (b4 == null) {
                    b4 = hm8Var.getValue();
                }
                this.a = b3;
                this.b = b4;
            }
            jt2 b5 = qeVar.b();
            Object obj2 = this.a;
            obj2.getClass();
            float c = b5.c(obj2);
            jt2 b6 = qeVar.b();
            Object obj3 = this.b;
            obj3.getClass();
            this.c = Math.abs(c - b6.c(obj3));
            if (Math.abs(dm8Var.h() - qeVar.b().c(hm8Var.getValue())) >= this.c / 2.0f) {
                if (z) {
                    obj = this.b;
                } else {
                    obj = this.a;
                }
                if (obj == null) {
                    obj = hm8Var.getValue();
                }
                qeVar.e(obj);
            }
        }
    }
}
