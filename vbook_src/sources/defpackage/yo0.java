package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yo0  reason: default package */
/* loaded from: classes3.dex */
public final class yo0 extends n42 {
    public int C;
    public Map a;
    public String b;
    public String c;
    public boolean d;
    public /* synthetic */ Object e;
    public final /* synthetic */ zo0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yo0(zo0 zo0Var, n42 n42Var) {
        super(n42Var);
        this.f = zo0Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.C |= Integer.MIN_VALUE;
        return this.f.n(null, null, false, null, false, this);
    }
}
