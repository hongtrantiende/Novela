package defpackage;

import com.reader.data.reader.text.core.tts.AndroidTextToSpeechService;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: no  reason: default package */
/* loaded from: classes3.dex */
public final class no extends aab implements lu4 {
    public int a;
    public final /* synthetic */ AndroidTextToSpeechService b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ double f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public no(AndroidTextToSpeechService androidTextToSpeechService, String str, int i, int i2, double d, m42 m42Var) {
        super(2, m42Var);
        this.b = androidTextToSpeechService;
        this.c = str;
        this.d = i;
        this.e = i2;
        this.f = d;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        return new no(this.b, this.c, this.d, this.e, this.f, m42Var);
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((no) create((m82) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
        if (r0 == r6) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ab, code lost:
        if (com.reader.data.reader.text.core.tts.AndroidTextToSpeechService.c(r4) != r6) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00be, code lost:
        if (r0 == r6) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c0, code lost:
        return r6;
     */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r5 = r18
            int r0 = r5.a
            r1 = 3
            r2 = 2
            r3 = 1
            com.reader.data.reader.text.core.tts.AndroidTextToSpeechService r4 = r5.b
            n82 r6 = defpackage.n82.a
            if (r0 == 0) goto L2c
            if (r0 == r3) goto L26
            if (r0 == r2) goto L21
            if (r0 != r1) goto L1a
            defpackage.hre.r(r19)
            r0 = r19
            goto Lc1
        L1a:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r0)
            r0 = 0
            return r0
        L21:
            defpackage.hre.r(r19)
            goto Lae
        L26:
            defpackage.hre.r(r19)
            r0 = r19
            goto L42
        L2c:
            defpackage.hre.r(r19)
            bp9 r0 = r4.N
            r0.y()
            tqc r0 = r4.J
            if (r0 == 0) goto L44
            r5.a = r3
            java.lang.Object r0 = r0.t(r5)
            if (r0 != r6) goto L42
            goto Lc0
        L42:
            pvc r0 = (defpackage.pvc) r0
        L44:
            ye6 r0 = r4.a
            java.lang.Object r0 = r0.getValue()
            r9 = r0
            io5 r9 = (defpackage.io5) r9
            ye6 r0 = r4.b
            java.lang.Object r0 = r0.getValue()
            r10 = r0
            ixb r10 = (defpackage.ixb) r10
            ye6 r0 = r4.c
            java.lang.Object r0 = r0.getValue()
            r14 = r0
            klc r14 = (defpackage.klc) r14
            a2c r12 = r4.f()
            ye6 r0 = r4.e
            java.lang.Object r0 = r0.getValue()
            r13 = r0
            n64 r13 = (defpackage.n64) r13
            ye6 r0 = r4.d
            java.lang.Object r0 = r0.getValue()
            r11 = r0
            wl6 r11 = (defpackage.wl6) r11
            ye6 r0 = r4.E
            java.lang.Object r0 = r0.getValue()
            r15 = r0
            nld r15 = (defpackage.nld) r15
            ye6 r0 = r4.C
            java.lang.Object r0 = r0.getValue()
            r16 = r0
            npc r16 = (defpackage.npc) r16
            ye6 r0 = r4.D
            java.lang.Object r0 = r0.getValue()
            r17 = r0
            fyb r17 = (defpackage.fyb) r17
            tqc r7 = new tqc
            java.lang.String r8 = r5.c
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r4.J = r7
            kw5 r0 = new kw5
            java.lang.String r3 = r5.c
            r8 = 4
            r0.<init>(r8, r4, r3)
            r7.o = r0
            r5.a = r2
            java.lang.Boolean r0 = com.reader.data.reader.text.core.tts.AndroidTextToSpeechService.c(r4)
            if (r0 != r6) goto Lae
            goto Lc0
        Lae:
            tqc r0 = r4.J
            if (r0 == 0) goto Lc3
            r5.a = r1
            int r1 = r5.d
            int r2 = r5.e
            double r3 = r5.f
            java.lang.Object r0 = r0.s(r1, r2, r3, r5)
            if (r0 != r6) goto Lc1
        Lc0:
            return r6
        Lc1:
            pvc r0 = (defpackage.pvc) r0
        Lc3:
            pvc r0 = defpackage.pvc.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.no.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
