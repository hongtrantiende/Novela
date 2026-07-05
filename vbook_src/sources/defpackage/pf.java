package defpackage;

import android.content.Context;
import androidx.glance.appwidget.GlanceAppWidgetReceiver;
import com.reader.data.server.AndroidTestServerService;
import com.reader.data.updates.impl.bookupdate.AndroidBookUpdateWorker;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pf  reason: default package */
/* loaded from: classes3.dex */
public final class pf extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pf(Object obj, int i, Object obj2, m42 m42Var, int i2) {
        super(2, m42Var);
        this.a = i2;
        this.d = obj;
        this.c = i;
        this.e = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
        if (r0.s(r2 + 1, r13) == r9) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009e, code lost:
        if (defpackage.lq.c(r1, r2, r14, null, r5, r13, 4) != r9) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b8, code lost:
        if (r0.s(r2 - 1, r6) == r9) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00fa, code lost:
        if (defpackage.lq.c(r1, r2, r14, null, r5, r6, 4) != r9) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object o(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pf.o(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
        if (r0.i().l(r2 + 1, 0, r14) == r9) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009c, code lost:
        if (r15 == r9) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00cc, code lost:
        if (r15 == r9) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x012d, code lost:
        if (r15 != r9) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x015a, code lost:
        if (r15 == r9) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object p(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pf.p(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
        if (r10 == r8) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e A[Catch: all -> 0x0067, TRY_LEAVE, TryCatch #0 {all -> 0x0067, blocks: (B:6:0x0019, B:21:0x0054, B:23:0x005e), top: B:30:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object q(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.c
            java.lang.Object r1 = r9.e
            tqc r1 = (defpackage.tqc) r1
            java.lang.Object r2 = r9.d
            m82 r2 = (defpackage.m82) r2
            int r3 = r9.b
            pvc r4 = defpackage.pvc.a
            r5 = 2
            r6 = 1
            r7 = 0
            n82 r8 = defpackage.n82.a
            if (r3 == 0) goto L27
            if (r3 == r6) goto L23
            if (r3 != r5) goto L1d
            defpackage.hre.r(r10)     // Catch: java.lang.Throwable -> L67
            return r4
        L1d:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r9)
            return r7
        L23:
            defpackage.hre.r(r10)
            goto L49
        L27:
            defpackage.hre.r(r10)
            k97 r10 = r1.O
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r0)
            r10.getClass()
            j97 r10 = r10.a
            java.lang.Object r10 = r10.h(r3)
            java.lang.String r10 = (java.lang.String) r10
            if (r10 != 0) goto L4b
            r9.d = r2
            r9.b = r6
            java.io.Serializable r10 = r1.j(r0, r9)
            if (r10 != r8) goto L49
            goto L66
        L49:
            java.lang.String r10 = (java.lang.String) r10
        L4b:
            if (r10 == 0) goto L67
            int r0 = r10.length()
            if (r0 != 0) goto L54
            goto L67
        L54:
            vpc r0 = r1.m     // Catch: java.lang.Throwable -> L67
            r9.d = r7     // Catch: java.lang.Throwable -> L67
            r9.b = r5     // Catch: java.lang.Throwable -> L67
            xyb r0 = r0.a     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto L63
            java.lang.Object r9 = r0.d(r10, r9)     // Catch: java.lang.Throwable -> L67
            goto L64
        L63:
            r9 = r4
        L64:
            if (r9 != r8) goto L67
        L66:
            return r8
        L67:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pf.q(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                return new pf((AndroidBookUpdateWorker) this.d, (hk2) obj2, this.c, m42Var, 0);
            case 1:
                pf pfVar = new pf((AndroidTestServerService) obj2, this.c, m42Var, 1);
                pfVar.d = obj;
                return pfVar;
            case 2:
                pf pfVar2 = new pf((sr0) obj2, this.c, m42Var, 2);
                pfVar2.d = obj;
                return pfVar2;
            case 3:
                return new pf((c92) this.d, (lq) obj2, m42Var, 3);
            case 4:
                pf pfVar3 = new pf((ma3) obj2, this.c, m42Var, 4);
                pfVar3.d = obj;
                return pfVar3;
            case 5:
                return new pf((t14) this.d, (m71) obj2, m42Var, 5);
            case 6:
                return new pf((GlanceAppWidgetReceiver) this.d, (Context) obj2, this.c, m42Var, 6);
            case 7:
                pf pfVar4 = new pf((ur5) obj2, this.c, m42Var, 7);
                pfVar4.d = obj;
                return pfVar4;
            case 8:
                pf pfVar5 = new pf((qg6) obj2, this.c, m42Var, 8);
                pfVar5.d = obj;
                return pfVar5;
            case 9:
                return new pf((kj6) this.d, this.c, (aw7) obj2, m42Var, 9);
            case 10:
                return new pf((xy7) obj2, m42Var);
            case 11:
                return new pf((be9) this.d, this.c, (LinkedHashMap) obj2, m42Var, 11);
            case 12:
                pf pfVar6 = new pf((np9) obj2, this.c, m42Var, 12);
                pfVar6.d = obj;
                return pfVar6;
            case 13:
                pf pfVar7 = new pf((zfa) obj2, this.c, m42Var, 13);
                pfVar7.d = obj;
                return pfVar7;
            case 14:
                return new pf((c92) this.d, (lq) obj2, m42Var, 14);
            case 15:
                return new pf((c92) this.d, (lq) obj2, m42Var, 15);
            case 16:
                pf pfVar8 = new pf((y5c) obj2, this.c, m42Var, 16);
                pfVar8.d = obj;
                return pfVar8;
            case 17:
                pf pfVar9 = new pf((tqc) obj2, this.c, m42Var, 17);
                pfVar9.d = obj;
                return pfVar9;
            default:
                return new pf((ubd) this.d, this.c, (abd) obj2, m42Var, 18);
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                return ((pf) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 1:
                return ((pf) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 2:
                return ((pf) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 3:
                return ((pf) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 4:
                return ((pf) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 5:
                return ((pf) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 6:
                return ((pf) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 7:
                return ((pf) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 8:
                return ((pf) create((i2a) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 9:
                return ((pf) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 10:
                return ((pf) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 11:
                return ((pf) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 12:
                return ((pf) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 13:
                return ((pf) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 14:
                return ((pf) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 15:
                return ((pf) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 16:
                return ((pf) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 17:
                return ((pf) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            default:
                return ((pf) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x0347, code lost:
        if (r0 == r6) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0363, code lost:
        if (r0.q(r25) == r6) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x036f, code lost:
        if (r0 == r6) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x038b, code lost:
        if (r0.s(r25) == r6) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0398, code lost:
        if (r0 == r6) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x03b3, code lost:
        if (r0.t(r25) == r6) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x03be, code lost:
        if (r0 == r6) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x03d9, code lost:
        if (r0.r(r25) == r6) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x03e4, code lost:
        if (r0 == r6) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x03ff, code lost:
        if (r0.u(r25) == r6) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0541, code lost:
        if (defpackage.kqe.f(r4, r0, r25) == r2) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x054b, code lost:
        if (defpackage.kqe.x(r4, r0, r25) == r2) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0692, code lost:
        if (defpackage.ade.r(r6, r25) != r3) goto L312;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x06ed, code lost:
        if (r6 == r3) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x06f1, code lost:
        if (r6 == r3) goto L326;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x06f4, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x0853, code lost:
        if (r7.s(r1 + 1, r25) == r8) goto L392;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x0891, code lost:
        if (defpackage.lq.c(r0, r4, r2, null, r4, r25, 4) != r8) goto L394;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x08a8, code lost:
        if (r7.s(r1 - 1, r25) == r8) goto L392;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x08dd, code lost:
        if (defpackage.lq.c(r0, r6, r2, null, r4, r25, 4) != r8) goto L394;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x0ab9, code lost:
        if (r1 == r3) goto L511;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x0af4, code lost:
        if (defpackage.z87.E(r0, r17, r25) == r3) goto L511;
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:?, code lost:
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:549:?, code lost:
        return r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0750  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x08ee  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x08f4  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x08fa  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0958  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0268  */
    /* JADX WARN: Type inference failed for: r6v64, types: [zl9, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:177:0x0440 -> B:179:0x0445). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:318:0x06f1 -> B:321:0x06f5). Please submit an issue!!! */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 2878
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pf.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pf(Object obj, int i, m42 m42Var, int i2) {
        super(2, m42Var);
        this.a = i2;
        this.e = obj;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pf(xy7 xy7Var, m42 m42Var) {
        super(2, m42Var);
        this.a = 10;
        this.e = xy7Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pf(Object obj, Object obj2, int i, m42 m42Var, int i2) {
        super(2, m42Var);
        this.a = i2;
        this.d = obj;
        this.e = obj2;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pf(Object obj, Object obj2, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.d = obj;
        this.e = obj2;
    }
}
