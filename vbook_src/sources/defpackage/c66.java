package defpackage;

import java.nio.channels.AsynchronousSocketChannel;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c66  reason: default package */
/* loaded from: classes3.dex */
public final class c66 extends aab implements lu4 {
    public final /* synthetic */ g66 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c66(g66 g66Var, m42 m42Var) {
        super(2, m42Var);
        this.a = g66Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        return new c66(this.a, m42Var);
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        pvc pvcVar = pvc.a;
        ((c66) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
        return pvcVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        hre.r(obj);
        g66 g66Var = this.a;
        AsynchronousSocketChannel asynchronousSocketChannel = g66Var.a;
        if (asynchronousSocketChannel != null) {
            asynchronousSocketChannel.close();
        }
        g66Var.a = null;
        return pvc.a;
    }
}
