package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fle  reason: default package */
/* loaded from: classes.dex */
public final class fle extends o0e {
    private static final fle zzj;
    private static volatile f2e zzk;
    private int zzb;
    private int zze;
    private f1e zzf;
    private f1e zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        fle fleVar = new fle();
        zzj = fleVar;
        o0e.o(fle.class, fleVar);
    }

    public fle() {
        j2e j2eVar = j2e.e;
        this.zzf = j2eVar;
        this.zzg = j2eVar;
    }

    public final kle A(int i) {
        return (kle) this.zzg.get(i);
    }

    public final void B(int i, cme cmeVar) {
        f1e f1eVar = this.zzf;
        if (!((jzd) f1eVar).a) {
            this.zzf = eub.r(f1eVar);
        }
        this.zzf.set(i, cmeVar);
    }

    public final void C(int i, kle kleVar) {
        f1e f1eVar = this.zzg;
        if (!((jzd) f1eVar).a) {
            this.zzg = eub.r(f1eVar);
        }
        this.zzg.set(i, kleVar);
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
                                f2e f2eVar2 = zzk;
                                if (f2eVar2 == null) {
                                    synchronized (fle.class) {
                                        try {
                                            f2eVar = zzk;
                                            if (f2eVar == null) {
                                                f2eVar = new n0e(zzj);
                                                zzk = f2eVar;
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
                        return zzj;
                    }
                    return new m0e(zzj);
                }
                return new fle();
            }
            return new k2e(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzb", "zze", "zzf", cme.class, "zzg", kle.class, "zzh", "zzi"});
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
        return this.zzf.size();
    }

    public final cme x(int i) {
        return (cme) this.zzf.get(i);
    }

    public final f1e y() {
        return this.zzg;
    }

    public final int z() {
        return this.zzg.size();
    }
}
