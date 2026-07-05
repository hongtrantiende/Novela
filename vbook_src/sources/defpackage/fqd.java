package defpackage;

import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.Inflater;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fqd  reason: default package */
/* loaded from: classes.dex */
public final class fqd extends pe4 {
    public static final hn8 f;
    public final hn8 c;
    public final pe4 d;
    public final LinkedHashMap e;

    static {
        String str = hn8.b;
        f = fn8.d("/", false);
    }

    public fqd(hn8 hn8Var, pe4 pe4Var, LinkedHashMap linkedHashMap) {
        pe4Var.getClass();
        this.c = hn8Var;
        this.d = pe4Var;
        this.e = linkedHashMap;
    }

    @Override // defpackage.pe4
    public final yd4 I0(hn8 hn8Var) {
        Long valueOf;
        Integer num;
        boolean z;
        Long l;
        Integer num2;
        Long l2;
        Integer num3;
        Long l3;
        Long valueOf2;
        Throwable th;
        hn8Var.getClass();
        hn8 hn8Var2 = f;
        hn8Var2.getClass();
        vpd vpdVar = (vpd) this.e.get(e.b(hn8Var2, hn8Var, true));
        if (vpdVar == null) {
            return null;
        }
        long j = vpdVar.h;
        if (j != -1) {
            x56 N0 = this.d.N0(this.c);
            try {
                mj9 mj9Var = new mj9(N0.G(j));
                vpdVar = dye.q(mj9Var, vpdVar);
                vpdVar.getClass();
                try {
                    mj9Var.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                if (N0 != null) {
                    try {
                        N0.close();
                    } catch (Throwable th4) {
                        pye.e(th3, th4);
                    }
                }
                th = th3;
                vpdVar = null;
            }
            if (th == null) {
                try {
                    N0.close();
                    th = null;
                } catch (Throwable th5) {
                    th = th5;
                }
                if (th != null) {
                    throw th;
                }
            } else {
                throw th;
            }
        }
        boolean z2 = vpdVar.b;
        boolean z3 = !z2;
        if (z2) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(vpdVar.f);
        }
        Long l4 = vpdVar.m;
        if (l4 != null) {
            l = Long.valueOf((l4.longValue() / 10000) - 11644473600000L);
            z = true;
        } else {
            if (vpdVar.p != null) {
                z = true;
                l = Long.valueOf(num.intValue() * 1000);
            } else {
                z = true;
                l = null;
            }
        }
        Long l5 = vpdVar.k;
        if (l5 != null) {
            l2 = Long.valueOf((l5.longValue() / 10000) - 11644473600000L);
        } else {
            if (vpdVar.n != null) {
                l2 = Long.valueOf(num2.intValue() * 1000);
            } else {
                int i = vpdVar.j;
                if (i != -1) {
                    int i2 = vpdVar.i;
                    if (i != -1) {
                        int i3 = (i & 31) << 1;
                        GregorianCalendar gregorianCalendar = new GregorianCalendar();
                        gregorianCalendar.set(14, 0);
                        gregorianCalendar.set(((i2 >> 9) & Token.SWITCH) + 1980, ((i2 >> 5) & 15) - 1, i2 & 31, (i >> 11) & 31, (i >> 5) & 63, i3);
                        l2 = Long.valueOf(gregorianCalendar.getTime().getTime());
                    }
                }
                l2 = null;
            }
        }
        Long l6 = vpdVar.l;
        if (l6 != null) {
            valueOf2 = Long.valueOf((l6.longValue() / 10000) - 11644473600000L);
        } else {
            if (vpdVar.o != null) {
                valueOf2 = Long.valueOf(num3.intValue() * 1000);
            } else {
                l3 = null;
                return new yd4(z3, z2, null, valueOf, l, l2, l3);
            }
        }
        l3 = valueOf2;
        return new yd4(z3, z2, null, valueOf, l, l2, l3);
    }

    @Override // defpackage.pe4
    public final x56 N0(hn8 hn8Var) {
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // defpackage.pe4
    public final void Q(hn8 hn8Var) {
        hn8Var.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.pe4
    public final void V(hn8 hn8Var, boolean z) {
        hn8Var.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.pe4
    public final x56 V0(hn8 hn8Var) {
        hn8Var.getClass();
        throw new IOException("zip entries are not writable");
    }

    @Override // defpackage.pe4
    public final yma g1(hn8 hn8Var, boolean z) {
        hn8Var.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.pe4
    public final osa k1(hn8 hn8Var) {
        Throwable th;
        mj9 mj9Var;
        hn8Var.getClass();
        hn8 hn8Var2 = f;
        hn8Var2.getClass();
        vpd vpdVar = (vpd) this.e.get(e.b(hn8Var2, hn8Var, true));
        if (vpdVar != null) {
            long j = vpdVar.f;
            x56 N0 = this.d.N0(this.c);
            try {
                mj9Var = new mj9(N0.G(vpdVar.h));
                try {
                    N0.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                if (N0 != null) {
                    try {
                        N0.close();
                    } catch (Throwable th4) {
                        pye.e(th3, th4);
                    }
                }
                th = th3;
                mj9Var = null;
            }
            if (th == null) {
                mj9Var.getClass();
                dye.q(mj9Var, null);
                if (vpdVar.g == 0) {
                    return new nh4(mj9Var, j, true);
                }
                return new nh4(new bv5(new mj9(new nh4(mj9Var, vpdVar.e, true)), new Inflater(true)), j, false);
            }
            throw th;
        }
        fb4.h(hn8Var, "no such file: ");
        return null;
    }

    public final List l1(hn8 hn8Var, boolean z) {
        hn8 hn8Var2 = f;
        hn8Var2.getClass();
        hn8Var.getClass();
        vpd vpdVar = (vpd) this.e.get(e.b(hn8Var2, hn8Var, true));
        if (vpdVar == null) {
            if (!z) {
                return null;
            }
            hfd.i(hn8Var, "not a directory: ");
            return null;
        }
        return sl1.C0(vpdVar.q);
    }

    @Override // defpackage.pe4
    public final List m0(hn8 hn8Var) {
        hn8Var.getClass();
        List l1 = l1(hn8Var, true);
        l1.getClass();
        return l1;
    }

    @Override // defpackage.pe4
    public final yma o(hn8 hn8Var) {
        hn8Var.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.pe4
    public final List p0(hn8 hn8Var) {
        hn8Var.getClass();
        return l1(hn8Var, false);
    }

    @Override // defpackage.pe4
    public final void q(hn8 hn8Var, hn8 hn8Var2) {
        hn8Var.getClass();
        hn8Var2.getClass();
        throw new IOException("zip file systems are read-only");
    }
}
