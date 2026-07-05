package defpackage;

import androidx.glance.session.SessionWorker;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: je  reason: default package */
/* loaded from: classes3.dex */
public final class je extends aab implements xt4 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ je(Object obj, Object obj2, Object obj3, m42 m42Var, int i) {
        super(1, m42Var);
        this.a = i;
        this.e = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // defpackage.hh0
    public final m42 create(m42 m42Var) {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                return new je((pe) obj2, this.c, (nu4) obj, m42Var, 0);
            case 1:
                return new je((qe) obj2, this.c, (nu4) obj, m42Var, 1);
            case 2:
                return new je((mj5) obj2, (yeb) this.c, (yeb) obj, m42Var, 2);
            case 3:
                return new je((SessionWorker) obj2, (jac) obj, m42Var);
            case 4:
                return new je((wwb) obj2, (f76) this.c, (cs9) obj, m42Var, 4);
            case 5:
                return new je((xwb) obj2, (f76) this.c, (cs9) obj, m42Var, 5);
            case 6:
                return new je((bxb) obj2, (f76) this.c, (cs9) obj, m42Var, 6);
            default:
                return new je((dxb) obj2, (f76) this.c, (cs9) obj, m42Var, 7);
        }
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        m42 m42Var = (m42) obj;
        switch (i) {
            case 0:
                return ((je) create(m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((je) create(m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((je) create(m42Var)).invokeSuspend(pvcVar);
            case 3:
                return ((je) create(m42Var)).invokeSuspend(pvcVar);
            case 4:
                return ((je) create(m42Var)).invokeSuspend(pvcVar);
            case 5:
                return ((je) create(m42Var)).invokeSuspend(pvcVar);
            case 6:
                return ((je) create(m42Var)).invokeSuspend(pvcVar);
            default:
                return ((je) create(m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.je.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public je(SessionWorker sessionWorker, jac jacVar, m42 m42Var) {
        super(1, m42Var);
        this.a = 3;
        this.e = sessionWorker;
        this.d = jacVar;
    }
}
