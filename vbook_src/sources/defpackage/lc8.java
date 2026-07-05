package defpackage;

import java.util.HashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lc8  reason: default package */
/* loaded from: classes3.dex */
public final class lc8 extends n42 {
    public int C;
    public /* synthetic */ Object D;
    public final /* synthetic */ oc8 E;
    public int F;
    public hn8 a;
    public HashMap b;
    public c41[] c;
    public my0 d;
    public my0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lc8(oc8 oc8Var, n42 n42Var) {
        super(n42Var);
        this.E = oc8Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.a(null, this);
    }
}
