package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ss8  reason: default package */
/* loaded from: classes3.dex */
public final class ss8 extends fdd {
    public final klc C;
    public final bm5 D;
    public final pi9 E;
    public final wpc F;
    public final npc G;
    public final fyb H;
    public final fnb I;
    public final qvb J;
    public final ih8 K;
    public final rj9 L;
    public vl6 M;
    public long N;
    public final mfb O = new mfb(new fs8(this, 0));
    public final cza P = dza.a(new mr8(true, false, "", false, "", 1.0f, 0, 0.0d));
    public final cza Q;
    public final cza R;
    public final cza S;
    public final cza T;
    public final cza U;
    public final cza V;
    public final eb1 W;
    public final cza X;
    public final cza Y;
    public w26 Z;
    public final cza a0;
    public final cza b0;
    public final String c;
    public final wl6 d;
    public final wo5 e;
    public final xs5 f;

    public ss8(String str, wl6 wl6Var, wo5 wo5Var, xs5 xs5Var, klc klcVar, bm5 bm5Var, pi9 pi9Var, wpc wpcVar, npc npcVar, fyb fybVar, ko5 ko5Var, fnb fnbVar, qvb qvbVar, ih8 ih8Var) {
        this.c = str;
        this.d = wl6Var;
        this.e = wo5Var;
        this.f = xs5Var;
        this.C = klcVar;
        this.D = bm5Var;
        this.E = pi9Var;
        this.F = wpcVar;
        this.G = npcVar;
        this.H = fybVar;
        this.I = fnbVar;
        this.J = qvbVar;
        this.K = ih8Var;
        this.L = ko5Var.a(new tj7(this, 9));
        cm5 cm5Var = (cm5) bm5Var;
        int a = cm5Var.a();
        int b = cm5Var.b();
        xh9 xh9Var = cm5Var.a;
        boolean d = xh9Var.d();
        float a2 = xh9Var.a();
        this.Q = dza.a(new dm5(cm5Var.e(), cm5Var.d(), b, cm5Var.c(), d, a2, xh9Var.c(), a, 1965284));
        this.R = dza.a(new rl5());
        this.S = dza.a(new am5());
        this.T = dza.a(new xp5(-1, -1, -1));
        this.U = dza.a(new kq5());
        this.V = dza.a(ks3.a);
        sj4 A = z1d.A(new mx(npcVar.b, 6));
        ij6 ij6Var = new ij6(this, null);
        int i = yk4.a;
        this.W = z1d.N(A, new we1(ij6Var, (m42) null, 2));
        hk1 a3 = jdd.a(this);
        sw2 sw2Var = ab3.a;
        ru2 ru2Var = ru2.c;
        f(a3, ru2Var, new ms8(0, null, this));
        f(jdd.a(this), ru2Var, new r9(this, null, 26));
        f(jdd.a(this), ru2Var, new is8(5, null, this));
        f(jdd.a(this), ru2Var, new is8(4, null, this));
        this.X = dza.a(new vxb(null, 63));
        this.Y = dza.a(null);
        this.a0 = dza.a(new q3c(null, null, null, null, null, 255));
        this.b0 = dza.a(new tvb());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bf A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(defpackage.ss8 r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, defpackage.n42 r20) {
        /*
            r0 = r16
            r1 = r20
            boolean r2 = r1 instanceof defpackage.js8
            if (r2 == 0) goto L17
            r2 = r1
            js8 r2 = (defpackage.js8) r2
            int r3 = r2.D
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.D = r3
            goto L1c
        L17:
            js8 r2 = new js8
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f
            int r3 = r2.D
            r4 = 0
            r5 = 2
            r6 = 1
            r7 = 0
            if (r3 == 0) goto L4a
            if (r3 == r6) goto L34
            if (r3 != r5) goto L2e
            defpackage.hre.r(r1)
            return r1
        L2e:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r0)
            return r7
        L34:
            java.lang.String r0 = r2.e
            yk8[] r3 = r2.d
            java.lang.String r6 = r2.c
            xs5 r8 = r2.b
            yk8[] r9 = r2.a
            defpackage.hre.r(r1)
            byte[] r1 = (byte[]) r1
            if (r1 == 0) goto L98
            java.lang.String r1 = defpackage.kxe.m(r1)
            goto L99
        L4a:
            defpackage.hre.r(r1)
            cza r1 = r0.P
            if (r1 == 0) goto L6a
        L51:
            java.lang.Object r3 = r1.getValue()
            r8 = r3
            mr8 r8 = (defpackage.mr8) r8
            r13 = 0
            r15 = 253(0xfd, float:3.55E-43)
            r9 = 1
            r10 = 0
            r11 = 0
            r12 = 0
            mr8 r8 = defpackage.mr8.a(r8, r9, r10, r11, r12, r13, r15)
            boolean r3 = r1.l(r3, r8)
            if (r3 == 0) goto L51
        L6a:
            xs5 r8 = r0.f
            java.lang.String r0 = r0.c
            r1 = 4
            yk8[] r3 = new defpackage.yk8[r1]
            yk8 r1 = new yk8
            java.lang.String r9 = "book_name"
            r10 = r17
            r1.<init>(r9, r10)
            r3[r4] = r1
            yk8 r1 = new yk8
            java.lang.String r4 = "book_language"
            r9 = r19
            r1.<init>(r4, r9)
            r3[r6] = r1
            yk8 r1 = new yk8
            java.lang.String r4 = "book_author"
            r6 = r18
            r1.<init>(r4, r6)
            r3[r5] = r1
            r4 = 3
            java.lang.String r1 = "cover"
            r6 = r0
            r0 = r1
            r9 = r3
        L98:
            r1 = r7
        L99:
            if (r1 != 0) goto L9d
            java.lang.String r1 = ""
        L9d:
            yk8 r10 = new yk8
            r10.<init>(r0, r1)
            r3[r4] = r10
            java.util.Map r0 = defpackage.o17.s(r9)
            r2.a = r7
            r2.b = r7
            r2.c = r7
            r2.d = r7
            r2.e = r7
            r2.D = r5
            zs5 r8 = (defpackage.zs5) r8
            java.lang.Object r0 = r8.b(r6, r0, r2)
            n82 r1 = defpackage.n82.a
            if (r0 != r1) goto Lbf
            return r1
        Lbf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ss8.j(ss8, java.lang.String, java.lang.String, java.lang.String, n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0073 A[LOOP:1: B:21:0x0073->B:24:0x0095, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009c A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(defpackage.ss8 r26) {
        /*
            r0 = r26
            klc r1 = r0.C
            cza r2 = r0.R
            r3 = 0
            java.lang.String r4 = "book"
            if (r2 == 0) goto L6f
        Lb:
            java.lang.Object r5 = r2.getValue()
            r6 = r5
            rl5 r6 = (defpackage.rl5) r6
            vl6 r7 = r0.M
            if (r7 == 0) goto L6b
            java.lang.String r8 = r7.a
            java.util.Map r9 = r7.b
            java.lang.String r7 = r7.m
            r10 = r1
            plc r10 = (defpackage.plc) r10
            java.lang.String r7 = r10.f(r9, r8, r7)
            vl6 r9 = r0.M
            if (r9 == 0) goto L67
            java.util.Map r11 = r9.c
            java.lang.String r12 = r9.a
            java.lang.String r9 = r9.m
            java.lang.String r9 = r10.f(r11, r12, r9)
            vl6 r10 = r0.M
            if (r10 == 0) goto L63
            java.lang.String r11 = r10.d
            r12 = r11
            java.lang.String r11 = r10.j
            java.lang.String r13 = r10.h
            r23 = 0
            r24 = 261984(0x3ff60, float:3.67118E-40)
            r10 = r12
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r25 = r8
            r8 = r7
            r7 = r25
            rl5 r6 = defpackage.rl5.a(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            boolean r5 = r2.l(r5, r6)
            if (r5 == 0) goto Lb
            goto L6f
        L63:
            defpackage.c16.w(r4)
            throw r3
        L67:
            defpackage.c16.w(r4)
            throw r3
        L6b:
            defpackage.c16.w(r4)
            throw r3
        L6f:
            cza r2 = r0.S
            if (r2 == 0) goto L9c
        L73:
            java.lang.Object r5 = r2.getValue()
            r6 = r5
            am5 r6 = (defpackage.am5) r6
            vl6 r7 = r0.M
            if (r7 == 0) goto L98
            java.util.Map r8 = r7.b
            java.lang.String r9 = r7.a
            java.lang.String r7 = r7.m
            r10 = r1
            plc r10 = (defpackage.plc) r10
            java.lang.String r7 = r10.f(r8, r9, r7)
            r8 = 5
            r9 = 0
            am5 r6 = defpackage.am5.a(r6, r9, r7, r9, r8)
            boolean r5 = r2.l(r5, r6)
            if (r5 == 0) goto L73
            goto L9c
        L98:
            defpackage.c16.w(r4)
            throw r3
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ss8.k(ss8):void");
    }

    @Override // defpackage.gdd
    public final void d() {
        try {
            hl5.x(n());
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024 A[LOOP:1: B:11:0x0024->B:12:0x002f, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0031 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l() {
        /*
            r5 = this;
            w26 r0 = r5.Z
            r1 = 0
            if (r0 == 0) goto L8
            r0.cancel(r1)
        L8:
            cza r0 = r5.X
            if (r0 == 0) goto L20
        Lc:
            java.lang.Object r2 = r0.getValue()
            r3 = r2
            vxb r3 = (defpackage.vxb) r3
            vxb r3 = new vxb
            r4 = 63
            r3.<init>(r1, r4)
            boolean r2 = r0.l(r2, r3)
            if (r2 == 0) goto Lc
        L20:
            cza r5 = r5.Y
            if (r5 == 0) goto L31
        L24:
            java.lang.Object r0 = r5.getValue()
            r2 = r0
            vq8 r2 = (defpackage.vq8) r2
            boolean r0 = r5.l(r0, r1)
            if (r0 == 0) goto L24
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ss8.l():void");
    }

    public final ArrayList m() {
        List<rb1> list = ((vxb) this.X.getValue()).f;
        ArrayList arrayList = new ArrayList();
        for (rb1 rb1Var : list) {
            xl1.P(arrayList, rb1Var.c);
        }
        return arrayList;
    }

    public final dyb n() {
        return (dyb) this.O.getValue();
    }

    public final void o(rxb rxbVar) {
        Object value;
        cza czaVar = this.Y;
        if (czaVar != null) {
            do {
                value = czaVar.getValue();
                vq8 vq8Var = (vq8) value;
            } while (!czaVar.l(value, new vq8(rxbVar.a, rxbVar.b, rxbVar.c + 1)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d A[LOOP:1: B:13:0x002d->B:14:0x0038, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(java.lang.String r5) {
        /*
            r4 = this;
            r5.getClass()
            w26 r0 = r4.Z
            r1 = 0
            if (r0 == 0) goto Lb
            r0.cancel(r1)
        Lb:
            boolean r0 = defpackage.k4b.j0(r5)
            if (r0 == 0) goto L3b
            cza r5 = r4.X
            if (r5 == 0) goto L29
        L15:
            java.lang.Object r0 = r5.getValue()
            r2 = r0
            vxb r2 = (defpackage.vxb) r2
            vxb r2 = new vxb
            r3 = 63
            r2.<init>(r1, r3)
            boolean r0 = r5.l(r0, r2)
            if (r0 == 0) goto L15
        L29:
            cza r4 = r4.Y
            if (r4 == 0) goto L3a
        L2d:
            java.lang.Object r5 = r4.getValue()
            r0 = r5
            vq8 r0 = (defpackage.vq8) r0
            boolean r5 = r4.l(r5, r1)
            if (r5 == 0) goto L2d
        L3a:
            return
        L3b:
            hk1 r0 = defpackage.jdd.a(r4)
            sw2 r2 = defpackage.ab3.a
            qs8 r3 = new qs8
            r3.<init>(r4, r5, r1)
            w26 r5 = r4.f(r0, r2, r3)
            r4.Z = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ss8.p(java.lang.String):void");
    }

    public final void q(String str, String str2, String str3) {
        hk1 a = jdd.a(this);
        sw2 sw2Var = ab3.a;
        f(a, ru2.c, new ba(this, str, str2, str3, null, 6));
    }
}
