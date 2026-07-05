package defpackage;

import android.content.Context;
import com.reader.data.download.impl.AndroidDownloadService;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n0  reason: default package */
/* loaded from: classes3.dex */
public final class n0 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(Object obj, Object obj2, Object obj3, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ab, code lost:
        if (r0 == r9) goto L45;
     */
    /* JADX WARN: Type inference failed for: r10v3, types: [xl9, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object o(java.lang.Object r44) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n0.o(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f1, code lost:
        if (r0 == r9) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e6 A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:7:0x0021, B:38:0x00f4, B:31:0x00cb, B:33:0x00e2, B:35:0x00e6), top: B:59:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0103 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object p(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n0.p(java.lang.Object):java.lang.Object");
    }

    private final Object q(Object obj) {
        zl9 zl9Var;
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                zl9Var = (zl9) this.c;
                hre.r(obj);
            } else {
                vs.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            hre.r(obj);
            zl9 zl9Var2 = (zl9) this.d;
            this.c = zl9Var2;
            this.b = 1;
            Object a = ((o19) this.e).a(this);
            n82 n82Var = n82.a;
            if (a == n82Var) {
                return n82Var;
            }
            obj = a;
            zl9Var = zl9Var2;
        }
        zl9Var.a = obj;
        return pvc.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
        if (r8.b(r9, r13) == r7) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object r(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n0.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                return new n0((yu7) this.c, (k59) this.d, (kb3) obj2, m42Var, 0);
            case 1:
                n0 n0Var = new n0((b8) this.d, (String) obj2, m42Var, 1);
                n0Var.c = obj;
                return n0Var;
            case 2:
                n0 n0Var2 = new n0((mu4) this.d, (pe) obj2, m42Var, 2);
                n0Var2.c = obj;
                return n0Var2;
            case 3:
                n0 n0Var3 = new n0((mu4) this.d, (qe) obj2, m42Var, 3);
                n0Var3.c = obj;
                return n0Var3;
            case 4:
                n0 n0Var4 = new n0((nu4) this.d, (pe) obj2, m42Var, 4);
                n0Var4.c = obj;
                return n0Var4;
            case 5:
                n0 n0Var5 = new n0((nu4) this.d, (qe) obj2, m42Var, 5);
                n0Var5.c = obj;
                return n0Var5;
            case 6:
                n0 n0Var6 = new n0((AndroidDownloadService) this.d, (String) obj2, m42Var, 6);
                n0Var6.c = obj;
                return n0Var6;
            case 7:
                n0 n0Var7 = new n0((tkc) this.d, (aw7) obj2, m42Var, 7);
                n0Var7.c = obj;
                return n0Var7;
            case 8:
                return new n0((aib) this.c, (Context) this.d, (uy4) obj2, m42Var, 8);
            case 9:
                return new n0((n10) this.d, (h10) obj2, m42Var, 9);
            case 10:
                return new n0((qq4) this.d, (xra) obj2, m42Var, 10);
            case 11:
                n0 n0Var8 = new n0((zra) this.d, (qq4) obj2, m42Var, 11);
                n0Var8.c = obj;
                return n0Var8;
            case 12:
                return new n0((n0) this.d, (t00) obj2, m42Var, 12);
            case 13:
                return new n0((pq0) this.d, (oq0) obj2, m42Var, 13);
            case 14:
                return new n0((ev0) this.c, (i38) this.d, (hg) obj2, m42Var, 14);
            case 15:
                n0 n0Var9 = new n0((lhd) this.d, (yya) obj2, m42Var, 15);
                n0Var9.c = obj;
                return n0Var9;
            case 16:
                n0 n0Var10 = new n0((fy0) this.d, (List) obj2, m42Var, 16);
                n0Var10.c = obj;
                return n0Var10;
            case 17:
                return new n0((fy0) obj2, m42Var, 17);
            case 18:
                n0 n0Var11 = new n0((g91) this.d, (String) obj2, m42Var, 18);
                n0Var11.c = obj;
                return n0Var11;
            case 19:
                n0 n0Var12 = new n0((tj4) this.d, (wa1) obj2, m42Var, 19);
                n0Var12.c = obj;
                return n0Var12;
            case 20:
                return new n0((un6) this.c, (ee1) this.d, (aw7) obj2, m42Var, 20);
            case 21:
                return new n0((kj6) this.c, (vt4) this.d, (aw7) obj2, m42Var, 21);
            case 22:
                n0 n0Var13 = new n0((ng1) obj2, m42Var, 22);
                n0Var13.d = obj;
                return n0Var13;
            case 23:
                return new n0((pta) this.c, (String) this.d, (String) obj2, m42Var, 23);
            case 24:
                return new n0((lp1) this.c, (String) this.d, (String) obj2, m42Var, 24);
            case 25:
                n0 n0Var14 = new n0((op1) obj2, m42Var, 25);
                n0Var14.d = obj;
                return n0Var14;
            case 26:
                n0 n0Var15 = new n0((ky1) this.d, (t10) obj2, m42Var, 26);
                n0Var15.c = obj;
                return n0Var15;
            case 27:
                return new n0((zl9) this.d, (o19) obj2, m42Var, 27);
            case 28:
                n0 n0Var16 = new n0((gh2) obj2, m42Var, 28);
                n0Var16.d = obj;
                return n0Var16;
            default:
                n0 n0Var17 = new n0((gh2) this.d, (lu4) obj2, m42Var, 29);
                n0Var17.c = obj;
                return n0Var17;
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                return ((n0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 1:
                return ((n0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 2:
                return ((n0) create((t07) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 3:
                return ((n0) create((jt2) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 4:
                return ((n0) create((yk8) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 5:
                return ((n0) create((yk8) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 6:
                return ((n0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 7:
                return ((n0) create((x69) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 8:
                return ((n0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 9:
                return ((n0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 10:
                return ((n0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 11:
                return ((n0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 12:
                return ((n0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 13:
                return ((n0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 14:
                return ((n0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 15:
                return ((n0) create((yk8) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 16:
                return ((n0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 17:
                return ((n0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 18:
                return ((n0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 19:
                return ((n0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 20:
                return ((n0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 21:
                return ((n0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 22:
                return ((n0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 23:
                return ((n0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 24:
                return ((n0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 25:
                return ((n0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 26:
                return ((n0) create((f20) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 27:
                return ((n0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 28:
                return ((n0) create((tj4) obj, (m42) obj2)).invokeSuspend(pvcVar);
            default:
                return ((n0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x06f9  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x070e  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0929  */
    /* JADX WARN: Type inference failed for: r0v72, types: [int] */
    /* JADX WARN: Type inference failed for: r0v73, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v79, types: [java.lang.Throwable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:316:0x0606 -> B:318:0x0609). Please submit an issue!!! */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 2556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(Object obj, Object obj2, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.d = obj;
        this.e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(Object obj, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.e = obj;
    }
}
