package defpackage;

import java.io.Serializable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v19  reason: default package */
/* loaded from: classes.dex */
public final class v19 extends n42 {
    public Object a;
    public Serializable b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ x19 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v19(x19 x19Var, n42 n42Var) {
        super(n42Var);
        this.e = x19Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.g(null, null, this);
    }
}
