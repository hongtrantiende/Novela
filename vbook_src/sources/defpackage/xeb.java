package defpackage;

import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xeb  reason: default package */
/* loaded from: classes3.dex */
public final class xeb {
    public final boolean a;
    public final long b;
    public final ycb c;
    public final n05 d;
    public final xfd e;
    public final boolean f;
    public final boolean g;
    public final r24 h;
    public final Long i;
    public final boolean j;
    public final dt5 k;
    public final r24 l;
    public final boolean m;
    public final cs9 n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final boolean w;

    public xeb(boolean z, long j, ycb ycbVar, n05 n05Var, xfd xfdVar, boolean z2, boolean z3, r24 r24Var, Long l, boolean z4, dt5 dt5Var, r24 r24Var2, boolean z5, cs9 cs9Var, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        ycbVar.getClass();
        cs9Var.getClass();
        this.a = z;
        this.b = j;
        this.c = ycbVar;
        this.d = n05Var;
        this.e = xfdVar;
        this.f = z2;
        this.g = z3;
        this.h = r24Var;
        this.i = l;
        this.j = z4;
        this.k = dt5Var;
        this.l = r24Var2;
        this.m = z5;
        this.n = cs9Var;
        this.o = z6;
        this.p = z7;
        this.q = z8;
        this.r = z9;
        this.s = z10;
        this.t = z11;
        this.u = z12;
        this.v = z13;
        this.w = z14;
    }

    public static xeb a(xeb xebVar, boolean z, long j, ycb ycbVar, n05 n05Var, xfd xfdVar, boolean z2, boolean z3, r24 r24Var, Long l, boolean z4, dt5 dt5Var, r24 r24Var2, boolean z5, cs9 cs9Var, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, int i) {
        boolean z15 = (i & 1) != 0 ? xebVar.a : z;
        xebVar.getClass();
        long j2 = (i & 4) != 0 ? xebVar.b : j;
        ycb ycbVar2 = (i & 8) != 0 ? xebVar.c : ycbVar;
        n05 n05Var2 = (i & 16) != 0 ? xebVar.d : n05Var;
        xfd xfdVar2 = (i & 32) != 0 ? xebVar.e : xfdVar;
        boolean z16 = (i & 64) != 0 ? xebVar.f : z2;
        boolean z17 = (i & Token.CASE) != 0 ? xebVar.g : z3;
        r24 r24Var3 = (i & 256) != 0 ? xebVar.h : r24Var;
        Long l2 = (i & 512) != 0 ? xebVar.i : l;
        boolean z18 = (i & 1024) != 0 ? xebVar.j : z4;
        dt5 dt5Var2 = (i & 2048) != 0 ? xebVar.k : dt5Var;
        r24 r24Var4 = (i & 4096) != 0 ? xebVar.l : r24Var2;
        boolean z19 = (i & 8192) != 0 ? xebVar.m : z5;
        boolean z20 = z15;
        cs9 cs9Var2 = (i & 16384) != 0 ? xebVar.n : cs9Var;
        boolean z21 = (i & 32768) != 0 ? xebVar.o : z6;
        boolean z22 = (i & Parser.ARGC_LIMIT) != 0 ? xebVar.p : z7;
        boolean z23 = (i & 131072) != 0 ? xebVar.q : z8;
        boolean z24 = (i & 262144) != 0 ? xebVar.r : z9;
        boolean z25 = (i & 524288) != 0 ? xebVar.s : z10;
        boolean z26 = (i & 1048576) != 0 ? xebVar.t : z11;
        boolean z27 = (i & 2097152) != 0 ? xebVar.u : z12;
        boolean z28 = (i & 4194304) != 0 ? xebVar.v : z13;
        boolean z29 = (i & 8388608) != 0 ? xebVar.w : z14;
        xebVar.getClass();
        ycbVar2.getClass();
        cs9Var2.getClass();
        return new xeb(z20, j2, ycbVar2, n05Var2, xfdVar2, z16, z17, r24Var3, l2, z18, dt5Var2, r24Var4, z19, cs9Var2, z21, z22, z23, z24, z25, z26, z27, z28, z29);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof xeb) {
                xeb xebVar = (xeb) obj;
                if (this.a != xebVar.a || this.b != xebVar.b || this.c != xebVar.c || !c16.i(this.d, xebVar.d) || !c16.i(this.e, xebVar.e) || this.f != xebVar.f || this.g != xebVar.g || !c16.i(this.h, xebVar.h) || !c16.i(this.i, xebVar.i) || this.j != xebVar.j || !c16.i(this.k, xebVar.k) || !c16.i(this.l, xebVar.l) || this.m != xebVar.m || this.n != xebVar.n || this.o != xebVar.o || this.p != xebVar.p || this.q != xebVar.q || this.r != xebVar.r || this.s != xebVar.s || this.t != xebVar.t || this.u != xebVar.u || this.v != xebVar.v || this.w != xebVar.w) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = (this.c.hashCode() + hl5.c(hl5.c(Boolean.hashCode(this.a) * 31, 0L, 31), this.b, 31)) * 31;
        int i = 0;
        n05 n05Var = this.d;
        if (n05Var == null) {
            hashCode = 0;
        } else {
            hashCode = n05Var.hashCode();
        }
        int i2 = (hashCode6 + hashCode) * 31;
        xfd xfdVar = this.e;
        if (xfdVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = xfdVar.hashCode();
        }
        int k = eub.k(eub.k((i2 + hashCode2) * 31, 31, this.f), 31, this.g);
        r24 r24Var = this.h;
        if (r24Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = r24Var.hashCode();
        }
        int i3 = (k + hashCode3) * 31;
        Long l = this.i;
        if (l == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = l.hashCode();
        }
        int k2 = eub.k((i3 + hashCode4) * 31, 31, this.j);
        dt5 dt5Var = this.k;
        if (dt5Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = dt5Var.hashCode();
        }
        int i4 = (k2 + hashCode5) * 31;
        r24 r24Var2 = this.l;
        if (r24Var2 != null) {
            i = r24Var2.hashCode();
        }
        return Boolean.hashCode(this.w) + eub.k(eub.k(eub.k(eub.k(eub.k(eub.k(eub.k(eub.k((this.n.hashCode() + eub.k((i4 + i) * 31, 31, this.m)) * 31, 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, this.v);
    }

    public final String toString() {
        return "SyncState(isCheckingCloud=" + this.a + ", lastBackup=0, lastSyncAt=" + this.b + ", syncMethod=" + this.c + ", googleDriveInfo=" + this.d + ", webDavInfo=" + this.e + ", isSyncing=" + this.f + ", isRestoring=" + this.g + ", syncProgress=" + this.h + ", cloudBackupAt=" + this.i + ", isTestingWebDav=" + this.j + ", importProgress=" + this.k + ", exportProgress=" + this.l + ", isError=" + this.m + ", restoreMode=" + this.n + ", backupSetting=" + this.o + ", backupShelf=" + this.p + ", backupExtension=" + this.q + ", backupContent=" + this.r + ", backupAppData=" + this.s + ", restoreSetting=" + this.t + ", restoreShelf=" + this.u + ", restoreExtension=" + this.v + ", restoreAppData=" + this.w + ")";
    }
}
