package defpackage;

import java.util.HashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f54  reason: default package */
/* loaded from: classes3.dex */
public final class f54 extends n42 {
    public String a;
    public HashMap b;
    public vl9 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ g54 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f54(g54 g54Var, n42 n42Var) {
        super(n42Var);
        this.e = g54Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.c(null, null, this);
    }
}
