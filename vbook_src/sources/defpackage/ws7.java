package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ws7  reason: default package */
/* loaded from: classes.dex */
public final class ws7 implements r94 {
    public long A;
    public t94 B;
    public vs7[] C;
    public long[][] D;
    public int E;
    public pr7 F;
    public final m8b a;
    public final int b;
    public final boolean c;
    public final km8 d;
    public final km8 e;
    public final km8 f;
    public final km8 g;
    public final ArrayDeque h;
    public final c5a i;
    public final ArrayList j;
    public mm9 k;
    public int l;
    public int m;
    public long n;
    public int o;
    public km8 p;
    public int q;
    public int r;
    public int s;
    public int t;
    public boolean u;
    public boolean v;
    public boolean w;
    public long x;
    public boolean y;
    public boolean z;

    public ws7(m8b m8bVar, int i) {
        boolean z;
        int i2;
        this.a = m8bVar;
        this.b = i;
        if ((i & 256) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.c = z;
        ms5 ms5Var = qs5.b;
        this.k = mm9.e;
        if ((i & 4) != 0) {
            i2 = 3;
        } else {
            i2 = 0;
        }
        this.l = i2;
        this.i = new c5a();
        this.j = new ArrayList();
        this.g = new km8(16);
        this.h = new ArrayDeque();
        this.d = new km8(dae.i);
        this.e = new km8(6);
        this.f = new km8();
        this.q = -1;
        this.B = t94.m;
        this.C = new vs7[0];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x065f, code lost:
        throw defpackage.xm8.c("Atom size less than header length (unsupported).");
     */
    /* JADX WARN: Removed duplicated region for block: B:275:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x058b  */
    /* JADX WARN: Type inference failed for: r4v2, types: [at7, java.lang.Object] */
    @Override // defpackage.r94
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(defpackage.s94 r40, defpackage.fr2 r41) {
        /*
            Method dump skipped, instructions count: 1970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ws7.b(s94, fr2):int");
    }

    @Override // defpackage.r94
    public final boolean c(s94 s94Var) {
        boolean z;
        mm9 mm9Var;
        if ((this.b & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        ura t = cwe.t(s94Var, false, z);
        if (t != null) {
            mm9Var = qs5.r(t);
        } else {
            ms5 ms5Var = qs5.b;
            mm9Var = mm9.e;
        }
        this.k = mm9Var;
        if (t == null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.r94
    public final void d(long j, long j2) {
        vs7[] vs7VarArr;
        this.h.clear();
        this.o = 0;
        this.q = -1;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = false;
        this.z = false;
        if (j == 0) {
            if (this.l != 3) {
                this.l = 0;
                this.o = 0;
                return;
            }
            c5a c5aVar = this.i;
            c5aVar.a.clear();
            c5aVar.b = 0;
            this.j.clear();
            return;
        }
        for (vs7 vs7Var : this.C) {
            gjc gjcVar = vs7Var.b;
            int a = gjcVar.a(j2);
            if (a == -1) {
                a = gjcVar.b(j2);
            }
            vs7Var.e = a;
            ooc oocVar = vs7Var.d;
            if (oocVar != null) {
                oocVar.b = false;
                oocVar.c = 0;
            }
        }
    }

    @Override // defpackage.r94
    public final List e() {
        return this.k;
    }

    @Override // defpackage.r94
    public final void f(t94 t94Var) {
        if ((this.b & 16) == 0) {
            t94Var = new o40(t94Var, this.a);
        }
        this.B = t94Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
        if (((defpackage.v27) r12).a.equals("auxiliary.tracks.interleaved") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a8, code lost:
        if (((defpackage.v27) r12).a.equals("auxiliary.tracks.map") != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0123, code lost:
        if (((defpackage.v27) r13).a.equals("auxiliary.tracks.offset") != false) goto L236;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0366  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(long r44) {
        /*
            Method dump skipped, instructions count: 1128
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ws7.g(long):void");
    }

    @Override // defpackage.r94
    public final void a() {
    }
}
