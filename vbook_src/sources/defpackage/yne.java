package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yne  reason: default package */
/* loaded from: classes.dex */
public final class yne extends o0e {
    private static final yne zzj;
    private static volatile f2e zzk;
    private int zzb;
    private f1e zze;
    private f1e zzf;
    private f1e zzg;
    private boolean zzh;
    private f1e zzi;

    static {
        yne yneVar = new yne();
        zzj = yneVar;
        o0e.o(yne.class, yneVar);
    }

    public yne() {
        j2e j2eVar = j2e.e;
        this.zze = j2eVar;
        this.zzf = j2eVar;
        this.zzg = j2eVar;
        this.zzi = j2eVar;
    }

    public static yne z() {
        return zzj;
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
                                    synchronized (yne.class) {
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
                return new yne();
            }
            return new k2e(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zzb", "zze", qme.class, "zzf", sme.class, "zzg", nne.class, "zzh", "zzi", qme.class});
        }
        return (byte) 1;
    }

    public final List t() {
        return this.zze;
    }

    public final List u() {
        return this.zzf;
    }

    public final List v() {
        return this.zzg;
    }

    public final boolean w() {
        if ((this.zzb & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean x() {
        return this.zzh;
    }

    public final f1e y() {
        return this.zzi;
    }
}
