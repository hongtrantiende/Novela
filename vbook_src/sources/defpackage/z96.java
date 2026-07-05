package defpackage;

import java.nio.charset.Charset;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z96  reason: default package */
/* loaded from: classes3.dex */
public final class z96 extends n42 {
    public int C;
    public Charset a;
    public isc b;
    public s11 c;
    public s76 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ ea6 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z96(ea6 ea6Var, n42 n42Var) {
        super(n42Var);
        this.f = ea6Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.C |= Integer.MIN_VALUE;
        return this.f.a(null, null, null, this);
    }
}
