package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: soe  reason: default package */
/* loaded from: classes.dex */
public final class soe extends o0e {
    private static final soe zzw;
    private static volatile f2e zzx;
    private int zzb;
    private long zze;
    private String zzf = "";
    private int zzg;
    private f1e zzh;
    private f1e zzi;
    private f1e zzj;
    private String zzk;
    private boolean zzl;
    private f1e zzm;
    private f1e zzn;
    private String zzo;
    private String zzp;
    private yne zzq;
    private cpe zzr;
    private rpe zzs;
    private hpe zzt;
    private woe zzu;
    private z0e zzv;

    static {
        soe soeVar = new soe();
        zzw = soeVar;
        o0e.o(soe.class, soeVar);
    }

    public soe() {
        j2e j2eVar = j2e.e;
        this.zzh = j2eVar;
        this.zzi = j2eVar;
        this.zzj = j2eVar;
        this.zzk = "";
        this.zzm = j2eVar;
        this.zzn = j2eVar;
        this.zzo = "";
        this.zzp = "";
        this.zzv = q0e.e;
    }

    public static ooe K() {
        return (ooe) zzw.j();
    }

    public static soe L() {
        return zzw;
    }

    public final List A() {
        return this.zzj;
    }

    public final f1e B() {
        return this.zzm;
    }

    public final int C() {
        return this.zzm.size();
    }

    public final f1e D() {
        return this.zzn;
    }

    public final String E() {
        return this.zzo;
    }

    public final boolean F() {
        if ((this.zzb & Token.CASE) != 0) {
            return true;
        }
        return false;
    }

    public final yne G() {
        yne yneVar = this.zzq;
        if (yneVar == null) {
            return yne.z();
        }
        return yneVar;
    }

    public final boolean H() {
        if ((this.zzb & 512) != 0) {
            return true;
        }
        return false;
    }

    public final rpe I() {
        rpe rpeVar = this.zzs;
        if (rpeVar == null) {
            return rpe.v();
        }
        return rpeVar;
    }

    public final z0e J() {
        return this.zzv;
    }

    public final void M(int i, loe loeVar) {
        f1e f1eVar = this.zzi;
        if (!((jzd) f1eVar).a) {
            this.zzi = eub.r(f1eVar);
        }
        this.zzi.set(i, loeVar);
    }

    public final void N() {
        this.zzj = j2e.e;
    }

    public final void O() {
        this.zzm = j2e.e;
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
                                f2e f2eVar2 = zzx;
                                if (f2eVar2 == null) {
                                    synchronized (soe.class) {
                                        try {
                                            f2eVar = zzx;
                                            if (f2eVar == null) {
                                                f2eVar = new n0e(zzw);
                                                zzx = f2eVar;
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
                        return zzw;
                    }
                    return new m0e(zzw);
                }
                return new soe();
            }
            return new k2e(zzw, "\u0004\u0012\u0000\u0001\u0001\u0014\u0012\u0000\u0006\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b\u0014+", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", mpe.class, "zzi", loe.class, "zzj", fle.class, "zzk", "zzl", "zzm", jve.class, "zzn", eoe.class, "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv"});
        }
        return (byte) 1;
    }

    public final boolean t() {
        if ((this.zzb & 1) != 0) {
            return true;
        }
        return false;
    }

    public final long u() {
        return this.zze;
    }

    public final boolean v() {
        if ((this.zzb & 2) != 0) {
            return true;
        }
        return false;
    }

    public final String w() {
        return this.zzf;
    }

    public final f1e x() {
        return this.zzh;
    }

    public final int y() {
        return this.zzi.size();
    }

    public final loe z(int i) {
        return (loe) this.zzi.get(i);
    }
}
