package defpackage;

import java.nio.channels.AsynchronousFileChannel;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n30  reason: default package */
/* loaded from: classes3.dex */
public final class n30 extends aab implements xt4 {
    public final /* synthetic */ AsynchronousFileChannel a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n30(AsynchronousFileChannel asynchronousFileChannel, m42 m42Var) {
        super(1, m42Var);
        this.a = asynchronousFileChannel;
    }

    @Override // defpackage.hh0
    public final m42 create(m42 m42Var) {
        return new n30(this.a, m42Var);
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        return ((n30) create((m42) obj)).invokeSuspend(pvc.a);
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        hre.r(obj);
        return new Long(this.a.size());
    }
}
