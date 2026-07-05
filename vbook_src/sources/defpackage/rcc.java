package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rcc  reason: default package */
/* loaded from: classes.dex */
public final class rcc {
    public static final char[] u;
    public static final int[] v;
    public final vc1 a;
    public final iv7 b;
    public dcc d;
    public boolean e;
    public final rc3 g;
    public final ybc h;
    public final xbc i;
    public zbc j;
    public final tbc k;
    public final vbc l;
    public final ubc m;
    public final bcc n;
    public String o;
    public String p;
    public int q;
    public int r;
    public final int[] s;
    public final int[] t;
    public ifc c = ifc.d;
    public final s26 f = new s26(28, false);

    static {
        char[] copyOf = Arrays.copyOf(new char[]{'\t', '\n', '\r', '\f', ' ', '<', '&'}, 7);
        if (copyOf.length > 1) {
            Arrays.sort(copyOf);
        }
        u = copyOf;
        v = new int[]{8364, Token.DEFAULT, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, Token.EMPTY, 381, Token.BLOCK, Token.LABEL, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, Token.DOTDOT, 382, 376};
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [bcc, zbc] */
    /* JADX WARN: Type inference failed for: r0v9, types: [zbc, ybc] */
    /* JADX WARN: Type inference failed for: r1v2, types: [xbc, zbc] */
    public rcc(unc uncVar) {
        rc3 rc3Var;
        this.a = uncVar.l();
        this.b = (iv7) uncVar.k().d;
        if (uncVar instanceof cpd) {
            rc3Var = rc3.b;
        } else {
            rc3Var = rc3.a;
        }
        this.g = rc3Var;
        ?? zbcVar = new zbc(acc.b, uncVar);
        this.h = zbcVar;
        this.i = new zbc(acc.c, uncVar);
        this.j = zbcVar;
        this.k = new tbc();
        this.l = new vbc();
        this.m = new ubc();
        ?? zbcVar2 = new zbc(acc.f, uncVar);
        zbcVar2.k = true;
        this.n = zbcVar2;
        this.s = new int[1];
        this.t = new int[2];
    }

    public final void a(ifc ifcVar) {
        ifcVar.getClass();
        p(ifcVar);
        this.a.o();
    }

    public final void b(String str) {
        iv7 iv7Var = this.b;
        if (iv7Var.b()) {
            ((ArrayList) iv7Var.b).add(new nm8(this.a, "Invalid character reference: ".concat(str)));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
        if (r6 >= 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r12.charValue() == r0.V()) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01e0, code lost:
        if (r0.I0('=', '-', '_') == false) goto L100;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int[] c(java.lang.Character r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rcc.c(java.lang.Character, boolean):int[]");
    }

    public final void d() {
        this.l.f();
    }

    public final zbc e(boolean z) {
        zbc zbcVar;
        if (z) {
            zbcVar = this.h;
            zbcVar.f();
        } else {
            zbcVar = this.i;
            zbcVar.f();
        }
        this.j = zbcVar;
        return zbcVar;
    }

    public final void f() {
        this.f.O();
    }

    public final void g(char c) {
        tbc tbcVar = this.k;
        tbcVar.d.j(c);
        tbcVar.a = this.r;
        tbcVar.b = this.a.g1();
    }

    public final void h(dcc dccVar) {
        dccVar.getClass();
        if (!this.e) {
            this.d = dccVar;
            this.e = true;
            dccVar.a = this.q;
            vc1 vc1Var = this.a;
            dccVar.b = vc1Var.g1();
            this.r = vc1Var.g1();
            int ordinal = ((acc) dccVar.c).ordinal();
            if (ordinal != 1) {
                if (ordinal == 2) {
                    xbc xbcVar = (xbc) dccVar;
                    if (xbcVar.g != null) {
                        String n = hl5.n("Attributes incorrectly present on end tag [/", xbcVar.W(), "]");
                        iv7 iv7Var = this.b;
                        if (iv7Var.b()) {
                            ((ArrayList) iv7Var.b).add(new nm8(vc1Var, n));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            this.o = ((ybc) dccVar).d.V();
            this.p = null;
            return;
        }
        cy7.i("Must be false");
    }

    public final void i(String str) {
        tbc tbcVar = this.k;
        tbcVar.getClass();
        tbcVar.d.k(str);
        tbcVar.a = this.r;
        tbcVar.b = this.a.g1();
    }

    public final void j() {
        h(this.m);
    }

    public final void k() {
        h(this.l);
    }

    public final void l() {
        zbc zbcVar = this.j;
        if (zbcVar.h.A()) {
            zbcVar.U();
        }
        h(this.j);
    }

    public final void m(ifc ifcVar) {
        iv7 iv7Var = this.b;
        if (iv7Var.b()) {
            iv7Var.a(new nm8(this.a, "Unexpectedly reached end of file (EOF) in input state [" + ifcVar + "]"));
        }
    }

    public final void n(ifc ifcVar) {
        iv7 iv7Var = this.b;
        if (iv7Var.b()) {
            vc1 vc1Var = this.a;
            char V = vc1Var.V();
            iv7Var.a(new nm8(vc1Var, "Unexpected character '" + V + "' in input state [" + ifcVar + "]"));
        }
    }

    public final boolean o() {
        if (this.o != null && this.j.d.V().equalsIgnoreCase(this.o)) {
            return true;
        }
        return false;
    }

    public final void p(ifc ifcVar) {
        ifcVar.getClass();
        if (ifcVar == ifc.G) {
            this.q = this.a.g1();
        }
        this.c = ifcVar;
    }
}
