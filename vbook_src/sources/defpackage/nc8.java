package defpackage;

import java.util.HashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nc8  reason: default package */
/* loaded from: classes3.dex */
public final class nc8 extends n42 {
    public int C;
    public c41 a;
    public qw7 b;
    public HashMap c;
    public c41 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ oc8 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc8(oc8 oc8Var, n42 n42Var) {
        super(n42Var);
        this.f = oc8Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.C |= Integer.MIN_VALUE;
        return this.f.c(null, this);
    }
}
