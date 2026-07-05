package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hte  reason: default package */
/* loaded from: classes.dex */
public final class hte extends o0e {
    private static final hte zzi;
    private static volatile f2e zzj;
    private int zzb;
    private f1e zze = j2e.e;
    private String zzf = "";
    private String zzg = "";
    private int zzh;

    static {
        hte hteVar = new hte();
        zzi = hteVar;
        o0e.o(hte.class, hteVar);
    }

    public static dte A() {
        return (dte) zzi.j();
    }

    public static dte B(hte hteVar) {
        m0e j = zzi.j();
        j.e(hteVar);
        return (dte) j;
    }

    public final /* synthetic */ void C(int i, nte nteVar) {
        I();
        this.zze.set(i, nteVar);
    }

    public final /* synthetic */ void D(nte nteVar) {
        I();
        this.zze.add(nteVar);
    }

    public final /* synthetic */ void E(ArrayList arrayList) {
        I();
        hzd.d(arrayList, this.zze);
    }

    public final void F() {
        this.zze = j2e.e;
    }

    public final /* synthetic */ void G(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzf = str;
    }

    public final /* synthetic */ void H(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzg = str;
    }

    public final void I() {
        f1e f1eVar = this.zze;
        if (!((jzd) f1eVar).a) {
            this.zze = eub.r(f1eVar);
        }
    }

    @Override // defpackage.o0e
    public final Object s(int i) {
        f2e f2eVar;
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (i2 == 6) {
                                f2e f2eVar2 = zzj;
                                if (f2eVar2 == null) {
                                    synchronized (hte.class) {
                                        try {
                                            f2eVar = zzj;
                                            if (f2eVar == null) {
                                                f2eVar = new n0e(zzi);
                                                zzj = f2eVar;
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                    return f2eVar;
                                }
                                return f2eVar2;
                            }
                            throw null;
                        }
                        return zzi;
                    }
                    return new m0e(zzi);
                }
                return new hte();
            }
            return new k2e(zzi, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzb", "zze", nte.class, "zzf", "zzg", "zzh", bzd.k});
        }
        return (byte) 1;
    }

    public final List t() {
        return this.zze;
    }

    public final int u() {
        return this.zze.size();
    }

    public final nte v(int i) {
        return (nte) this.zze.get(i);
    }

    public final boolean w() {
        if ((this.zzb & 1) != 0) {
            return true;
        }
        return false;
    }

    public final String x() {
        return this.zzf;
    }

    public final boolean y() {
        if ((this.zzb & 2) != 0) {
            return true;
        }
        return false;
    }

    public final String z() {
        return this.zzg;
    }
}
