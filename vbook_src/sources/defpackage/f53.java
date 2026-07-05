package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f53  reason: default package */
/* loaded from: classes3.dex */
public final class f53 extends n42 {
    public int C;
    public k23 a;
    public Map b;
    public Map c;
    public HashMap d;
    public /* synthetic */ Object e;
    public final /* synthetic */ i53 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f53(i53 i53Var, n42 n42Var) {
        super(n42Var);
        this.f = i53Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.C |= Integer.MIN_VALUE;
        return i53.F(this.f, this);
    }
}
