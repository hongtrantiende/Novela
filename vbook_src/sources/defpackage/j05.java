package defpackage;

import java.io.Closeable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: j05  reason: default package */
/* loaded from: classes3.dex */
public final class j05 extends n42 {
    public final /* synthetic */ l05 C;
    public int D;
    public f31 a;
    public byte[] b;
    public Closeable c;
    public bz0 d;
    public int e;
    public /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j05(l05 l05Var, n42 n42Var) {
        super(n42Var);
        this.C = l05Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.D |= Integer.MIN_VALUE;
        return l05.a(this.C, null, null, this);
    }
}
