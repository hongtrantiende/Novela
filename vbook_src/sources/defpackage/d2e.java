package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d2e  reason: default package */
/* loaded from: classes.dex */
public final class d2e implements m2e {
    public final hzd a;
    public final zj1 b;

    public d2e(zj1 zj1Var, hzd hzdVar) {
        h88 h88Var = i0e.a;
        this.b = zj1Var;
        this.a = hzdVar;
    }

    @Override // defpackage.m2e
    public final void a(Object obj, Object obj2) {
        n2e.b(obj, obj2);
    }

    @Override // defpackage.m2e
    public final int b(hzd hzdVar) {
        x2e x2eVar = ((o0e) hzdVar).zzc;
        int i = x2eVar.d;
        if (i == -1) {
            int i2 = 0;
            for (int i3 = 0; i3 < x2eVar.a; i3++) {
                int a = g0e.a(8);
                int a2 = g0e.a(x2eVar.b[i3] >>> 3) + g0e.a(16);
                int a3 = g0e.a(24);
                int b = ((szd) x2eVar.c[i3]).b();
                i2 += a + a + a2 + eub.g(b, b, a3);
            }
            x2eVar.d = i2;
            return i2;
        }
        return i;
    }

    @Override // defpackage.m2e
    public final void c(Object obj) {
        this.b.getClass();
        x2e x2eVar = ((o0e) obj).zzc;
        if (x2eVar.e) {
            x2eVar.e = false;
        }
        h88 h88Var = i0e.a;
        throw s21.i(obj);
    }

    @Override // defpackage.m2e
    public final int d(o0e o0eVar) {
        return o0eVar.zzc.hashCode();
    }

    @Override // defpackage.m2e
    public final void e(Object obj, byte[] bArr, int i, int i2, lzd lzdVar) {
        o0e o0eVar = (o0e) obj;
        if (o0eVar.zzc == x2e.f) {
            o0eVar.zzc = x2e.a();
        }
        throw s21.i(obj);
    }

    @Override // defpackage.m2e
    public final void f(Object obj, vh1 vh1Var, h0e h0eVar) {
        this.b.getClass();
        zj1.t(obj);
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.m2e
    public final boolean g(o0e o0eVar, o0e o0eVar2) {
        if (!o0eVar.zzc.equals(o0eVar2.zzc)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.m2e
    public final void h(Object obj, bp9 bp9Var) {
        throw s21.i(obj);
    }

    @Override // defpackage.m2e
    public final o0e zza() {
        hzd hzdVar = this.a;
        if (hzdVar instanceof o0e) {
            return ((o0e) hzdVar).i();
        }
        m0e m0eVar = (m0e) ((o0e) hzdVar).s(5);
        boolean g = m0eVar.b.g();
        o0e o0eVar = m0eVar.b;
        if (!g) {
            return o0eVar;
        }
        o0eVar.getClass();
        i2e.c.a(o0eVar.getClass()).c(o0eVar);
        o0eVar.h();
        return m0eVar.b;
    }

    @Override // defpackage.m2e
    public final boolean zzl(Object obj) {
        throw s21.i(obj);
    }
}
