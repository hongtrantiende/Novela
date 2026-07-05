package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ad9  reason: default package */
/* loaded from: classes3.dex */
public final class ad9 extends n42 {
    public hn8 a;
    public hn8 b;
    public Iterator c;
    public /* synthetic */ Object d;
    public final /* synthetic */ be9 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ad9(be9 be9Var, n42 n42Var) {
        super(n42Var);
        this.e = be9Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.v(null, this);
    }
}
