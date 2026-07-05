package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.glance.appwidget.GlanceAppWidgetReceiver;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d53  reason: default package */
/* loaded from: classes3.dex */
public final class d53 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;
    public Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d53(fdd fddVar, Object obj, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = fddVar;
        this.d = obj;
    }

    private final Object o(Object obj) {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                pv7 pv7Var = (pv7) this.d;
                hre.r(obj);
                return pv7Var;
            }
            vs.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hre.r(obj);
        pv7 g = ((pv7) this.d).g();
        this.d = g;
        this.b = 1;
        ((iz7) this.c).invoke(g, this);
        pvc pvcVar = pvc.a;
        n82 n82Var = n82.a;
        if (pvcVar == n82Var) {
            return n82Var;
        }
        return g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
        if (defpackage.lq.c((defpackage.lq) r1, r6, r7, null, null, r10, 12) != r4) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0069 -> B:7:0x0016). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object p(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.b
            java.lang.Object r1 = r12.c
            r2 = 1
            r3 = 2
            n82 r4 = defpackage.n82.a
            if (r0 == 0) goto L27
            if (r0 == r2) goto L1f
            if (r0 != r3) goto L18
            java.lang.Object r0 = r12.d
            d82 r0 = (defpackage.d82) r0
            defpackage.hre.r(r13)
            r10 = r12
        L16:
            r13 = r0
            goto L6c
        L18:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r12)
            r12 = 0
            return r12
        L1f:
            java.lang.Object r0 = r12.d
            d82 r0 = (defpackage.d82) r0
            defpackage.hre.r(r13)
            goto L49
        L27:
            defpackage.hre.r(r13)
            d82 r13 = r12.getContext()
        L2e:
            boolean r0 = defpackage.k27.u(r13)
            if (r0 == 0) goto L6e
            r0 = r1
            lq r0 = (defpackage.lq) r0
            java.lang.Float r5 = new java.lang.Float
            r6 = 0
            r5.<init>(r6)
            r12.d = r13
            r12.b = r2
            java.lang.Object r0 = r0.g(r12, r5)
            if (r0 != r4) goto L48
            goto L6b
        L48:
            r0 = r13
        L49:
            r5 = r1
            lq r5 = (defpackage.lq) r5
            java.lang.Float r6 = new java.lang.Float
            r13 = 1065353216(0x3f800000, float:1.0)
            r6.<init>(r13)
            r13 = 0
            ls2 r7 = defpackage.on3.d
            r8 = 4000(0xfa0, float:5.605E-42)
            arc r7 = defpackage.tte.x(r8, r13, r7, r3)
            r12.d = r0
            r12.b = r3
            r8 = 0
            r9 = 0
            r11 = 12
            r10 = r12
            java.lang.Object r12 = defpackage.lq.c(r5, r6, r7, r8, r9, r10, r11)
            if (r12 != r4) goto L16
        L6b:
            return r4
        L6c:
            r12 = r10
            goto L2e
        L6e:
            pvc r12 = defpackage.pvc.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d53.p(java.lang.Object):java.lang.Object");
    }

    private final Object q(Object obj) {
        int i = this.b;
        pvc pvcVar = pvc.a;
        if (i != 0) {
            if (i == 1) {
                hre.r(obj);
            } else {
                vs.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            hre.r(obj);
            String uri = ((Uri) this.c).toString();
            uri.getClass();
            vyc b = obe.o(uri).b();
            this.b = 1;
            q36 q36Var = r36.d;
            q36Var.getClass();
            String b2 = q36Var.b(vyc.Companion.serializer(), b);
            Object o = y9e.o(((di2) this.d).a, new ol((Object) new e49("responseUri"), b2, (m42) null, 19), this);
            n82 n82Var = n82.a;
            if (o != n82Var) {
                o = pvcVar;
            }
            if (o != n82Var) {
                o = pvcVar;
            }
            if (o == n82Var) {
                return n82Var;
            }
        }
        return pvcVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return new d53((i53) obj2, m42Var, 0);
            case 1:
                return new d53((fdd) ((i53) obj2), (Object) ((Integer) this.d), m42Var, 1);
            case 2:
                return new d53((fdd) ((l93) obj2), (Object) ((String) this.d), m42Var, 2);
            case 3:
                d53 d53Var = new d53((ie3) obj2, m42Var, 3);
                d53Var.d = obj;
                return d53Var;
            case 4:
                return new d53((Object) ((ie3) this.d), (Object) ((List) obj2), m42Var, 4);
            case 5:
                return new d53((bo3) obj2, m42Var, 5);
            case 6:
                return new d53((fdd) ((zq3) obj2), (Object) ((String) this.d), m42Var, 6);
            case 7:
                return new d53((Object) ((zq3) this.d), (Object) ((List) obj2), m42Var, 7);
            case 8:
                return new d53((Object) ((as3) this.d), (Object) ((vp3) obj2), m42Var, 8);
            case 9:
                d53 d53Var2 = new d53((v14) obj2, m42Var, 9);
                d53Var2.d = obj;
                return d53Var2;
            case 10:
                return new d53((p24) obj2, m42Var, 10);
            case 11:
                return new d53((fdd) ((i44) obj2), (Object) ((String) this.d), m42Var, 11);
            case 12:
                return new d53((fdd) ((p54) obj2), (Object) ((String) this.d), m42Var, 12);
            case 13:
                return new d53((fdd) ((m64) obj2), (Object) ((String) this.d), m42Var, 13);
            case 14:
                return new d53((l84) this.d, (qg6) obj2, m42Var, 14);
            case 15:
                return new d53((Object) ((v84) this.d), (Object) ((f84) obj2), m42Var, 15);
            case 16:
                return new d53((xt4) this.d, (bx8) obj2, m42Var, 16);
            case 17:
                d53 d53Var3 = new d53((mce) obj2, m42Var, 17);
                d53Var3.d = obj;
                return d53Var3;
            case 18:
                return new d53((ug4) this.d, (uba) obj2, m42Var, 18);
            case 19:
                return new d53((gj4) this.d, (dj4) obj2, m42Var, 19);
            case 20:
                return new d53((gj4) this.d, (ez5) obj2, m42Var, 20);
            case 21:
                return new d53((zl9) this.d, (tj4) obj2, m42Var, 21);
            case 22:
                return new d53((fdd) ((uo4) obj2), (Object) ((String) this.d), m42Var, 22);
            case 23:
                return new d53((vp4) obj2, m42Var, 23);
            case 24:
                d53 d53Var4 = new d53((ux) obj2, m42Var, 24);
                d53Var4.d = obj;
                return d53Var4;
            case 25:
                return new d53((Context) this.d, (GlanceAppWidgetReceiver) obj2, m42Var, 25);
            case 26:
                d53 d53Var5 = new d53((iz7) obj2, m42Var, 26);
                d53Var5.d = obj;
                return d53Var5;
            case 27:
                return new d53((lq) obj2, m42Var, 27);
            case 28:
                return new d53((di2) this.d, (Uri) obj2, m42Var, 28);
            default:
                return new d53((i55) this.d, (pgd) obj2, m42Var, 29);
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                return ((d53) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 1:
                return ((d53) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 2:
                return ((d53) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 3:
                return ((d53) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 4:
                return ((d53) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 5:
                return ((d53) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 6:
                return ((d53) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 7:
                return ((d53) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 8:
                return ((d53) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 9:
                return ((d53) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 10:
                return ((d53) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 11:
                return ((d53) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 12:
                return ((d53) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 13:
                return ((d53) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 14:
                return ((d53) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 15:
                return ((d53) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 16:
                return ((d53) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 17:
                return ((d53) create((y69) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 18:
                return ((d53) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 19:
                return ((d53) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 20:
                return ((d53) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 21:
                return ((d53) create((pvc) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 22:
                return ((d53) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 23:
                return ((d53) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 24:
                return ((d53) create((kba) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 25:
                return ((d53) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 26:
                return ((d53) create((pv7) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 27:
                return ((d53) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 28:
                return ((d53) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            default:
                return ((d53) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x022d, code lost:
        if (r1 == r9) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0264, code lost:
        if (r3.b(r47) == r9) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0488, code lost:
        if (r1 == r9) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x04fd, code lost:
        if (r1 == r9) goto L342;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0538, code lost:
        if (r0 == r9) goto L342;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x0804, code lost:
        if (r2 == r9) goto L448;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x0835, code lost:
        if (r3 == r9) goto L448;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x0860, code lost:
        if (r14.m(r47) != r9) goto L436;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x0a1b, code lost:
        if (r6 == r9) goto L546;
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x0a85, code lost:
        if (defpackage.i53.F(r14, r47) != r9) goto L557;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x0a91, code lost:
        if (defpackage.i53.E(r14, r47) == r9) goto L546;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x0acc, code lost:
        if (defpackage.i53.H(r14, r47) == r9) goto L546;
     */
    /* JADX WARN: Code restructure failed: missing block: B:557:?, code lost:
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:582:?, code lost:
        return r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:317:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0856  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x0a44  */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r48) {
        /*
            Method dump skipped, instructions count: 2860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d53.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d53(Object obj, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d53(Object obj, Object obj2, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.d = obj;
        this.c = obj2;
    }
}
