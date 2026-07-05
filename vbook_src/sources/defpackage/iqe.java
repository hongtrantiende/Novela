package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: iqe  reason: default package */
/* loaded from: classes.dex */
public final class iqe extends o0e {
    private static final iqe zzp;
    private static volatile f2e zzq;
    private int zzb;
    private String zze;
    private String zzf;
    private String zzg;
    private long zzh;
    private String zzi;
    private String zzj;
    private String zzk;
    private long zzl;
    private r1e zzm;
    private r1e zzn;
    private String zzo;

    static {
        iqe iqeVar = new iqe();
        zzp = iqeVar;
        o0e.o(iqe.class, iqeVar);
    }

    public iqe() {
        r1e r1eVar = r1e.b;
        this.zzm = r1eVar;
        this.zzn = r1eVar;
        this.zze = "";
        this.zzf = "";
        this.zzg = "";
        this.zzi = "";
        this.zzj = "";
        this.zzk = "";
        this.zzo = "";
    }

    public static wpe Y() {
        return (wpe) zzp.j();
    }

    public static iqe Z() {
        return zzp;
    }

    public final /* synthetic */ void A() {
        this.zzb &= -65;
        this.zzk = zzp.zzk;
    }

    public final /* synthetic */ void B(long j) {
        this.zzb |= Token.CASE;
        this.zzl = j;
    }

    public final r1e C() {
        r1e r1eVar = this.zzm;
        if (!r1eVar.a) {
            this.zzm = r1eVar.a();
        }
        return this.zzm;
    }

    public final r1e D() {
        r1e r1eVar = this.zzn;
        if (!r1eVar.a) {
            this.zzn = r1eVar.a();
        }
        return this.zzn;
    }

    public final /* synthetic */ void E(String str) {
        this.zzb |= 256;
        this.zzo = str;
    }

    public final /* synthetic */ void F() {
        this.zzb &= -257;
        this.zzo = zzp.zzo;
    }

    public final boolean G() {
        if ((this.zzb & 1) != 0) {
            return true;
        }
        return false;
    }

    public final String H() {
        return this.zze;
    }

    public final boolean I() {
        if ((this.zzb & 2) != 0) {
            return true;
        }
        return false;
    }

    public final String J() {
        return this.zzf;
    }

    public final boolean K() {
        if ((this.zzb & 4) != 0) {
            return true;
        }
        return false;
    }

    public final String L() {
        return this.zzg;
    }

    public final boolean M() {
        if ((this.zzb & 8) != 0) {
            return true;
        }
        return false;
    }

    public final long N() {
        return this.zzh;
    }

    public final boolean O() {
        if ((this.zzb & 16) != 0) {
            return true;
        }
        return false;
    }

    public final String P() {
        return this.zzi;
    }

    public final boolean Q() {
        if ((this.zzb & 32) != 0) {
            return true;
        }
        return false;
    }

    public final String R() {
        return this.zzj;
    }

    public final boolean S() {
        if ((this.zzb & 64) != 0) {
            return true;
        }
        return false;
    }

    public final String T() {
        return this.zzk;
    }

    public final boolean U() {
        if ((this.zzb & Token.CASE) != 0) {
            return true;
        }
        return false;
    }

    public final long V() {
        return this.zzl;
    }

    public final boolean W() {
        if ((this.zzb & 256) != 0) {
            return true;
        }
        return false;
    }

    public final String X() {
        return this.zzo;
    }

    public final /* synthetic */ void a0(String str) {
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void b0() {
        this.zzb &= -2;
        this.zze = zzp.zze;
    }

    public final /* synthetic */ void c0(String str) {
        this.zzb |= 2;
        this.zzf = str;
    }

    public final /* synthetic */ void d0() {
        this.zzb &= -3;
        this.zzf = zzp.zzf;
    }

    public final /* synthetic */ void e0(String str) {
        this.zzb |= 4;
        this.zzg = str;
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
                                f2e f2eVar2 = zzq;
                                if (f2eVar2 == null) {
                                    synchronized (iqe.class) {
                                        try {
                                            f2eVar = zzq;
                                            if (f2eVar == null) {
                                                f2eVar = new n0e(zzp);
                                                zzq = f2eVar;
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
                        return zzp;
                    }
                    return new m0e(zzp);
                }
                return new iqe();
            }
            return new k2e(zzp, "\u0004\u000b\u0000\u0001\u0001\u000b\u000b\u0002\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007\t2\n2\u000bဈ\b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", ype.a, "zzn", bqe.a, "zzo"});
        }
        return (byte) 1;
    }

    public final /* synthetic */ void t() {
        this.zzb &= -5;
        this.zzg = zzp.zzg;
    }

    public final /* synthetic */ void u(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }

    public final /* synthetic */ void v(String str) {
        this.zzb |= 16;
        this.zzi = str;
    }

    public final /* synthetic */ void w() {
        this.zzb &= -17;
        this.zzi = zzp.zzi;
    }

    public final /* synthetic */ void x(String str) {
        this.zzb |= 32;
        this.zzj = str;
    }

    public final /* synthetic */ void y() {
        this.zzb &= -33;
        this.zzj = zzp.zzj;
    }

    public final /* synthetic */ void z(String str) {
        this.zzb |= 64;
        this.zzk = str;
    }
}
