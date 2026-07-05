package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c63  reason: default package */
/* loaded from: classes3.dex */
public final class c63 extends n42 {
    public List a;
    public a63 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ q63 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c63(q63 q63Var, n42 n42Var) {
        super(n42Var);
        this.d = q63Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.d(null, this);
    }
}
