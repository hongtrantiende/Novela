package defpackage;

import java.io.IOException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cz2  reason: default package */
/* loaded from: classes3.dex */
public final class cz2 extends n42 {
    public IOException a;
    public dk1 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ dz2 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cz2(dz2 dz2Var, n42 n42Var) {
        super(n42Var);
        this.d = dz2Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.d(null, null, this);
    }
}
