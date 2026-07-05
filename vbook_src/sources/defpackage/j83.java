package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: j83  reason: default package */
/* loaded from: classes3.dex */
public final class j83 extends n42 {
    public List a;
    public /* synthetic */ Object b;
    public final /* synthetic */ m83 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j83(m83 m83Var, n42 n42Var) {
        super(n42Var);
        this.c = m83Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return m83.D(this.c, this);
    }
}
