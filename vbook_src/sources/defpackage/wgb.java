package defpackage;

import android.content.Context;
import android.speech.tts.TextToSpeech;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wgb  reason: default package */
/* loaded from: classes3.dex */
public final class wgb implements xyb {
    public List a;
    public ArrayList b;
    public ArrayList c;
    public final co d;
    public int e;
    public long f;
    public String g;
    public int h;
    public int i;

    public wgb() {
        Context context = twe.e;
        context.getClass();
        this.d = new co(context);
        hq7 hq7Var = wl3.b;
        this.f = 0L;
        this.g = "";
        this.i = -1;
    }

    @Override // defpackage.xyb
    public final pvc a(ryb rybVar) {
        TextToSpeech textToSpeech;
        ny7 ny7Var = new ny7(rybVar.a, rybVar.b);
        co coVar = this.d;
        coVar.m = ny7Var;
        coVar.d.m(null);
        TextToSpeech textToSpeech2 = coVar.c;
        if (textToSpeech2 != null && textToSpeech2.isSpeaking() && (textToSpeech = coVar.c) != null) {
            nc2.c(textToSpeech.stop());
        }
        TextToSpeech textToSpeech3 = coVar.c;
        if (textToSpeech3 != null) {
            textToSpeech3.shutdown();
        }
        coVar.c = null;
        coVar.l.clear();
        coVar.f();
        return pvc.a;
    }

