package defpackage;

import com.reader.data.download.impl.AndroidDownloadService;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pi  reason: default package */
/* loaded from: classes3.dex */
public final class pi extends aab implements lu4 {
    public final /* synthetic */ boolean C;
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ AndroidDownloadService c;
    public final /* synthetic */ String d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pi(AndroidDownloadService androidDownloadService, String str, int i, int i2, boolean z, m42 m42Var) {
        super(2, m42Var);
        this.c = androidDownloadService;
        this.d = str;
        this.e = i;
        this.f = i2;
        this.C = z;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        pi piVar = new pi(this.c, this.d, this.e, this.f, this.C, m42Var);
        piVar.b = obj;
        return piVar;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((pi) create((m82) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.b
            m82 r0 = (defpackage.m82) r0
            n82 r0 = defpackage.n82.a
            int r1 = r10.a
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1d
            if (r1 != r2) goto L17
            defpackage.hre.r(r11)     // Catch: java.lang.Throwable -> L13
            r9 = r10
            goto L3c
        L13:
            r0 = move-exception
            r11 = r0
            r9 = r10
            goto L49
        L17:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r10)
            return r3
        L1d:
            defpackage.hre.r(r11)
            com.reader.data.download.impl.AndroidDownloadService r11 = r10.c
            java.lang.String r5 = r10.d
            int r6 = r10.e
            int r7 = r10.f
            boolean r8 = r10.C
            boolean r1 = com.reader.data.download.impl.AndroidDownloadService.C     // Catch: java.lang.Throwable -> L45
            xf3 r4 = r11.b()     // Catch: java.lang.Throwable -> L45
            r10.b = r3     // Catch: java.lang.Throwable -> L42
            r10.a = r2     // Catch: java.lang.Throwable -> L42
            r9 = r10
            java.lang.Object r10 = r4.h(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L3f
            if (r10 != r0) goto L3c
            return r0
        L3c:
            pvc r10 = defpackage.pvc.a     // Catch: java.lang.Throwable -> L3f
            goto L4e
        L3f:
            r0 = move-exception
        L40:
            r11 = r0
            goto L49
        L42:
            r0 = move-exception
            r9 = r10
            goto L40
        L45:
            r0 = move-exception
            r9 = r10
            r10 = r0
            r11 = r10
        L49:
            gs9 r10 = new gs9
            r10.<init>(r11)
        L4e:
            com.reader.data.download.impl.AndroidDownloadService r11 = r9.c
            java.lang.String r0 = r9.d
            boolean r1 = r10 instanceof defpackage.gs9
            if (r1 != 0) goto L83
            pvc r10 = (defpackage.pvc) r10
            java.lang.Object r10 = r11.e
            monitor-enter(r10)
            java.util.HashMap r1 = r11.f     // Catch: java.lang.Throwable -> L69
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L69
            w26 r1 = (defpackage.w26) r1     // Catch: java.lang.Throwable -> L69
            if (r1 == 0) goto L6c
            r1.cancel(r3)     // Catch: java.lang.Throwable -> L69
            goto L6c
        L69:
            r0 = move-exception
            r11 = r0
            goto L81
        L6c:
            java.util.HashMap r1 = r11.f     // Catch: java.lang.Throwable -> L69
            m41 r2 = r11.c     // Catch: java.lang.Throwable -> L69
            l0 r4 = new l0     // Catch: java.lang.Throwable -> L69
            r5 = 11
            r4.<init>(r11, r0, r3, r5)     // Catch: java.lang.Throwable -> L69
            r11 = 3
            iya r11 = defpackage.z87.v(r2, r3, r3, r4, r11)     // Catch: java.lang.Throwable -> L69
            r1.put(r0, r11)     // Catch: java.lang.Throwable -> L69
            monitor-exit(r10)
            goto L83
        L81:
            monitor-exit(r10)
            throw r11
        L83:
            pvc r10 = defpackage.pvc.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pi.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
