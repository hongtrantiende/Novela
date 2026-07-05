package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oq2  reason: default package */
/* loaded from: classes.dex */
public final class oq2 implements sr {
    public final q60 a;
    public final drc b;
    public final Object c;
    public final js d;
    public final js e;
    public final js f;
    public final Object g;
    public final long h;

    public oq2(pq2 pq2Var, drc drcVar, Object obj, js jsVar) {
        q60 q60Var = new q60(pq2Var.a);
        ui4 ui4Var = (ui4) q60Var.b;
        this.a = q60Var;
        this.b = drcVar;
        this.c = obj;
        js jsVar2 = (js) drcVar.a.invoke(obj);
        this.d = jsVar2;
        this.e = bue.e(jsVar);
        xt4 xt4Var = drcVar.b;
        if (((js) q60Var.e) == null) {
            q60Var.e = jsVar2.c();
        }
        js jsVar3 = (js) q60Var.e;
        if (jsVar3 != null) {
            int b = jsVar3.b();
            int i = 0;
            while (true) {
                js jsVar4 = (js) q60Var.e;
                if (i < b) {
                    if (jsVar4 != null) {
                        jsVar4.e(i, ui4Var.t(jsVar2.a(i), jsVar.a(i)));
                        i++;
                    } else {
                        c16.w("targetVector");
                        throw null;
                    }
                } else if (jsVar4 != null) {
                    this.g = xt4Var.invoke(jsVar4);
                    if (((js) q60Var.d) == null) {
                        q60Var.d = jsVar2.c();
                    }
                    js jsVar5 = (js) q60Var.d;
                    if (jsVar5 != null) {
                        int b2 = jsVar5.b();
                        long j = 0;
                        for (int i2 = 0; i2 < b2; i2++) {
                            jsVar2.getClass();
                            j = Math.max(j, ui4Var.p(jsVar.a(i2)));
                        }
                        this.h = j;
                        js e = bue.e(this.a.a(j, this.d, jsVar));
                        this.f = e;
                        int b3 = e.b();
                        for (int i3 = 0; i3 < b3; i3++) {
                            js jsVar6 = this.f;
                            float a = jsVar6.a(i3);
                            float f = this.a.a;
                            jsVar6.e(i3, dce.m(a, -f, f));
                        }
                        return;
                    }
                    c16.w("velocityVector");
                    throw null;
                } else {
                    c16.w("targetVector");
                    throw null;
                }
            }
        } else {
            c16.w("targetVector");
            throw null;
        }
    }

    @Override // defpackage.sr
    public final boolean a() {
        return false;
    }

    @Override // defpackage.sr
    public final long b() {
        return this.h;
    }

    @Override // defpackage.sr
    public final drc c() {
        return this.b;
    }

    @Override // defpackage.sr
    public final js d(long j) {
        if (!e(j)) {
            return this.a.a(j, this.d, this.e);
        }
        return this.f;
    }

    @Override // defpackage.sr
    public final Object f(long j) {
        if (!e(j)) {
            xt4 xt4Var = this.b.b;
            q60 q60Var = this.a;
            js jsVar = (js) q60Var.c;
            js jsVar2 = this.d;
            if (jsVar == null) {
                q60Var.c = jsVar2.c();
            }
            js jsVar3 = (js) q60Var.c;
            if (jsVar3 != null) {
                int b = jsVar3.b();
                int i = 0;
                while (true) {
                    js jsVar4 = (js) q60Var.c;
                    if (i < b) {
                        if (jsVar4 != null) {
                            jsVar4.e(i, ((ui4) q60Var.b).h(jsVar2.a(i), this.e.a(i), j));
                            i++;
                        } else {
                            c16.w("valueVector");
                            throw null;
                        }
                    } else if (jsVar4 != null) {
                        return xt4Var.invoke(jsVar4);
                    } else {
                        c16.w("valueVector");
                        throw null;
                    }
                }
            } else {
                c16.w("valueVector");
                throw null;
            }
        } else {
            return this.g;
        }
    }

    @Override // defpackage.sr
    public final Object g() {
        return this.g;
    }
}
