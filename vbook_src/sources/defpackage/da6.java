package defpackage;

import java.nio.charset.Charset;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: da6  reason: default package */
/* loaded from: classes3.dex */
public final class da6 extends n42 {
    public int C;
    public e32 a;
    public Charset b;
    public isc c;
    public Object d;
    public /* synthetic */ Object e;
    public final /* synthetic */ ea6 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da6(ea6 ea6Var, n42 n42Var) {
        super(n42Var);
        this.f = ea6Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.C |= Integer.MIN_VALUE;
        return this.f.b(null, null, null, null, this);
    }
}
