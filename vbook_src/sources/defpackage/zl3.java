package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zl3  reason: default package */
/* loaded from: classes3.dex */
public final class zl3 implements s76 {
    public static final zl3 a = new Object();
    public static final y59 b = new y59("kotlin.time.Duration", w59.n);

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        long j;
        int i;
        int i2;
        boolean z;
        boolean z2;
        long j2 = ((wl3) obj).a;
        hq7 hq7Var = wl3.b;
        StringBuilder sb = new StringBuilder();
        int i3 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i3 < 0) {
            sb.append('-');
        }
        sb.append("PT");
        if (i3 < 0) {
            j = wl3.k(j2);
        } else {
            j = j2;
        }
        long i4 = wl3.i(j, am3.HOURS);
        boolean z3 = false;
        if (wl3.g(j)) {
            i = 0;
        } else {
            i = (int) (wl3.i(j, am3.MINUTES) % 60);
        }
        if (wl3.g(j)) {
            i2 = 0;
        } else {
            i2 = (int) (wl3.i(j, am3.SECONDS) % 60);
        }
        int f = wl3.f(j);
        if (wl3.g(j2)) {
            i4 = 9999999999999L;
        }
        if (i4 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (i2 == 0 && f == 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (i != 0 || (z2 && z)) {
            z3 = true;
        }
        if (z) {
            sb.append(i4);
            sb.append('H');
        }
        if (z3) {
            sb.append(i);
            sb.append('M');
        }
        if (z2 || (!z && !z3)) {
            wl3.b(sb, i2, f, 9, "S", true);
        }
        jbeVar.I(sb.toString());
    }

    @Override // defpackage.s76
    public final Object c(yq2 yq2Var) {
        hq7 hq7Var = wl3.b;
        String s = yq2Var.s();
        s.getClass();
        try {
            long L = jue.L(s);
            if (!wl3.d(L, wl3.e)) {
                return new wl3(L);
            }
            throw new IllegalStateException("invariant failed");
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(hl5.n("Invalid ISO duration string format: '", s, "'."), e);
        }
    }

    @Override // defpackage.s76
    public final o9a e() {
        return b;
    }
}
