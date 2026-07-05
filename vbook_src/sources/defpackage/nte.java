package defpackage;

import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nte  reason: default package */
/* loaded from: classes.dex */
public final class nte extends o0e {
    private static final nte zzaw;
    private static volatile f2e zzax;
    private long zzA;
    private int zzB;
    private String zzC;
    private String zzD;
    private boolean zzE;
    private f1e zzF;
    private String zzG;
    private int zzH;
    private int zzI;
    private int zzJ;
    private String zzK;
    private long zzL;
    private long zzM;
    private String zzN;
    private String zzO;
    private int zzP;
    private String zzQ;
    private ute zzR;
    private z0e zzS;
    private long zzT;
    private long zzU;
    private String zzV;
    private String zzW;
    private int zzX;
    private boolean zzY;
    private String zzZ;
    private boolean zzaa;
    private zse zzab;
    private String zzac;
    private f1e zzad;
    private String zzae;
    private long zzaf;
    private boolean zzag;
    private String zzah;
    private boolean zzai;
    private String zzaj;
    private int zzak;
    private String zzal;
    private uqe zzam;
    private int zzan;
    private iqe zzao;
    private String zzap;
    private rue zzaq;
    private long zzar;
    private String zzas;
    private wre zzat;
    private String zzau;
    private f1e zzav;
    private int zzb;
    private int zze;
    private int zzf;
    private f1e zzg;
    private f1e zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private String zzn;
    private String zzo;
    private String zzp;
    private String zzq;
    private int zzr;
    private String zzs;
    private String zzt;
    private String zzu;
    private long zzv;
    private long zzw;
    private String zzx;
    private boolean zzy;
    private String zzz;

    static {
        nte nteVar = new nte();
        zzaw = nteVar;
        o0e.o(nte.class, nteVar);
    }

    public nte() {
        j2e j2eVar = j2e.e;
        this.zzg = j2eVar;
        this.zzh = j2eVar;
        this.zzn = "";
        this.zzo = "";
        this.zzp = "";
        this.zzq = "";
        this.zzs = "";
        this.zzt = "";
        this.zzu = "";
        this.zzx = "";
        this.zzz = "";
        this.zzC = "";
        this.zzD = "";
        this.zzF = j2eVar;
        this.zzG = "";
        this.zzK = "";
        this.zzN = "";
        this.zzO = "";
        this.zzQ = "";
        this.zzS = q0e.e;
        this.zzV = "";
        this.zzW = "";
        this.zzZ = "";
        this.zzac = "";
        this.zzad = j2eVar;
        this.zzae = "";
        this.zzah = "";
        this.zzaj = "";
        this.zzal = "";
        this.zzap = "";
        this.zzas = "";
        this.zzau = "";
        this.zzav = j2eVar;
    }

    public static jte Y() {
        return (jte) zzaw.j();
    }

    public static jte Z(nte nteVar) {
        m0e j = zzaw.j();
        j.e(nteVar);
        return (jte) j;
    }

    public final boolean A() {
        if ((this.zzb & 131072) != 0) {
            return true;
        }
        return false;
    }

    public final String A0() {
        return this.zzac;
    }

    public final /* synthetic */ void A1(long j) {
        this.zzb |= 16384;
        this.zzv = j;
    }

    public final boolean B() {
        return this.zzy;
    }

