package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l83  reason: default package */
/* loaded from: classes3.dex */
public final class l83 extends n42 {
    public List a;
    public Map b;
    public HashMap c;
    public /* synthetic */ Object d;
    public final /* synthetic */ m83 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l83(m83 m83Var, n42 n42Var) {
        super(n42Var);
        this.e = m83Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return m83.E(this.e, this);
    }
}
