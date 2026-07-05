package defpackage;

import java.io.RandomAccessFile;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kq  reason: default package */
/* loaded from: classes3.dex */
public final class kq extends aab implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kq(Object obj, m42 m42Var, int i) {
        super(1, m42Var);
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.hh0
    public final m42 create(m42 m42Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new kq((lq) obj, m42Var, 0);
            case 1:
                return new kq((RandomAccessFile) obj, m42Var, 1);
            case 2:
                return new kq((jj) obj, m42Var, 2);
            case 3:
                return new kq((nb9) obj, m42Var, 3);
            case 4:
                return new kq((lrb) obj, m42Var, 4);
            default:
                return new kq((List) obj, m42Var, 5);
        }
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        m42 m42Var = (m42) obj;
        switch (i) {
            case 0:
                ((kq) create(m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 1:
                return ((kq) create(m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((kq) create(m42Var)).invokeSuspend(pvcVar);
            case 3:
                return ((kq) create(m42Var)).invokeSuspend(pvcVar);
            case 4:
                ((kq) create(m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                return ((kq) create(m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                hre.r(obj);
                lq.a((lq) obj2);
                return pvcVar;
            case 1:
                hre.r(obj);
                return new Long(((RandomAccessFile) obj2).length());
            case 2:
                hre.r(obj);
                return new pl5((jj) obj2);
            case 3:
                hre.r(obj);
                return ((hb9) ((nb9) obj2)).a;
            case 4:
                hre.r(obj);
                ((lrb) obj2).Q.u.setValue(Boolean.FALSE);
                return pvcVar;
            default:
                hre.r(obj);
                q36 q36Var = r36.d;
                q36Var.getClass();
                return r4b.H(q36Var.b(new sz(goa.Companion.serializer(), 0), (List) obj2));
        }
    }
}
