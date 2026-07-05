package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: j8e  reason: default package */
/* loaded from: classes.dex */
public final class j8e implements o8e {
    public final i6e a;

    public j8e(i6e i6eVar) {
        this.a = i6eVar;
    }

    @Override // defpackage.o8e
    public final boolean a(m7e m7eVar, m7e m7eVar2) {
        if (!m7eVar.zzb.equals(m7eVar2.zzb)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.o8e
    public final boolean b(Object obj) {
        a82.x(obj);
        throw null;
    }

    @Override // defpackage.o8e
    public final int c(m7e m7eVar) {
        return m7eVar.zzb.hashCode();
    }

    @Override // defpackage.o8e
    public final void d(Object obj) {
        x8e x8eVar = ((m7e) obj).zzb;
        if (x8eVar.e) {
            x8eVar.e = false;
        }
        a82.x(obj);
        throw null;
    }

    @Override // defpackage.o8e
    public final void e(Object obj, k57 k57Var) {
        a82.x(obj);
        throw null;
    }

    @Override // defpackage.o8e
    public final int f(m7e m7eVar) {
        x8e x8eVar = m7eVar.zzb;
        int i = x8eVar.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < x8eVar.a; i3++) {
            i2 += e7e.n(3, (s6e) x8eVar.c[i3]) + eub.y(x8eVar.b[i3] >>> 3, e7e.t(16), e7e.t(8) << 1);
        }
        x8eVar.d = i2;
        return i2;
    }

    @Override // defpackage.o8e
    public final void g(Object obj, byte[] bArr, int i, int i2, lzd lzdVar) {
        m7e m7eVar = (m7e) obj;
        if (m7eVar.zzb == x8e.f) {
            m7eVar.zzb = x8e.e();
        }
        throw s21.i(obj);
    }

    @Override // defpackage.o8e
    public final void h(Object obj, Object obj2) {
        oc2.J(obj, obj2);
    }

    @Override // defpackage.o8e
    public final void i(Object obj, vh1 vh1Var, g7e g7eVar) {
        j55.C(obj);
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.o8e
    public final m7e zza() {
        i6e i6eVar = this.a;
        if (i6eVar instanceof m7e) {
            return ((m7e) i6eVar).p();
        }
        l7e l7eVar = (l7e) ((m7e) i6eVar).d(5);
        boolean s = l7eVar.b.s();
        m7e m7eVar = l7eVar.b;
        if (!s) {
            return m7eVar;
        }
        m7eVar.q();
        return l7eVar.b;
    }
}
