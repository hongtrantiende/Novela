package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ple  reason: default package */
/* loaded from: classes.dex */
public final class ple extends o0e {
    private static final ple zzi;
    private static volatile f2e zzj;
    private int zzb;
    private jme zze;
    private yle zzf;
    private boolean zzg;
    private String zzh = "";

    static {
        ple pleVar = new ple();
        zzi = pleVar;
        o0e.o(ple.class, pleVar);
    }

    public static ple B() {
        return zzi;
    }

    public final String A() {
        return this.zzh;
    }

    public final /* synthetic */ void C(String str) {
        this.zzb |= 8;
        this.zzh = str;
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
                                    synchronized (ple.class) {
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
                return new ple();
            }
            return new k2e(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final boolean t() {
        if ((this.zzb & 1) != 0) {
            return true;
        }
        return false;
    }

    public final jme u() {
        jme jmeVar = this.zze;
        if (jmeVar == null) {
            return jme.A();
        }
        return jmeVar;
    }

    public final boolean v() {
        if ((this.zzb & 2) != 0) {
            return true;
        }
        return false;
    }

    public final yle w() {
        yle yleVar = this.zzf;
        if (yleVar == null) {
            return yle.C();
        }
        return yleVar;
    }

    public final boolean x() {
        if ((this.zzb & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean y() {
        return this.zzg;
    }

    public final boolean z() {
        if ((this.zzb & 8) != 0) {
            return true;
        }
        return false;
    }
}
