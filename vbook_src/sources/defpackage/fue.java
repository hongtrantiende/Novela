package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fue  reason: default package */
/* loaded from: classes.dex */
public final class fue extends o0e {
    private static final fue zzg;
    private static volatile f2e zzh;
    private int zzb;
    private int zze;
    private e1e zzf = o1e.e;

    static {
        fue fueVar = new fue();
        zzg = fueVar;
        o0e.o(fue.class, fueVar);
    }

    public static due y() {
        return (due) zzg.j();
    }

    public final void A(List list) {
        e1e e1eVar = this.zzf;
        if (!((jzd) e1eVar).a) {
            o1e o1eVar = (o1e) e1eVar;
            int i = o1eVar.c;
            this.zzf = o1eVar.zzg(i + i);
        }
        hzd.d(list, this.zzf);
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
                                f2e f2eVar2 = zzh;
                                if (f2eVar2 == null) {
                                    synchronized (fue.class) {
                                        try {
                                            f2eVar = zzh;
                                            if (f2eVar == null) {
                                                f2eVar = new n0e(zzg);
                                                zzh = f2eVar;
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
                        return zzg;
                    }
                    return new m0e(zzg);
                }
                return new fue();
            }
            return new k2e(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzb", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final boolean t() {
        if ((this.zzb & 1) != 0) {
            return true;
        }
        return false;
    }

    public final int u() {
        return this.zze;
    }

    public final List v() {
        return this.zzf;
    }

    public final int w() {
        return ((o1e) this.zzf).size();
    }

    public final long x(int i) {
        return ((o1e) this.zzf).b(i);
    }

    public final /* synthetic */ void z(int i) {
        this.zzb |= 1;
        this.zze = i;
    }
}
