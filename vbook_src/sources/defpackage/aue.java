package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: aue  reason: default package */
/* loaded from: classes.dex */
public final class aue extends o0e {
    private static final aue zzh;
    private static volatile f2e zzi;
    private e1e zzb;
    private e1e zze;
    private f1e zzf;
    private f1e zzg;

    static {
        aue aueVar = new aue();
        zzh = aueVar;
        o0e.o(aue.class, aueVar);
    }

    public aue() {
        o1e o1eVar = o1e.e;
        this.zzb = o1eVar;
        this.zze = o1eVar;
        j2e j2eVar = j2e.e;
        this.zzf = j2eVar;
        this.zzg = j2eVar;
    }

    public static xte B() {
        return (xte) zzh.j();
    }

    public static aue C() {
        return zzh;
    }

    public final int A() {
        return this.zzg.size();
    }

    public final void D(Iterable iterable) {
        e1e e1eVar = this.zzb;
        if (!((jzd) e1eVar).a) {
            o1e o1eVar = (o1e) e1eVar;
            int i = o1eVar.c;
            this.zzb = o1eVar.zzg(i + i);
        }
        hzd.d(iterable, this.zzb);
    }

    public final void E() {
        this.zzb = o1e.e;
    }

    public final void F(List list) {
        e1e e1eVar = this.zze;
        if (!((jzd) e1eVar).a) {
            o1e o1eVar = (o1e) e1eVar;
            int i = o1eVar.c;
            this.zze = o1eVar.zzg(i + i);
        }
        hzd.d(list, this.zze);
    }

    public final void G() {
        this.zze = o1e.e;
    }

    public final void H(ArrayList arrayList) {
        f1e f1eVar = this.zzf;
        if (!((jzd) f1eVar).a) {
            this.zzf = eub.r(f1eVar);
        }
        hzd.d(arrayList, this.zzf);
    }

    public final void I() {
        this.zzf = j2e.e;
    }

    public final void J(Iterable iterable) {
        f1e f1eVar = this.zzg;
        if (!((jzd) f1eVar).a) {
            this.zzg = eub.r(f1eVar);
        }
        hzd.d(iterable, this.zzg);
    }

    public final void K() {
        this.zzg = j2e.e;
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
                                f2e f2eVar2 = zzi;
                                if (f2eVar2 == null) {
                                    synchronized (aue.class) {
                                        try {
                                            f2eVar = zzi;
                                            if (f2eVar == null) {
                                                f2eVar = new n0e(zzh);
                                                zzi = f2eVar;
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
                        return zzh;
                    }
                    return new m0e(zzh);
                }
                return new aue();
            }
            return new k2e(zzh, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzb", "zze", "zzf", dse.class, "zzg", fue.class});
        }
        return (byte) 1;
    }

    public final List t() {
        return this.zzb;
    }

    public final int u() {
        return ((o1e) this.zzb).size();
    }

    public final List v() {
        return this.zze;
    }

    public final int w() {
        return ((o1e) this.zze).size();
    }

    public final f1e x() {
        return this.zzf;
    }

    public final int y() {
        return this.zzf.size();
    }

    public final f1e z() {
        return this.zzg;
    }
}
