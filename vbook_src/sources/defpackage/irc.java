package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: irc  reason: default package */
/* loaded from: classes3.dex */
public final class irc extends zo0 {
    public static final String q(irc ircVar, so0 so0Var, w14 w14Var) {
        String str = w14Var.h;
        StringBuilder sb = new StringBuilder();
        sb.append(so0Var.f);
        String str2 = so0Var.g;
        if (!k4b.j0(str2)) {
            sb.append("\n");
            sb.append(str2);
        }
        if (!k4b.j0(str)) {
            sb.append("\n\n");
            sb.append(k4b.N0(str).toString());
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object r(defpackage.irc r5, defpackage.so0 r6, defpackage.n42 r7) {
        /*
            r5.getClass()
            boolean r0 = r7 instanceof defpackage.frc
            if (r0 == 0) goto L16
            r0 = r7
            frc r0 = (defpackage.frc) r0
            int r1 = r0.C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.C = r1
            goto L1b
        L16:
            frc r0 = new frc
            r0.<init>(r5, r7)
        L1b:
            java.lang.Object r5 = r0.e
            int r7 = r0.C
            r1 = 1
            if (r7 == 0) goto L37
            if (r7 != r1) goto L30
            java.lang.StringBuilder r6 = r0.d
            java.lang.StringBuilder r7 = r0.c
            java.lang.StringBuilder r1 = r0.b
            so0 r0 = r0.a
            defpackage.hre.r(r5)
            goto L5f
        L30:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            r5 = 0
            return r5
        L37:
            defpackage.hre.r(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            mfb r7 = defpackage.s2b.n
            java.lang.Object r7 = r7.getValue()
            y3b r7 = (defpackage.y3b) r7
            r0.a = r6
            r0.b = r5
            r0.c = r5
            r0.d = r5
            r0.C = r1
            java.lang.Object r7 = defpackage.yqe.u(r7, r0)
            n82 r0 = defpackage.n82.a
            if (r7 != r0) goto L5a
            return r0
        L5a:
            r1 = r5
            r0 = r6
            r6 = r1
            r5 = r7
            r7 = r6
        L5f:
            java.lang.String r5 = (java.lang.String) r5
            r6.append(r5)
            java.lang.String r5 = "\n"
            r7.append(r5)
            java.util.List r6 = r0.b
            java.util.Iterator r6 = r6.iterator()
        L6f:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L9a
            java.lang.Object r2 = r6.next()
            sm2 r2 = (defpackage.sm2) r2
            java.lang.String r3 = "- "
            r7.append(r3)
            java.util.Map r3 = r0.c
            int r2 = r2.d
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r2)
            java.lang.Object r2 = r3.get(r4)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L93
            java.lang.String r2 = ""
        L93:
            r7.append(r2)
            r7.append(r5)
            goto L6f
        L9a:
            java.lang.String r5 = r1.toString()
            java.lang.CharSequence r5 = defpackage.k4b.N0(r5)
            java.lang.String r5 = r5.toString()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.irc.r(irc, so0, n42):java.lang.Object");
    }

    public static final String s(irc ircVar, String str) {
        ircVar.getClass();
        qa5 qa5Var = qa5.a;
        cp3 a0 = qa5.f(str).a0();
        a0.W("img, video, audio, svg, canvas, picture, source, embed, object, iframe").d();
        return k4b.N0(qa5.g(qa5.e().d(a0)).b).toString();
    }
}
