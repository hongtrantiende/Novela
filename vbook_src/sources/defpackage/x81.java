package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x81  reason: default package */
/* loaded from: classes3.dex */
public final class x81 extends aab implements nu4 {
    public final /* synthetic */ int a = 0;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x81(List list, xt4 xt4Var, m42 m42Var) {
        super(4, m42Var);
        this.d = list;
        this.e = xt4Var;
    }

    @Override // defpackage.nu4
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj5 = this.e;
        switch (i) {
            case 0:
                m82 m82Var = (m82) obj;
                x81 x81Var = new x81((List) this.d, (xt4) obj5, (m42) obj4);
                x81Var.b = (fg6) obj2;
                x81Var.c = (fg6) obj3;
                x81Var.invokeSuspend(pvcVar);
                return pvcVar;
            default:
                x81 x81Var2 = new x81((rmc) obj5, (m42) obj4);
                x81Var2.b = (String) obj;
                x81Var2.c = (Map) obj2;
                x81Var2.d = (Map) obj3;
                x81Var2.invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0065 A[LOOP:1: B:16:0x0065->B:20:0x0079, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d A[LOOP:2: B:22:0x007d->B:26:0x0091, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b9 A[LOOP:4: B:34:0x00b9->B:38:0x00cd, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d1 A[LOOP:5: B:40:0x00d1->B:44:0x00e5, LOOP_START] */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x81.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x81(rmc rmcVar, m42 m42Var) {
        super(4, m42Var);
        this.e = rmcVar;
    }
}
