package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qkb  reason: default package */
/* loaded from: classes3.dex */
public final class qkb extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qkb(gcd gcdVar, lu4 lu4Var, vt4 vt4Var, m42 m42Var) {
        super(2, m42Var);
        this.a = 26;
        this.c = gcdVar;
        this.e = lu4Var;
        this.d = vt4Var;
    }

    private final Object o(Object obj) {
        Object p;
        Object value;
        fbd fbdVar;
        int i;
        ubd ubdVar = (ubd) this.c;
        int i2 = this.b;
        if (i2 != 0) {
            if (i2 == 1) {
                hre.r(obj);
                p = obj;
            } else {
                vs.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            hre.r(obj);
            byb bybVar = new byb((ArrayList) this.d, ubdVar, (xic) this.e, (m42) null, 21);
            this.b = 1;
            p = k27.p(bybVar, this);
            n82 n82Var = n82.a;
            if (p == n82Var) {
                return n82Var;
            }
        }
        List list = (List) p;
        cza czaVar = ubdVar.V;
        if (czaVar != null) {
            do {
                value = czaVar.getValue();
                fbdVar = (fbd) value;
                if (!list.isEmpty()) {
                    i = 0;
                } else {
                    i = -1;
                }
            } while (!czaVar.l(value, fbd.a(fbdVar, false, false, null, null, 0, null, null, 0, list, i, 255)));
            return pvc.a;
        }
        return pvc.a;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                qkb qkbVar = new qkb((w26) this.d, (lu4) obj2, m42Var, 0);
                qkbVar.c = obj;
                return qkbVar;
            case 1:
                return new qkb((epb) this.d, (xob) obj2, m42Var, 1);
            case 2:
                return new qkb((ytb) this.c, (d19) this.d, (a0b) obj2, m42Var, 2);
            case 3:
                return new qkb((wwb) this.c, (String) this.d, (String) obj2, m42Var, 3);
            case 4:
                return new qkb((wwb) this.c, (f76) this.d, (cs9) obj2, m42Var, 4);
            case 5:
                return new qkb((xwb) this.c, (String) this.d, (String) obj2, m42Var, 5);
            case 6:
                return new qkb((xwb) this.c, (f76) this.d, (cs9) obj2, m42Var, 6);
            case 7:
                return new qkb((bxb) this.c, (String) this.d, (String) obj2, m42Var, 7);
            case 8:
                return new qkb((bxb) this.c, (f76) this.d, (cs9) obj2, m42Var, 8);
            case 9:
                return new qkb((dxb) this.c, (String) this.d, (String) obj2, m42Var, 9);
            case 10:
                return new qkb((dxb) this.c, (f76) this.d, (cs9) obj2, m42Var, 10);
            case 11:
                return new qkb((df) this.d, (aw7) obj2, m42Var, 11);
            case 12:
                return new qkb((y5c) this.c, (pwb) this.d, (pwb) obj2, m42Var, 12);
            case 13:
                return new qkb((y5c) obj2, m42Var, 13);
            case 14:
                return new qkb((w6c) this.d, (String) obj2, m42Var, 14);
            case 15:
                qkb qkbVar2 = new qkb((s8c) this.d, (m82) obj2, m42Var, 15);
                qkbVar2.c = obj;
                return qkbVar2;
            case 16:
                qkb qkbVar3 = new qkb((lu4) obj2, (p1a) this.d, m42Var);
                qkbVar3.c = obj;
                return qkbVar3;
            case 17:
                return new qkb((aw7) this.c, (cs5) this.d, (aw7) obj2, m42Var, 17);
            case 18:
                return new qkb((c3e) obj2, m42Var, 18);
            case 19:
                qkb qkbVar4 = new qkb((csc) obj2, m42Var, 19);
                qkbVar4.c = obj;
                return qkbVar4;
            case 20:
                qkb qkbVar5 = new qkb((db2) this.d, (hn8) obj2, m42Var, 20);
                qkbVar5.c = obj;
                return qkbVar5;
            case 21:
                qkb qkbVar6 = new qkb((d0d) this.d, (String) obj2, m42Var, 21);
                qkbVar6.c = obj;
                return qkbVar6;
            case 22:
                qkb qkbVar7 = new qkb((x0d) obj2, m42Var, 22);
                qkbVar7.c = obj;
                return qkbVar7;
            case 23:
                return new qkb((d3d) this.c, (gn8) this.d, (cs9) obj2, m42Var, 23);
            case 24:
                return new qkb((s3d) this.c, (gn8) this.d, (cs9) obj2, m42Var, 24);
            case 25:
                qkb qkbVar8 = new qkb((yh) this.d, (String) obj2, m42Var, 25);
                qkbVar8.c = obj;
                return qkbVar8;
            case 26:
                return new qkb((gcd) this.c, (lu4) obj2, (vt4) this.d, m42Var);
            case 27:
                return new qkb((ubd) this.c, (ArrayList) this.d, (xic) obj2, m42Var, 27);
            case 28:
                return new qkb((hy) this.c, (ymd) this.d, (vb8) obj2, m42Var, 28);
            default:
                return new qkb((nnd) this.c, (lr6) this.d, (gmd) obj2, m42Var, 29);
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                return ((qkb) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 1:
                return ((qkb) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 2:
                return ((qkb) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 3:
                return ((qkb) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 4:
                return ((qkb) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 5:
                return ((qkb) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 6:
                return ((qkb) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 7:
                return ((qkb) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 8:
                return ((qkb) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 9:
                return ((qkb) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 10:
                return ((qkb) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 11:
                return ((qkb) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 12:
                return ((qkb) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 13:
                return ((qkb) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 14:
                return ((qkb) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 15:
                return ((qkb) create((yk8) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 16:
                return ((qkb) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 17:
                return ((qkb) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 18:
                return ((qkb) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 19:
                return ((qkb) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 20:
                return ((qkb) create((f31) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 21:
                return ((qkb) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 22:
                return ((qkb) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 23:
                return ((qkb) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 24:
                return ((qkb) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 25:
                return ((qkb) create((tj4) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 26:
                ((qkb) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return n82.a;
            case 27:
                return ((qkb) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 28:
                return ((qkb) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            default:
                return ((qkb) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0080, code lost:
        if (r9 == r12) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x09b6, code lost:
        if (((defpackage.xob) r10).a(r1, r23) == r12) goto L549;
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x0a03, code lost:
        if (((defpackage.w26) r23.d).join(r23) == r12) goto L581;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x015c, code lost:
        if (r0.t(r23) == r12) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0169, code lost:
        if (r2 == r12) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x017a, code lost:
        if (r2 == r12) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x048f  */
    /* JADX WARN: Type inference failed for: r3v1, types: [lh4, java.lang.Object, wr7] */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 2642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qkb.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qkb(lu4 lu4Var, p1a p1aVar, m42 m42Var) {
        super(2, m42Var);
        this.a = 16;
        this.e = lu4Var;
        this.d = p1aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qkb(Object obj, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.e = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qkb(Object obj, Object obj2, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.d = obj;
        this.e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qkb(Object obj, Object obj2, Object obj3, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