    public final boolean B0() {
        if ((this.zze & 32768) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void B1() {
        this.zzb |= 32768;
        this.zzw = 161000L;
    }

    public final String C() {
        return this.zzz;
    }

    public final long C0() {
        return this.zzaf;
    }

    public final /* synthetic */ void C1(String str) {
        str.getClass();
        this.zzb |= Parser.ARGC_LIMIT;
        this.zzx = str;
    }

    public final boolean D() {
        if ((this.zzb & 524288) != 0) {
            return true;
        }
        return false;
    }

    public final boolean D0() {
        return this.zzag;
    }

    public final /* synthetic */ void D1() {
        this.zzb &= -65537;
        this.zzx = zzaw.zzx;
    }

    public final long E() {
        return this.zzA;
    }

    public final boolean E0() {
        if ((this.zze & 131072) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void E1(boolean z) {
        this.zzb |= 131072;
        this.zzy = z;
    }

    public final boolean F() {
        if ((this.zzb & 1048576) != 0) {
            return true;
        }
        return false;
    }

    public final String F0() {
        return this.zzah;
    }

    public final /* synthetic */ void F1() {
        this.zzb &= -131073;
        this.zzy = false;
    }

    public final int G() {
        return this.zzB;
    }

    public final boolean G0() {
        if ((this.zze & 262144) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void G1(String str) {
        this.zzb |= 262144;
        this.zzz = str;
    }

    public final String H() {
        return this.zzC;
    }

    public final boolean H0() {
        return this.zzai;
    }

    public final /* synthetic */ void H1() {
        this.zzb &= -262145;
        this.zzz = zzaw.zzz;
    }

    public final String I() {
        return this.zzD;
    }

    public final boolean I0() {
        if ((this.zze & 524288) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void I1(long j) {
        this.zzb |= 524288;
        this.zzA = j;
    }

    public final boolean J() {
        if ((this.zzb & 8388608) != 0) {
            return true;
        }
        return false;
    }

    public final String J0() {
        return this.zzaj;
    }

    public final /* synthetic */ void J1(int i) {
        this.zzb |= 1048576;
        this.zzB = i;
    }

    public final boolean K() {
        return this.zzE;
    }

    public final int K0() {
        return this.zzak;
    }

    public final /* synthetic */ void K1(String str) {
        this.zzb |= 2097152;
        this.zzC = str;
    }

    public final f1e L() {
        return this.zzF;
    }

    public final boolean L0() {
        if ((this.zze & 4194304) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void L1() {
        this.zzb &= -2097153;
        this.zzC = zzaw.zzC;
    }

    public final String M() {
        return this.zzG;
    }

    public final uqe M0() {
        uqe uqeVar = this.zzam;
        if (uqeVar == null) {
            return uqe.B();
        }
        return uqeVar;
    }

    public final /* synthetic */ void M1(String str) {
        str.getClass();
        this.zzb |= 4194304;
        this.zzD = str;
    }

    public final boolean N() {
        if ((this.zzb & 33554432) != 0) {
            return true;
        }
        return false;
    }

    public final boolean N0() {
        if ((this.zze & 8388608) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void N1() {
        this.zzb |= 8388608;
        this.zzE = false;
    }

    public final int O() {
        return this.zzH;
    }

    public final int O0() {
        return this.zzan;
    }

    public final void O1(ArrayList arrayList) {
        f1e f1eVar = this.zzF;
        if (!((jzd) f1eVar).a) {
            this.zzF = eub.r(f1eVar);
        }
        hzd.d(arrayList, this.zzF);
    }

    public final boolean P() {
        if ((this.zzb & 536870912) != 0) {
            return true;
        }
        return false;
    }

    public final boolean P0() {
        if ((this.zze & 16777216) != 0) {
            return true;
        }
        return false;
    }

    public final void P1() {
        this.zzF = j2e.e;
    }

    public final long Q() {
        return this.zzL;
    }

    public final iqe Q0() {
        iqe iqeVar = this.zzao;
        if (iqeVar == null) {
            return iqe.Z();
        }
        return iqeVar;
    }

    public final /* synthetic */ void Q1(String str) {
        this.zzb |= 16777216;
        this.zzG = str;
    }

    public final boolean R() {
        if ((this.zzb & Integer.MIN_VALUE) != 0) {
            return true;
        }
        return false;
    }

    public final boolean R0() {
        if ((this.zze & 67108864) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void R1(int i) {
        this.zzb |= 33554432;
        this.zzH = i;
    }

    public final String S() {
        return this.zzN;
    }

    public final rue S0() {
        rue rueVar = this.zzaq;
        if (rueVar == null) {
            return rue.v();
        }
        return rueVar;
    }

    public final /* synthetic */ void S1() {
        this.zzb &= -268435457;
        this.zzK = zzaw.zzK;
    }

    public final boolean T() {
        if ((this.zzb & 1) != 0) {
            return true;
        }
        return false;
    }

    public final int T0() {
        return this.zzf;
    }

    public final List T1() {
        return this.zzg;
    }

    public final boolean U() {
        if ((this.zze & 134217728) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void U0(long j) {
        this.zzb |= 536870912;
        this.zzL = j;
    }

    public final void U1() {
        f1e f1eVar = this.zzg;
        if (!((jzd) f1eVar).a) {
            this.zzg = eub.r(f1eVar);
        }
    }

    public final long V() {
        return this.zzar;
    }

    public final /* synthetic */ void V0(String str) {
        str.getClass();
        this.zzb |= Integer.MIN_VALUE;
        this.zzN = str;
    }

    public final void V1() {
        f1e f1eVar = this.zzh;
        if (!((jzd) f1eVar).a) {
            this.zzh = eub.r(f1eVar);
        }
    }

    public final boolean W() {
        if ((this.zze & 536870912) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void W0() {
        this.zzb &= Integer.MAX_VALUE;
        this.zzN = zzaw.zzN;
    }

    public final void W1(List list) {
        f1e f1eVar = this.zzav;
        if (!((jzd) f1eVar).a) {
            this.zzav = eub.r(f1eVar);
        }
        hzd.d(list, this.zzav);
    }

    public final wre X() {
        wre wreVar = this.zzat;
        if (wreVar == null) {
            return wre.v();
        }
        return wreVar;
    }

    public final /* synthetic */ void X0(int i) {
        this.zze |= 2;
        this.zzP = i;
    }

    public final int X1() {
        return this.zzg.size();
    }

    public final void Y0(List list) {
        z0e z0eVar = this.zzS;
        if (!((jzd) z0eVar).a) {
            q0e q0eVar = (q0e) z0eVar;
            int i = q0eVar.c;
            this.zzS = q0eVar.zzg(i + i);
        }
        hzd.d(list, this.zzS);
    }

    public final jse Y1(int i) {
        return (jse) this.zzg.get(i);
    }

    public final /* synthetic */ void Z0(long j) {
        this.zze |= 16;
        this.zzT = j;
    }

    public final f1e Z1() {
        return this.zzh;
    }

    public final /* synthetic */ void a0() {
        this.zzb |= 1;
        this.zzf = 1;
    }

    public final /* synthetic */ void a1(long j) {
        this.zze |= 32;
        this.zzU = j;
    }

    public final int a2() {
        return this.zzh.size();
    }

    public final /* synthetic */ void b0(int i, jse jseVar) {
        U1();
        this.zzg.set(i, jseVar);
    }

    public final /* synthetic */ void b1(String str) {
        this.zze |= Token.CASE;
        this.zzW = str;
    }

    public final wue b2(int i) {
        return (wue) this.zzh.get(i);
    }

    public final /* synthetic */ void c0(jse jseVar) {
        U1();
        this.zzg.add(jseVar);
    }

    public final /* synthetic */ void c1(String str) {
        str.getClass();
        this.zze |= 8192;
        this.zzac = str;
    }

    public final boolean c2() {
        if ((this.zzb & 2) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void d0(Iterable iterable) {
        U1();
        hzd.d(iterable, this.zzg);
    }

    public final /* synthetic */ void d1() {
        this.zze &= -8193;
        this.zzac = zzaw.zzac;
    }

    public final long d2() {
        return this.zzi;
    }

    public final void e0() {
        this.zzg = j2e.e;
    }

    public final void e1(Set set) {
        f1e f1eVar = this.zzad;
        if (!((jzd) f1eVar).a) {
            this.zzad = eub.r(f1eVar);
        }
        hzd.d(set, this.zzad);
    }

    public final boolean e2() {
        if ((this.zzb & 4) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void f0(int i) {
        U1();
        this.zzg.remove(i);
    }

    public final /* synthetic */ void f1(String str) {
        str.getClass();
        this.zze |= 16384;
        this.zzae = str;
    }

    public final long f2() {
        return this.zzj;
    }

    public final /* synthetic */ void g0(int i, wue wueVar) {
        V1();
        this.zzh.set(i, wueVar);
    }

    public final /* synthetic */ void g1(long j) {
        this.zze |= 32768;
        this.zzaf = j;
    }

    public final boolean g2() {
        if ((this.zzb & 8) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void h0(wue wueVar) {
        V1();
        this.zzh.add(wueVar);
    }

    public final /* synthetic */ void h1(boolean z) {
        this.zze |= Parser.ARGC_LIMIT;
        this.zzag = z;
    }

    public final long h2() {
        return this.zzk;
    }

    public final /* synthetic */ void i0(int i) {
        V1();
        this.zzh.remove(i);
    }

    public final /* synthetic */ void i1(String str) {
        this.zze |= 131072;
        this.zzah = str;
    }

    public final boolean i2() {
        if ((this.zzb & 16) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void j0(long j) {
        this.zzb |= 2;
        this.zzi = j;
    }

    public final /* synthetic */ void j1(boolean z) {
        this.zze |= 262144;
        this.zzai = z;
    }

    public final long j2() {
        return this.zzl;
    }

    public final /* synthetic */ void k0() {
        this.zzb &= -3;
        this.zzi = 0L;
    }

    public final /* synthetic */ void k1(String str) {
        str.getClass();
        this.zze |= 524288;
        this.zzaj = str;
    }

    public final boolean k2() {
        if ((this.zzb & 32) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void l0(long j) {
        this.zzb |= 4;
        this.zzj = j;
    }

    public final /* synthetic */ void l1(int i) {
        this.zze |= 1048576;
        this.zzak = i;
    }

    public final long l2() {
        return this.zzm;
    }

    public final /* synthetic */ void m0(long j) {
        this.zzb |= 8;
        this.zzk = j;
    }

    public final /* synthetic */ void m1(uqe uqeVar) {
        this.zzam = uqeVar;
        this.zze |= 4194304;
    }

    public final String m2() {
        return this.zzn;
    }

    public final /* synthetic */ void n0(long j) {
        this.zzb |= 16;
        this.zzl = j;
    }

    public final /* synthetic */ void n1(int i) {
        this.zze |= 8388608;
        this.zzan = i;
    }

    public final String n2() {
        return this.zzo;
    }

    public final /* synthetic */ void o0() {
        this.zzb &= -17;
        this.zzl = 0L;
    }

    public final /* synthetic */ void o1(iqe iqeVar) {
        this.zzao = iqeVar;
        this.zze |= 16777216;
    }

    public final String o2() {
        return this.zzp;
    }

    public final /* synthetic */ void p0(long j) {
        this.zzb |= 32;
        this.zzm = j;
    }

    public final /* synthetic */ void p1(rue rueVar) {
        this.zzaq = rueVar;
        this.zze |= 67108864;
    }

    public final String p2() {
        return this.zzq;
    }

    public final /* synthetic */ void q0() {
        this.zzb &= -33;
        this.zzm = 0L;
    }

    public final /* synthetic */ void q1(long j) {
        this.zze |= 134217728;
        this.zzar = j;
    }

    public final boolean q2() {
        if ((this.zzb & 1024) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void r0() {
        this.zzb |= 64;
        this.zzn = "android";
    }

    public final /* synthetic */ void r1(wre wreVar) {
        this.zzat = wreVar;
        this.zze |= 536870912;
    }

    public final int r2() {
        return this.zzr;
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
                                f2e f2eVar2 = zzax;
                                if (f2eVar2 == null) {
                                    synchronized (nte.class) {
                                        try {
                                            f2eVar = zzax;
                                            if (f2eVar == null) {
                                                f2eVar = new n0e(zzaw);
                                                zzax = f2eVar;
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
                        return zzaw;
                    }
                    return new m0e(zzaw);
                }
                return new nte();
            }
            return new k2e(zzaw, "\u0004E\u0000\u0002\u0001YE\u0000\u0006\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5᠌(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.Cဂ/Dဇ0Gဈ1Hဇ2Iဈ3Jင4Kဈ5Lဉ6Mင7Oဉ8Pဈ9Qဉ:Rဂ;Sဈ<Vဉ=Xဈ>Y\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", jse.class, "zzh", wue.class, "zzi", "zzj", "zzk", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzl", "zzE", "zzF", are.class, "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", bzd.h, "zzY", "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag", "zzah", "zzai", "zzaj", "zzak", "zzal", "zzam", "zzan", "zzao", "zzap", "zzaq", "zzar", "zzas", "zzat", "zzau", "zzav", ale.class});
        }
        return (byte) 1;
    }

    public final /* synthetic */ void s0(String str) {
        str.getClass();
        this.zzb |= Token.CASE;
        this.zzo = str;
    }

    public final /* synthetic */ void s1(String str) {
        str.getClass();
        this.zze |= 1073741824;
        this.zzau = str;
    }

    public final String s2() {
        return this.zzs;
    }

    public final String t() {
        return this.zzt;
    }

    public final boolean t0() {
        if ((this.zze & 2) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void t1() {
        String str = Build.MODEL;
        str.getClass();
        this.zzb |= 256;
        this.zzp = str;
    }

    public final String u() {
        return this.zzu;
    }

    public final int u0() {
        return this.zzP;
    }

    public final /* synthetic */ void u1() {
        this.zzb &= -257;
        this.zzp = zzaw.zzp;
    }

    public final boolean v() {
        if ((this.zzb & 16384) != 0) {
            return true;
        }
        return false;
    }

    public final boolean v0() {
        if ((this.zze & 16) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void v1(String str) {
        str.getClass();
        this.zzb |= 512;
        this.zzq = str;
    }

    public final long w() {
        return this.zzv;
    }

    public final long w0() {
        return this.zzT;
    }

    public final /* synthetic */ void w1(int i) {
        this.zzb |= 1024;
        this.zzr = i;
    }

    public final boolean x() {
        if ((this.zzb & 32768) != 0) {
            return true;
        }
        return false;
    }

    public final boolean x0() {
        if ((this.zze & Token.CASE) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void x1(String str) {
        str.getClass();
        this.zzb |= 2048;
        this.zzs = str;
    }

    public final long y() {
        return this.zzw;
    }

    public final String y0() {
        return this.zzW;
    }

    public final /* synthetic */ void y1(String str) {
        str.getClass();
        this.zzb |= 4096;
        this.zzt = str;
    }

    public final String z() {
        return this.zzx;
    }

    public final boolean z0() {
        if ((this.zze & 8192) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void z1(String str) {
        str.getClass();
        this.zzb |= 8192;
        this.zzu = str;
    }
}