    @Override // defpackage.xyb
    public final void b(int i) {
        this.i = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055 A[LOOP:0: B:18:0x004f->B:20:0x0055, LOOP_END] */
    @Override // defpackage.xyb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.m42 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.qgb
            if (r0 == 0) goto L13
            r0 = r5
            qgb r0 = (defpackage.qgb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L1a
        L13:
            qgb r0 = new qgb
            n42 r5 = (defpackage.n42) r5
            r0.<init>(r4, r5)
        L1a:
            java.lang.Object r5 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            defpackage.hre.r(r5)
            goto L3e
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.hre.r(r5)
            r0.c = r2
            co r4 = r4.d
            java.lang.Object r5 = r4.c(r0)
            n82 r4 = defpackage.n82.a
            if (r5 != r4) goto L3e
            return r4
        L3e:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r4 = new java.util.ArrayList
            r0 = 10
            int r0 = defpackage.tl1.s(r5, r0)
            r4.<init>(r0)
            java.util.Iterator r5 = r5.iterator()
        L4f:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L68
            java.lang.Object r0 = r5.next()
            oy7 r0 = (defpackage.oy7) r0
            tyb r1 = new tyb
            java.lang.String r2 = r0.a
            java.lang.String r0 = r0.b
            r1.<init>(r2, r0)
            r4.add(r1)
            goto L4f
        L68:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wgb.c(m42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    @Override // defpackage.xyb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.m42 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.ugb
            if (r0 == 0) goto L14
            r0 = r8
            ugb r0 = (defpackage.ugb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.c = r1
        L12:
            r6 = r0
            goto L1c
        L14:
            ugb r0 = new ugb
            n42 r8 = (defpackage.n42) r8
            r0.<init>(r7, r8)
            goto L12
        L1c:
            java.lang.Object r8 = r6.a
            int r0 = r6.c
            r1 = 1
            if (r0 == 0) goto L30
            if (r0 != r1) goto L29
            defpackage.hre.r(r8)
            goto L5f
        L29:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            r7 = 0
            return r7
        L30:
            defpackage.hre.r(r8)
            java.util.ArrayList r8 = r7.b
            if (r8 != 0) goto L3a
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            return r7
        L3a:
            int r0 = r7.e
            int r8 = r8.size()
            int r8 = r8 - r1
            if (r0 >= r8) goto L62
            int r8 = r7.e
            int r3 = r8 + (-1)
            r7.e = r3
            long r4 = r7.f
            r6.c = r1
            java.util.ArrayList r2 = r7.c
            if (r2 == 0) goto L58
            co r1 = r7.d
            java.lang.Object r7 = r1.k(r2, r3, r4, r6)
            goto L5a
        L58:
            pvc r7 = defpackage.pvc.a
        L5a:
            n82 r8 = defpackage.n82.a
            if (r7 != r8) goto L5f
            return r8
        L5f:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            return r7
        L62:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wgb.f(m42):java.lang.Object");
    }

    @Override // defpackage.xyb
    public final Object g(float f, n42 n42Var) {
        return this.d.i(f, n42Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e A[LOOP:0: B:18:0x0058->B:20:0x005e, LOOP_END] */
    @Override // defpackage.xyb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.tyb r5, defpackage.m42 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.sgb
            if (r0 == 0) goto L13
            r0 = r6
            sgb r0 = (defpackage.sgb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L1a
        L13:
            sgb r0 = new sgb
            n42 r6 = (defpackage.n42) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            defpackage.hre.r(r6)
            goto L47
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.hre.r(r6)
            oy7 r6 = new oy7
            java.lang.String r1 = r5.a
            java.lang.String r5 = r5.b
            r6.<init>(r1, r5)
            r0.c = r2
            co r4 = r4.d
            java.io.Serializable r6 = r4.e(r6, r0)
            n82 r4 = defpackage.n82.a
            if (r6 != r4) goto L47
            return r4
        L47:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = defpackage.tl1.s(r6, r5)
            r4.<init>(r5)
            java.util.Iterator r5 = r6.iterator()
        L58:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L73
            java.lang.Object r6 = r5.next()
            py7 r6 = (defpackage.py7) r6
            wyb r0 = new wyb
            java.lang.String r1 = r6.a
            java.lang.String r2 = r6.b
            boolean r6 = r6.c
            r0.<init>(r1, r2, r6)
            r4.add(r0)
            goto L58
        L73:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wgb.h(tyb, m42):java.lang.Object");
    }

    @Override // defpackage.xyb
    public final Object i(float f, n42 n42Var) {
        return this.d.h(f, n42Var);
    }

    @Override // defpackage.xyb
    public final void j(List list) {
        list.getClass();
        this.a = list;
    }

    @Override // defpackage.xyb
    public final Object k(n42 n42Var) {
        co coVar = this.d;
        return new syb(0, false, TextToSpeech.getMaxSpeechInputLength(), coVar.q, coVar.p, coVar.s, coVar.r, false, false, "");
    }

    @Override // defpackage.xyb
    public final Boolean l(rpc rpcVar) {
        return Boolean.valueOf(this.d.h);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055 A[LOOP:0: B:18:0x004f->B:20:0x0055, LOOP_END] */
    @Override // defpackage.xyb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(defpackage.m42 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.rgb
            if (r0 == 0) goto L13
            r0 = r5
            rgb r0 = (defpackage.rgb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L1a
        L13:
            rgb r0 = new rgb
            n42 r5 = (defpackage.n42) r5
            r0.<init>(r4, r5)
        L1a:
            java.lang.Object r5 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            defpackage.hre.r(r5)
            goto L3e
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.hre.r(r5)
            r0.c = r2
            co r4 = r4.d
            java.io.Serializable r5 = r4.d(r0)
            n82 r4 = defpackage.n82.a
            if (r5 != r4) goto L3e
            return r4
        L3e:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r4 = new java.util.ArrayList
            r0 = 10
            int r0 = defpackage.tl1.s(r5, r0)
            r4.<init>(r0)
            java.util.Iterator r5 = r5.iterator()
        L4f:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L68
            java.lang.Object r0 = r5.next()
            ny7 r0 = (defpackage.ny7) r0
            ryb r1 = new ryb
            java.lang.String r2 = r0.a
            java.lang.String r0 = r0.b
            r1.<init>(r2, r0)
            r4.add(r1)
            goto L4f
        L68:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wgb.m(m42):java.lang.Object");
    }

    @Override // defpackage.xyb
    public final void n(int i) {
        this.h = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
        if (r1 == r7) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006b, code lost:
        if (r1 != r7) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006d, code lost:
        return r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    @Override // defpackage.xyb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(defpackage.m42 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.tgb
            if (r0 == 0) goto L14
            r0 = r9
            tgb r0 = (defpackage.tgb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.c = r1
        L12:
            r6 = r0
            goto L1c
        L14:
            tgb r0 = new tgb
            n42 r9 = (defpackage.n42) r9
            r0.<init>(r8, r9)
            goto L12
        L1c:
            java.lang.Object r9 = r6.a
            int r0 = r6.c
            pvc r1 = defpackage.pvc.a
            r2 = 2
            r3 = 1
            n82 r7 = defpackage.n82.a
            if (r0 == 0) goto L3b
            if (r0 == r3) goto L37
            if (r0 != r2) goto L30
            defpackage.hre.r(r9)
            goto L6e
        L30:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r8)
            r8 = 0
            return r8
        L37:
            defpackage.hre.r(r9)
            goto L5b
        L3b:
            defpackage.hre.r(r9)
            java.util.ArrayList r9 = r8.b
            if (r9 != 0) goto L45
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            return r8
        L45:
            int r0 = r8.e
            int r9 = r9.size()
            int r9 = r9 - r3
            if (r0 >= r9) goto L71
            int r9 = r8.e
            int r9 = r9 + r3
            r8.e = r9
            r6.c = r3
            r8.y(r6)
            if (r1 != r7) goto L5b
            goto L6d
        L5b:
            int r3 = r8.e
            long r4 = r8.f
            r6.c = r2
            java.util.ArrayList r2 = r8.c
            if (r2 == 0) goto L6b
            co r1 = r8.d
            java.lang.Object r1 = r1.k(r2, r3, r4, r6)
        L6b:
            if (r1 != r7) goto L6e
        L6d:
            return r7
        L6e:
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            return r8
        L71:
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wgb.o(m42):java.lang.Object");
    }

    @Override // defpackage.xyb
    public final Object q(m42 m42Var) {
        this.d.l();
        return pvc.a;
    }

    @Override // defpackage.xyb
    public final Object r(float f, kqc kqcVar) {
        if (this.g.length() > 0) {
            String str = this.g;
            return u(str, (int) (f * str.length()), this.f, kqcVar);
        }
        return pvc.a;
    }

    @Override // defpackage.xyb
    public final Object s(tyb tybVar, n42 n42Var) {
        return this.d.g(new oy7(tybVar.a, tybVar.b), n42Var);
    }

    @Override // defpackage.xyb
    public final Object t(n42 n42Var) {
        TextToSpeech textToSpeech;
        co coVar = this.d;
        coVar.f = true;
        coVar.d.m(null);
        TextToSpeech textToSpeech2 = coVar.c;
        if (textToSpeech2 != null && textToSpeech2.isSpeaking() && (textToSpeech = coVar.c) != null) {
            nc2.c(textToSpeech.stop());
        }
        TextToSpeech textToSpeech3 = coVar.c;
        if (textToSpeech3 != null) {
            textToSpeech3.shutdown();
        }
        coVar.c = null;
        coVar.l.clear();
        return pvc.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018e A[RETURN] */
    @Override // defpackage.xyb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.String r19, int r20, long r21, defpackage.n42 r23) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wgb.u(java.lang.String, int, long, n42):java.lang.Object");
    }

    @Override // defpackage.xyb
    public final void v(bp9 bp9Var) {
        rwa rwaVar = new rwa(3, this, bp9Var);
        co coVar = this.d;
        coVar.getClass();
        coVar.b = rwaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    @Override // defpackage.xyb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(defpackage.n42 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.pgb
            if (r0 == 0) goto L13
            r0 = r6
            pgb r0 = (defpackage.pgb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            pgb r0 = new pgb
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            pvc r2 = defpackage.pvc.a
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L2e
            if (r1 != r4) goto L28
            defpackage.hre.r(r6)
            goto L64
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            return r3
        L2e:
            defpackage.hre.r(r6)
            r0.c = r4
            co r6 = r5.d
            r6.f = r4
            cza r0 = r6.d
            r0.m(r3)
            android.speech.tts.TextToSpeech r0 = r6.c
            if (r0 == 0) goto L51
            boolean r0 = r0.isSpeaking()
            if (r0 != r4) goto L51
            android.speech.tts.TextToSpeech r0 = r6.c
            if (r0 == 0) goto L51
            int r0 = r0.stop()
            defpackage.nc2.c(r0)
        L51:
            android.speech.tts.TextToSpeech r0 = r6.c
            if (r0 == 0) goto L58
            r0.shutdown()
        L58:
            r6.c = r3
            java.util.HashSet r6 = r6.l
            r6.clear()
            n82 r6 = defpackage.n82.a
            if (r2 != r6) goto L64
            return r6
        L64:
            r5.b = r3
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wgb.w(n42):java.lang.Object");
    }

    @Override // defpackage.xyb
    public final Object x(wyb wybVar, n42 n42Var) {
        return this.d.j(new py7(wybVar.a, wybVar.b, wybVar.c), n42Var);
    }

    @Override // defpackage.xyb
    public final Object y(n42 n42Var) {
        co coVar = this.d;
        coVar.h = false;
        TextToSpeech textToSpeech = coVar.c;
        if (textToSpeech != null) {
            nc2.c(textToSpeech.stop());
        }
        coVar.l.clear();
        return pvc.a;
    }

    @Override // defpackage.xyb
    public final void e(List list) {
    }

    @Override // defpackage.xyb
    public final void p(boolean z) {
    }
}
