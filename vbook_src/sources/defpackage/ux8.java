package defpackage;

import android.view.textclassifier.TextClassifier;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ux8  reason: default package */
/* loaded from: classes.dex */
public final class ux8 extends aab implements lu4 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ xx8 c;
    public final /* synthetic */ CharSequence d;
    public final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ux8(long j, m42 m42Var, xx8 xx8Var, CharSequence charSequence) {
        super(2, m42Var);
        this.c = xx8Var;
        this.d = charSequence;
        this.e = j;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        ux8 ux8Var = new ux8(this.e, m42Var, this.c, this.d);
        ux8Var.b = obj;
        return ux8Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((ux8) create(cp8.h(obj), (m42) obj2)).invokeSuspend(pvc.a);
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                hre.r(obj);
            } else {
                vs.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            hre.r(obj);
            TextClassifier h = cp8.h(this.b);
            this.a = 1;
            Object a = xx8.a(this.c, this.d, this.e, h, this);
            n82 n82Var = n82.a;
            if (a == n82Var) {
                return n82Var;
            }
        }
        return pvc.a;
    }
}
