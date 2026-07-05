package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ove  reason: default package */
/* loaded from: classes.dex */
public final class ove extends o0e {
    private static final ove zzk;
    private static volatile f2e zzl;
    private int zzb;
    private int zze;
    private f1e zzf = j2e.e;
    private String zzg = "";
    private String zzh = "";
    private boolean zzi;
    private double zzj;

    static {
        ove oveVar = new ove();
        zzk = oveVar;
        o0e.o(ove.class, oveVar);
    }

    public final double A() {
        return this.zzj;
    }

    public final int B() {
        int i;
        int i2 = this.zze;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        if (i2 != 4) {
                            i = 0;
                        } else {
                            i = 5;
                        }
                    }
                } else {
                    i = 3;
                }
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
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
                                f2e f2eVar2 = zzl;
                                if (f2eVar2 == null) {
                                    synchronized (ove.class) {
                                        try {
                                            f2eVar = zzl;
                                            if (f2eVar == null) {
                                                f2eVar = new n0e(zzk);
                                                zzl = f2eVar;
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
                        return zzk;
                    }
                    return new m0e(zzk);
                }
                return new ove();
            }
            return new k2e(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zzb", "zze", bzd.p, "zzf", ove.class, "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }

    public final List t() {
        return this.zzf;
    }

    public final String u() {
        return this.zzg;
    }

    public final boolean v() {
        if ((this.zzb & 4) != 0) {
            return true;
        }
        return false;
    }

    public final String w() {
        return this.zzh;
    }

    public final boolean x() {
        if ((this.zzb & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean y() {
        return this.zzi;
    }

    public final boolean z() {
        if ((this.zzb & 16) != 0) {
            return true;
        }
        return false;
    }
}
