package defpackage;

import java.util.HashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t73  reason: default package */
/* loaded from: classes3.dex */
public final class t73 extends n42 {
    public int C;
    public /* synthetic */ Object D;
    public final /* synthetic */ u73 E;
    public int F;
    public u73 a;
    public bw7 b;
    public Object c;
    public HashMap d;
    public p73 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t73(u73 u73Var, n42 n42Var) {
        super(n42Var);
        this.E = u73Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return u73.D(this.E, null, this);
    }
}
