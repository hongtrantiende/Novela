package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xkb  reason: default package */
/* loaded from: classes.dex */
public final class xkb implements sr {
    public final o4d a;
    public final drc b;
    public Object c;
    public Object d;
    public js e;
    public js f;
    public final js g;
    public long h;
    public js i;

    public xkb(xr xrVar, drc drcVar, Object obj, Object obj2, js jsVar) {
        js c;
        this.a = xrVar.a(drcVar);
        this.b = drcVar;
        this.c = obj2;
        this.d = obj;
        this.e = (js) drcVar.a.invoke(obj);
        xt4 xt4Var = drcVar.a;
        this.f = (js) xt4Var.invoke(obj2);
        if (jsVar != null) {
            c = bue.e(jsVar);
        } else {
            c = ((js) xt4Var.invoke(obj)).c();
        }
        this.g = c;
        this.h = -1L;
    }

    @Override // defpackage.sr
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.sr
    public final long b() {
        if (this.h < 0) {
            this.h = this.a.h(this.e, this.f, this.g);
        }
        return this.h;
    }

    @Override // defpackage.sr
    public final drc c() {
        return this.b;
    }

    @Override // defpackage.sr
    public final js d(long j) {
        if (!e(j)) {
            return this.a.l(j, this.e, this.f, this.g);
        }
        js jsVar = this.i;
        if (jsVar == null) {
            js v = this.a.v(this.e, this.f, this.g);
            this.i = v;
            return v;
        }
        return jsVar;
    }

    @Override // defpackage.sr
    public final Object f(long j) {
        if (!e(j)) {
            js u = this.a.u(j, this.e, this.f, this.g);
            int b = u.b();
            for (int i = 0; i < b; i++) {
                if (Float.isNaN(u.a(i))) {
                    g39.b("AnimationVector cannot contain a NaN. " + u + ". Animation: " + this + ", playTimeNanos: " + j);
                }
            }
            return this.b.b.invoke(u);
        }
        return this.c;
    }

    @Override // defpackage.sr
    public final Object g() {
        return this.c;
    }

    public final void h(Object obj) {
        if (!c16.i(obj, this.d)) {
            this.d = obj;
            this.e = (js) this.b.a.invoke(obj);
            this.i = null;
            this.h = -1L;
        }
    }

    public final void i(Object obj) {
        if (!c16.i(this.c, obj)) {
            this.c = obj;
            this.f = (js) this.b.a.invoke(obj);
            this.i = null;
            this.h = -1L;
        }
    }

    public final String toString() {
        Object obj = this.d;
        Object obj2 = this.c;
        return "TargetBasedAnimation: " + obj + " -> " + obj2 + ",initial velocity: " + this.g + ", duration: " + (b() / 1000000) + " ms,animationSpec: " + this.a;
    }
}
