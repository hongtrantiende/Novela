package defpackage;

import androidx.work.impl.workers.ConstraintTrackingWorker;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q02  reason: default package */
/* loaded from: classes.dex */
public final class q02 extends n42 {
    public lr6 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ConstraintTrackingWorker c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q02(ConstraintTrackingWorker constraintTrackingWorker, n42 n42Var) {
        super(n42Var);
        this.c = constraintTrackingWorker;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return ConstraintTrackingWorker.f(this.c, this);
    }
}
