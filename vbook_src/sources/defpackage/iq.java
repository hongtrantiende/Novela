package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: iq  reason: default package */
/* loaded from: classes.dex */
public final class iq extends aab implements xt4 {
    public final /* synthetic */ long C;
    public final /* synthetic */ xt4 D;
    public es a;
    public vl9 b;
    public int c;
    public final /* synthetic */ lq d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ sr f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iq(lq lqVar, Object obj, sr srVar, long j, xt4 xt4Var, m42 m42Var) {
        super(1, m42Var);
        this.d = lqVar;
        this.e = obj;
        this.f = srVar;
        this.C = j;
        this.D = xt4Var;
    }

    @Override // defpackage.hh0
    public final m42 create(m42 m42Var) {
        return new iq(this.d, this.e, this.f, this.C, this.D, m42Var);
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        return ((iq) create((m42) obj)).invokeSuspend(pvc.a);
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [vl9, java.lang.Object] */
    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        es esVar;
        vl9 vl9Var;
        tr trVar;
        sr srVar = this.f;
        lq lqVar = this.d;
        es esVar2 = lqVar.c;
        int i = this.c;
        try {
            if (i != 0) {
                if (i == 1) {
                    vl9Var = this.b;
                    esVar = this.a;
                    hre.r(obj);
                } else {
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                hre.r(obj);
                esVar2.c = (js) lqVar.a.a.invoke(this.e);
                lqVar.e.setValue(srVar.g());
                lqVar.d.setValue(Boolean.TRUE);
                es esVar3 = new es(esVar2.a, esVar2.b.getValue(), bue.e(esVar2.c), esVar2.d, Long.MIN_VALUE, esVar2.f);
                ?? obj2 = new Object();
                long j = this.C;
                hq hqVar = new hq(lqVar, esVar3, this.D, (Object) obj2, 0);
                this.a = esVar3;
                this.b = obj2;
                this.c = 1;
                Object k = ote.k(esVar3, srVar, j, hqVar, this);
                n82 n82Var = n82.a;
                if (k == n82Var) {
                    return n82Var;
                }
                esVar = esVar3;
                vl9Var = obj2;
            }
            if (vl9Var.a) {
                trVar = tr.a;
            } else {
                trVar = tr.b;
            }
            lq.a(lqVar);
            return new vr(esVar, trVar);
        } catch (CancellationException e) {
            lq.a(lqVar);
            throw e;
        }
    }
}
