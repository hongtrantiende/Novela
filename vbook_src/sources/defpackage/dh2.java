package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dh2  reason: default package */
/* loaded from: classes3.dex */
public final class dh2 extends aab implements xt4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;
    public Object d;
    public Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dh2(Object obj, Object obj2, Object obj3, Object obj4, m42 m42Var, int i) {
        super(1, m42Var);
        this.a = i;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
        this.f = obj4;
    }

    @Override // defpackage.hh0
    public final m42 create(m42 m42Var) {
        int i = this.a;
        Object obj = this.f;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return new dh2((zl9) this.e, (gh2) obj2, (xl9) obj, m42Var, 0);
            case 1:
                return new dh2((gh2) obj2, (d82) this.e, (lu4) obj, m42Var);
            case 2:
                return new dh2((xe4) obj2, obj, m42Var);
            case 3:
                return new dh2((xt4) this.e, (ns2) obj2, (String) obj, m42Var, 3);
            case 4:
                return new dh2((m82) this.d, (pa8) this.e, (gn8) obj2, (cs9) obj, m42Var, 4);
            case 5:
                return new dh2((sf9) this.d, (ArrayList) this.e, (pf9) obj2, (ph) obj, m42Var, 5);
            case 6:
                return new dh2((sf9) this.e, (pf9) obj2, (ph) obj, m42Var, 6);
            default:
                return new dh2((xoa) this.e, (loa) obj2, (ioa) obj, m42Var, 7);
        }
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        m42 m42Var = (m42) obj;
        switch (i) {
            case 0:
                return ((dh2) create(m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((dh2) create(m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((dh2) create(m42Var)).invokeSuspend(pvcVar);
            case 3:
                return ((dh2) create(m42Var)).invokeSuspend(pvcVar);
            case 4:
                return ((dh2) create(m42Var)).invokeSuspend(pvcVar);
            case 5:
                return ((dh2) create(m42Var)).invokeSuspend(pvcVar);
            case 6:
                return ((dh2) create(m42Var)).invokeSuspend(pvcVar);
            default:
                return ((dh2) create(m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:207:0x03dd, code lost:
        if (r0 != r8) goto L198;
     */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:228:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:231:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ba  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x01af -> B:95:0x01b2). Please submit an issue!!! */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 1020
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dh2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dh2(xe4 xe4Var, Object obj, m42 m42Var) {
        super(1, m42Var);
        this.a = 2;
        this.c = xe4Var;
        this.f = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dh2(Object obj, Object obj2, Object obj3, m42 m42Var, int i) {
        super(1, m42Var);
        this.a = i;
        this.e = obj;
        this.c = obj2;
        this.f = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dh2(gh2 gh2Var, d82 d82Var, lu4 lu4Var, m42 m42Var) {
        super(1, m42Var);
        this.a = 1;
        this.c = gh2Var;
        this.e = d82Var;
        this.f = lu4Var;
    }
}
